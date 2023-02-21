package com.smartbear.academy.backend.models;

public class TimeStamp {
    private String timestamp;

    public TimeStamp() {

    }

    public TimeStamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimestamp() {
        return this.timestamp;
    }
}
