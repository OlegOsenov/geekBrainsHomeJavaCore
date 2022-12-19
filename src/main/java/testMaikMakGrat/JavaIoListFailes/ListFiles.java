package testMaikMakGrat.JavaIoListFailes;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("data");
        if (dir.exists()){
            String[] file = dir.list();
            System.out.println(file.length + " файлов найдено...");
            for (int i = 0; i < file.length; i++) {
                System.out.println(file[i]);
            }
        }
        else {
            System.out.println("Каталог не найден");
        }
    }
}
