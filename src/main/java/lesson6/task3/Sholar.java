package lesson6.task3;

import java.util.HashMap;
import java.util.List;

public class Sholar {
    HashMap<DayOfWeek, List> diary = new HashMap<>();

    public void setDiary(DayOfWeek dayOfWeek, List listLessons) {
        this.diary.put(dayOfWeek, listLessons);
    }

    public HashMap<DayOfWeek, List> getDiary() {
        return diary;
    }
}
