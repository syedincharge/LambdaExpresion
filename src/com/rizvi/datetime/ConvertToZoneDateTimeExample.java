package com.rizvi.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ConvertToZoneDateTimeExample {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/New_York"));
        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("localDateTime = " + localDateTime.atOffset(ZoneOffset.ofHours(-10)));
    }
}
