package android.hardware.tv.tuner;

public final class DemuxPid implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxPid> CREATOR = null;
    public static final int mmtpPid = 1;
    public static final int tPid = 0;
    private int _tag;
    private java.lang.Object _value;
    public DemuxPid() {}
    private DemuxPid(int p0, java.lang.Object p1) {}
    private DemuxPid(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxPid mmtpPid(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxPid tPid(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getMmtpPid() { return 0; }
    public final int getStability() { return 0; }
    public int getTPid() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setMmtpPid(int p0) {}
    public void setTPid(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int mmtpPid = 1;
        public static final int tPid = 0;
    }
}
