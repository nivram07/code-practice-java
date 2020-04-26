package code.practice.model;

public class Square extends Shape implements Printable {

  private double edgeLength;

  public Square(double edgeLength) {
    this.edgeLength = edgeLength;
  }

  public Square() {
    super();
    this.edgeLength = 1.0;
  }

  @Override
  public String getName() {
    return Square.class.getSimpleName();
  }

  @Override
  public double getArea() {
    return edgeLength * edgeLength;
  }

  public void setEdgeLength(double length) {
    this.edgeLength = length;
  }

  @Override
  public String toString() {
    return "I'm a square with length: " + edgeLength + ".";
  }
  @Override
  public void print() {
    System.out.format("edgeLength: %f\n", edgeLength);
  }

}
