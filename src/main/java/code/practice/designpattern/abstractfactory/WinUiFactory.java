package code.practice.designpattern.abstractfactory;

import code.practice.model.Button;
import code.practice.model.CheckBox;
import code.practice.model.WinButton;
import code.practice.model.WinCheckBox;

public class WinUiFactory extends UIAbstractFactory {

  @Override
  public Button createButton() {
    return new WinButton();
  }

  @Override
  public CheckBox createCheckBox() {
    return new WinCheckBox();
  }
}
