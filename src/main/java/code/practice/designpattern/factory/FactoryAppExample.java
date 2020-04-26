package code.practice.designpattern.factory;

import code.practice.designpattern.factory.ShapeFactory;
import code.practice.designpattern.factory.SquareFactory;

public class FactoryAppExample {

  public static void main(String[] args) {
    ShapeFactory factory = new SquareFactory();
    factory.render();
  }
}
