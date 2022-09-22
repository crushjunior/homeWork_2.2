package task_1;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public void hello() {
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + "Я родился(лась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". " + "Будем знакомы!");
    }
}
