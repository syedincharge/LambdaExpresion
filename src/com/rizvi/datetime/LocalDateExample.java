package com.rizvi.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {


        // create localdate
        LocalDate localDate = LocalDate.now();
        System.out.println("local Date  :   "+localDate);

        // using day of the year
        localDate = LocalDate.ofYearDay(2018,35);
        System.out.println("local date  :   "+localDate);

        // local date.of
        localDate = LocalDate.of(2018, 03, 23);
        System.out.println("local date  :   "+localDate);

        localDate = LocalDate.now();
        // get Methods
        System.out.println("localDate .getMonth() : "+localDate.getMonth());
        System.out.println("localDate .getMonthValue() : "+localDate.getMonthValue());
        System.out.println("localDate .getDayOfWeek() : "+localDate.getDayOfWeek());
        System.out.println("localDate .getDayOfYear() : "+localDate.getDayOfYear());
        System.out.println("localDate .getDayOfWeek() : "+localDate.get(ChronoField.MONTH_OF_YEAR));



    }
}
