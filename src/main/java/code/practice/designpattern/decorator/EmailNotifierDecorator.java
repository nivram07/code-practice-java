package code.practice.designpattern.decorator;

public class EmailNotifierDecorator extends BaseNotifierDecorator {
  public EmailNotifierDecorator(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    notifier.send(message);
    System.out.format("Email: %s\n", message);
  }
}
