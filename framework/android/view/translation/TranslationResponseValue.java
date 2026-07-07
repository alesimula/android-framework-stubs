package android.view.translation;

public final class TranslationResponseValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationResponseValue> CREATOR = null;
    public static final java.lang.String EXTRA_DEFINITIONS = "android.view.translation.extra.DEFINITIONS";
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_SUCCESS = 0;
    private final android.os.Bundle mExtras = null;
    private final int mStatusCode = 0;
    private final java.lang.CharSequence mText = null;
    private final java.lang.CharSequence mTransliteration = null;
    TranslationResponseValue(int p0, java.lang.CharSequence p1, android.os.Bundle p2, java.lang.CharSequence p3) {}
    TranslationResponseValue(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.os.Bundle defaultExtras() { return null; }
    private static java.lang.CharSequence defaultText() { return null; }
    private static java.lang.CharSequence defaultTransliteration() { return null; }
    private boolean extrasEquals(android.os.Bundle p0) { return false; }
    public static android.view.translation.TranslationResponseValue forError() { return null; }
    public static java.lang.String statusToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.Bundle getExtras() { return null; }
    public int getStatusCode() { return 0; }
    public java.lang.CharSequence getText() { return null; }
    public java.lang.CharSequence getTransliteration() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.view.translation.TranslationResponseValue.BaseBuilder {
        private long mBuilderFieldsSet;
        private android.os.Bundle mExtras;
        private int mStatusCode;
        private java.lang.CharSequence mText;
        private java.lang.CharSequence mTransliteration;
        public Builder(int p0) { super(); }
        private void checkNotUsed() {}
        public android.view.translation.TranslationResponseValue build() { return null; }
        public android.view.translation.TranslationResponseValue.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.translation.TranslationResponseValue.Builder setText(java.lang.CharSequence p0) { return null; }
        public android.view.translation.TranslationResponseValue.Builder setTransliteration(java.lang.CharSequence p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
