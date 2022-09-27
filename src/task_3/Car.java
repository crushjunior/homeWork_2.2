package task_3;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public void carInfo() {
        System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка в " + productionCountry + ", " + color + " цвет, объем двигателя - " + engineVolume);
    }
}
