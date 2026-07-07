package android.hardware.tv.tuner;

public class FrontendIptvSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIptvSettings> CREATOR = null;
    public long bitrate;
    public java.lang.String contentUrl;
    public android.hardware.tv.tuner.FrontendIptvSettingsFec fec;
    public int igmp;
    public android.hardware.tv.tuner.DemuxIpAddress ipAddr;
    public int protocol;
    public FrontendIptvSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
