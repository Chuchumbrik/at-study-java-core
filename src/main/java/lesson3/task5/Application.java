package lesson3.task5;

public class Application {
    public static void main(String[] args) {


        Human[] people = new Human[20];
        for (int i = 0; i < people.length; i++)
            people[i] = new Human();

        for (Human human : people) {
            int quantityDogs = 0;
            int quantityCats = 0;
            for (Cat cat : human.cats)
                if (cat != null)
                    quantityCats++;

            for (Dog dog : human.dogs)
                if (dog != null)
                    quantityDogs++;

            if (quantityDogs == quantityCats) {
                System.out.println(human.name);
                if (human.cats[0] != null) {
                    for (int i = 0; i < human.cats.length; i++)
                        if (human.cats[i] != null)
                            System.out.printf("#%d Имя кошки : %s, возраст %d - ", i + 1, human.cats[i].name, human.cats[i].age);
                    System.out.println();
                } else
                    System.out.println("- Кошек нет -");

                if (human.dogs[0] != null) {
                    for (int i = 0; i < human.dogs.length; i++)
                        if (human.dogs[i] != null)
                            System.out.printf("#%d Имя собаки : %s, возраст %d - ", i + 1, human.dogs[i].name, human.dogs[i].age);
                    System.out.println();
                } else
                    System.out.println("- Собак нет -");
                System.out.println("------------------------");
            }

        }
    }
}
