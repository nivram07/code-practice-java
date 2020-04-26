package code.practice.designpattern.adapter;

public interface VHS {
  void show();
  boolean reachedEnd();
  boolean reachedStart();
  void rotateCCW(); // rewind
  void rotateCW(); // forward
}
