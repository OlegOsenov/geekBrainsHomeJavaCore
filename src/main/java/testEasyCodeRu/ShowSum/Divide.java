package testEasyCodeRu.ShowSum;

public class Divide {

    public static void main(String[] args) {

        print(showDivide(10, 4.5f));
        print(showDivide(10, Double.parseDouble("4.25")));

    }

    private static float showDivide(int i, float i1) {
        return (i / i1);
    }

    private static double showDivide(int i, double i1) {
        return (i / i1);
    }

    private static int showDivide(int i, int i1) {
        return (i / i1);
    }

    private static void print(float numb1) {
        System.out.println(numb1);
    }

    private static void print(int numb1) {
        System.out.println(numb1);
    }

    private static void print(double numb1) {
        System.out.println(numb1);
    }


}
