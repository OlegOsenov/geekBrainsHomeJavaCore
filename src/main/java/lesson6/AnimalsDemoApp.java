package lesson6;

public class AnimalsDemoApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Бублик");
        Cat cat1 = new Cat("Сева");
        cat.run(250);
        cat.swim(100);

        Dog dog = new Dog("Зевс");
        Dog dog1 = new Dog("Чарли");
        dog.run(400);
        dog.swim(5);

        System.out.println("Кол-во котов: " + Cat.catCounter + " | Кол-во собак: " + Dog.dogCounter +
                " | Кол-во животных : " + Animal.animalCounter);


    }
}
