package lesson3.task3;

public class Human {
    String name;
    int age;
    Human[] parents = new Human[2];

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.parents[0] = null;
        this.parents[1] = null;
    }

    public Human(String name, int age, Human father, Human mother) {
        this.name = name;
        this.age = age;
        this.parents[0] = father;
        this.parents[1] = mother;
    }

    //    public Human(String name, int age, String[] parents) {
//        this.name = name;
//        this.age = age;
//        this.parents[0] = (parents[0] != null) ? parents[0] : null;
//        if (parents.length > 1 && parents[1] != null)
//            this.parents[1] = parents[1];
//        else
//            this.parents[1] = null;
//    }
}
