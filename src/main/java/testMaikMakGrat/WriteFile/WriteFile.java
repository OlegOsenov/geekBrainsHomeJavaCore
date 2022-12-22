package testMaikMakGrat.WriteFile;

import java.io.*;
import java.util.Arrays;

public class WriteFile {
    public static void main(String[] args) {

        try {
            FileWriter file = new FileWriter("tam.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("Дул ветер из последних сил,");
            buffer.newLine();
            buffer.write("И град хлестал, и ливень лил,");
            buffer.newLine();
            buffer.write("И вспышки молний тьма глотала,");
            buffer.newLine();
            buffer.close();
        }
        catch (IOException e){
            System.out.println("Произошла ошибка записи");
        }
    }
}
