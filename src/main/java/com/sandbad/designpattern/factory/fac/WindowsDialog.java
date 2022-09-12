package com.sandbad.designpattern.factory.fac;

import com.sandbad.designpattern.factory.Button;
import com.sandbad.designpattern.factory.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
