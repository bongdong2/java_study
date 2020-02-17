package me.seungui.lambda;

public class Application {
    public void doWork() {
        Runnable runner = () -> {
            System.out.println(this.toString());
        };

        new Thread(runner).start();
    }
}
