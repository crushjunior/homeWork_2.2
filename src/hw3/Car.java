package hw3;

    public class Car {
        String brand;
        String model;
        double engineVolume;
        String color;
        int productionYear;
        String productionCountry;

        Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
        }

        Car(double engineVolume, String color, int productionYear) {
            this.brand = "default";
            this.model = "default";
            this.productionCountry = "default";
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
        }

        Car(String brand, String model, String color, int productionYear, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
            this.engineVolume = 1.5;
        }

        Car(String brand, String model, double engineVolume, int productionYear, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
            this.color = "Белый";
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
        }

        Car(String brand, String model, double engineVolume, String color, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = 2000;
            this.productionCountry = productionCountry;
        }

        public void carInfo() {
            System.out.println(brand + " " + model + ", " + productionYear + " год выпуска, сборка " + productionCountry + ", " + color + " цвет, объем двигателя - " + engineVolume);
        }
    }

