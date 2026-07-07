package android.view.translation;

public final class TranslationSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.translation.TranslationSpec> CREATOR = null;
    public static final int DATA_FORMAT_TEXT = 1;
    private final int mDataFormat = 0;
    @java.lang.Deprecated
    private final java.lang.String mLanguage = null;
    public TranslationSpec(android.icu.util.ULocale p0, int p1) {}
    TranslationSpec(android.os.Parcel p0) {}
    @java.lang.Deprecated
    public TranslationSpec(java.lang.String p0, int p1) {}
    @java.lang.Deprecated
    private void __metadata() {}
    static android.icu.util.ULocale unparcelLocale(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDataFormat() { return 0; }
    @java.lang.Deprecated
    public java.lang.String getLanguage() { return null; }
    public android.icu.util.ULocale getLocale() { return null; }
    public int hashCode() { return 0; }
    void parcelLocale(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataFormat {
    }
}
