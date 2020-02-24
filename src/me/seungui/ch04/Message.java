package me.seungui.ch04;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public final class Message implements Cloneable {
    private String sender;
    private ArrayList<String> recipients;
    private String text;


    public ArrayList<String> getRecipients() {
        return recipients;
    }

    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    public void addRecipient(String recipient) {
        recipients.add(recipient);
    }

    ;

    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients
                    = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients;
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
