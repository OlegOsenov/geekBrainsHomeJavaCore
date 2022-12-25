package testMaikMakGrat;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Alfa");
        list.add("Delta");
        list.add("Charli");
        list.add("Beta");
        System.out.println("Список " + list);
        System.out.println("Заменяем: " + list.get(1) + "\n");
        list.set(1,"Bravo");
        list.forEach((x) -> System.out.println("Элемент: " + x));
    }
}
