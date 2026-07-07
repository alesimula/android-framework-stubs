package android.media.audio.common;

public final class AudioIoFlags implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioIoFlags> CREATOR = null;
    public static final int input = 0;
    public static final int output = 1;
    private int _tag;
    private java.lang.Object _value;
    public AudioIoFlags() {}
    private AudioIoFlags(int p0, java.lang.Object p1) {}
    private AudioIoFlags(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.media.audio.common.AudioIoFlags input(int p0) { return null; }
    public static android.media.audio.common.AudioIoFlags output(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getInput() { return 0; }
    public int getOutput() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setInput(int p0) {}
    public void setOutput(int p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int input = 0;
        public static final int output = 1;
    }
}
