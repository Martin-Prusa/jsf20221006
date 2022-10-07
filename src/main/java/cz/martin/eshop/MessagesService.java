package cz.martin.eshop;

import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class MessagesService implements Serializable {
    private List<Message> messages = new ArrayList<>();

    public void addMessage(String text, boolean l) {
    messages.add(new Message(text, l));
    }

    public void deleteMessage(Message m) {
        messages.remove(m);
    }

    public List<Message> getMessages() {
        List<Message> s = messages;
        messages = new ArrayList<>();
        messages.addAll(s.stream().filter(i -> i.isLongTime()).toList());
        //messages = messages.stream().filter(i -> i.isLongTime()).toList();
        return s;
    }
}
