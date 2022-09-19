package com.sandbad.designpattern.facade;

import com.sandbad.designpattern.facade.facade.VideoConversionFacade;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
