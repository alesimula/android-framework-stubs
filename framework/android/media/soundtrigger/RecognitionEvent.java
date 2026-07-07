package android.media.soundtrigger;

public class RecognitionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.RecognitionEvent> CREATOR = null;
    public android.media.audio.common.AudioConfig audioConfig;
    public boolean captureAvailable;
    public int captureDelayMs;
    public int capturePreambleMs;
    public byte[] data;
    public boolean recognitionStillActive;
    public int status;
    public boolean triggerInData;
    public int type;
    public RecognitionEvent() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
