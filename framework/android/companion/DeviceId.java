package android.companion;

public final class DeviceId implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.DeviceId> CREATOR = null;
    private static final int CUSTOM_ID_LENGTH_LIMIT = 1024;
    private final java.lang.String mCustomId = null;
    private final byte[] mKey = null;
    private DeviceId(android.companion.DeviceId.Builder p0) {}
    private DeviceId(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCustomId() { return null; }
    public byte[] getKey() { return null; }
    public android.net.MacAddress getMacAddress() { return null; }
    public java.lang.String getMacAddressAsString() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mCustomId;
        private byte[] mKey;
        public Builder() {}
        public android.companion.DeviceId build() { return null; }
        public android.companion.DeviceId.Builder setCustomId(java.lang.String p0) { return null; }
        public android.companion.DeviceId.Builder setKey(byte[] p0) { return null; }
        public android.companion.DeviceId.Builder setMacAddress(android.net.MacAddress p0) { return null; }
    }
}
