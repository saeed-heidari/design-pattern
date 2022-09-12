package com.sandbad.designpattern.abstractfactory.factories.impl;

import com.sandbad.designpattern.abstractfactory.buttons.Button;
import com.sandbad.designpattern.abstractfactory.buttons.impl.MacOSButton;
import com.sandbad.designpattern.abstractfactory.checkboxes.Checkbox;
import com.sandbad.designpattern.abstractfactory.checkboxes.impl.MacOSCheckbox;
import com.sandbad.designpattern.abstractfactory.factories.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
