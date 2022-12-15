package lesson8;

public class Cat implements Players {
    private String name;
    private int maxRun;
    private int maxJump;

    public String getName() {
        return name;
    }



    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public boolean run(int length) {
        return this.maxRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.maxJump >= height;
    }
}
