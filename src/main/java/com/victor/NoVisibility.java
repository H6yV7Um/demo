package com.victor;

/**
 * Created by zhangcs on 2018/1/3.
 */
public class NoVisibility {

    public static void main(String[] args) {
       int i=-10;
        System.out.println(Integer.toBinaryString(i));
        int j=10;
        System.out.println(Integer.toBinaryString(j));

        System.out.println(i>>>2);
    }

    private static void test(String value) {

        switch (value) {
            case "hello":
                System.out.println(1);
                break;
            case "world":
                System.out.println(2);
                break;
            default:
                System.out.println(3);
                break;
        }
    }
}
