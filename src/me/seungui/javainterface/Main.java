package me.seungui.javainterface;

import java.awt.*;
import java.util.*;
import java.util.List;

import static me.seungui.javainterface.IntSequence.average;

public class Main {

    public static void main(String[] args) {

        // 처음 사각형 100개의 평균 구하기
        SquareSequence squares = new SquareSequence();
        double avg = average(squares, 100);
        System.out.println(avg);

        // 가장 낮은 자릿수부터 시작하는 양수로 된 숫자 출력 (9, 2, 7 ,1)
        DigitSequence digitSequence = new DigitSequence(1729);
        while (true) {
            if(digitSequence.hasNext()){
                System.out.println(digitSequence.next());
            } else {
                break;
            }
        }

        // 인터페이스 타입으로 변환하기
        IntSequence digits = new DigitSequence(1729);
        System.out.println(average(digits, 100));

        // 타입변환
        IntSequence sequence = new DigitSequence(1897);
        DigitSequence digits2 = (DigitSequence)sequence;
        System.out.println(digits2.rest());

        // instanceof
        if(sequence instanceof DigitSequence) {
            DigitSequence digits3 = (DigitSequence) sequence;
        }

        // constants
        System.out.println(SwingConstants.NORTH);
        System.out.println(SwingConstants.NORTH_EAST);
        System.out.println(SwingConstants.EAST);

        // static method
        IntSequence mySq = IntSequence.digitsOf(1729);
        System.out.println(mySq);
        while (true) {
            if(mySq.hasNext()){
                System.out.println(mySq.next());
            } else {
                break;
            }
        }

        System.out.println("======Comparable interface=====");
        Employee emp1 = new Employee(1, "mike", 100.1);
        Employee emp2 = new Employee(2, "john", 123.45);
        Employee emp3 = new Employee(3, "seungui", 9.9);
        Employee emp4 = new Employee(4, "changStar", 20000);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        System.out.println("리스트에 넣은 순서대로");
        System.out.println(empList);
        System.out.println("compareTo 메소드에 정한 순서로");
        Collections.sort(empList);
        System.out.println(empList);
        System.out.println("===============================");

        System.out.println("======Comparator interface=====");
        LengthComparator lengthComparator = new LengthComparator();
        String word1 = "show me the moeny";
        String word2 = "power overwhelming";
        if(lengthComparator.compare(word1, word2) > 0) {
            System.out.println("word1's length is Long");
        } else {
            System.out.println("hmm");
        }

        //익명의 Comparator를 만듦
        Comparator<Employee> nameLengthComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().length() - o1.getName().length();
            }
        };

        //Collections.sort(empList, nameLengthComparator);
        empList.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println(empList);

        System.out.println("===============================");

        System.out.println("======Runnable interface=====");
        HelloTask helloTask = new HelloTask();
        Thread thread = new Thread(helloTask);
        thread.start();
        System.out.println("===============================");

    }
}
