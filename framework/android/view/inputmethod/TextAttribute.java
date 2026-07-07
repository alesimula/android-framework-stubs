package android.view.inputmethod;

public final class TextAttribute implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.TextAttribute> CREATOR = null;
    private final android.os.PersistableBundle mExtras = null;
    private final java.util.List<java.lang.String> mTextConversionSuggestions = null;
    private final boolean mTextSuggestionSelected = false;
    private TextAttribute(android.os.Parcel p0) {}
    private TextAttribute(android.view.inputmethod.TextAttribute.Builder p0) {}
    public int describeContents() { return 0; }
    public android.os.PersistableBundle getExtras() { return null; }
    public java.util.List<java.lang.String> getTextConversionSuggestions() { return null; }
    public boolean isTextSuggestionSelected() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.PersistableBundle mExtras;
        private java.util.List<java.lang.String> mTextConversionSuggestions;
        private boolean mTextSuggestionSelected;
        public Builder() {}
        public android.view.inputmethod.TextAttribute build() { return null; }
        public android.view.inputmethod.TextAttribute.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.view.inputmethod.TextAttribute.Builder setTextConversionSuggestions(java.util.List<java.lang.String> p0) { return null; }
        public android.view.inputmethod.TextAttribute.Builder setTextSuggestionSelected(boolean p0) { return null; }
    }
}
