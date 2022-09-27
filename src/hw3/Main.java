package hw3;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        Human max = new Human("Максим", "Минск", "Бренд-менеджер", currentYear - 35);
        Human anya = new Human("Аня", "Москва", "Методист образовательных программ", currentYear - 29);
        Human katya = new Human("Катя", "Калининград", "Продакт-менеджер", currentYear - 28);
        Human artem = new Human("Артём", "Москва", "Директор по развитию бизнеса", currentYear - 27);
        Human vova = new Human("Владимир", "Казань", null, currentYear - 21);

        max.hello();
        anya.hello();
        katya.hello();
        artem.hello();
        vova.hello();

        System.out.println();

        Car lada = new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия");
        lada.setGear("Автомат");
        lada.setRegNumber("e123rr1223");
        System.out.println(lada.isCorrectNumber());
        lada.changeTyre();
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "Чёрный", 2021, "Германия");
        Car kia = new Car("KIA", "Sportage", 2.4, "Красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");


        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
    }
}


