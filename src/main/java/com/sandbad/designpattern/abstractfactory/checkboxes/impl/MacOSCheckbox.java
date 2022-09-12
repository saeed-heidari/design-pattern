package com.sandbad.designpattern.abstractfactory.checkboxes.impl;

import com.sandbad.designpattern.abstractfactory.checkboxes.Checkbox;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
