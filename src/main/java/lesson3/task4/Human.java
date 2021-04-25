package lesson3.task4;

public class Human {
    String name;
    Human[] friends = new Human[10];

    public Human(String name) {
        this.name = name;
    }

    void addFriend(Human newFriend) {
        for (Human friend: this.friends)
            if (friend == newFriend)
                return;

        for (int i = 0;i < this.friends.length; i++) {
            if (this.friends[i] == null) {
                this.friends[i] = newFriend;
                break;
            }
        }

        for (int i = 0;i < newFriend.friends.length; i++) {
            if (newFriend.friends[i] == null) {
                newFriend.friends[i] = this;
                break;
            }
        }
    }

}
