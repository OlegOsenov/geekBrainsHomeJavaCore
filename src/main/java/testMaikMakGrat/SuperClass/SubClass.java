package testMaikMakGrat.SuperClass;

public class SubClass extends SuperClass{
    public static void main(String[] args) {

        hello();
        SuperClass.hello();
        try {
            echo(args[0]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ввода данных не было");
        }

    }
    public static void hello(){
        System.out.println("Привет из Подкласса");
    }
}
