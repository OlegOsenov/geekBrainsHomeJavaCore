package testEasyCodeRu.ShowSum;

public class Lection6Dz {
    public static void main(String[] args) {
        final String user = "Оброжка";
        String food = "Мясо";
        doFood(food,user);

    }

    private static void doFood(String food,String user) {
        System.out.println(user + " покушал " + food);
    }

}

