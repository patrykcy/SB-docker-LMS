package com.smartbear.academy.backend.services;

import com.smartbear.academy.backend.models.TimeStamp;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TimeService {

    public TimeStamp getCurrentTime() {
        TimeStamp timeStamp = new TimeStamp();
        String formattedTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
        timeStamp.setTimestamp(formattedTime);
        return timeStamp;
    }
}
