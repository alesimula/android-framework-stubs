package android.hardware.tv.tuner;

public final class FrontendScanMessageStandard implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendScanMessageStandard> CREATOR = null;
    public static final int sStd = 0;
    public static final int sifStd = 2;
    public static final int tStd = 1;
    private int _tag;
    private java.lang.Object _value;
    public FrontendScanMessageStandard() {}
    private FrontendScanMessageStandard(int p0, java.lang.Object p1) {}
    private FrontendScanMessageStandard(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendScanMessageStandard sStd(byte p0) { return null; }
    public static android.hardware.tv.tuner.FrontendScanMessageStandard sifStd(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendScanMessageStandard tStd(byte p0) { return null; }
    public int describeContents() { return 0; }
    public byte getSStd() { return 0; }
    public int getSifStd() { return 0; }
    public final int getStability() { return 0; }
    public byte getTStd() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setSStd(byte p0) {}
    public void setSifStd(int p0) {}
    public void setTStd(byte p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int sStd = 0;
        public static final int sifStd = 2;
        public static final int tStd = 1;
    }
}
