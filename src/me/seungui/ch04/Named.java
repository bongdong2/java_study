package me.seungui.ch04;

public interface Named {

    default String getName() {
        return "";
    }
}
