package me.seungui.javainterface;

public interface Person {
    String getName();
    default int getId() { return 0; }
}
