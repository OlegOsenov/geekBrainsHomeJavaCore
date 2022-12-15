package lesson6;

public class Dog extends Animal {
    public static int dogCounter;
    public static void countAdd(){
        dogCounter++;
    }

    public Dog(String name) {
        super(name);
        Dog.countAdd();
    }

    public void run(int i) {
        if (i > 500) {
            System.out.println("Собака по имени " + super.getName() + " не может столько бегать");
        } else {
            System.out.println("Собака по имени " + super.getName() + " пробежал " + i);
        }
    }


    public void swim(int i) {
        if (i > 10) {
            System.out.println("Собака по имени " + super.getName() + " не может столько плыть");
        } else {
            System.out.println("Собака по имени " + super.getName() + " проплыла " + i);
        }
    }
}
