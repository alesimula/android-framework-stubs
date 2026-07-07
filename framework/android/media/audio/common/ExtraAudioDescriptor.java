package android.media.audio.common;

public class ExtraAudioDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.ExtraAudioDescriptor> CREATOR = null;
    public byte[] audioDescriptor;
    public int encapsulationType;
    public int standard;
    public ExtraAudioDescriptor() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
