package com.victor.kmp;

/**
 * Created by zhangcs on 2018/5/11.
 */
public class KmpDemo {

    public static void main(String[] args) {
        String p="ABCDABD";
        int[]next=getNext(p);

        System.out.println("hi");
    }

    private static int[] getNext(String p) {
        char[] strKey = p.toCharArray();
        int[] next = new int[p.length()];

        int j = 0;
        int k = -1;
        next[0] = -1;

        while (j < strKey.length - 1) {
            if (k == -1 || strKey[j] == strKey[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }

        return next;
    }
}
