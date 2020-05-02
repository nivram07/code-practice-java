package code.practice.designpattern.mediator;

public class HelpButton extends Component {

  public HelpButton(Mediator mediator) {
    super(mediator);
  }

  public void help() {
    this.mediator.notify(this, Notification.HELP);
  }
}
