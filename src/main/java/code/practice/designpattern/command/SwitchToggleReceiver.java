package code.practice.designpattern.command;

public class SwitchToggleReceiver implements ToggleReceiver {

  private boolean value;

  @Override
  public void toggle() {
    this.value = !this.value;
  }

  @Override
  public boolean getValue() {
    return this.value;
  }
}
