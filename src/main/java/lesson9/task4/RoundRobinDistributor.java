package lesson9.task4;

import java.util.List;
import lesson9.task4.food.Food;

public class RoundRobinDistributor extends Distributor {
    private static int pointer = -1;

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        pointer++;
        return cookers.get(pointer %= cookers.size());
    }

    @Override
    void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }

}