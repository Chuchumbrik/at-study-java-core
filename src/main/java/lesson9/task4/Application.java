package lesson9.task4;

import lesson9.task4.food.Food;
import lesson9.task4.food.FoodFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    private static final int ORDER_COUNT = 100;
    public static void main(String[] args) {
        List<Cooker> cookers = new ArrayList<>();
        RoundRobinDistributor roundRobinDistributor = new RoundRobinDistributor();
        BusyTimeDistributor busyTimeDistributor = new BusyTimeDistributor();
        Random random = new Random();
        List<Food> order = new ArrayList<>(ORDER_COUNT);
        int maxCookingTimeRoundRobin = 0;
        int maxCookingTimeBusyTime = 0;

        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            cookers.add(new Cooker());
        }
        for (int i = 0; i < ORDER_COUNT; i++) {
            order.add(FoodFactory.generate());
        }

        // roundRobinDistributor
        for (Food food : order) {
            roundRobinDistributor.addFood(food, cookers);
        }

        for (Cooker cooker : cookers) {
            if (maxCookingTimeRoundRobin < cooker.getSummCookingTime()) {
                maxCookingTimeRoundRobin = cooker.getSummCookingTime();
            }
            cooker.clearOrder();
        }

        // busyTimeDistributor
        for (Food food : order) {
            busyTimeDistributor.addFood(food, cookers);
        }

        for (Cooker cooker : cookers) {
            if (maxCookingTimeBusyTime < cooker.getSummCookingTime()) {
                maxCookingTimeBusyTime = cooker.getSummCookingTime();
            }
            cooker.clearOrder();
        }
        System.out.println("При " + ORDER_COUNT + " блюд задействованы " + cookers.size() + " поваров, то:");
        System.out.println("Время приготовления при распределении заказов по механизму RoundRobin, составит " + maxCookingTimeRoundRobin + " минут.");
        System.out.println("Время приготовления при распределении заказов по механизму BusyTime, составит " + maxCookingTimeBusyTime + " минут.");
    }
}