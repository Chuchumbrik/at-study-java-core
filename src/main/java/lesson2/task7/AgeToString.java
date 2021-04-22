package lesson2.task7;

public class AgeToString {
    public static void main(String[] args) {
        AgeToString ageToString = new AgeToString();
        int[] ageArray = {32, 52, 66, 82, 25, 44, 60, 75, 22, 119};
        ageToString.textOutputAge(ageArray);
    }

    void textOutputAge(int... ages) {
        String result;
        for (int age: ages) {
            if ( age >= 25 && age < 44) {
                result = "Молодой";
            } else
            if ( age >= 44 && age < 60) {
                result = "Средний";
            } else
            if ( age >= 60 && age < 75) {
                result = "Пожилой";
            } else
            if ( age >= 75 && age < 90) {
                result = "Старческий";
            } else
                result = "Неизвестный";
            System.out.println(result + " возраст");
        }
    }
}
