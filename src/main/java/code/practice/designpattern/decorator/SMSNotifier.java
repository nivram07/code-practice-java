package code.practice.designpattern.decorator;

public class SMSNotifier implements Notifier {

  @Override
  public void send(String message) {
    System.out.format("SMS: %s\n", message);
  }
}
