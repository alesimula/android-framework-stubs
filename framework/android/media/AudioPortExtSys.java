package android.media;

public final class AudioPortExtSys implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.AudioPortExtSys> CREATOR = null;
    public static final int device = 1;
    public static final int mix = 2;
    public static final int session = 3;
    public static final int unspecified = 0;
    private int _tag;
    private java.lang.Object _value;
    public AudioPortExtSys() {}
    private AudioPortExtSys(int p0, java.lang.Object p1) {}
    private AudioPortExtSys(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.media.AudioPortExtSys device(android.media.AudioPortDeviceExtSys p0) { return null; }
    public static android.media.AudioPortExtSys mix(android.media.AudioPortMixExtSys p0) { return null; }
    public static android.media.AudioPortExtSys session(int p0) { return null; }
    public static android.media.AudioPortExtSys unspecified(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public android.media.AudioPortDeviceExtSys getDevice() { return null; }
    public android.media.AudioPortMixExtSys getMix() { return null; }
    public int getSession() { return 0; }
    public int getTag() { return 0; }
    public boolean getUnspecified() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setDevice(android.media.AudioPortDeviceExtSys p0) {}
    public void setMix(android.media.AudioPortMixExtSys p0) {}
    public void setSession(int p0) {}
    public void setUnspecified(boolean p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int device = 1;
        public static final int mix = 2;
        public static final int session = 3;
        public static final int unspecified = 0;
    }
}
