package com.sandbad.designpattern.iterator.social_networks;

import com.sandbad.designpattern.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
