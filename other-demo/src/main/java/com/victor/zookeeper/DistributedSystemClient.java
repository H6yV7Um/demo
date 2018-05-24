package com.victor.zookeeper;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangcs on 2018/5/3.
 */
public class DistributedSystemClient {
    private final String hosts = "10.3.8.22:2181,10.3.8.22:2182,10.3.8.22:2183";
    private final int sessionTimeout = 2000;
    private final String rootPath = "/servers";

    private volatile List<String> servers = null;
    private ZooKeeper zooKeeper;

    private void init() throws IOException {
        zooKeeper = new ZooKeeper(hosts, sessionTimeout, event -> {
            if (event.getType() == Watcher.Event.EventType.None) {
                return;
            }

            try {
                updateServers();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    private void updateServers() throws Exception {
        List<String> children = zooKeeper.getChildren(rootPath, true);

        servers = new ArrayList<>();

        for (String child : children) {
            servers.add(new String(zooKeeper.getData(rootPath + "/" + child, false, null)));
        }

        for (String server : servers) {
            System.out.println(server);
        }

        System.out.println("========================================");
    }

    private void requestService() throws InterruptedException {
        Thread.sleep(Long.MAX_VALUE);
    }

    public static void main(String[] args) throws Exception {
        DistributedSystemClient client = new DistributedSystemClient();
        client.init();
        client.updateServers();
        client.requestService();
    }
}
