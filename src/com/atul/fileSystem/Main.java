package com.atul.fileSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("downloads", new ArrayList<>());
        File aadharCard = new File("Aadhar card");
        directory.getObjs().add(aadharCard);

        Directory photos = new Directory("photos", new ArrayList<>());
        File myPic = new File("my Pic");
        photos.getObjs().add(myPic);

        directory.getObjs().add(photos);

        directory.ls();

    }
}
