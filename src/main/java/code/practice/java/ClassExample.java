package code.practice.java;

public class ClassExample {

    public static void main(String[] args) {
        Square sq = new Square();
        sq.print();
    }

    public static class Shape {
        protected String description = "I'm a shape";
    }

    public static class Square extends Shape {
        private String description = "I'm a square";

        public void print() {
            System.out.println(description);
            System.out.println(super.description);
        }
    }


}

