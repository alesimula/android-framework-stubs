package android.media;

public final class MediaRoute2Info implements android.os.Parcelable {
    public static final int CONNECTION_STATE_CONNECTED = 2;
    public static final int CONNECTION_STATE_CONNECTING = 1;
    public static final int CONNECTION_STATE_DISCONNECTED = 0;
    public static final android.os.Parcelable.Creator<android.media.MediaRoute2Info> CREATOR = null;
    public static final java.lang.String FEATURE_LIVE_AUDIO = "android.media.route.feature.LIVE_AUDIO";
    public static final java.lang.String FEATURE_LIVE_VIDEO = "android.media.route.feature.LIVE_VIDEO";
    public static final java.lang.String FEATURE_LOCAL_PLAYBACK = "android.media.route.feature.LOCAL_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_AUDIO_PLAYBACK = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_GROUP_PLAYBACK = "android.media.route.feature.REMOTE_GROUP_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_PLAYBACK = "android.media.route.feature.REMOTE_PLAYBACK";
    public static final java.lang.String FEATURE_REMOTE_VIDEO_PLAYBACK = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    public static final java.lang.String ROUTE_ID_DEFAULT = "DEFAULT_ROUTE";
    public static final int ROUTING_TYPE_APP_PROJECTION = 6;
    public static final int ROUTING_TYPE_AUDIO_PROJECTION = 2;
    public static final int ROUTING_TYPE_DISPLAY_EXTENSION = 5;
    public static final int ROUTING_TYPE_DISPLAY_MIRRORING = 3;
    public static final int ROUTING_TYPE_DISPLAY_MIRRORING_AND_AUDIO_PROJECTION = 4;
    public static final int ROUTING_TYPE_OTHER = 0;
    public static final int ROUTING_TYPE_REMOTE = 1;
    public static final int SUITABILITY_STATUS_NOT_SUITABLE_FOR_TRANSFER = 2;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_DEFAULT_TRANSFER = 0;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_MANUAL_TRANSFER = 1;
    public static final int TYPE_AUX_LINE = 19;
    public static final int TYPE_BLE_HEADSET = 26;
    public static final int TYPE_BLE_HEARING_AID = 33;
    public static final int TYPE_BLUETOOTH_A2DP = 8;
    public static final int TYPE_BUILTIN_SPEAKER = 2;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_GROUP = 2000;
    public static final int TYPE_HDMI = 9;
    public static final int TYPE_HDMI_ARC = 10;
    public static final int TYPE_HDMI_EARC = 29;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_LINE_ANALOG = 5;
    public static final int TYPE_LINE_DIGITAL = 6;
    public static final int TYPE_MULTICHANNEL_SPEAKER_GROUP = 32;
    public static final int TYPE_REMOTE_AUDIO_VIDEO_RECEIVER = 1003;
    public static final int TYPE_REMOTE_CAR = 1008;
    public static final int TYPE_REMOTE_COMPUTER = 1006;
    public static final int TYPE_REMOTE_GAME_CONSOLE = 1007;
    public static final int TYPE_REMOTE_SMARTPHONE = 1010;
    public static final int TYPE_REMOTE_SMARTWATCH = 1009;
    public static final int TYPE_REMOTE_SPEAKER = 1002;
    public static final int TYPE_REMOTE_TABLET = 1004;
    public static final int TYPE_REMOTE_TABLET_DOCKED = 1005;
    public static final int TYPE_REMOTE_TV = 1001;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_WIRED_HEADPHONES = 4;
    public static final int TYPE_WIRED_HEADSET = 3;
    public static final int VISIBILITY_PUBLIC = 0;
    public static final int VISIBILITY_RESTRICTED_TO_ALLOWLIST = 1;
    public static final int VISIBILITY_RESTRICTED_TO_ALLOWLIST_AND_PRIVILEGED = 2;
    private final java.lang.String mAddress = null;
    private final java.util.Set<java.lang.String> mAllowedPackages = null;
    private final java.lang.String mClientPackageName = null;
    private final int mConnectionState = 0;
    private final java.util.Set<java.lang.String> mDeduplicationIds = null;
    private final java.lang.CharSequence mDescription = null;
    private final java.lang.String mDeviceManufacturer = null;
    private final java.lang.String mDeviceModel = null;
    private final android.os.Bundle mExtras = null;
    private final java.util.List<java.lang.String> mFeatures = null;
    private final android.net.Uri mIconUri = null;
    private final java.lang.String mId = null;
    private final boolean mIsSystem = false;
    private final java.lang.CharSequence mName = null;
    private final java.lang.String mProviderId = null;
    private final java.lang.String mProviderPackageName = null;
    private final java.util.List<java.util.Set<java.lang.String>> mRequiredPermissions = null;
    private final int mSuitabilityStatus = 0;
    private final java.util.Set<java.lang.Integer> mSupportedRoutingTypes = null;
    private java.util.Set<java.lang.String> mTemporaryVisibilityPackages;
    private final int mType = 0;
    private final int mVisibility = 0;
    private final int mVolume = 0;
    private final int mVolumeHandling = 0;
    private final int mVolumeMax = 0;
    MediaRoute2Info(android.media.MediaRoute2Info.Builder p0) {}
    MediaRoute2Info(android.os.Parcel p0) {}
    private void dumpVolume(java.io.PrintWriter p0, java.lang.String p1) {}
    private static java.lang.String getDeviceTypeString(int p0) { return null; }
    public static java.lang.String getRoutingTypeString(int p0) { return null; }
    public static java.lang.String getSupportedRoutingTypesString(java.util.Set<java.lang.Integer> p0) { return null; }
    static java.lang.String getVolumeString(int p0, int p1, int p2) { return null; }
    public static boolean isPrivilegedRoutingType(int p0) { return false; }
    public static java.util.Set<java.lang.Integer> validateRoutingTypes(java.util.Set<java.lang.Integer> p0, boolean p1) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getAddress() { return null; }
    public java.lang.String getClientPackageName() { return null; }
    public int getConnectionState() { return 0; }
    public java.util.Set<java.lang.String> getDeduplicationIds() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.lang.String getDeviceManufacturer() { return null; }
    public java.lang.String getDeviceModel() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.util.List<java.lang.String> getFeatures() { return null; }
    public android.net.Uri getIconUri() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getOriginalId() { return null; }
    public java.lang.String getProviderId() { return null; }
    public java.lang.String getProviderPackageName() { return null; }
    public java.util.List<java.util.Set<java.lang.String>> getRequiredPermissions() { return null; }
    public int getSuitabilityStatus() { return 0; }
    public java.util.Set<java.lang.Integer> getSupportedRoutingTypes() { return null; }
    public java.util.Set<java.lang.String> getTemporaryVisibilityPackages() { return null; }
    public int getType() { return 0; }
    public int getVolume() { return 0; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public boolean hasAnyFeatures(java.util.Collection<java.lang.String> p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isPublic() { return false; }
    public boolean isSystemRoute() { return false; }
    public boolean isSystemRouteType() { return false; }
    public boolean isValid() { return false; }
    public boolean isVisibleTo(java.lang.String p0) { return false; }
    public boolean isVisibleTo(java.lang.String p0, boolean p1) { return false; }
    public boolean supportsPrivilegedRoutingTypes() { return false; }
    public boolean supportsRemoteRouting() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mAddress;
        private java.util.Set<java.lang.String> mAllowedPackages;
        private java.lang.String mClientPackageName;
        private int mConnectionState;
        private java.util.Set<java.lang.String> mDeduplicationIds;
        private java.lang.CharSequence mDescription;
        private java.lang.String mDeviceManufacturer;
        private java.lang.String mDeviceModel;
        private android.os.Bundle mExtras;
        private final java.util.List<java.lang.String> mFeatures = null;
        private android.net.Uri mIconUri;
        private final java.lang.String mId = null;
        private boolean mIsSystem;
        private final java.lang.CharSequence mName = null;
        private java.lang.String mProviderId;
        private java.lang.String mProviderPackageName;
        private java.util.List<java.util.Set<java.lang.String>> mRequiredPermissions;
        private int mSuitabilityStatus;
        private java.util.Set<java.lang.Integer> mSupportedRoutingTypes;
        private java.util.Set<java.lang.String> mTemporaryVisibilityPackages;
        private int mType;
        private int mVisibility;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;
        public Builder(android.media.MediaRoute2Info p0) {}
        public Builder(java.lang.String p0, android.media.MediaRoute2Info p1) {}
        public Builder(java.lang.String p0, java.lang.CharSequence p1) {}
        public android.media.MediaRoute2Info.Builder addFeature(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder addFeatures(java.util.Collection<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info build() { return null; }
        public android.media.MediaRoute2Info.Builder clearFeatures() { return null; }
        public android.media.MediaRoute2Info.Builder setAddress(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setConnectionState(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setDeduplicationIds(java.util.Set<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.media.MediaRoute2Info.Builder setDeviceManufacturer(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setDeviceModel(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.media.MediaRoute2Info.Builder setIconUri(android.net.Uri p0) { return null; }
        public android.media.MediaRoute2Info.Builder setProviderId(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setProviderPackageName(java.lang.String p0) { return null; }
        public android.media.MediaRoute2Info.Builder setRequiredPermissions(java.util.List<java.util.Set<java.lang.String>> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setRequiredPermissions(java.util.Set<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setSuitabilityStatus(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setSupportedRoutingTypes(java.util.Set<java.lang.Integer> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setSystemRoute(boolean p0) { return null; }
        public android.media.MediaRoute2Info.Builder setTemporaryAllowedPackages(java.util.Set<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setType(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVisibilityPublic() { return null; }
        public android.media.MediaRoute2Info.Builder setVisibilityRestricted(java.util.Set<java.lang.String> p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVisibilityRestricted(java.util.Set<java.lang.String> p0, boolean p1) { return null; }
        public android.media.MediaRoute2Info.Builder setVolume(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVolumeHandling(int p0) { return null; }
        public android.media.MediaRoute2Info.Builder setVolumeMax(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PlaybackVolume {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface RoutingType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SuitabilityStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Visibility {
    }
}
