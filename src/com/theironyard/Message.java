package com.theironyard;

/**
 * Created by stevenburris on 10/5/16.
 */
public class Message {
    String text;

    public Message() {
    }

    public Message(String theMessage) {
        this.text = theMessage;
    }

    public String getTheMessage() {
        return text;
    }

    public void setTheMessage(String theMessage) {
        this.text = theMessage;
    }
}
