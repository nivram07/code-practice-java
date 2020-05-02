package code.practice.designpattern.command;

public interface ToggleReceiver extends Receiver {
  void toggle();
  boolean getValue();
}
