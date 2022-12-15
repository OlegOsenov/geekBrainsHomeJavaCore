package lesson8;

public class Human implements Players {
    private String name;
    private int maxRun;
    private int maxJump;

    @Override
    public String getName() {
        return name;
    }

    public Human(String name, int maxRun, int maxJump) {
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
