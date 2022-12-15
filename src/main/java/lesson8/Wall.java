package lesson8;

public class Wall implements Trap {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Players players) {
        if (players.jump(this.height)) {
            System.out.println("Прыгнул на препятсвие участник " + players.getName() + " высота препятсвия " + this.height);
            return true;
        }
        System.out.println("Не смог прыгнуть " + players.getName() + " высота препятсвия " + this.height);
        return false;
    }
}
