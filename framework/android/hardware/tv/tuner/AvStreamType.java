package android.hardware.tv.tuner;

public final class AvStreamType implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.AvStreamType> CREATOR = null;
    public static final int audio = 1;
    public static final int video = 0;
    private int _tag;
    private java.lang.Object _value;
    public AvStreamType() {}
    private AvStreamType(int p0, java.lang.Object p1) {}
    private AvStreamType(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.AvStreamType audio(int p0) { return null; }
    public static android.hardware.tv.tuner.AvStreamType video(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getAudio() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int getVideo() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAudio(int p0) {}
    public void setVideo(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int audio = 1;
        public static final int video = 0;
    }
}
