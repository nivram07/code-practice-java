package code.practice.designpattern.command;

public class SwitchCommand implements Command {

  private ToggleReceiver toggleReceiver;

  public SwitchCommand(ToggleReceiver toggleReceiver) {
    this.toggleReceiver = toggleReceiver;
  }

  @Override
  public void execute() {
    // command controls the receiver. This is a business logic.
    this.toggleReceiver.toggle();
  }
}
