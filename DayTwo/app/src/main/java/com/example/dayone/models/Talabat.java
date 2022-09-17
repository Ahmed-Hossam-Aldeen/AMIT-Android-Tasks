package com.example.dayone.models;

import android.graphics.drawable.Drawable;

public class Talabat {

    public String location;
    public String delevering;

    public Talabat(String location, String delevering, Drawable image) {
        this.location = location;
        this.delevering = delevering;
        this.image = image;
    }

    public Drawable image;

}