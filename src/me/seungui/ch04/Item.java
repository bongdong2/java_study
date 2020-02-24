package me.seungui.ch04;

import java.util.Objects;

public class Item {
    private String description;
    private double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public boolean equals(Object otherObject) {
        // 두 객체가 동일한지 알아보는 빠른 검사
        if (this == otherObject) return true;

        // otherObject 파라미터가 null이면 false를 반환해야 한다.
        if (otherObject == null) return false;

        // otherObject가 Item의 인스턴스인지 검사한다.
        if (getClass() != otherObject.getClass()) return false;

        // 인스턴스 변수들의 값이 같은지 검사한다.
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description)
            && price == other.price;
    }

    public int hashCode() {
        return Objects.hash(description, price);
    }
}
