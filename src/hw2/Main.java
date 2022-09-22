package hw2;

public class Main {
    public static void main(String[] args) {
        Human max = new Human(-1);
        Human anya = new Human("Аня", "Москва", "Методист образовательных программ", 1993);
        Human katya = new Human("Катя", "Калининград", "Продакт-менеджер", 1994);
        Human artem = new Human("Артём", "Москва", "Директор по развитию бизнеса", 1995);

        max.hello();
        anya.hello();
        katya.hello();
        artem.hello();

        System.out.println();

        Car lada = new Car("Lada", "Granta", 1.7, "Жёлтый", 2015, "Россия");
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
