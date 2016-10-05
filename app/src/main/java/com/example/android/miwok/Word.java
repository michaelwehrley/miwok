package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public String getDefaultWord() {
        return mDefaultTranslation;
    }

    public String getMiwokWord() {
        return mMiwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
}
