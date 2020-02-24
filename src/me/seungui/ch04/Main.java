package me.seungui.ch04;

import me.seungui.ch04.sec04.Size;

public class Main {
    public static void main(String[] args) {
        Size notMySize = Size.valueOf("SMALL");
        System.out.println(notMySize);

        for (Size s : Size.values()) { System.out.println(s); }

        System.out.println(Size.MEDIUM.ordinal());
    }
}
