package android.hardware.radio.network;

public final class PhysicalChannelConfigBand implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.PhysicalChannelConfigBand> CREATOR = null;
    public static final int eutranBand = 3;
    public static final int geranBand = 1;
    public static final int ngranBand = 4;
    public static final int noinit = 0;
    public static final int utranBand = 2;
    private int _tag;
    private java.lang.Object _value;
    public PhysicalChannelConfigBand() {}
    private PhysicalChannelConfigBand(int p0, java.lang.Object p1) {}
    private PhysicalChannelConfigBand(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.radio.network.PhysicalChannelConfigBand eutranBand(int p0) { return null; }
    public static android.hardware.radio.network.PhysicalChannelConfigBand geranBand(int p0) { return null; }
    public static android.hardware.radio.network.PhysicalChannelConfigBand ngranBand(int p0) { return null; }
    public static android.hardware.radio.network.PhysicalChannelConfigBand noinit(boolean p0) { return null; }
    public static android.hardware.radio.network.PhysicalChannelConfigBand utranBand(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getEutranBand() { return 0; }
    public int getGeranBand() { return 0; }
    public int getNgranBand() { return 0; }
    public boolean getNoinit() { return false; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public int getUtranBand() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setEutranBand(int p0) {}
    public void setGeranBand(int p0) {}
    public void setNgranBand(int p0) {}
    public void setNoinit(boolean p0) {}
    public void setUtranBand(int p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int eutranBand = 3;
        public static final int geranBand = 1;
        public static final int ngranBand = 4;
        public static final int noinit = 0;
        public static final int utranBand = 2;
    }
}
