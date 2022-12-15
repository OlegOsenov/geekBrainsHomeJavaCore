package lesson7;

public class CatsDemoApp {
    public static void main(String[] args) {


        Cats[] catsArr = {new Cats("Василий", 30), new Cats("Рыжик", 10),
                new Cats("Марвел", 5)};
        Bowl bowlArr = new Bowl();
        bowlArr.putFood(30);

        for (Cats cats1: catsArr) {
            cats1.eat(bowlArr);
            cats1.info();
        }
    }
}
