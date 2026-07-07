package android.media.audio.common;

public class AudioAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioAttributes> CREATOR = null;
    public int contentType;
    public int flags;
    public int source;
    public java.lang.String[] tags;
    public int usage;
    public AudioAttributes() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
