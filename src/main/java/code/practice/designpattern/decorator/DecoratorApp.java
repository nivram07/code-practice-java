package code.practice.designpattern.decorator;

public class DecoratorApp {
  public static void main(String[] args) {
    Notifier notifier = new SMSNotifier();
    notifier = new FacebookNotifierDecorator(notifier);
    notifier = new EmailNotifierDecorator(notifier);

    notifier.send("This is an important message!");
  }
}
