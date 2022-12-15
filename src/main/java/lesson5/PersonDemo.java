package lesson5;

public class PersonDemo {
    public static void main(String[] args) {

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Артур","Охрана","art@mail.ru",34546546, 45.500, 35);
        persArray[1] = new Person("Ваня","Менеджер","van@mail.ru",98765, 55.500, 46);
        persArray[2] = new Person("Ирина","Администратор","ir@mail.ru",34346546, 55.000, 26);
        persArray[3] = new Person("Николай","Бухгалтер","nik@mail.ru",66646546, 75.800, 47);
        persArray[4] = new Person("Настя","Директор","nas@mail.ru",77846546, 95.500, 33);

        infoPersonal(persArray);
        System.out.println("_________________________________________________________");
        persPoisk(persArray);
    }

    private static void infoPersonal(Person[] persArray) {
        for (int i = 0; i < persArray.length; i++) {
            persArray[i].displayInfo();
        }
    }

    private static void persPoisk(Person[] persArray) {
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].displayInfo();
            }
        }
    }


}
