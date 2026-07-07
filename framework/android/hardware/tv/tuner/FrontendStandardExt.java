package android.hardware.tv.tuner;

public final class FrontendStandardExt implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendStandardExt> CREATOR = null;
    public static final int dvbsStandardExt = 0;
    public static final int dvbtStandardExt = 1;
    private int _tag;
    private java.lang.Object _value;
    public FrontendStandardExt() {}
    private FrontendStandardExt(int p0, java.lang.Object p1) {}
    private FrontendStandardExt(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendStandardExt dvbsStandardExt(byte p0) { return null; }
    public static android.hardware.tv.tuner.FrontendStandardExt dvbtStandardExt(byte p0) { return null; }
    public int describeContents() { return 0; }
    public byte getDvbsStandardExt() { return 0; }
    public byte getDvbtStandardExt() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setDvbsStandardExt(byte p0) {}
    public void setDvbtStandardExt(byte p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int dvbsStandardExt = 0;
        public static final int dvbtStandardExt = 1;
    }
}
