package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId;

    public  Word(String miwokTranslation, String defaultTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }
    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
