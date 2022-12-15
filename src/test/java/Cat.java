public class Cat {
    private String name;
    private String color;
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Не верно указан возраст");
        }
    }

    public int getAge() {
        return age;
    }

    public Cat() {
        System.out.println("Это конструктор класса Cat");
        name = "Барсик";
        color = "Белый";
        age = 2;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public Cat(String name) {
        this.name = name;
        this.color = "неизвестно";
        this.age = 1;
    }

    void displayInfo() {
        System.out.println("Имя кота: " + name + " цвет : " + color + " возраст: " + age);
    }
}
