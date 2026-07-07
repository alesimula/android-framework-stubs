package android.net;

public class WifiLinkQualityInfo extends android.net.LinkQualityInfo {
    private java.lang.String mBssid;
    private int mRssi;
    private long mTxBad;
    private long mTxGood;
    private int mType;
    public WifiLinkQualityInfo() { super(); }
    public static android.net.WifiLinkQualityInfo createFromParcelBody(android.os.Parcel p0) { return null; }
    public java.lang.String getBssid() { return null; }
    public int getRssi() { return 0; }
    public long getTxBad() { return 0L; }
    public long getTxGood() { return 0L; }
    public int getType() { return 0; }
    public void setBssid(java.lang.String p0) {}
    public void setRssi(int p0) {}
    public void setTxBad(long p0) {}
    public void setTxGood(long p0) {}
    public void setType(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
