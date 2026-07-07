package android.hardware.tv.tuner;

public final class FrontendBandwidth implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendBandwidth> CREATOR = null;
    public static final int atsc3 = 0;
    public static final int dtmb = 4;
    public static final int dvbc = 1;
    public static final int dvbt = 2;
    public static final int isdbt = 3;
    private int _tag;
    private java.lang.Object _value;
    public FrontendBandwidth() {}
    private FrontendBandwidth(int p0, java.lang.Object p1) {}
    private FrontendBandwidth(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendBandwidth atsc3(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendBandwidth dtmb(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendBandwidth dvbc(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendBandwidth dvbt(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendBandwidth isdbt(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getAtsc3() { return 0; }
    public int getDtmb() { return 0; }
    public int getDvbc() { return 0; }
    public int getDvbt() { return 0; }
    public int getIsdbt() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAtsc3(int p0) {}
    public void setDtmb(int p0) {}
    public void setDvbc(int p0) {}
    public void setDvbt(int p0) {}
    public void setIsdbt(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int atsc3 = 0;
        public static final int dtmb = 4;
        public static final int dvbc = 1;
        public static final int dvbt = 2;
        public static final int isdbt = 3;
    }
}
