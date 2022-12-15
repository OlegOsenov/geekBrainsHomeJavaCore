package lesson2;

import java.util.Arrays;

public class Home2 {
    public static void main(String[] args) {
        System.out.println("Задание 1 : ");

// 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
// условия заменить 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

// 2.Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
//значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание 2 :");
        int[] arr2 = new int[8];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
        for (int a : arr2) {
            System.out.print(a + " ");
        }
        System.out.println();
//3 .Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//умножить на 2;
        System.out.println("Задание 3: ");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
        }
        for (int a : arr3) {
            System.out.print(a + " ");
        }
        System.out.println();

        // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
        //одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание 4 :");
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = 0;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
        //помощи интернета);
        System.out.println("Задание 5 :");
        int[] arr5 = {1, 5, 3, 7};
        int x = 0;
        int y = 0;
        int max = arr5[x];
        int min = arr5[y];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                x = i;
            } else if (arr5[i] < min) {
                min = arr5[i];
                y = i;
            }

        }
        System.out.println("Max = " + max + " Min = " + min);
    }
}
