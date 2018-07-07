package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    /** image resource is not provided **/
    private static final int NO_IMAGE_PROVIDED = -1;
    /** image resource id **/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** media resource **/
    private int mMediaResourceId;

    public  Word(String miwokTranslation, String defaultTranslation, int mediaResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMediaResourceId = mediaResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int mediaResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mMediaResourceId = mediaResourceId;
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

    public int getMediaResourceId() {
        return mMediaResourceId;
    }

    public boolean hasValidImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
