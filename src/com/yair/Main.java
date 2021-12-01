package com.yair;

import com.yair.model.FindNumbers;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 64, 25};
	    int[] arr2 = {5, 6, 3, 7, 9, 11, 12, 43, 25, 64, 34 };
        int[] newArr = FindNumbers.FindNumberInTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(newArr));
    }
}
