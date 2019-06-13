package com.yt;

/**
 * @Author: yan_tao
 * @Description:
 * @Date: Created in 2019/6/13
 * 选择排序 ：双层循环，时间复杂度和冒泡一模一样，都是O(n2)。
 */
public class SelectSort {

    public static void sort(int arr[]){
        for( int i = 0;i < arr.length ; i++ ){
            int min = i;//最小元素的下标
            for(int j = i + 1;j < arr.length ; j++ ){
                if(arr[j] < arr[min]){
                    min = j;//找最小值
                }
            }
            //交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
