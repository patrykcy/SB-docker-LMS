package com.smartbear.academy.backend.services;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.fail;

public class TimeServiceTest {

    private final TimeService timeService = new TimeService();

    @Test
    void getCurrentTime_WhenCalled_ThenShouldBeInProperFormat() {
        // Given
        SimpleDateFormat expectedDateFormat = new SimpleDateFormat("hh:mm:ss");
        var result = timeService.getCurrentTime();

        // When
        var timeStamp = result.getTimestamp();

        // Then
        try {
            expectedDateFormat.parse(timeStamp);
        } catch (ParseException e) {
            fail("TimeStamp value was not in correct format!");
        }
    }

}
