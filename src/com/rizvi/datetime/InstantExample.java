package com.rizvi.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantExample {

    public static void main(String[] args) {

        Instant timestamp = Instant.now();
        System.out.println("timestamp.getNano()  = " + timestamp.getNano());
        
        
        Instant timestamp1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp1, timestamp);

        System.out.println("duration.toSeconds()) = " + duration.toSeconds());

        LocalDateTime ld = LocalDateTime.ofInstant(timestamp1, ZoneId.systemDefault());
        System.out.println("localDateTime = " + ld);
    }
}
