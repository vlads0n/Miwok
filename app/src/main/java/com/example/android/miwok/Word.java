package com.example.android.miwok;

/**
 * Created by Vinnik on 16.09.2016.
 */
public class Word {
    private String defaultText;
    private String miwokText;
    private int audio;
    private int image = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultText, String miwokText, int audio) {
        this.defaultText = defaultText;
        this.miwokText = miwokText;
        this.audio = audio;
    }

    public Word(String defaultText, String miwokText, int image, int audio) {
        this.defaultText = defaultText;
        this.miwokText = miwokText;
        this.image = image;
        this.audio = audio;
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

    public int getAudio() {
        return audio;
    }

    public boolean hasImage() {
        return image != NO_IMAGE;
    }
}
