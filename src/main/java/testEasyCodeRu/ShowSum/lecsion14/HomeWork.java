package testEasyCodeRu.ShowSum.lecsion14;

public class HomeWork {
    public static void main(String[] args) {
        print("Задание 1:");
        multipleOfThree(new int[]{1, 2, 3, 4, 5, 6, 7, -7});
        multipleOfThree(new int[]{3, 6, 9, 12, 13, 15});
        multipleOfThree(new int[]{1, 2, 4, 5});
        multipleOfThree(new int[]{});
        print("--------------------------------------------");
        print("Задание 2:");
        checkMultiple(2, new int[]{1, 2, 3, 4});
        checkMultiple(6, new int[]{9, 2, 13, 24});
        print("--------------------------------------------");
        print("Задание 3:");
        fibonacciCheck(new int[]{1, 2, 3, 4, 5, 6});

    }

    private static void fibonacciCheck(int[] array) {
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            print(array[i]);
        }
    }

    private static void checkMultiple(int check, int[] array) {
        int temp = 0;
        isEmptyArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % check == 0) {
                temp = array[i];
                printF("[" + temp + "]");
            }
        }
        print("");
    }

    private static void multipleOfThree(int[] array) {
        isEmptyArray(array);
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            if (array[i] % 3 == 0) {
                temp = array[i];
                printF("[" + temp + "]");
            }
        }
        print("");
    }

    private static void isEmptyArray(int[] array) {
        if (array.length == 0) {
            print("Массив пустой");
        }
    }

    private static void print(String msg) {
        System.out.println(msg);
    }

    private static void printF(String msg) {
        System.out.print(msg);
    }

    private static void print(int msg) {
        System.out.println(msg);
    }
}
