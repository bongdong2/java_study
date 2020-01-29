package me.seungui.javainterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancleAction implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("action!");
    }
}
