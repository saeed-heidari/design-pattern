package com.sandbad.designpattern.abstractfactory.factories.impl;

import com.sandbad.designpattern.abstractfactory.buttons.Button;
import com.sandbad.designpattern.abstractfactory.buttons.impl.WindowsButton;
import com.sandbad.designpattern.abstractfactory.checkboxes.Checkbox;
import com.sandbad.designpattern.abstractfactory.checkboxes.impl.WindowsCheckbox;
import com.sandbad.designpattern.abstractfactory.factories.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
