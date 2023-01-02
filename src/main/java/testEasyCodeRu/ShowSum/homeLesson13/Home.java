package testEasyCodeRu.ShowSum.homeLesson13;

public class Home {

    public static void main(String[] args) {
        print("Задание 1 :");
        arrayMin(new int[]{1, 2, 3, 4, 5, 6, 7, -7});
        print("----------------------------------------");
        print("Задание 2 :");
        multiArray(new int[]{3, 3, 3, 3, 3, 4, 5});
        print("----------------------------------------");
        print("Задание 3 :");
        arrayNegativ(new int[]{1, -2, 3, -4, 5, 6, 7, -7});
        print("----------------------------------------");
        print("Задание 4 :");
        arrayCheck(1, new int[]{1, -2, 3, -4, 5, 1, 8, -7});
        print("----------------------------------------");
        print("Задание 5 :");
        arrayIsEmpty(new String[]{"", "1", "", "2"});
        print("Задание 6 :");
        print(arrayCheckArithmetic(new int[]{5, 8, 11, 14, 17}));
        print(arrayCheckArithmetic(new int[]{4,8,10,12}));
    }

    private static boolean arrayCheckArithmetic(int[] numbers) {
        boolean result = true;
        if (numbers.length == 0) {
            print("Массив пустой");
            result = false;
        } else if (numbers.length > 2) {
            int difference = numbers[1] - numbers[0];
            for (int i = 1; i < numbers.length - 1; i++) {
                int diff = numbers[i + 1] - numbers[i];
                if (diff != difference) {
                    result = false;
                }
            }
        } else {
            print("Слишком мало данных");
            result = false;
        }
        return result;
    }

    private static void arrayIsEmpty(String[] arrStr) {
        int count = 0;
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].isEmpty()) {
                count++;
            }
        }
        print("Количество пустых строк в массиве: " + count);
    }

    private static void arrayCheck(int check, int[] array) {
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            if (check == array[j]) {
                count++;
            }
        }
        print("Найденно совпадение : " + count);
    }

    private static void arrayNegativ(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                print(array[i]);
            }
        }
    }

    private static void multiArray(int[] ints) {
        int multi = 1;
        for (int anInt : ints) {
            multi *= anInt;
        }
        print("Произведение всех чисел в массиве = " + multi);

    }

    // Задание 1
    private static void arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        print("Минимальное значение в массиве :" + min);
    }

    private static void print(String msg) {
        System.out.println(msg);
    }

    private static void print(int msg) {
        System.out.println(msg);
    }

    private static void print(boolean msg) {
        System.out.println(msg);
    }

}
