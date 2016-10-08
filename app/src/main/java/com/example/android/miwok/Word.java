package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceId;

    public String getDefaultWord() {
        return mDefaultTranslation;
    }

    public String getMiwokWord() {
        return mMiwokTranslation;
    }

    public int getResourceId() {
        return mResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
}
