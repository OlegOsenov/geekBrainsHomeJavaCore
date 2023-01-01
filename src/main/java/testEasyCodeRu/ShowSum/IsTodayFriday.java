package testEasyCodeRu.ShowSum;

public class IsTodayFriday {

    public static void main(String[] args) {
        print(drink(true, true));
        print(drink(false, true));

    }

    private static boolean drink(boolean isTFriday, boolean aLotOfMoney) {
        return isTFriday || aLotOfMoney;
    }

    private static void print(boolean resul) {
        System.out.println(resul);
    }


}
