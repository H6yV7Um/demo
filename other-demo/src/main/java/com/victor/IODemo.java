package com.victor;


import redis.clients.jedis.Jedis;

import java.io.*;

/**
 * Created by zhangcs on 2018/4/18.
 */
public class IODemo {

    private static void fileInputStreamDemo() throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("E:\\tem.txt")) {

            byte[] buf = new byte[1024];

            while (fileInputStream.read(buf) > 0) {
                //中文会出现乱码
                System.out.println(new String(buf, 0, buf.length));
            }
        }
    }

    private static void fileReaderDemo() throws IOException {
        try (FileReader fileReader = new FileReader("E:\\tem.txt")) {
            char[] buf = new char[32];

            while (fileReader.read(buf) > 0) {
                System.out.println(new String(buf, 0, buf.length));
            }
        }
    }

    private static void fileOutputStreamDemo() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("E:\\tem.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("E:\\tem1.txt")
        ) {
            byte[] buf = new byte[4];

            while (fileInputStream.read(buf) > 0) {
                fileOutputStream.write(buf);
            }

            System.out.println("write success");
        }
    }

    private static void fileWriterDemo() throws IOException {
        try (FileWriter fileWriter = new FileWriter("E:\\tem1.txt")) {
            fileWriter.write("你是我的小呀小苹果");
            fileWriter.write("怎么爱你都不谦多");
        }
    }

    private static void printStreamDemo() throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("E:\\tem.txt");
             PrintStream printStream = new PrintStream(fileOutputStream)) {
            printStream.println("天大地大");
            printStream.println(new IODemo());

            System.out.println("over");
        }
    }


    private static void stringReaderDemo() throws IOException {
        String str = "天大地大，何处是我家";

        char[] buf = new char[32];

        try (StringReader stringReader = new StringReader(str)) {
            while (stringReader.read(buf) > 0) {
                System.out.println(new String(buf, 0, buf.length));
            }
        }
    }

    private static void stringWriterDemo() throws IOException {
        try (StringWriter stringWriter = new StringWriter()) {
            stringWriter.write("黑夜给了我黑色的眼睛");
            stringWriter.write("我却用它寻找光明");

            System.out.println(stringWriter.toString());
        }
    }

    private static void keyIn() throws IOException {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(reader)) {

            String line = null;

            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try (Jedis jedis = new Jedis("10.3.8.22", 6379)) {

            System.out.println("redis connect success");

            jedis.set("name", "victor");

            String name = jedis.get("name");

            System.out.println(name);
        }
    }
}
