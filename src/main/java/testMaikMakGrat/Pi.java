package testMaikMakGrat;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        float shortPi = (float) Math.PI;
        float circ = shortPi * (radius + radius);
        float area = shortPi * (radius * radius);

        System.out.print("Если число PI рассчитано в диапазоне от " + Math.PI);
        System.out.println(" до " + shortPi + "...");
        System.out.println("Окружность с радиусом " + radius + " см");
        System.out.print(" имеет длину " + circ + " см");
        System.out.println(" и площадь " + area + " кв.см");
    }
}
