package testEasyCodeRu.ShowSum.lecsion14;

public class HomeWork {
    public static void main(String[] args) {
        print("Задание 1 :");
        multipleOfThree(new int[]{1, 2, 3, 4, 5, 6, 7, -7});
        multipleOfThree(new int[]{});
        multipleOfThree(new int[]{3, 6, 9, 12, 13, 15});
        multipleOfThree(new int[]{1,2,4,5});

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

}
