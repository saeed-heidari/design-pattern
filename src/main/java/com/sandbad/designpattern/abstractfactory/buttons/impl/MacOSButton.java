package com.sandbad.designpattern.abstractfactory.buttons.impl;


import com.sandbad.designpattern.abstractfactory.buttons.Button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
