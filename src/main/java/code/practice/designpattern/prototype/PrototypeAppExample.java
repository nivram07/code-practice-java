package code.practice.designpattern.prototype;

import code.practice.model.Shape;
import code.practice.model.Square;

public class PrototypeAppExample {

  public static void main(String[] args) {
    Shape square = ShapeStore.getShape(Square.class.getSimpleName());
    Shape square2 = ShapeStore.getShape(Square.class.getSimpleName());
    System.out.println(square.toString());
  }
}
