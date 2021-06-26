package lesson6.task3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Sholar student = new Sholar();

        for (DayOfWeek day : DayOfWeek.values()) {
            student.setDiary(day, Lesson.generate());
        }

        for (Map.Entry<DayOfWeek, List> entry : student.getDiary().entrySet()) {
            StringBuilder formmaterSchedule = new StringBuilder();
            formmaterSchedule.append(entry.getKey() + " : ");
            for (Object lesson : entry.getValue()) {
                formmaterSchedule.append(lesson + ", ");
            }
            System.out.println(formmaterSchedule.substring(0, formmaterSchedule.length()-2));
        }

        HashMap<Lesson, Integer> numberOfEachLesson = new HashMap<>();

        for (Lesson lesson : Lesson.values()) {
            numberOfEachLesson.put(lesson, 0);
        }

        for (Map.Entry<DayOfWeek, List> entry : student.getDiary().entrySet()) {
            for (Object lesson : entry.getValue()) {
                numberOfEachLesson.put((Lesson) lesson, (numberOfEachLesson.get(lesson) + 1));
            }
        }

        numberOfEachLesson.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
