package lesson1;

// 1 создать проект
public class HomeWork {
    public static void main(String[] args) {
        // 2 типы данных
        byte a = -120;
        short b = 12000;
        int c = 1000;
        long x = 20000L;
        float y = 12.23f;
        double z = -120.120;
        char ch = '*';
        boolean bol = false;

        // 3 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println("ДЗ 3 = " + calculate(2, 2, 2, 2));

        // 4 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
        //в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
        System.out.println("Задание 4 " + task10and20(15, 5));

        // 5 Написать метод, которому в качестве параметра передается целое число, метод должен
        //напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
        //считаем положительным числом.
        isPositiveOrNegative(-6);

        // 6 Написать метод, которому в качестве параметра передается целое число. Метод должен
        //вернуть true, если число отрицательное, и вернуть false если положительное.
        System.out.println("Задание 6 " + isNegative(-6));

        // 7 Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        //Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        greetings("Олег");


    }

    private static void greetings(String str) {
        System.out.println("Привет, " + str + "!");
    }

    private static boolean isNegative(int x) {
        if (x < 0){
            return true;
        }
        return false;
    }

    public static void isPositiveOrNegative(int i) {
        if (i >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean task10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

}
