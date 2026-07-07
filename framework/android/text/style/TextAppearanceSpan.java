package android.text.style;

public class TextAppearanceSpan extends android.text.style.MetricAffectingSpan implements android.text.ParcelableSpan {
    private final boolean mElegantTextHeight = false;
    private final java.lang.String mFamilyName = null;
    private final java.lang.String mFontFeatureSettings = null;
    private final java.lang.String mFontVariationSettings = null;
    private final boolean mHasElegantTextHeight = false;
    private final boolean mHasLetterSpacing = false;
    private final float mLetterSpacing = 0.0f;
    private final int mShadowColor = 0;
    private final float mShadowDx = 0.0f;
    private final float mShadowDy = 0.0f;
    private final float mShadowRadius = 0.0f;
    private final int mStyle = 0;
    private final android.content.res.ColorStateList mTextColor = null;
    private final android.content.res.ColorStateList mTextColorLink = null;
    private final int mTextFontWeight = 0;
    private final android.os.LocaleList mTextLocales = null;
    private final int mTextSize = 0;
    private final android.graphics.Typeface mTypeface = null;
    public TextAppearanceSpan(android.content.Context p0, int p1) { super(); }
    public TextAppearanceSpan(android.content.Context p0, int p1, int p2) { super(); }
    public TextAppearanceSpan(android.os.Parcel p0) { super(); }
    public TextAppearanceSpan(java.lang.String p0, int p1, int p2, android.content.res.ColorStateList p3, android.content.res.ColorStateList p4) { super(); }
    public TextAppearanceSpan(java.lang.String p0, int p1, int p2, android.content.res.ColorStateList p3, android.content.res.ColorStateList p4, android.graphics.Typeface p5, int p6, android.os.LocaleList p7, float p8, float p9, float p10, int p11, boolean p12, boolean p13, boolean p14, float p15, java.lang.String p16, java.lang.String p17) { super(); }
    public int describeContents() { return 0; }
    public java.lang.String getFamily() { return null; }
    public java.lang.String getFontFeatureSettings() { return null; }
    public java.lang.String getFontVariationSettings() { return null; }
    public float getLetterSpacing() { return 0.0f; }
    public android.content.res.ColorStateList getLinkTextColor() { return null; }
    public int getShadowColor() { return 0; }
    public float getShadowDx() { return 0.0f; }
    public float getShadowDy() { return 0.0f; }
    public float getShadowRadius() { return 0.0f; }
    public int getSpanTypeId() { return 0; }
    public int getSpanTypeIdInternal() { return 0; }
    public android.content.res.ColorStateList getTextColor() { return null; }
    public int getTextFontWeight() { return 0; }
    public android.os.LocaleList getTextLocales() { return null; }
    public int getTextSize() { return 0; }
    public int getTextStyle() { return 0; }
    public android.graphics.Typeface getTypeface() { return null; }
    public boolean hasElegantTextHeight() { return false; }
    public boolean hasLetterSpacing() { return false; }
    public boolean isElegantTextHeight() { return false; }
    public java.lang.String toString() { return null; }
    public void updateDrawState(android.text.TextPaint p0) {}
    public void updateMeasureState(android.text.TextPaint p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
}
