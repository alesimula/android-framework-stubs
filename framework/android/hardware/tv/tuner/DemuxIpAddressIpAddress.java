package android.hardware.tv.tuner;

public final class DemuxIpAddressIpAddress implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxIpAddressIpAddress> CREATOR = null;
    public static final int v4 = 0;
    public static final int v6 = 1;
    private int _tag;
    private java.lang.Object _value;
    public DemuxIpAddressIpAddress() {}
    private DemuxIpAddressIpAddress(int p0, java.lang.Object p1) {}
    private DemuxIpAddressIpAddress(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxIpAddressIpAddress v4(byte[] p0) { return null; }
    public static android.hardware.tv.tuner.DemuxIpAddressIpAddress v6(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public byte[] getV4() { return null; }
    public byte[] getV6() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setV4(byte[] p0) {}
    public void setV6(byte[] p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int v4 = 0;
        public static final int v6 = 1;
    }
}
