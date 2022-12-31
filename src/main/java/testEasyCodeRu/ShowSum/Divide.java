package testEasyCodeRu.ShowSum;

public class Divide {

    public static void main(String[] args) {
        showDivide(10, 0);

    }


    private static void showDivide(int i, int i1) {
        if (i1 == 0) {
            print("second argument is zero");
        } else {
            print(i / i1);
        }
    }


    private static void print(int numb1) {
        System.out.println(numb1);
    }


    private static void print(String numb1) {
        System.out.println(numb1);
    }

}
