package code.practice.designpattern.decorator;

public class FacebookNotifierDecorator extends BaseNotifierDecorator {

  public FacebookNotifierDecorator(Notifier notifier) {
    super(notifier);
  }

  @Override
  public void send(String message) {
    notifier.send(message);
    System.out.format("Facebook: %s\n", message);
  }
}
