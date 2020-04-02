package LeetCode_Easy;

import java.time.LocalDate;

public class LeetCode_1185 {
    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;

        dayOfTheWeek(day, month, year);
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate dayOfTheWeekName = LocalDate.of(year, month, day);
        String prefix = dayOfTheWeekName.getDayOfWeek().toString().substring(0, 1);
        //System.out.println(prefix + dayOfTheWeekName.getDayOfWeek().toString().substring(1).toLowerCase());
        //return prefix + dayOfTheWeekName.getDayOfWeek().toString().substring(1).toLowerCase();
        System.out.println(dayOfTheWeekName.getDayOfWeek().toString().substring(0, 1) + dayOfTheWeekName.getDayOfWeek().toString().substring(1).toLowerCase());
        return dayOfTheWeekName.getDayOfWeek().toString().substring(0, 1) + dayOfTheWeekName.getDayOfWeek().toString().substring(1).toLowerCase();
    }
}
