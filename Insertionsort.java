package Sorting;

import java.util.Arrays;

public class InsertionSortDSA {
    public static void main(String[] args) {
        int[] arr= {8,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){  //arr.length will be like if the length is index:[0-4] means the loop will go for up to 3
            for(int j=i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int start,int end){
        int temp= arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
