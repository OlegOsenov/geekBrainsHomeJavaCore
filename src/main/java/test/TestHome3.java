package test;

import java.util.Random;
import java.util.Scanner;

public class TestHome3 {

    static Scanner scanner = new Scanner(System.in);

    private static void guessGame() {
        int counter = 1;
        Random random = new Random();
        int x = random.nextInt(10);
        boolean isNumber = false;
        int number = 0;
        boolean f = true;
        while (counter < 4 && f) {
            System.out.println("Угадайте число от 0 до 9 \nВведите ваше число : ");
            isNumber = scanner.hasNextInt();
            if (isNumber) {
                number = scanner.nextInt();
                scanner.nextLine();
                if (x == number) {
                    System.out.println("Вы угадали");
                    f = false;
                } else if (x > number) {
                    System.out.println("Ваше число больше, кол-во попыток " + counter);
                    counter++;
                } else if (x < number) {
                    System.out.println("Ваше число меньше, кол-во попыток " + counter);
                    counter++;
                }

            } else {
                System.out.println("Вы ввели некорректные данные, введите число, кол-во попыток " + counter);
                counter++;
                scanner.nextLine();
            }
        }
    }

    static void tack3() {
        boolean isExit = false;
        int userScan = 0;
        boolean isUser = false;
        guessGame();
        do {
            System.out.println("Повторить игру? да = 1, нет = 0");
            isUser = scanner.hasNextInt();
            if (isUser) {
                userScan = scanner.nextInt();
                scanner.nextLine();
                if (userScan == 1) {
                    guessGame();
                } else {
                    isExit = true;
                }
            } else {
                System.out.println("Вы ввели некорректные данные, повторите");
                scanner.nextLine();
            }
        } while (!isExit);
    }

    public static void main(String[] args) {
        /*
        Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        tack3();


    }
}
