package android.bluetooth.le;

public abstract class ScanResult implements android.os.Parcelable {
    public ScanResult() {}
    public android.os.Parcelable.Creator CREATOR = null;
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    public android.bluetooth.le.ScanRecord getScanRecord() { return null; }
}
