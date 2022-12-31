package testEasyCodeRu.ShowSum;

public class Lection6Dz {
    private static final String USER = "Оброжка";

    public static void main(String[] args) {

        String food = "Мясо";
        doFood(food);
        food = "Яблоко";
        doFood(food);

    }

    private static void doFood(String food) {
        System.out.println(USER + " покушал " + food);
    }

}

