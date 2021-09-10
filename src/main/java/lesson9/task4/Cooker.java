package lesson9.task4;

import java.util.List;
import lesson9.task4.food.Food;

import java.util.ArrayList;

public class Cooker {
    List<Food> order = new ArrayList<>();

    public int getSummCookingTime() {
        int cookingTime = 0;
        if (order.size() == 0) {
            return 0;
        }
        for (Food food : order) {
            cookingTime += food.getCookingTime();
        }
        return cookingTime;
    }

    public int getOrderSize() {
        return order.size();
    }

    public void addFood(Food food) {
        order.add(food);
    }

    public void clearOrder() {
        order.clear();
    }
}