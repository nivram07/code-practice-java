package code.practice.designpattern.mediator;

public class MediatorApp {
  public static void main(String[] args) {
    ActionMediator mediator = new ActionMediator();
    mediator.notify(mediator.getHelpButton(), Notification.HELP);
  }
}
