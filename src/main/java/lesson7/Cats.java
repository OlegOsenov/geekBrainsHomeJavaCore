package lesson7;

public class Cats {

    private String name;
    private int appetite;
    private boolean hungry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    void info() {
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + isHungry);
    }

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void eat(Bowl bowl) {
        if (hungry && bowl.decreaseFood(appetite)) {
            hungry = false;
        }
    }
}
