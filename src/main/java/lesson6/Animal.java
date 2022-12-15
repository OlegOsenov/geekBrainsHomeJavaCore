package lesson6;


public class Animal {
    private String name;
    public static int animalCounter;

    public static void countAdd() {
        animalCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Animal(String name) {
        this.name = name;
        Animal.countAdd();
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    public void run() {
        System.out.println("Животное бегает");
    }

    public void swim() {
        System.out.println("Животное умеет плавать");
    }
}
