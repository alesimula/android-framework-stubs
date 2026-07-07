package android.bluetooth;

public abstract class BluetoothDevice implements android.os.Parcelable {
    public BluetoothDevice() {}
    public java.lang.String getAddress() { return null; }
    public android.os.Parcelable.Creator CREATOR = null;
    public java.lang.String getAlias() { return null; }
    public java.lang.String getName() { return null; }
    public android.os.ParcelUuid[] getUuids() { return null; }
    public void prepareToEnterProcess(android.content.AttributionSource p0) {}
}
