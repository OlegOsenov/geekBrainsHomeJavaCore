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
        print("--------------------------------------------");
        print("Задание 4:");
        arrayMinMax(new int[]{1, 2, 3, 4, 5, -6});
        print("--------------------------------------------");
        print("Задание 5:");
        arrayRepeatSearch(new int[]{5, 5, 5, 8, 8});
        print("--------------------------------------------");
        print("Задание 6:");
        arrayRevers(new int[]{1, 2, 3, 4, 5});
        print("--------------------------------------------");
        print("Задание 7:");
        arrayStringThis(new String[]{"this", "oleg", "dog", "this"});

    }

    private static void arrayStringThis(String[] strings) {
        isEmptyArray(strings);
        String str = "this";
        for (int i = 0; i < strings.length; i++) {
            if (str.equals(strings[i])) {
                printF("[" + i + "]");
            }
        }
    }

    private static void arrayRevers(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            printF("[" + array[i] + "]");
        }

    }

    // Задание 5 до решить
    private static void arrayRepeatSearch(int[] array) {
        isEmptyArray(array);
        int count = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    temp = array[i];
                    count++;
                    print(array[j]);
                }
            }
        }
        print("Число " + temp + " повторы " + count);
    }

    private static void arrayMinMax(int[] array) {
        isEmptyArray(array);
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        print("min = " + min + ", max = " + max + ". Разница между min и max = " + (max - min));

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
    private static void isEmptyArray(String[] array) {
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
