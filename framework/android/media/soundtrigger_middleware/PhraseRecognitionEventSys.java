package android.media.soundtrigger_middleware;

public class PhraseRecognitionEventSys implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.soundtrigger_middleware.PhraseRecognitionEventSys> CREATOR = null;
    public long halEventReceivedMillis;
    public android.media.soundtrigger.PhraseRecognitionEvent phraseRecognitionEvent;
    public android.os.IBinder token;
    public PhraseRecognitionEventSys() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
