package com.sandbad.designpattern.abstractfactory.factories;

import com.sandbad.designpattern.abstractfactory.buttons.Button;
import com.sandbad.designpattern.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
