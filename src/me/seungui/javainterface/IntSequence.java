package me.seungui.javainterface;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }
    int next();

    static double average(IntSequence seq, int n) {
        int count = 0;
        double sum = 0;

        while(seq.hasNext() && count < n) {
            count ++;
            sum += seq.next();
        }
        return count == 0? 0 : sum / count;
    }

    static IntSequence digitsOf(int n) {
        return new DigitSequence(n);
    }
}