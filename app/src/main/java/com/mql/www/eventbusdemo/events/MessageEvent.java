package com.mql.www.eventbusdemo.events;

/**
 *
 * Created by MQL on 2017/8/20.
 */

public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
