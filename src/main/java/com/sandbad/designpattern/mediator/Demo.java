package com.sandbad.designpattern.mediator;

import com.sandbad.designpattern.mediator.components.*;
import com.sandbad.designpattern.mediator.mediator.Editor;
import com.sandbad.designpattern.mediator.mediator.Mediator;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
