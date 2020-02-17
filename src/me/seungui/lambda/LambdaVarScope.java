package me.seungui.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Comparator;

public class LambdaVarScope {

    public static void main(String[] args) {

        //int first = 0;
        //Comparator<String> comparator = (first, second) -> first.length() - second.length();

        //Application application = new Application();
        //application.doWork();

        //repeatMessgage("Hello World!", 10);

        advencedFor();
    }

    /*public static void capture() {
        for(int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(i)).start();
            // 오류 i를 캡쳐할 수 없다.
        }
    }*/

    public static void advencedFor() {
        for(String arg : new String[] {"jwa", "seung", "ui"}) {
            new Thread(() -> System.out.println(arg)).start();
        }
    }

    public static void repeatMessgage(String text, int count) {
        Runnable r = () -> {
            for(int i = 0; i < count; i++) {
                System.out.println(text);
            }
        };

        new Thread(r).start();
    }

    /*public static void repeatMessage(String text, int count, int threads) {
        Runnable r = () -> {
            while(count > 0) {
                count--;
                System.out.println(text);
            }
        };

        for(int i = 0; i < threads; i++) new Thread(r).start();
    }*/
}

