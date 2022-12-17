package testMaikMakGrat.SuperClass;

public class SuperClass {

    // выводит стороку для идентификаций
    public static void hello(){
        System.out.println("Привет из Суперкласса");

    }
    // вывод переденого аргумента
    public static void echo(String arg){
        try {
            System.out.println("Вы ввели: " + arg);
        }catch (Exception e){
            System.out.println("Требуется аргумент");
        }
    }
}
