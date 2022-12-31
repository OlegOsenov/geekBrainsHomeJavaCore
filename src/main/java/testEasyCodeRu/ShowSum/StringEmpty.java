package testEasyCodeRu.ShowSum;

public class StringEmpty {

    public static void main(String[] args) {

        String text = "";
        boolean isTextEmpty = text.isEmpty();
        System.out.println(isTextEmpty);
        text = "some ";
        isTextEmpty = text.isEmpty();
        System.out.println(isTextEmpty);
    }
}
