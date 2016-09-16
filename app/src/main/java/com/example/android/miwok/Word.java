package com.example.android.miwok;

/**
 * Created by Vinnik on 16.09.2016.
 */
public class Word {
    private String defaultText;
    private String miwokText;

    public Word(String defaultText, String miwokText) {
        this.defaultText = defaultText;
        this.miwokText = miwokText;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public String getMiwokText() {
        return miwokText;
    }
}
