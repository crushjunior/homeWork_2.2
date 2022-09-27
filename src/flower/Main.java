package flower;

import java.util.concurrent.Flow;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower hriz = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "Англия", 69.9, 1);
        Flower gips = new Flower(null, "Турция", 19.5, 10);

        printInfo(rose);
        printInfo(hriz);
        printInfo(pion);
        printInfo(gips);

        System.out.println();

        printCostOfBucket(
                rose, rose, rose,
                hriz, hriz, hriz, hriz, hriz,
                gips
                );

    }

    private static void printInfo(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                        ", страна: " + flower.getCountry() +
                        ", стоимость: " + flower.getCost() +
                        ", срок стояния: " + flower.lifeSpan
        );
    }

    private static void printCostOfBucket(Flower... flowers) {
double totalCost = 0;
int minLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minLifeSpan) {
                minLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
totalCost *= 1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срока хранения: " + minLifeSpan);
    }


}
