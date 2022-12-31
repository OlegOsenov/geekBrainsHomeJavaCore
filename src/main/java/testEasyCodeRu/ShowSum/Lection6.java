package testEasyCodeRu.ShowSum;

public class Lection6 {
    public static void main(String[] args) {
        final String player1 = "John";
        final String player2 = "Mike";

        String currentPlayer = player1;
        doStep(currentPlayer);
        currentPlayer = player2;
        doStep(currentPlayer);
        currentPlayer = player1;
        doStep(currentPlayer);
    }

    private static void doStep(String playerName) {
        System.out.println(playerName + " is making step");
    }
}
