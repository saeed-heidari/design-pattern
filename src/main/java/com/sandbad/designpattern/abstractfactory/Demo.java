package com.sandbad.designpattern.abstractfactory;

import com.sandbad.designpattern.abstractfactory.app.Application;
import com.sandbad.designpattern.abstractfactory.factories.GUIFactory;
import com.sandbad.designpattern.abstractfactory.factories.impl.MacOSFactory;
import com.sandbad.designpattern.abstractfactory.factories.impl.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
