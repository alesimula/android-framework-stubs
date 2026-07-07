package android.companion;

public final class AssociatedDevice implements android.os.Parcelable {
    private static final int BLUETOOTH_LE = 1;
    private static final int CLASSIC_BLUETOOTH = 0;
    public static final android.os.Parcelable.Creator<android.companion.AssociatedDevice> CREATOR = null;
    private static final int WIFI = 2;
    private final android.os.Parcelable mDevice = null;
    private AssociatedDevice(android.os.Parcel p0) {}
    public AssociatedDevice(android.os.Parcelable p0) {}
    private static android.os.Parcelable.Creator<? extends android.os.Parcelable> getDeviceCreator(int p0) { return null; }
    private int getDeviceType() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.bluetooth.le.ScanResult getBleDevice() { return null; }
    public android.bluetooth.BluetoothDevice getBluetoothDevice() { return null; }
    public android.net.wifi.ScanResult getWifiDevice() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
