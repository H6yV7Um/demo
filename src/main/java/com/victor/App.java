package com.victor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {

    private static Queue<Integer> logQueue = new LinkedList<Integer>();

    private static ExecutorService threadPool = new ThreadPoolExecutor(
            3,
            3,
            10,
            TimeUnit.SECONDS, new
            LinkedBlockingQueue<>(10));

    public static void main(String[] args) {
        System.out.println(Integer.class);
        String s=new String("test");
        s.hashCode();
    }
}


