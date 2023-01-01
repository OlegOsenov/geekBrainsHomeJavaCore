package testEasyCodeRu.ShowSum.lecsion11;

public class Home {
    private static int counter = 0;
    private static int gamerNumber = 1;

    public static void main(String[] args) {
        System.out.println("Задание 1:");
        print(triangle(3, 3, 3));
        System.out.println("---------------------------");
        System.out.println("Задание 2");
        print(max(1, 2, 3, 4));
        System.out.println("---------------------------");
        System.out.println("Задание 3");
        workHome(true, true);
        workHome(true, false);
        workHome(false, true);
        workHome(false, false);
        System.out.println("---------------------------");
        System.out.println("Задача №5");
        accessToContent(19);
        System.out.println("---------------------------");
        System.out.println("Задача №6");
        whereToGo(19);
        whereToGo(17);
        whereToGo(170);
        System.out.println("---------------------------");
        System.out.println("Задача №7");
        noLoveAntoniDen("Антон");
        noLoveAntoniDen("Олег");
        noLoveAntoniDen("Денис");
        System.out.println("---------------------------");
        System.out.println("Задача №8");
        increment();
        increment();
        increment();
        increment();
        increment();
        increment();
        System.out.println("---------------------------");
        System.out.println("Задача №9");
        waterCondition(100);
        waterCondition(0);
        waterCondition(-3);
        System.out.println("---------------------------");
        System.out.println("Задача №11");
        print(equalsToString("Олег", "Олег"));
        print(equalsToString("Олег", ""));
        System.out.println("---------------------------");
        System.out.println("Задача №12");
        stringCheck("Олег");
        stringCheck("http:// oleg.osenov");
        stringCheck("oleg.osenov http://");
        System.out.println("---------------------------");
        System.out.println("Задача №13");
        arithmeticMean(5, 3, 4, 5, 2);
        arithmeticMean(5, 5, 5, 5, 5);
        arithmeticMean(4, 4, 5, 5, 4);
        System.out.println("---------------------------");
        System.out.println("Задача №14");
        ivanIvanov("Иван", "Иванов");
        ivanIvanov("Иван", "Осенов");
        ivanIvanov("Олег", "Осенов");
        System.out.println("---------------------------");
        System.out.println("Задача №15");
        print(module(1));
        print(module(0));
        print(module(-5));
        System.out.println("---------------------------");
        System.out.println("Задача №16");
        isRectangle(5, 5, 5, 5);
        isRectangle(5, 6, 5, 6);
        isRectangle(5, 4, 5, 6);
        System.out.println("---------------------------");
        System.out.println("Задача №17");
        print(unlockLesson(1, false));
        print(unlockLesson(12, true));
        print(unlockLesson(1, true));
        print(unlockLesson(13, false));
        print(unlockLesson(103, true));
        System.out.println("---------------------------");
        System.out.println("Задача №18");
        games(1, "step1");
        games(1, "step2");
        games(2, "step3");
        games(2, "step4");
        games(1, "step5");


    }
    // Задача 18
    private static void games(int gamer, String str){
        if (gamer == gamerNumber){
            print(str);
            gamerNumber = gamerNumber == 1 ? 2:1;
        }
    }

    // Задача 17
    private static boolean unlockLesson(int number, boolean isUserPremium) {
       if (number < 1 || number > 100){
           print("Номер урока не валидный");
           return false;
       }else {
           return isUserPremium || number == 1;
       }
    }

    // Задача 16
    private static void isRectangle(int AB, int BC, int CD, int DA) {
        if (AB == BC && BC == CD && CD == DA) {
            print("Квадрат");
        } else if (AB == CD && BC == DA) {
            print("Прямоугольник");
        } else {
            print("Четырехугольник");
        }
    }
    // Задача 15

    private static int module(int number) {
        return number > 0 ? number : number * (-1);
    }

    //Задача 14
    private static void ivanIvanov(String name, String surname) {
        if (name.equals("Иван") && surname.equals("Иванов")) {
            print("Комбо");
        } else if (name.equals("Иван")) {
            print(name + " вам отказано");
        } else {
            print("Здравствуйте " + name + " " + surname);
        }
    }

    // Задача 13
    private static void arithmeticMean(int a, int b, int c, int d, int e) {
        int result = (a + b + c + d + e) / 5;
        if (result == 5) {
            print("Отличник");
        } else if (result >= 4) {
            print("Хорошист");
        } else {
            print("Удовлетворительно");
        }

    }

    // Задача 12
    private static void stringCheck(String str) {
        print(str.startsWith("http://") ? "Строка содержит http:// " + str : "Строки с http нету");

    }

    // Задача 11
    private static boolean equalsToString(String str1, String str2) {
        return !str1.isEmpty() && !str2.isEmpty() && str1.equals(str2);
    }

    // Задача №9
    private static void waterCondition(int a) {
        if (a >= 100) {
            print("Пар");
        } else if (a >= 0) {
            print("Вода");
        } else {
            print("Лед");
        }
    }

    //Задача №8
    private static void increment() {
        if (counter < 5) {
            print("Вызов метода increment");
            counter++;
        } else {
            print("Метод инкремент превысил количество вызовов");
        }
    }

    // Задача №7

    private static void noLoveAntoniDen(String name) {
        String antoni = "Антон";
        String den = "Денис";
        print(antoni.equalsIgnoreCase(name) || den.equalsIgnoreCase(name) ? "Добро пожаловать отсюда " + name :
                "Добро пожаловать " + name);

    }

    // Задание №6
    private static void whereToGo(int age) {
        if (age < 0 || age > 110) {
            print("Вы бот");
        } else if (age >= 18) {
            print("Вам по взрослым делам");
        } else {
            print("Вам учиться");
        }
    }

    //Задание 5
    private static void accessToContent(int age) {
        print(age > 18 ? "Доступ к контенту разрешен" : "Доступ запрещен");

    }

    // Задание 3
    private static void workHome(boolean weekend, boolean holiday) {
        if (!holiday) {
            if (weekend) {
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
