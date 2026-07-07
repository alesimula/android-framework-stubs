package android.hardware.contexthub;

@android.annotation.SystemApi
public final class HubServiceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubServiceInfo> CREATOR = null;
    public static final int FORMAT_AIDL = 1;
    public static final int FORMAT_CUSTOM = 0;
    public static final int FORMAT_PW_RPC_PROTOBUF = 2;
    private final int mFormat = 0;
    private final int mMajorVersion = 0;
    private final int mMinorVersion = 0;
    private final java.lang.String mServiceDescriptor = null;
    public HubServiceInfo(android.hardware.contexthub.Service p0) {}
    private HubServiceInfo(android.os.Parcel p0) {}
    public HubServiceInfo(java.lang.String p0, int p1, int p2, int p3) {}
    public int describeContents() { return 0; }
    public int getFormat() { return 0; }
    public int getMajorVersion() { return 0; }
    public int getMinorVersion() { return 0; }
    public java.lang.String getServiceDescriptor() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mFormat = 0;
        private final int mMajorVersion = 0;
        private final int mMinorVersion = 0;
        private final java.lang.String mServiceDescriptor = null;
        public Builder(java.lang.String p0, int p1, int p2, int p3) {}
        public android.hardware.contexthub.HubServiceInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceFormat {
    }
}
