package lesson99999;

public class AnimalsApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Барсик","рыжий");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
    }
}
