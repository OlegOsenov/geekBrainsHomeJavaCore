package testMaikMakGrat.CarVersion3;

public class Car {
    private String maker;
    private String color;
    private String bodyType;

    private String accelerate(){
        String motion = "Ускоряется...";
        return motion;
    }
    public void setCar(String brand, String paint, String style){
        maker = brand;
        color = paint;
        bodyType = style;
    }
    public void getCar()
        {
            System.out.println(maker + " цвет " + color);
            System.out.println(maker + " тип кузова " + bodyType);
            System.out.println(maker + "  " + accelerate() + "\n");
        }


}
