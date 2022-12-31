package testEasyCodeRu.ShowSum;

public class StringIf {
    public static void main(String[] args) {
        String text = "txt";
        print(text);
        text = "";
        print(text);
        text = "text";
        print(text);
    }

    private static void print(String text){
        if(!text.isEmpty()){
            System.out.println(text);
        }
    }
}
