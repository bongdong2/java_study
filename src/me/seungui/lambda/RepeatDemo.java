package me.seungui.lambda;

import java.util.function.IntConsumer;

public class RepeatDemo {

    public static void main(String[] args) {
        //repeat(10, () -> System.out.println("Hello World!"));
        repeat(10, i -> System.out.println("Countdown : " + (9 - i)));
    }

    public static void repeat(int n, Runnable runnable) {
        for (int i = 0; i < n; i++) {
            runnable.run();
        }
    }

    public static void repeat(int n, IntConsumer intConsumer) {
        for(int i = 0; i < n; i++) {
            intConsumer.accept(i);
        }
    }
}
