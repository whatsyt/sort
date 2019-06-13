package com.yt;

/**
 * @Author: yan_tao
 * @Description:
 * @Date: Created in 2019/6/13
 * 插入排序：最好情况的时间复杂度是 O(n)，最坏情况的时间复杂度是 O(n2)。
 */
public class InsertSort {

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int value = arr[i];
            int j = 0;//插入的位置
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j+1] = arr[j];//移动数据
                } else {
                    break;
                }
            }
            arr[j+1] = value; //插入数据
        }
    }

}
