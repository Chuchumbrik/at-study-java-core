package lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human misha = new Human("Михаил");
        Human egor = new Human("Егор");
        Human alexandr = new Human("Александр");
        Human grigoriy = new Human("Григорий");
        Human stas = new Human("Станислав");
        Human valeriy = new Human("Валерий");

        sergey.addFriend(valeriy);
        sergey.addFriend(grigoriy);

        valeriy.addFriend(stas);

        stas.addFriend(misha);

        misha.addFriend(alexandr);

        alexandr.addFriend(egor);
        alexandr.addFriend(grigoriy);

        egor.addFriend(grigoriy);

        System.out.println(checkFriendship(sergey, grigoriy));
        System.out.println(checkFriendship(sergey, alexandr));
        System.out.println(checkFriendship(stas, misha));
        System.out.println(checkFriendship(misha, valeriy));
    }

    static boolean checkFriendship(Human human1, Human human2) {
        for (Human friend: human1.friends)
            if (friend == human2)
                return true;
        return false;
    }
}
