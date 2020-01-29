package me.seungui.javainterface;

import java.io.Closeable;
import java.io.IOException;

public class FileSequence implements IntSequence, Closeable {

    @Override
    public void close() throws IOException {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public int next() {
        return 0;
    }
}
