package android.hardware.display;

public final class WifiDisplay implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.WifiDisplay> CREATOR = null;
    public static final android.hardware.display.WifiDisplay[] EMPTY_ARRAY = null;
    private static final java.lang.String UNKNOWN_MAC_ADDRESS = "00:00:00:00:00:00";
    private final boolean mCanConnect = false;
    private final java.lang.String mDeviceAddress = null;
    private final java.lang.String mDeviceAlias = null;
    private final java.lang.String mDeviceName = null;
    private final boolean mIsAvailable = false;
    private final boolean mIsRemembered = false;
    public WifiDisplay(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, boolean p5) {}
    public boolean canConnect() { return false; }
    public android.hardware.display.WifiDisplay copy(boolean p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(android.hardware.display.WifiDisplay p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getDeviceAddress() { return null; }
    public java.lang.String getDeviceAlias() { return null; }
    public java.lang.String getDeviceName() { return null; }
    public java.lang.String getFriendlyDisplayName() { return null; }
    public boolean hasSameAddress(android.hardware.display.WifiDisplay p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isAvailable() { return false; }
    public boolean isRemembered() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
