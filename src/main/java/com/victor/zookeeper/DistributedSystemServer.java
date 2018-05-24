package com.victor.zookeeper;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * Created by zhangcs on 2018/5/3.
 */
public class DistributedSystemServer {

    private final String hosts = "10.3.8.22:2181,10.3.8.22:2182,10.3.8.22:2183";
    private final int sessionTimeout = 2000;
    private final String rootPath = "/servers";

    private ZooKeeper zooKeeper;

    private void init() throws IOException {
        zooKeeper = new ZooKeeper(hosts, sessionTimeout, event -> {
            return;
        });
    }

    private void connectZk(String serverName, String port) throws KeeperException, InterruptedException {

        if (zooKeeper.exists(rootPath, false) == null) {
            zooKeeper.create(rootPath, null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        }

        zooKeeper.create(rootPath + "/", (serverName + ":" + port).getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode
                .EPHEMERAL_SEQUENTIAL);
        System.out.println("server " + serverName + " is online ......");
    }

    private void handle(String serverName) throws Exception {
        System.out.println("server " + serverName
                + " is waiting for task process......");
        Thread.sleep(Long.MAX_VALUE);
    }

    public static void main(String[] args) throws Exception {
        DistributedSystemServer server = new DistributedSystemServer();
        server.init();
        server.connectZk("localhost", "8080");
        server.handle("localhost");
    }
}
