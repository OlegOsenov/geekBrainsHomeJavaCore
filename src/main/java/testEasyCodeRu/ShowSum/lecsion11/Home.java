package testEasyCodeRu.ShowSum.lecsion11;

public class Home {

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        print(triangle(3, 3, 3));
        System.out.println("---------------------------");
        System.out.println("Задание 2");
        print(max(1, 2, 3, 4));
        System.out.println("---------------------------");
        System.out.println("Задание 3");
        workHome(true,true);
        workHome(true,false);
        workHome(false,true);
        workHome(false,false);
        System.out.println("---------------------------");
        System.out.println("Задача №5");



    }
    //Задание 5
    private static void accessToContent(){

    }

    // Задание 3
    private static void workHome(boolean weekend, boolean holiday) {
        if (!holiday){
            if (weekend){
                print("Alarm on 11:00");
            } else {
                print("Alarm on 6.00! Go to work");
            }
        } else {
            print("Отдыхаем");
        }
    }

    // Задание 1
    private static boolean triangle(int a, int b, int c) {

        return (a + b) > c && (c + a) > b && (c + b) > a;
    }

    private static void print(boolean b) {
        System.out.println(b);
    }
    private static void print(String b) {
        System.out.println(b);
    }

    private static void print(int b) {
        System.out.println(b);
    }

    // Задание 2
    private static int max(int a, int b, int c, int d) {
        int max;
        if (a > b && a > c && a > d) {
            max = a;
        } else if (b > a && b > c && b > d) {
            max = b;
        } else if (c > a && c > b && c > d) {
            max = c;
        } else {
            max = d;
        }

        return max;
    }
}
