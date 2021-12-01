package com.yair.model;

public class FindNumbers {
    public static int[] FindNumberInTwoArrays (int[] arr1, int[] arr2){
        boolean find = false;
        int[] arr3 = new int[arr1.length + arr2.length];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    find = true;
                }
            }
            if (!find){
                arr3[counter] = arr1[i];
                counter++;
            } else {
                find = false;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]){
                    find = true;
                }
            }
            if (!find){
                arr3[counter] = arr2[i];
                counter++;
            } else {
                find = false;
            }
        }
        int[] newArr = new int[counter];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr3[i];
        }
        System.out.println(counter);
        return newArr;
    }
}
