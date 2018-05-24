package com.victor.sort;

/**
 * Created by zhangcs on 2018/5/8.
 */
public class SortDemo {

    public static void main(String[] args) {
        int[] arr = {26, 53, 67, 48, 57, 13, 48, 32, 60, 50};
        selectSort(arr);
        printArr(arr);
    }

    /**
     * 选择排序法
     * @param a
     */
    private static void selectSort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    /**
     * 快速排序法
     *
     * @param a
     * @param low
     * @param hight
     */
    private static void quickSort(int a[], int low, int hight) {
        int i, j, index;

        if (low > hight) {
            return;
        }

        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准

        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
        }
        a[i] = index;// 将基准数值替换回 a[i]
        quickSort(a, low, i - 1); // 对低子表进行递归排序
        quickSort(a, i + 1, hight); // 对高子表进行递归排序
    }

    /**
     * 冒泡排序法
     *
     * @param arr
     */
    private static void bubbleSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 希尔排序法
     *
     * @param arr
     */
    private static void shellSort(int[] arr) {
        int j;
        int temp;

        for (int increment = arr.length / 2; increment > 0; increment = increment / 2) {

            for (int i = increment; i < arr.length; i++) {

                temp = arr[i];

                for (j = i - increment; j >= 0; j = j - increment) {

                    if (temp < arr[j]) {
                        arr[j + increment] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + increment] = temp;
            }
        }
    }

    /**
     * 插入排序法
     *
     * @param arr
     */
    private static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {

                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
