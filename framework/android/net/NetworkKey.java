package android.net;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NetworkKey implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.NetworkKey> CREATOR = null;
    private static final java.lang.String TAG = "NetworkKey";
    public static final int TYPE_WIFI = 1;
    public final int type = 0;
    public final android.net.WifiKey wifiKey = null;
    public NetworkKey(android.net.WifiKey p0) {}
    private NetworkKey(android.os.Parcel p0) {}
    public static android.net.NetworkKey createFromScanResult(android.net.wifi.ScanResult p0) { return null; }
    public static android.net.NetworkKey createFromWifiInfo(android.net.wifi.WifiInfo p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
