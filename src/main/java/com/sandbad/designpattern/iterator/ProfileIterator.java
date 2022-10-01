package com.sandbad.designpattern.iterator;

import com.sandbad.designpattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}