package android.companion;

public final class DevicePresenceEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.DevicePresenceEvent> CREATOR = null;
    public static final int EVENT_ASSOCIATION_REMOVED = 6;
    public static final int EVENT_BLE_APPEARED = 0;
    public static final int EVENT_BLE_DISAPPEARED = 1;
    public static final int EVENT_BT_CONNECTED = 2;
    public static final int EVENT_BT_DISCONNECTED = 3;
    public static final int EVENT_SELF_MANAGED_APPEARED = 4;
    public static final int EVENT_SELF_MANAGED_DISAPPEARED = 5;
    public static final int EVENT_SELF_MANAGED_NEARBY = 7;
    public static final int EVENT_SELF_MANAGED_NOT_NEARBY = 8;
    public static final int NO_ASSOCIATION = -1;
    private static final int PARCEL_UUID_NOT_NULL = 1;
    private static final int PARCEL_UUID_NULL = 0;
    private final int mAssociationId = 0;
    private final int mEvent = 0;
    private final android.os.ParcelUuid mUuid = null;
    @java.lang.Deprecated
    public DevicePresenceEvent(int p0, int p1, android.os.ParcelUuid p2) {}
    private DevicePresenceEvent(android.companion.DevicePresenceEvent.Builder p0) {}
    private DevicePresenceEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAssociationId() { return 0; }
    public int getEvent() { return 0; }
    public android.os.ParcelUuid getUuid() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.Integer mAssociationId;
        private java.lang.Integer mEvent;
        private android.os.ParcelUuid mUuid;
        public Builder() {}
        public android.companion.DevicePresenceEvent build() { return null; }
        public android.companion.DevicePresenceEvent.Builder setAssociationId(int p0) { return null; }
        public android.companion.DevicePresenceEvent.Builder setEvent(int p0) { return null; }
        public android.companion.DevicePresenceEvent.Builder setUuid(android.os.ParcelUuid p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }
}
