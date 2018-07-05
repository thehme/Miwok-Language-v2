package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    /** image resource is not provided **/
    private static final int NO_IMAGE_PROVIDED = -1;
    /** image resource id **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

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

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasValidImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
