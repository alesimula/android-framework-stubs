package android.net.wifi;

public abstract class ScanResult implements android.os.Parcelable {
    public ScanResult() {}
    public android.os.Parcelable.Creator CREATOR = null;
    public java.lang.String SSID = null;
    public java.lang.String BSSID = null;
    public int level = 0;
}
