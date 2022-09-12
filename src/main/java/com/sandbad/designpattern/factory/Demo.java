package com.sandbad.designpattern.factory;

import com.sandbad.designpattern.factory.fac.Dialog;
import com.sandbad.designpattern.factory.fac.HtmlDialog;
import com.sandbad.designpattern.factory.fac.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
