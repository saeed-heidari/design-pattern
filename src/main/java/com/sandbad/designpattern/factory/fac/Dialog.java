package com.sandbad.designpattern.factory.fac;

import com.sandbad.designpattern.factory.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();

}
