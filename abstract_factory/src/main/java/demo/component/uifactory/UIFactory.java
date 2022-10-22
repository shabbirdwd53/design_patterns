package demo.component.uifactory;

import demo.component.Button;
import demo.component.CheckBox;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
