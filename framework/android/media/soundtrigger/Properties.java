package android.media.soundtrigger;

public class Properties implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.soundtrigger.Properties> CREATOR = null;
    public int audioCapabilities;
    public boolean captureTransition;
    public boolean concurrentCapture;
    public java.lang.String description;
    public java.lang.String implementor;
    public int maxBufferMs;
    public int maxKeyPhrases;
    public int maxSoundModels;
    public int maxUsers;
    public int powerConsumptionMw;
    public int recognitionModes;
    public java.lang.String supportedModelArch;
    public boolean triggerInEvent;
    public java.lang.String uuid;
    public int version;
    public Properties() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
