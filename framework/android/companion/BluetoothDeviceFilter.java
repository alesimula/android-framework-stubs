package android.companion;

public final class BluetoothDeviceFilter implements android.companion.DeviceFilter<android.bluetooth.BluetoothDevice> {
    public static final android.os.Parcelable.Creator<android.companion.BluetoothDeviceFilter> CREATOR = null;
    private final java.lang.String mAddress = null;
    private final java.util.regex.Pattern mNamePattern = null;
    private final java.util.List<android.os.ParcelUuid> mServiceUuidMasks = null;
    private final java.util.List<android.os.ParcelUuid> mServiceUuids = null;
    private BluetoothDeviceFilter(android.companion.BluetoothDeviceFilter.Builder p0) {}
    private BluetoothDeviceFilter(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAddress() { return null; }
    public java.lang.String getDeviceDisplayName(android.bluetooth.BluetoothDevice p0) { return null; }
    public int getMediumType() { return 0; }
    public java.util.regex.Pattern getNamePattern() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceUuidMasks() { return null; }
    public java.util.List<android.os.ParcelUuid> getServiceUuids() { return null; }
    public int hashCode() { return 0; }
    public boolean matches(android.bluetooth.BluetoothDevice p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.BluetoothDeviceFilter> {
        private java.lang.String mAddress;
        private java.util.regex.Pattern mNamePattern;
        private java.util.ArrayList<android.os.ParcelUuid> mServiceUuid;
        private java.util.ArrayList<android.os.ParcelUuid> mServiceUuidMask;
        public Builder() { super(); }
        public android.companion.BluetoothDeviceFilter.Builder addServiceUuid(android.os.ParcelUuid p0, android.os.ParcelUuid p1) { return null; }
        public android.companion.BluetoothDeviceFilter build() { return null; }
        public android.companion.BluetoothDeviceFilter.Builder setAddress(java.lang.String p0) { return null; }
        public android.companion.BluetoothDeviceFilter.Builder setNamePattern(java.util.regex.Pattern p0) { return null; }
    }
}
