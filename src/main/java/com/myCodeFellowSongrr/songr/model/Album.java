package com.myCodeFellowSongrr.songr.model;

import java.net.URL;

public class Album {

    public String title;
    public String artist;
    public int songCount;
    public int lengthInSeconds;
    public String imageURL;

    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return this.title + " is by " + this.artist + " and contains " + this.songCount + " songs";
    }
}
