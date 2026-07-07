package android.net;

public class LinkQualityInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.LinkQualityInfo> CREATOR = null;
    public static final int NORMALIZED_MAX_SIGNAL_STRENGTH = 99;
    public static final int NORMALIZED_MIN_SIGNAL_STRENGTH = 0;
    public static final int NORMALIZED_SIGNAL_STRENGTH_RANGE = 100;
    protected static final int OBJECT_TYPE_LINK_QUALITY_INFO = 1;
    protected static final int OBJECT_TYPE_MOBILE_LINK_QUALITY_INFO = 3;
    protected static final int OBJECT_TYPE_WIFI_LINK_QUALITY_INFO = 2;
    public static final int UNKNOWN_INT = 2147483647;
    public static final long UNKNOWN_LONG = 9223372036854775807L;
    private int mDataSampleDuration;
    private long mLastDataSampleTime;
    private int mNetworkType;
    private int mNormalizedSignalStrength;
    private long mPacketCount;
    private long mPacketErrorCount;
    private int mTheoreticalLatency;
    private int mTheoreticalRxBandwidth;
    private int mTheoreticalTxBandwidth;
    public LinkQualityInfo() {}
    public int describeContents() { return 0; }
    public int getDataSampleDuration() { return 0; }
    public long getLastDataSampleTime() { return 0L; }
    public int getNetworkType() { return 0; }
    public int getNormalizedSignalStrength() { return 0; }
    public long getPacketCount() { return 0L; }
    public long getPacketErrorCount() { return 0L; }
    public int getTheoreticalLatency() { return 0; }
    public int getTheoreticalRxBandwidth() { return 0; }
    public int getTheoreticalTxBandwidth() { return 0; }
    protected void initializeFromParcel(android.os.Parcel p0) {}
    public void setDataSampleDuration(int p0) {}
    public void setLastDataSampleTime(long p0) {}
    public void setNetworkType(int p0) {}
    public void setNormalizedSignalStrength(int p0) {}
    public void setPacketCount(long p0) {}
    public void setPacketErrorCount(long p0) {}
    public void setTheoreticalLatency(int p0) {}
    public void setTheoreticalRxBandwidth(int p0) {}
    public void setTheoreticalTxBandwidth(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1, int p2) {}
}
