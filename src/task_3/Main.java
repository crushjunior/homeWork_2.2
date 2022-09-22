package task_3;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.engineVolume = 1.7;
        lada.color = "Жёлтый";
        lada.productionYear = 2015;
        lada.productionCountry = "Россия";

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.engineVolume = 3.0;
        audi.color = "Чёрный";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.engineVolume = 3.0;
        bmw.color = "Чёрный";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";

        Car kia = new Car();
        kia.brand = "KIA";
        kia.model = "Sportage";
        kia.engineVolume = 2.4;
        kia.color = "Красный";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.engineVolume = 1.6;
        hyundai.color = "Оранжевый";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";

        lada.carInfo();
        audi.carInfo();
        bmw.carInfo();
        kia.carInfo();
        hyundai.carInfo();
    }
}
