package android.hardware.tv.tuner;

public final class FrontendRollOff implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendRollOff> CREATOR = null;
    public static final int dvbs = 0;
    public static final int isdbs = 1;
    public static final int isdbs3 = 2;
    private int _tag;
    private java.lang.Object _value;
    public FrontendRollOff() {}
    private FrontendRollOff(int p0, java.lang.Object p1) {}
    private FrontendRollOff(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendRollOff dvbs(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendRollOff isdbs(int p0) { return null; }
    public static android.hardware.tv.tuner.FrontendRollOff isdbs3(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getDvbs() { return 0; }
    public int getIsdbs() { return 0; }
    public int getIsdbs3() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setDvbs(int p0) {}
    public void setIsdbs(int p0) {}
    public void setIsdbs3(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int dvbs = 0;
        public static final int isdbs = 1;
        public static final int isdbs3 = 2;
    }
}
