package code.practice.model;

public abstract class Shape implements Cloneable {
  abstract String getName();
  abstract double getArea();

  @Override
  public Object clone() {
    Object clone = null;
    try {
      clone = super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return clone;
  }
}
