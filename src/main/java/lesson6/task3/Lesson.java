package lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHEMATICS,
    PHYSICS,
    PROGRAMMING,
    HISTORY,
    BIOLOGY,
    GEOGRAPHY;

    public static List generate() {
        List lessons = new ArrayList();
        int countLessons = new Random().nextInt(3) + 4;
        for (int i = 0; i < countLessons; i++) {
            int pick = new Random().nextInt(Lesson.values().length);
            lessons.add(Lesson.values()[pick]);
        }
        return lessons;
    }

}
