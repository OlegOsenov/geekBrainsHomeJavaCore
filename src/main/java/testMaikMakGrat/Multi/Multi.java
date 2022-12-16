package testMaikMakGrat.Multi;

public class Multi {
    public static void main(String[] args) {

        String msg = "Это глобальная переменная класса Multi";
        System.out.println(msg);
        System.out.println(Data.txt);
        Data.greeting();
        Draw.line();
    }
}
