package testEasyCodeRu.ShowSum;

public class Main {
    public static void main(String[] args) {
        int sum1 = sum(3, 4);
        int diff1 = difference(7, 5);
        final int multiplication1 = multiply(sum1, diff1);
        print(multiplication1);

        sum1 = sum(5, 6);
        diff1 = difference(8, 4);
        final int multiplication2 = multiply(sum1, diff1);
        print(multiplication2);
    }

    private static int sum(int numb1, int numb2) {
        return numb1 + numb2;
    }

    private static int sumString(String numb1, String numb2) {
        return (Integer.valueOf(numb1) + Integer.valueOf(numb2));
    }

    private static void print(int numb) {
        System.out.println(numb);
    }

    private static int difference(int numb1, int numb2) {
        return numb1 - numb2;
    }

    private static int multiply(int numb1, int numb2) {
        return numb1 * numb2;
    }
}
