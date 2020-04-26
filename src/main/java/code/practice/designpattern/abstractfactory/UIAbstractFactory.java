package code.practice.designpattern.abstractfactory;

import code.practice.model.Button;
import code.practice.model.CheckBox;

public abstract class UIAbstractFactory {

  abstract Button createButton();
  abstract CheckBox createCheckBox();
}
