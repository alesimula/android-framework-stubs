package android.companion;

public final class AssociationRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.AssociationRequest> CREATOR = null;
    public static final java.lang.String DEVICE_PROFILE_APP_STREAMING = "android.app.role.COMPANION_DEVICE_APP_STREAMING";
    public static final java.lang.String DEVICE_PROFILE_AUTOMOTIVE_PROJECTION = "android.app.role.SYSTEM_AUTOMOTIVE_PROJECTION";
    public static final java.lang.String DEVICE_PROFILE_COMPUTER = "android.app.role.COMPANION_DEVICE_COMPUTER";
    public static final java.lang.String DEVICE_PROFILE_FITNESS_TRACKER = "android.app.role.COMPANION_DEVICE_FITNESS_TRACKER";
    public static final java.lang.String DEVICE_PROFILE_GLASSES = "android.app.role.COMPANION_DEVICE_GLASSES";
    public static final java.lang.String DEVICE_PROFILE_MEDICAL = "android.app.role.COMPANION_DEVICE_MEDICAL";
    public static final java.lang.String DEVICE_PROFILE_NEARBY_DEVICE_STREAMING = "android.app.role.COMPANION_DEVICE_NEARBY_DEVICE_STREAMING";
    public static final java.lang.String DEVICE_PROFILE_VIRTUAL_DEVICE = "android.app.role.COMPANION_DEVICE_VIRTUAL_DEVICE";
    public static final java.lang.String DEVICE_PROFILE_WATCH = "android.app.role.COMPANION_DEVICE_WATCH";
    public static final java.lang.String DEVICE_PROFILE_WEARABLE_SENSING = "android.companion.COMPANION_DEVICE_WEARABLE_SENSING";
    private static final int DISPLAY_NAME_LENGTH_LIMIT = 1024;
    public static final java.lang.String PERMISSION_GROUP_NEARBY = "NEARBY_DEVICES";
    private android.companion.AssociatedDevice mAssociatedDevice;
    private final long mCreationTime = 0L;
    private final java.util.List<android.companion.DeviceFilter<?>> mDeviceFilters = null;
    private android.graphics.drawable.Icon mDeviceIcon;
    private final java.lang.String mDeviceProfile = null;
    private java.lang.String mDeviceProfilePrivilegesDescription;
    private java.lang.CharSequence mDisplayName;
    private final java.util.Set<java.lang.String> mExtraPermissions = null;
    private final boolean mForceConfirmation = false;
    private java.lang.String mPackageName;
    private final boolean mRemoteAiAgentSupported = false;
    private java.util.List<java.lang.Integer> mRequestedPerms;
    private final boolean mSelfManaged = false;
    private final boolean mSingleDevice = false;
    private boolean mSkipPrompt;
    private final boolean mSkipRoleGrant = false;
    private int mUserId;
    private AssociationRequest(android.companion.AssociationRequest.Builder p0) {}
    AssociationRequest(android.os.Parcel p0) {}
    private static void validateDisplayName(java.lang.CharSequence p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.companion.AssociatedDevice getAssociatedDevice() { return null; }
    public long getCreationTime() { return 0L; }
    public java.util.List<android.companion.DeviceFilter<?>> getDeviceFilters() { return null; }
    public android.graphics.drawable.Icon getDeviceIcon() { return null; }
    public java.lang.String getDeviceProfile() { return null; }
    public java.lang.String getDeviceProfilePrivilegesDescription() { return null; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public java.util.Set<java.lang.String> getExtraPermissions() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<java.lang.Integer> getRequestedPerms() { return null; }
    public int getUserId() { return 0; }
    public boolean isForceConfirmation() { return false; }
    public boolean isRemoteAiAgentSupported() { return false; }
    public boolean isSelfManaged() { return false; }
    public boolean isSingleDevice() { return false; }
    public boolean isSkipPrompt() { return false; }
    public boolean isSkipRoleGrant() { return false; }
    public void setAssociatedDevice(android.companion.AssociatedDevice p0) {}
    public void setDeviceIcon(android.graphics.drawable.Icon p0) {}
    public void setDisplayName(java.lang.CharSequence p0) {}
    public void setPackageName(java.lang.String p0) {}
    public void setRequestedPerms(java.util.List<java.lang.Integer> p0) {}
    public void setSkipPrompt(boolean p0) {}
    public void setUserId(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.provider.OneTimeUseBuilder<android.companion.AssociationRequest> {
        private java.util.ArrayList<android.companion.DeviceFilter<?>> mDeviceFilters;
        private android.graphics.drawable.Icon mDeviceIcon;
        private java.lang.String mDeviceProfile;
        private java.lang.CharSequence mDisplayName;
        private java.util.Set<java.lang.String> mExtraPermissions;
        private boolean mForceConfirmation;
        private boolean mRemoteAiAgentSupported;
        private boolean mSelfManaged;
        private boolean mSingleDevice;
        private boolean mSkipRoleGrant;
        public Builder() { super(); }
        public android.companion.AssociationRequest.Builder addDeviceFilter(android.companion.DeviceFilter<?> p0) { return null; }
        public android.companion.AssociationRequest build() { return null; }
        public android.companion.AssociationRequest.Builder setDeviceIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.companion.AssociationRequest.Builder setDeviceProfile(java.lang.String p0) { return null; }
        public android.companion.AssociationRequest.Builder setDisplayName(java.lang.CharSequence p0) { return null; }
        public android.companion.AssociationRequest.Builder setExtraPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.companion.AssociationRequest.Builder setForceConfirmation(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder setRemoteAiAgentSupported(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder setSelfManaged(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder setSingleDevice(boolean p0) { return null; }
        public android.companion.AssociationRequest.Builder setSkipRoleGrant(boolean p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceProfile {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface Permission {
    }
}
