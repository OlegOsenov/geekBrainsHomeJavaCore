package lesson8;

public class StartGamePlayers {
    public static void main(String[] args) {
        Players[] players = {
                new Cat("Рыжик",100,200),
                new Cat("Марта",50,100),
                new Human("Николай",500, 10),
                new Human("Вася",1000, 20),
                new Robot("Робокоп", 10,50)
        };
        Trap[] traps = {
                new Track(500),
                new Wall(5),
                new Track(50),
                new Wall(15)
        };

        for (Players p:players) {
            for (Trap t:traps) {
                if (!t.overcome(p)) break;
            }
        }
    }
}
