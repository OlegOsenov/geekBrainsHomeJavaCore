package testMaikMakGrat.CarVersion3;

public class SafeInstance {
    public static void main(String[] args) {
        Car Porsche = new Car();
        Porsche.setCar("Порше", "Красный","Купе");
        Porsche.getCar();
        Car Bentley = new Car();
        Bentley.setCar("Бентли","Зеленый","Седан");
        Bentley.getCar();
    }
}
