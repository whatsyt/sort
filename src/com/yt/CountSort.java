package com.yt;

/**
 * @Author: yan_tao
 * @Description:
 * @Date: Created in 2019/6/13
 * 计数排序：计数排序的时间复杂度为 O(n + m )，m 指的是数据量
 * 利用出现次数及arr数组下标排序
 * 适用范围：计数排序只适用于正整数并且取值范围相差不大的数组排序使用
 */
public class CountSort {

    public static void sort(int[] arr) {
        //找出数组中的最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //初始化计数数组
        int[] countArr = new int[max + 1];

        //计数
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
            arr[i] = 0;
        }

        //排序
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) {
                arr[index++] = i;
            }
        }
    }
}
