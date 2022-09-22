package hw2;

public class Main {
    public static void main(String[] args) {
        Human max = new Human("Максим", "Минск", "Бренд-менеджер", 1987);
        Human anya = new Human("Аня", "Москва", "Методист образовательных программ", 1993);
        Human katya = new Human("Катя", "Калининград", "Продакт-менеджер", 1994);
        Human artem = new Human("Артём", "Москва", "Директор по развитию бизнеса", 1995);

        max.hello();
        anya.hello();
        katya.hello();
        artem.hello();
    }
}
