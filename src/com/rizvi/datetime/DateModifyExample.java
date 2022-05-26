package com.rizvi.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateModifyExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        // get 4 days from now
        localDate = localDate.plusDays(4);
        System.out.println("localDate = " + localDate);
        System.out.println("LocalDate.plusDays(4)  =  " +localDate.plusDays(4));
        localDate = localDate.now();
        System.out.println("LocalDate        =  " +localDate);
        System.out.println("LocalDate.plusMonth(2)  =  " +localDate.plusMonths(2));
        System.out.println("LocalDate.plusYears(2)  =  " +localDate.plusYears(2));
        System.out.println("LocalDate.minusDays(12)  =  " +localDate.minusDays(12));
        System.out.println("LocalDate.withYear(2023)  =  " +localDate.withYear(2023));

        // choronoField

        System.out.println("localDate.with(ChronoField)  = " + localDate.with(ChronoField.YEAR, 2025));
        System.out.println("localDate.with(TemporalAdjuster) = " + localDate.with(TemporalAdjusters.lastDayOfMonth()));


    }
}
