package testEasyCodeRu.ShowSum;

public class Main {
    public static void main(String[] args) {
        showSum("3", "4");
    }

    private static void showSum(Integer numb1, Integer numb2) {
        System.out.println(numb1 + numb2);
    }

    private static void showSum(String numb1, String numb2) {
        System.out.println(Integer.valueOf(numb1) + Integer.valueOf(numb2));
    }
}
