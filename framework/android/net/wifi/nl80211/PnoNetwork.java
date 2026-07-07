package android.net.wifi.nl80211;

@android.annotation.SystemApi
@java.lang.Deprecated
public final class PnoNetwork implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.wifi.nl80211.PnoNetwork> CREATOR = null;
    private int[] mFrequencies;
    private boolean mIsHidden;
    private byte[] mSsid;
    public PnoNetwork() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] getFrequenciesMhz() { return null; }
    public byte[] getSsid() { return null; }
    public int hashCode() { return 0; }
    public boolean isHidden() { return false; }
    public void setFrequenciesMhz(int[] p0) {}
    public void setHidden(boolean p0) {}
    public void setSsid(byte[] p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
