package me.seungui.ch04;

import java.util.Objects;

public class HashCodeDemo {

    public String variable1;
    public int variable2;

    public HashCodeDemo(String variable1, int variable2) {
        this.variable1 = variable1;
        this.variable2 = variable2;
    }

    public int hashCode() {
        return Objects.hash(variable1, variable2);
    }
}
