package test;

public class Loops {
    public static void main(String[] args) {
        String[] htm = {"HTML", "in", "easy", "steps"};
        int i = 0;
        while (i < htm.length) {
            System.out.println("htm[" + i + "] - | " + htm[i]);
            i++;
        }

        String[] xml = {"XML", "in", "easy", "steps"};
        int k = 0;
        if (xml.length > 0) do {
            System.out.println("\t\txml[" + k + "] - | " + xml[k]);
            k++;
        } while (k < xml.length);
    }
}
