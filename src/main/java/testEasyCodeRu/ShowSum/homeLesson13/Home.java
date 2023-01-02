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
        for (int i = 0; i < ints.length; i++) {
            multi = multi * ints[i];

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

}
