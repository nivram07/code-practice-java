package code.practice.designpattern.mediator;

public class ActionMediator implements Mediator {

  HelpButton helpButton;
  HelpDisplayer helpDisplayer;

  // concrete classes needed so we can direct them
  public ActionMediator() {
    this.helpButton = new HelpButton(this);
    this.helpDisplayer = new HelpDisplayer(this);
  }

  @Override
  public void notify(Component sender, Notification notification) {
    if (sender == helpButton && notification == Notification.HELP) {
      helpDisplayer.display();
    }
  }

  public HelpButton getHelpButton() {
    return helpButton;
  }

  public HelpDisplayer getHelpDisplayer() {
    return helpDisplayer;
  }
}
