package android.hardware.contexthub;

@android.annotation.SystemApi
public final class HubEndpointInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.HubEndpointInfo> CREATOR = null;
    public static final int TYPE_APP = 2;
    public static final int TYPE_FRAMEWORK = 1;
    public static final int TYPE_HUB_ENDPOINT = 5;
    public static final int TYPE_NANOAPP = 4;
    public static final int TYPE_NATIVE = 3;
    private final java.util.List<android.hardware.contexthub.HubServiceInfo> mHubServiceInfos = null;
    private final android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier mId = null;
    private final java.lang.String mName = null;
    private final java.util.List<java.lang.String> mRequiredPermissions = null;
    private final android.hardware.contexthub.EndpointInfo.SharedDataSupportVersion mSharedDataSupportVersion = null;
    private final java.lang.String mTag = null;
    private final int mType = 0;
    private final int mVersion = 0;
    public HubEndpointInfo(android.hardware.contexthub.EndpointInfo p0) {}
    private HubEndpointInfo(android.os.Parcel p0) {}
    public HubEndpointInfo(java.lang.String p0, int p1, java.lang.String p2, java.util.List<android.hardware.contexthub.HubServiceInfo> p3, android.hardware.contexthub.EndpointInfo.SharedDataSupportVersion p4) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier getIdentifier() { return null; }
    public java.lang.String getName() { return null; }
    public java.util.Collection<java.lang.String> getRequiredPermissions() { return null; }
    public java.util.Collection<android.hardware.contexthub.HubServiceInfo> getServiceInfoCollection() { return null; }
    public java.lang.String getTag() { return null; }
    public int getType() { return 0; }
    public int getVersion() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndpointType {
    }

    public static class HubEndpointIdentifier {
        private final long mEndpointId = 0L;
        private final long mHubId = 0L;
        public HubEndpointIdentifier(long p0, long p1) {}
        public HubEndpointIdentifier(android.hardware.contexthub.EndpointId p0) {}
        public static android.hardware.contexthub.HubEndpointInfo.HubEndpointIdentifier invalid() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public long getEndpoint() { return 0L; }
        public long getHub() { return 0L; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
