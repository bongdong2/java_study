package me.seungui.ch08;

import java.util.*;

public class OptinalType {

    public static void main(String[] args) {
        System.out.println(inverse(4.0).flatMap(OptinalType::squareRoot));
        System.out.println(inverse(-1.0).flatMap(OptinalType::squareRoot));
        System.out.println(inverse(0.0).flatMap(OptinalType::squareRoot));
        Optional<Double> result = Optional.of(-4.0).flatMap(OptinalType::inverse)
                .flatMap(OptinalType::squareRoot);
        System.out.println(result);
    }

    public static Optional<Double> inverse(Double x) {
        return x == 0 ? Optional.empty() : Optional.of(1 / x);
    }

    public static Optional<Double> squareRoot(Double x) {
        return x < 0 ? Optional.empty() : Optional.of(Math.sqrt(x));
    }

}
