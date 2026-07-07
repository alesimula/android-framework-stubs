package android.companion;

public final class ObservingDevicePresenceRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.ObservingDevicePresenceRequest> CREATOR = null;
    private static final int PARCEL_UUID_NOT_NULL = 1;
    private static final int PARCEL_UUID_NULL = 0;
    private final int mAssociationId = 0;
    private final android.companion.DeviceId mDeviceId = null;
    private final android.os.ParcelUuid mUuid = null;
    private ObservingDevicePresenceRequest(android.companion.ObservingDevicePresenceRequest.Builder p0) {}
    private ObservingDevicePresenceRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAssociationId() { return 0; }
    @android.annotation.SystemApi
    public android.companion.DeviceId getDeviceId() { return null; }
    public android.os.ParcelUuid getUuid() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAssociationId;
        private android.companion.DeviceId mDeviceId;
        private android.os.ParcelUuid mUuid;
        public Builder() {}
        public android.companion.ObservingDevicePresenceRequest build() { return null; }
        public android.companion.ObservingDevicePresenceRequest.Builder setAssociationId(int p0) { return null; }
        @android.annotation.SystemApi
        public android.companion.ObservingDevicePresenceRequest.Builder setDeviceId(android.companion.DeviceId p0) { return null; }
        public android.companion.ObservingDevicePresenceRequest.Builder setUuid(android.os.ParcelUuid p0) { return null; }
    }
}
