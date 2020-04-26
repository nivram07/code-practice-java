package code.practice.designpattern.factory;

import code.practice.model.Shape;

public abstract class ShapeFactory {

  // example of factory method
  public abstract Shape createShape();

  public void render() {
    Shape s = createShape();
    System.out.format("%s\n", s.toString());
  }
}
