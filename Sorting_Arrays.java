package com.Ismaila;
import java.util.Scanner;

public class Sorting_Arrays {
    private static Scanner scan=new Scanner(System.in);
    //create the integer method to store the arrays
    public static int[] getIntegers(int capacity){
        int[] array=new int[capacity];
        System.out.println("Enter " + capacity + " integer values\r");
        for (int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        return array;
    }
    //prints the values entered
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Elements " + i + " is " + array[i]);
        }
    }
    //arranges the values in increasing  order
    public static int[] sortIntegers(int[] array){
        int[] sortedArray=new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i]=array[i];
        }
        boolean flag=true;
        int temp;
        while (flag){
            flag=false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]>sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }return sortedArray;




    }
}
