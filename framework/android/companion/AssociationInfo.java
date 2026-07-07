package android.companion;

public final class AssociationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.AssociationInfo> CREATOR = null;
    private static final java.lang.String LAST_TIME_CONNECTED_NONE = "None";
    public static final java.lang.String METADATA_TIMESTAMP = "_timestamp_";
    private final android.companion.AssociatedDevice mAssociatedDevice = null;
    private final android.graphics.drawable.Icon mDeviceIcon = null;
    private final android.companion.DeviceId mDeviceId = null;
    private final java.lang.String mDeviceProfile = null;
    private final java.lang.CharSequence mDisplayName = null;
    private final java.util.Set<java.lang.String> mExtraPermissions = null;
    private final int mId = 0;
    private final long mLastTimeConnectedMs = 0L;
    private final android.os.PersistableBundle mMetadata = null;
    private final boolean mNotifyOnDeviceNearby = false;
    private final java.lang.String mPackageName = null;
    private final java.util.List<java.lang.String> mPackagesToNotify = null;
    private final boolean mPending = false;
    private final boolean mRemoteAiAgentSupported = false;
    private final boolean mRevoked = false;
    private final boolean mSelfManaged = false;
    private final int mSystemDataSyncFlags = 0;
    private final long mTimeApprovedMs = 0L;
    private final long mTimeMetadataSentMs = 0L;
    private final int mTransportFlags = 0;
    private final int[] mTrustTypes = null;
    private final boolean mTrusted = false;
    private final int mUserId = 0;
    private AssociationInfo(android.companion.AssociationInfo.Builder p0) {}
    private AssociationInfo(android.os.Parcel p0) {}
    private boolean isSameIcon(android.graphics.drawable.Icon p0, android.graphics.drawable.Icon p1) { return false; }
    public boolean belongsToPackage(int p0, java.lang.String p1) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    public android.graphics.drawable.Icon getDeviceIcon() { return null; }
    public android.companion.DeviceId getDeviceId() { return null; }
    public android.net.MacAddress getDeviceMacAddress() { return null; }
    public java.lang.String getDeviceMacAddressAsString() { return null; }
    public java.lang.String getDeviceProfile() { return null; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public java.util.Set<java.lang.String> getExtraPermissions() { return null; }
    public int getId() { return 0; }
    public long getLastTimeConnectedMs() { return 0L; }
    public android.os.PersistableBundle getMetadata() { return null; }
    public android.os.PersistableBundle getMetadata(java.lang.String p0) { return null; }
    public long getMetadataSentTimestamp() { return 0L; }
    public long getMetadataTimestamp() { return 0L; }
    @android.annotation.SystemApi
    public java.lang.String getPackageName() { return null; }
    public java.util.List<java.lang.String> getPackagesToNotify() { return null; }
    public int getSystemDataSyncFlags() { return 0; }
    public long getTimeApprovedMs() { return 0L; }
    public int getTransportFlags() { return 0; }
    public int[] getTrustTypes() { return null; }
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    public boolean isActive() { return false; }
    public boolean isLinkedTo(java.lang.String p0) { return false; }
    public boolean isNotifyOnDeviceNearby() { return false; }
    public boolean isPending() { return false; }
    public boolean isRemoteAiAgentSupported() { return false; }
    public boolean isRevoked() { return false; }
    public boolean isSelfManaged() { return false; }
    public boolean isTrusted() { return false; }
    public boolean shouldBindWhenPresent() { return false; }
    public java.lang.String toShortString() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.companion.AssociatedDevice mAssociatedDevice;
        private android.graphics.drawable.Icon mDeviceIcon;
        private android.companion.DeviceId mDeviceId;
        private java.lang.String mDeviceProfile;
        private java.lang.CharSequence mDisplayName;
        private java.util.Set<java.lang.String> mExtraPermissions;
        private final int mId = 0;
        private long mLastTimeConnectedMs;
        private android.os.PersistableBundle mMetadata;
        private boolean mNotifyOnDeviceNearby;
        private final java.lang.String mPackageName = null;
        private java.util.List<java.lang.String> mPackagesToNotify;
        private boolean mPending;
        private boolean mRemoteAiAgentSupported;
        private boolean mRevoked;
        private boolean mSelfManaged;
        private int mSystemDataSyncFlags;
        private long mTimeApprovedMs;
        private long mTimeMetadataSentMs;
        private int mTransportFlags;
        private int[] mTrustTypes;
        private boolean mTrusted;
        private final int mUserId = 0;
        public Builder(int p0, int p1, java.lang.String p2) {}
        public Builder(int p0, int p1, java.lang.String p2, android.companion.AssociationInfo p3) {}
        public Builder(android.companion.AssociationInfo p0) {}
        public android.companion.AssociationInfo build() { return null; }
        public android.companion.AssociationInfo.Builder setAssociatedDevice(android.companion.AssociatedDevice p0) { return null; }
        public android.companion.AssociationInfo.Builder setDeviceIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.companion.AssociationInfo.Builder setDeviceId(android.companion.DeviceId p0) { return null; }
        public android.companion.AssociationInfo.Builder setDeviceMacAddress(android.net.MacAddress p0) { return null; }
        public android.companion.AssociationInfo.Builder setDeviceProfile(java.lang.String p0) { return null; }
        public android.companion.AssociationInfo.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        public android.companion.AssociationInfo.Builder setExtraPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.companion.AssociationInfo.Builder setLastTimeConnected(long p0) { return null; }
        public android.companion.AssociationInfo.Builder setMetadata(android.os.PersistableBundle p0) { return null; }
        public android.companion.AssociationInfo.Builder setNotifyOnDeviceNearby(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setPackagesToNotify(java.util.List<java.lang.String> p0) { return null; }
        public android.companion.AssociationInfo.Builder setPending(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setRemoteAiAgentSupported(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setRevoked(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setSelfManaged(boolean p0) { return null; }
        public android.companion.AssociationInfo.Builder setSystemDataSyncFlags(int p0) { return null; }
        public android.companion.AssociationInfo.Builder setTimeApproved(long p0) { return null; }
        public android.companion.AssociationInfo.Builder setTimeMetadataSent(long p0) { return null; }
        public android.companion.AssociationInfo.Builder setTransportFlags(int p0) { return null; }
        public android.companion.AssociationInfo.Builder setTrustTypes(int[] p0) { return null; }
        public android.companion.AssociationInfo.Builder setTrusted(boolean p0) { return null; }
    }
}
