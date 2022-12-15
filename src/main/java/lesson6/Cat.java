package lesson6;

public class Cat extends Animal {
    public static int catCounter;
    public static void countAdd() {
        catCounter++;
    }

    public Cat(String name) {
        super(name);
        Cat.countAdd();

    }

    public void run(int i) {
        if (i > 200) {
            System.out.println("Кот по имени " + super.getName() + " не может столько бегать");
        } else {
            System.out.println("Кот по имени " + super.getName() + " пробежал " + i);
        }
    }

    public void swim(int i) {
        System.out.println("Кот по имени " + super.getName() + " не умеет плавать");

    }
}
