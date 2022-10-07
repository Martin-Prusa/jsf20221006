package cz.martin.eshop;

import java.io.Serializable;

public class Message implements Serializable {
    private String text;
    private boolean longTime;

    public Message(String text, boolean longTime) {
        this.text = text;
        this.longTime = longTime;
    }

    public String getText() {
        return text;
    }

    public boolean isLongTime() {
        return longTime;
    }
}
