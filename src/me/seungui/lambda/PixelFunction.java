package me.seungui.lambda;

import java.awt.*;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
