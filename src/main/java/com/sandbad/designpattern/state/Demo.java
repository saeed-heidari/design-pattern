package com.sandbad.designpattern.state;

import com.sandbad.designpattern.state.ui.Player;
import com.sandbad.designpattern.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
