package lesson7.task1;

import java.util.ArrayList;

public class MyArrayList<T> extends ArrayList<T> {

    @Override
    public int size() {
        System.out.printf("Размер спиcка: %d%n", super.size());
        return super.size();
    }

    @Override
    public boolean add(T t) {
        System.out.printf("Добавлен объект %s в список%n", t);
        return super.add(t);
    }

    @Override
    public void add(int index, T element) {
        int position = (index < super.size() && index >= 0) ? index : 0;
        System.out.printf("Добавлен объект %s в список на позицию %d%n", element, position);
        super.add(index, element);
    }

    @Override
    public boolean contains(Object o) {
        if (super.contains(o)) {
            System.out.println("Объект содержится в списке");
        } else {
            System.out.println("Объект не содержится в списке");
        }
        return super.contains(o);
    }

    @Override
    public T get(int index) {
        T object = null;
        try {
            object = super.get(index);
        } catch (IndexOutOfBoundsException ignore) {}
        System.out.printf("Получен объект %s из списка%n", object);
        return object;
    }
}
