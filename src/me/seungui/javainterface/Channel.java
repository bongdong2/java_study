package me.seungui.javainterface;

import java.io.Closeable;

public interface Channel extends Closeable {
    boolean isOpen();
}
