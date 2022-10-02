package com.sandbad.designpattern.mediator.components;

import com.sandbad.designpattern.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
