

import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        int [] arr = {3,2,6,32,11,56,21,54,1,56,3,4,67,54,1,21};
        //System.out.println(Arrays.toString(binarySort(arr)));
        //System.out.println(Arrays.toString(selectionSort(arr)));\


    }


    public static int [] binarySort(int [] arr){
        for(int i=0 ; i<arr.length; i++){
            for(int j= 0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }

    public static int [] selectionSort(int [] arr){
        for(int i=0 ; i<arr.length ; i++){
            int minIndex = i; // 3
            for(int j= i+1 ; j<arr.length ; j++){
               if(arr[j] < arr[minIndex]){
                   minIndex = j;
               }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
