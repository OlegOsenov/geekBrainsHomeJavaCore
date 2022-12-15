package lesson7;

public class Bowl {
    private int foodAmount;

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }

    public void putFood(int amount){
        this.foodAmount += amount;
        System.out.printf("Кол-во еды увеличенно на %d\n", this.foodAmount);
    }
    boolean decreaseFood(int amount){
        int diff = foodAmount - amount;
        if (diff < 0) {
            System.out.println("Не достаточно еды ");
            return false;
        } else {
            this.foodAmount -= amount;
        }
        System.out.printf("Кол-во еды осталось  %d\n", this.foodAmount);
        return true;
    }
}
