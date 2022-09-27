package hw2;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(String name, String town, String job, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.job = job;
        this.yearOfBirth = yearOfBirth;
    }

    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + "Я родился(лась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". " + "Будем знакомы!");
    }
}
