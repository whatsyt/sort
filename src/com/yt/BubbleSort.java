package com.yt;

/**
 * @Author: yan_tao
 * @Description:
 * @Date: Created in 2019/6/13
 * 冒泡排序：时间复杂度为O(n2)
 */
public class BubbleSort {

    public static void sort(int arr[]){
        for( int i = 0 ; i < arr.length - 1 ; i++ ){
            for(int j = 0;j < arr.length - 1 - i ; j++){
                int temp = 0;
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}



