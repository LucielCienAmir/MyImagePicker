package com.example.myimagepicker;

import android.net.Uri;

public class MyItem {
        private Uri uriImage;
        private String name;

    public MyItem(Uri uriImage, String name) {
        this.uriImage = uriImage;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getUriImage() {
        return uriImage;
    }

    public void setUriImage(Uri uriImage) {
        this.uriImage = uriImage;
    }

    public MyItem() {
    }
}
