package android.view.inputmethod;

public final class TextAppearanceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.TextAppearanceInfo> CREATOR = null;
    private final boolean mAllCaps = false;
    private final boolean mElegantTextHeight = false;
    private final boolean mFallbackLineSpacing = false;
    private final java.lang.String mFontFeatureSettings = null;
    private final java.lang.String mFontVariationSettings = null;
    private final int mHighlightTextColor = 0;
    private final int mHintTextColor = 0;
    private final float mLetterSpacing = 0.0f;
    private final int mLineBreakStyle = 0;
    private final int mLineBreakWordStyle = 0;
    private final int mLinkTextColor = 0;
    private final int mShadowColor = 0;
    private final float mShadowDx = 0.0f;
    private final float mShadowDy = 0.0f;
    private final float mShadowRadius = 0.0f;
    private final java.lang.String mSystemFontFamilyName = null;
    private final int mTextColor = 0;
    private final int mTextFontWeight = 0;
    private final android.os.LocaleList mTextLocales = null;
    private final float mTextScaleX = 0.0f;
    private final float mTextSize = 0.0f;
    private final int mTextStyle = 0;
    TextAppearanceInfo(android.os.Parcel p0) {}
    private TextAppearanceInfo(android.view.inputmethod.TextAppearanceInfo.Builder p0) {}
    public static android.view.inputmethod.TextAppearanceInfo createFromTextView(android.widget.TextView p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getFontFeatureSettings() { return null; }
    public java.lang.String getFontVariationSettings() { return null; }
    public int getHighlightTextColor() { return 0; }
    public int getHintTextColor() { return 0; }
    public float getLetterSpacing() { return 0.0f; }
    public int getLineBreakStyle() { return 0; }
    public int getLineBreakWordStyle() { return 0; }
    public int getLinkTextColor() { return 0; }
    public int getShadowColor() { return 0; }
    public float getShadowDx() { return 0.0f; }
    public float getShadowDy() { return 0.0f; }
    public float getShadowRadius() { return 0.0f; }
    public java.lang.String getSystemFontFamilyName() { return null; }
    public int getTextColor() { return 0; }
    public int getTextFontWeight() { return 0; }
    public android.os.LocaleList getTextLocales() { return null; }
    public float getTextScaleX() { return 0.0f; }
    public float getTextSize() { return 0.0f; }
    public int getTextStyle() { return 0; }
    public int hashCode() { return 0; }
    public boolean isAllCaps() { return false; }
    public boolean isElegantTextHeight() { return false; }
    public boolean isFallbackLineSpacing() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAllCaps;
        private boolean mElegantTextHeight;
        private boolean mFallbackLineSpacing;
        private java.lang.String mFontFeatureSettings;
        private java.lang.String mFontVariationSettings;
        private int mHighlightTextColor;
        private int mHintTextColor;
        private float mLetterSpacing;
        private int mLineBreakStyle;
        private int mLineBreakWordStyle;
        private int mLinkTextColor;
        private int mShadowColor;
        private float mShadowDx;
        private float mShadowDy;
        private float mShadowRadius;
        private java.lang.String mSystemFontFamilyName;
        private int mTextColor;
        private int mTextFontWeight;
        private android.os.LocaleList mTextLocales;
        private float mTextScaleX;
        private float mTextSize;
        private int mTextStyle;
        public Builder() {}
        public android.view.inputmethod.TextAppearanceInfo build() { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setAllCaps(boolean p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setElegantTextHeight(boolean p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setFallbackLineSpacing(boolean p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setFontFeatureSettings(java.lang.String p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setFontVariationSettings(java.lang.String p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setHighlightTextColor(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setHintTextColor(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setLetterSpacing(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setLineBreakStyle(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setLineBreakWordStyle(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setLinkTextColor(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setShadowColor(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setShadowDx(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setShadowDy(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setShadowRadius(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setSystemFontFamilyName(java.lang.String p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextColor(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextFontWeight(int p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextLocales(android.os.LocaleList p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextScaleX(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextSize(float p0) { return null; }
        public android.view.inputmethod.TextAppearanceInfo.Builder setTextStyle(int p0) { return null; }
    }
}
