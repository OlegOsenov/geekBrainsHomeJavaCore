public class CatDemoApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик","Белый",2);
        Cat cat2= new Cat("Черныш");
        cat1.setAge(-1);

        cat1.displayInfo();
        cat2.displayInfo();
    }

}
