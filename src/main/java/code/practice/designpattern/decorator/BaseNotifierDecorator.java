package code.practice.designpattern.decorator;

public class BaseNotifierDecorator implements Notifier {
  protected Notifier notifier;
  public BaseNotifierDecorator(Notifier notifier) {
    this.notifier = notifier;
  }

  public void send(String message) {
    this.notifier.send(message);
  }
}
