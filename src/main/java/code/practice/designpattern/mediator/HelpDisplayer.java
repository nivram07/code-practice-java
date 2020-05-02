package code.practice.designpattern.mediator;

public class HelpDisplayer extends Component{

  public HelpDisplayer(Mediator mediator) {
    super(mediator);
  }

  public void display() {
    System.out.format("This should help you navigate the site...\n");
  }
}
