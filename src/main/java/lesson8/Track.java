package lesson8;

public class Track implements Trap{
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Players players) {
        if (players.run(this.length)){
            System.out.println("Пробежал по дороге участник " + players.getName() + " длина препятсвия " + this.length);
            return true;
        }
        System.out.println("Не смог пробежать участник " + players.getName() + " длина препятсвия " + this.length);
        return false;
    }
}
