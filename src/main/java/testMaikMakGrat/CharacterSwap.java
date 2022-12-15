package testMaikMakGrat;

public class CharacterSwap {
    public static void main(String[] args) {

        String txt = "";
        if (txt.isEmpty()) txt = "    Боррокудо ";
        System.out.println("Строка: " + txt);
        System.out.println("Длинна первоначальной строки : " + txt.length());
        // удаление пробела в начале и в конце
        txt = txt.trim();
        System.out.println("Строка: " + txt);
        System.out.println("Длинна первоначальной строки : " + txt.length());
        // вывод первого символа строки
        char initial = txt.charAt(0);
        System.out.println("Первая буква: " + initial);


    }
}
