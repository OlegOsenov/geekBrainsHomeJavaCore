package testMaikMakGrat;

public class SumArray {
    public static void main(String[] args) {
    double [] array = {10, 10};
    testSum(array);

    }
    public static void testSum(double[] array) {
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма = " + sum);

    }
}
