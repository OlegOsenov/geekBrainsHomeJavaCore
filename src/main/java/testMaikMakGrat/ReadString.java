package testMaikMakGrat;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString {
    public static void main(String[] args) {

        System.out.println("Введите название данной книги: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";

        try {
            input = buffer.readLine();
            buffer.close();
        }
        catch (IOException e){
            System.out.println("Произошла ошибка ввода");
        }
        System.out.println("\nСпасибо, вы читаете " + input);
    }
}
