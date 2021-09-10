package lesson9.task4;

import java.util.List;
import lesson9.task4.food.Food;

public class BusyTimeDistributor extends Distributor {
    @Override
    void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        int minCookingTime = Integer.MAX_VALUE;
        for (Cooker cooker : cookers) {
            if (cooker.getSummCookingTime() < minCookingTime) {
                minCookingTime = cooker.getSummCookingTime();
            }
        }
        for (Cooker cooker : cookers) {
            if (cooker.getSummCookingTime() == minCookingTime) {
                return cooker;
            }
        }
        throw new IllegalStateException();
    }
}