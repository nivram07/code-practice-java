package code.practice.designpattern.mediator;

public interface Mediator {
  void notify(Component sender, Notification notification);
}
