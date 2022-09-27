package task_1;

public class Main {
    public static void main(String[] args) {
        Human max = new Human();
        max.name = "Максим";
        max.town = "Минск";
        max.yearOfBirth = 1987;
        max.job = "Бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.town = "Москва";
        anya.yearOfBirth = 1993;
        anya.job = "Методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 1994;
        katya.job = "Продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артём";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.job = "Директор по развитию бизнеса";

        max.hello();
        anya.hello();
        katya.hello();
        artem.hello();
    }
}
