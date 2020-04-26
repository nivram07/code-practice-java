package code.practice.designpattern.factory;

import code.practice.model.Square;

public class SquareFactory extends ShapeFactory {
  private final double THRESHOLD = 0.0000000001;
  private double edgeLength = 0.0;

  public SquareFactory(double edgeLength) {
    this.edgeLength = edgeLength;
  }

  public SquareFactory() {
    // intentionally left blank
  }
  @Override
  public Square createShape() {
    if (this.edgeLength - 0.0 < THRESHOLD)
      return new Square();
    return new Square(edgeLength);
  }
}
