package lesson9;

public class ArrayException {

    public static void main(String[] args) {

        String[][] array1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"},};
        System.out.println(Sum(array1));
    }

    public static int Sum(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }
}
