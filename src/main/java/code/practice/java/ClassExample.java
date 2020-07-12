package code.practice.java;

import code.practice.model.Square;

public class ClassExample {

    public static void main(String[] args) {
        Square sq = new Square(2.0);
        sq.print();

        Person person = new Person();
    }

    static class Person {
        String name;
    }


}

