package demo.component.uifactory;

import demo.component.Button;
import demo.component.CheckBox;
import demo.component.os.win.WinButton;
import demo.component.os.win.WinCheckBox;

public class WinUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
