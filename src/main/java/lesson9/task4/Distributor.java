package lesson9.task4;

import java.util.List;
import lesson9.task4.food.Food;

abstract class Distributor implements CookChooser {
    abstract void addFood(Food food, List<Cooker> cookers);
}
