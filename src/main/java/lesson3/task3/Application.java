package lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human valeriy = new Human("Валерий", 55);
        Human alexandra = new Human("Александра", 49);
        Human ivan = new Human("Иван", 26);

        Human sergey = new Human("Сергей", 26, valeriy, alexandra);
        Human marina = new Human("Марина", 25, ivan, null);

        Human elena = new Human("Елена", 26, sergey, marina);

        for (Human parent: elena.parents) {
            for (Human progenitor: parent.parents) {
                if (progenitor != null)
                System.out.printf("Имя %s возраст %d родители %s и %s%n", progenitor.name, progenitor.age, progenitor.parents[0], progenitor.parents[1]);
            }
        }

        /*
        Human[] family = {
                new Human("Сергей", 26, new String[]{"Валерий", "Александра"}),
                new Human("Марина", 25, new String[]{"Иван"}),
                new Human("Валерий", 55),
                new Human("Александра", 49),
                new Human("Иван", 26),
                new Human("Виталий", 26, new String[]{"Сергей", "Марина"}),
                new Human("Елена", 26, new String[]{"Сергей", "Марина"})
        };

         */

//        Human grandson = family[6];
//        Human[] progenitors = new Human[4];
//        int i = 0;
//        for (Human parent: family) {
//            if (grandson.parents[0].equals(parent.name) || grandson.parents[1].equals(parent.name))
//                for (Human progenitor: family) {
//                    if (parent.parents[0].equals(progenitor.name) || parent.parents[1].equals(progenitor.name)) {
//                        if (parent.age < progenitor.age) {
//                            progenitors[i] = progenitor;
//                            i++;
//                        }
//                    }
//                }
//        }
//
//        for (Human progenitor: progenitors) {
//            System.out.println(progenitors.length);
//            //System.out.printf("Имя %s возраст %d родители %s и %s%n", progenitor.name, progenitor.age, progenitor.parents[0], progenitor.parents[1]);
//        }
    }
}
