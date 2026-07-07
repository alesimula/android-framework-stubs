package android.hardware.tv.tuner;

public final class FrontendInterleaveMode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendInterleaveMode> CREATOR = null;
    public static final int atsc3 = 0;
    public static final int dtmb = 2;
    public static final int dvbc = 1;
    public static final int isdbt = 3;
    private int _tag;
    private java.lang.Object _value;
    public FrontendInterleaveMode() {}
    private FrontendInterleaveMode(int p0, java.lang.Object p1) {}
    private FrontendInterleaveMode(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendInterleaveMode atsc3(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendInterleaveMode dtmb(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendInterleaveMode dvbc(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendInterleaveMode isdbt(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getAtsc3() { return 0; }
    public int getDtmb() { return 0; }
    public int getDvbc() { return 0; }
    public int getIsdbt() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAtsc3(int p0) {}
    public void setDtmb(int p0) {}
    public void setDvbc(int p0) {}
    public void setIsdbt(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int atsc3 = 0;
        public static final int dtmb = 2;
        public static final int dvbc = 1;
        public static final int isdbt = 3;
    }
}
