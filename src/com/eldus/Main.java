package com.eldus;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.*;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        LocalDateTime startOfTheLectionInMonday = LocalDateTime.of(2021, 1, 25, 20, 0);
        LocalDateTime endOfTheLectionInThursday = LocalDateTime.of(2021, 1, 28, 22, 0);

        System.out.println(startOfTheLectionInMonday.until(endOfTheLectionInThursday, DAYS));
        System.out.println(startOfTheLectionInMonday.until(endOfTheLectionInThursday, HOURS));
        System.out.println(startOfTheLectionInMonday.until(endOfTheLectionInThursday, MINUTES));
        System.out.println(startOfTheLectionInMonday.until(endOfTheLectionInThursday, SECONDS));

        //Задание 2
        LocalTime startOfTheLection13 = LocalTime.of(20, 0);
        LocalTime endOfTheLection13 = LocalTime.of(22, 25, 47);
        Duration duration = Duration.between(startOfTheLection13, endOfTheLection13);

        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());

        //Задание 3
        Locale.setDefault(Locale.UK);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/LLL/dd hh:mm:ss a");
        System.out.println(localDateTime.format(formatter));

        //Задание 4
        //С помощью класса DateTimeFormatter форматировать дату в строку вида "23:56 2001/15/01" (часы:минуты год/месяц/день)
        //В этом задание ошибка. Формат представленный в скобках не соответсвует дате, так как 15-го месяца не существует

        formatter = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        System.out.println(localDateTime.format(formatter));

        
        //Задание 5

        LocalDateTime startOfSpring = LocalDateTime.of(0, 3, 1, 0, 0);
        LocalDateTime startOfSummer = LocalDateTime.of(0, 6, 1, 0, 0);
        LocalDateTime startOfAutumn = LocalDateTime.of(0, 9, 1, 0, 0);
        LocalDateTime startOfWinter = LocalDateTime.of(0, 12, 1, 0, 0);
        System.out.println(startOfSpring.until(startOfSummer, MINUTES));
        System.out.println(startOfSummer.until(startOfAutumn, MINUTES));
        System.out.println(startOfAutumn.until(startOfWinter, MINUTES));
        System.out.println(startOfWinter.until(startOfSpring.plusYears(1), MINUTES));

    }
}
