package testEasyCodeRu.ShowSum.homeLesson13;

public class Home {

    public static void main(String[] args) {
        print("Задание 1 :");
        arrayMin(new int[]{1,2,3,4,5,6,7,-7});
        print("----------------------------------------");
        print("Задание 2 :");
        multiArray(new int[]{3,3,3,3,3,4,5});
    }

    private static void multiArray(int[] ints) {
        int multi = 1;
        for (int i = 0; i < ints.length; i++) {
            multi = multi * ints[i];

        }
        print("Произведение всех чисел в массиве = "+ multi);

    }

    // Задание 1
    private static void arrayMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        print("Минимальное значение в массиве :" + min);
    }
    private static void print(String msg){
        System.out.println(msg);
    }
    private static void print(int msg){
        System.out.println(msg);
    }

}
