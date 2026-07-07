package android.hardware.tv.tuner;

public final class FrontendTransmissionMode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendTransmissionMode> CREATOR = null;
    public static final int dtmb = 2;
    public static final int dvbt = 0;
    public static final int isdbt = 1;
    private int _tag;
    private java.lang.Object _value;
    public FrontendTransmissionMode() {}
    private FrontendTransmissionMode(int p0, java.lang.Object p1) {}
    private FrontendTransmissionMode(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendTransmissionMode dtmb(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendTransmissionMode dvbt(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendTransmissionMode isdbt(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getDtmb() { return 0; }
    public int getDvbt() { return 0; }
    public int getIsdbt() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setDtmb(int p0) {}
    public void setDvbt(int p0) {}
    public void setIsdbt(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int dtmb = 2;
        public static final int dvbt = 0;
        public static final int isdbt = 1;
    }
}
