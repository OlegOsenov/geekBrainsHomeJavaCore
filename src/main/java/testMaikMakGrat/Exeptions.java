package testMaikMakGrat;

import java.util.Scanner;

public class Exeptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");

        try {
            int number = scanner.nextInt();
            System.out.println("Вы ввели: " + number);
        }
        catch (Exception e)
        {
            System.out.println("Неверный формат аргументов");
        }
        finally {
            System.out.println("Программа завершила работу");
        }

    }


}
