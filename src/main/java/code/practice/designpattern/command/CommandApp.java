package code.practice.designpattern.command;

public class CommandApp {
  public static void main(String[] args) {
    LogicModel model = new LogicModel();
    model.executeCommand("toggle");
    model.executeCommand("show");
    model.executeCommand("toggle");
    model.executeCommand("show");
  }
}
