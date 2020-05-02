package code.practice.designpattern.command;

import java.util.List;

public class LogicModel {

  private SwitchToggleReceiver receiver;
  private Command command;

  public LogicModel() {
    this.receiver = new SwitchToggleReceiver();
    this.command = new SwitchCommand(this.receiver);
  }

  public void executeCommand(String cmd) {
    switch(cmd) {
      case "toggle": {
        this.command.execute();
        break;
      }
      case "show": {
        System.out.format("value: %s\n", receiver.getValue());
        break;
      }
      default: {
        System.out.format("value: %s\n", receiver.getValue());
      }
    }
  }
}
