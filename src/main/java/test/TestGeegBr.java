package test;

import java.util.Scanner;

public class TestGeegBr {

    public static void main(String[] args) {
    int[][] arr = new int[3][3];
    print2Array(arr);

    }

    public static void print2Array(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }


}
