package com.sandbad.designpattern.factory.fac;

import com.sandbad.designpattern.factory.Button;
import com.sandbad.designpattern.factory.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
