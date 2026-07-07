package android.hardware.soundtrigger;

public final class KeyphraseMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.soundtrigger.KeyphraseMetadata> CREATOR = null;
    private final int mId = 0;
    private final java.lang.String mKeyphrase = null;
    private final int mRecognitionModeFlags = 0;
    private final android.util.ArraySet<java.util.Locale> mSupportedLocales = null;
    public KeyphraseMetadata(int p0, java.lang.String p1, java.util.Set<java.util.Locale> p2, int p3) {}
    KeyphraseMetadata(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getId() { return 0; }
    public java.lang.String getKeyphrase() { return null; }
    public int getRecognitionModeFlags() { return 0; }
    public java.util.Set<java.util.Locale> getSupportedLocales() { return null; }
    public int hashCode() { return 0; }
    public boolean supportsLocale(java.util.Locale p0) { return false; }
    public boolean supportsPhrase(java.lang.String p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
