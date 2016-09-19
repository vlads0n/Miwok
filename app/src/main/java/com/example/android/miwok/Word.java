package com.example.android.miwok;

/**
 * Created by Vinnik on 16.09.2016.
 */
public class Word {
    private String defaultText;
    private String miwokText;
    private int image = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultText, String miwokText) {
        this.defaultText = defaultText;
        this.miwokText = miwokText;
    }

    public Word(String defaultText, String miwokText, int image) {
        this.defaultText = defaultText;
        this.miwokText = miwokText;
        this.image = image;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public String getMiwokText() {
        return miwokText;
    }

    public int getImage() {
        return image;
    }

    public boolean hasImage() {
        return image != NO_IMAGE;
    }
}
