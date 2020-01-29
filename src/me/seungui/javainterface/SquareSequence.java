package me.seungui.javainterface;

public class SquareSequence implements IntSequence {

    int i;

    @Override
    public int next() {
        i++;
        return i * i;
    }
}