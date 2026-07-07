package android.hardware.tv.tuner;

public final class DemuxFilterMonitorEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.DemuxFilterMonitorEvent> CREATOR = null;
    public static final int cid = 1;
    public static final int scramblingStatus = 0;
    private int _tag;
    private java.lang.Object _value;
    public DemuxFilterMonitorEvent() {}
    private DemuxFilterMonitorEvent(int p0, java.lang.Object p1) {}
    private DemuxFilterMonitorEvent(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxFilterMonitorEvent cid(int p0) { return null; }
    public static android.hardware.tv.tuner.DemuxFilterMonitorEvent scramblingStatus(int p0) { return null; }
    public int describeContents() { return 0; }
    public int getCid() { return 0; }
    public int getScramblingStatus() { return 0; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCid(int p0) {}
    public void setScramblingStatus(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int cid = 1;
        public static final int scramblingStatus = 0;
    }
}
