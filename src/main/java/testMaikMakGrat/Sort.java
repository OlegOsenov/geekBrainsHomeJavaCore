package testMaikMakGrat;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        String[] names = {"Mike","Arnold","Piter"};
        int[] nums = {200,300,100};
        Arrays.sort(names);
        Arrays.sort(nums);
        display(names);
        display(nums);
    }

    public static void display(String[] elems){
        System.out.println("\nСтроковый массив: ");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }

    public static void display(int[] elems){
        System.out.println("\nЦелочисленный массив: ");
        for (int i = 0; i < elems.length; i++) {
            System.out.println("Элемент " + i + " - " + elems[i]);
        }
    }


}
