package lesson5;

public class Person {
   private String name;  // ФИО
   private String post; // Должность
   private String email;// email
   private int telephone;  // телефон
   private double salary;// зарплата
   private int age; // возраст

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String post, String email, int telephone, double salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("ФИО : " + name + " email: " + email + " номер телефон: " + telephone + " з/п : " + salary
        + " возраст : " + age);
    }
}
