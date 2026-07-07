package android.media.soundtrigger;

public class RecognitionConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.RecognitionConfig> CREATOR = null;
    public int audioCapabilities;
    public boolean captureRequested;
    public byte[] data;
    public android.media.soundtrigger.PhraseRecognitionExtra[] phraseRecognitionExtras;
    public RecognitionConfig() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
