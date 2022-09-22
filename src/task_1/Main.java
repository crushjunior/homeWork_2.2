package task_1;

public class Main {
    public static void main(String[] args) {
        Human max = new Human();
        max.name = "Максим";
        max.town = "Минск";
        max.yearOfBirth = 1987;

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1994;

        Human artem = new Human();
        artem.name = "Артём";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;

        max.hello();
        anya.hello();
        katya.hello();
        artem.hello();
    }
}
