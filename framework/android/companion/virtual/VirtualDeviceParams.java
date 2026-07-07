package android.companion.virtual;

@android.annotation.SystemApi
public final class VirtualDeviceParams implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final int ACTIVITY_POLICY_DEFAULT_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int ACTIVITY_POLICY_DEFAULT_BLOCKED = 1;
    public static final android.os.Parcelable.Creator<android.companion.virtual.VirtualDeviceParams> CREATOR = null;
    public static final int DEVICE_POLICY_CUSTOM = 1;
    public static final int DEVICE_POLICY_DEFAULT = 0;
    public static final int DEVICE_POLICY_INVALID = -1;
    public static final int LOCK_STATE_ALWAYS_UNLOCKED = 1;
    public static final int LOCK_STATE_DEFAULT = 0;
    @java.lang.Deprecated
    public static final int NAVIGATION_POLICY_DEFAULT_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int NAVIGATION_POLICY_DEFAULT_BLOCKED = 1;
    public static final int POLICY_TYPE_ACTIVITY = 3;
    public static final int POLICY_TYPE_AUDIO = 1;
    public static final int POLICY_TYPE_BLOCKED_ACTIVITY = 6;
    public static final int POLICY_TYPE_CAMERA = 5;
    public static final int POLICY_TYPE_CLIPBOARD = 4;
    public static final int POLICY_TYPE_DEFAULT_DEVICE_CAMERA_ACCESS = 7;
    public static final int POLICY_TYPE_RECENTS = 2;
    public static final int POLICY_TYPE_SENSORS = 0;
    public static final int POLICY_TYPE_THERMAL = 8;
    private final android.util.ArraySet<android.content.ComponentName> mActivityPolicyExemptions = null;
    private final android.util.ArraySet<android.os.UserHandle> mAllowedUsers = null;
    private final int mAudioPlaybackSessionId = 0;
    private final int mAudioRecordingSessionId = 0;
    private final android.util.ArraySet<android.content.ComponentName> mCrossTaskNavigationExemptions = null;
    private final int mDefaultActivityPolicy = 0;
    private final int mDefaultNavigationPolicy = 0;
    private final android.util.SparseIntArray mDevicePolicies = null;
    private final long mDimDuration = 0L;
    private final android.content.ComponentName mHomeComponent = null;
    private final android.content.ComponentName mInputMethodComponent = null;
    private final boolean mLocalDeviceOnly = false;
    private final int mLockState = 0;
    private final java.lang.String mName = null;
    private final long mScreenOffTimeout = 0L;
    private final android.util.ArraySet<android.os.UserHandle> mUsersWithMatchingAccounts = null;
    private final android.companion.virtual.ViewConfigurationParams mViewConfigurationParams = null;
    private final android.companion.virtual.sensor.IVirtualSensorCallback mVirtualSensorCallback = null;
    private final java.util.List<android.companion.virtual.sensor.VirtualSensorConfig> mVirtualSensorConfigs = null;
    private VirtualDeviceParams(int p0, java.util.Set<android.os.UserHandle> p1, java.util.Set<android.os.UserHandle> p2, int p3, java.util.Set<android.content.ComponentName> p4, int p5, java.util.Set<android.content.ComponentName> p6, java.lang.String p7, android.util.SparseIntArray p8, android.content.ComponentName p9, android.content.ComponentName p10, java.util.List<android.companion.virtual.sensor.VirtualSensorConfig> p11, android.companion.virtual.sensor.IVirtualSensorCallback p12, int p13, int p14, long p15, long p16, boolean p17, android.companion.virtual.ViewConfigurationParams p18) {}
    private VirtualDeviceParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public java.util.Set<android.content.ComponentName> getAllowedActivities() { return null; }
    @java.lang.Deprecated
    public java.util.Set<android.content.ComponentName> getAllowedCrossTaskNavigations() { return null; }
    public java.util.Set<android.os.UserHandle> getAllowedUsers() { return null; }
    public int getAudioPlaybackSessionId() { return 0; }
    public int getAudioRecordingSessionId() { return 0; }
    @java.lang.Deprecated
    public java.util.Set<android.content.ComponentName> getBlockedActivities() { return null; }
    @java.lang.Deprecated
    public java.util.Set<android.content.ComponentName> getBlockedCrossTaskNavigations() { return null; }
    @java.lang.Deprecated
    public int getDefaultActivityPolicy() { return 0; }
    @java.lang.Deprecated
    public int getDefaultNavigationPolicy() { return 0; }
    public android.util.SparseIntArray getDevicePolicies() { return null; }
    public int getDevicePolicy(int p0) { return 0; }
    public java.time.Duration getDimDuration() { return null; }
    public android.content.ComponentName getHomeComponent() { return null; }
    public android.content.ComponentName getInputMethodComponent() { return null; }
    public int getLockState() { return 0; }
    public java.lang.String getName() { return null; }
    public java.time.Duration getScreenOffTimeout() { return null; }
    public java.util.Set<android.os.UserHandle> getUsersWithMatchingAccounts() { return null; }
    public android.companion.virtual.ViewConfigurationParams getViewConfigurationParams() { return null; }
    public android.companion.virtual.sensor.IVirtualSensorCallback getVirtualSensorCallback() { return null; }
    public java.util.List<android.companion.virtual.sensor.VirtualSensorConfig> getVirtualSensorConfigs() { return null; }
    public int hashCode() { return 0; }
    public boolean isLocalDeviceOnly() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface ActivityPolicy {
    }

    public static final class Builder {
        private static final java.time.Duration INFINITE_TIMEOUT = null;
        private java.util.Set<android.content.ComponentName> mActivityPolicyExemptions;
        private java.util.Set<android.os.UserHandle> mAllowedUsers;
        private int mAudioPlaybackSessionId;
        private int mAudioRecordingSessionId;
        private java.util.Set<android.content.ComponentName> mCrossTaskNavigationExemptions;
        private int mDefaultActivityPolicy;
        private boolean mDefaultActivityPolicyConfigured;
        private int mDefaultNavigationPolicy;
        private boolean mDefaultNavigationPolicyConfigured;
        private final android.util.SparseIntArray mDevicePolicies = null;
        private java.time.Duration mDimDuration;
        private android.content.ComponentName mHomeComponent;
        private android.content.ComponentName mInputMethodComponent;
        private boolean mLocalDeviceOnly;
        private int mLockState;
        private java.lang.String mName;
        private java.time.Duration mScreenOffTimeout;
        private java.util.Set<android.os.UserHandle> mUsersWithMatchingAccounts;
        private android.companion.virtual.ViewConfigurationParams mViewConfigurationParams;
        private android.companion.virtual.sensor.VirtualSensorCallback mVirtualSensorCallback;
        private java.util.concurrent.Executor mVirtualSensorCallbackExecutor;
        private final java.util.List<android.companion.virtual.sensor.VirtualSensorConfig> mVirtualSensorConfigs = null;
        private android.companion.virtual.sensor.VirtualSensorDirectChannelCallback mVirtualSensorDirectChannelCallback;
        private java.util.concurrent.Executor mVirtualSensorDirectChannelCallbackExecutor;
        public Builder() {}
        public android.companion.virtual.VirtualDeviceParams.Builder addVirtualSensorConfig(android.companion.virtual.sensor.VirtualSensorConfig p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams build() { return null; }
        @java.lang.Deprecated
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        @java.lang.Deprecated
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setAllowedUsers(java.util.Set<android.os.UserHandle> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setAudioPlaybackSessionId(int p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setAudioRecordingSessionId(int p0) { return null; }
        @java.lang.Deprecated
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedActivities(java.util.Set<android.content.ComponentName> p0) { return null; }
        @java.lang.Deprecated
        public android.companion.virtual.VirtualDeviceParams.Builder setBlockedCrossTaskNavigations(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setDevicePolicy(int p0, int p1) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setDimDuration(java.time.Duration p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setHomeComponent(android.content.ComponentName p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setInputMethodComponent(android.content.ComponentName p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setLocalDeviceOnly(boolean p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setLockState(int p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setName(java.lang.String p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setScreenOffTimeout(java.time.Duration p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setUsersWithMatchingAccounts(java.util.Set<android.os.UserHandle> p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setViewConfigurationParams(android.companion.virtual.ViewConfigurationParams p0) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setVirtualSensorCallback(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorCallback p1) { return null; }
        public android.companion.virtual.VirtualDeviceParams.Builder setVirtualSensorDirectChannelCallback(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorDirectChannelCallback p1) { return null; }

        private static class VirtualSensorCallbackDelegate extends android.companion.virtual.sensor.IVirtualSensorCallback.Stub {
            private final android.companion.virtual.sensor.VirtualSensorCallback mCallback = null;
            private final android.companion.virtual.sensor.VirtualSensorDirectChannelCallback mDirectChannelCallback = null;
            private final java.util.concurrent.Executor mDirectChannelExecutor = null;
            private final java.util.concurrent.Executor mExecutor = null;
            VirtualSensorCallbackDelegate(java.util.concurrent.Executor p0, android.companion.virtual.sensor.VirtualSensorCallback p1, java.util.concurrent.Executor p2, android.companion.virtual.sensor.VirtualSensorDirectChannelCallback p3) { super(); }
            public void onConfigurationChanged(android.companion.virtual.sensor.VirtualSensor p0, boolean p1, int p2, int p3) {}
            public void onDirectChannelConfigured(int p0, android.companion.virtual.sensor.VirtualSensor p1, int p2, int p3) {}
            public void onDirectChannelCreated(int p0, android.os.SharedMemory p1) {}
            public void onDirectChannelDestroyed(int p0) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DevicePolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DynamicDisplayPolicyType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DynamicPolicyType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface LockState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface NavigationPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface PolicyType {
    }
}
