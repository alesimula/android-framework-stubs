package android.media;

public final class RoutingSessionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.RoutingSessionInfo> CREATOR = null;
    private static final java.lang.String KEY_GROUP_ROUTE = "androidx.mediarouter.media.KEY_GROUP_ROUTE";
    private static final java.lang.String KEY_VOLUME_HANDLING = "volumeHandling";
    public static final int RELEASE_TYPE_CASTING = 1;
    public static final int RELEASE_TYPE_SHARING = 2;
    public static final int RELEASE_UNSUPPORTED = 0;
    public static final int TRANSFER_REASON_APP = 2;
    public static final int TRANSFER_REASON_FALLBACK = 0;
    public static final int TRANSFER_REASON_SYSTEM_REQUEST = 1;
    final java.lang.String mClientPackageName = null;
    final android.os.Bundle mControlHints = null;
    final java.util.List<java.lang.String> mDeselectableRoutes = null;
    final boolean mIsSystemSession = false;
    final java.lang.CharSequence mName = null;
    final java.lang.String mOriginalId = null;
    final java.lang.String mOwnerPackageName = null;
    final java.lang.String mProviderId = null;
    private final int mReleaseType = 0;
    final java.util.List<java.lang.String> mSelectableRoutes = null;
    final java.util.List<java.lang.String> mSelectedRoutes = null;
    final java.lang.String mTransferInitiatorPackageName = null;
    final android.os.UserHandle mTransferInitiatorUserHandle = null;
    final int mTransferReason = 0;
    final java.util.List<java.lang.String> mTransferableRoutes = null;
    final int mVolume = 0;
    final int mVolumeHandling = 0;
    final int mVolumeMax = 0;
    RoutingSessionInfo(android.media.RoutingSessionInfo.Builder p0) {}
    RoutingSessionInfo(android.os.Parcel p0) {}
    private java.util.List<java.lang.String> convertToUniqueRouteIds(java.util.List<java.lang.String> p0) { return null; }
    private static <T extends java.lang.Object> java.util.List<T> ensureList(java.util.List<? extends T> p0) { return null; }
    private static java.lang.String ensureString(java.lang.String p0) { return null; }
    private static java.lang.String getHumanReadableReleaseType(int p0) { return null; }
    private static android.os.Bundle updateVolumeHandlingInHints(android.os.Bundle p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getClientPackageName() { return null; }
    public android.os.Bundle getControlHints() { return null; }
    public java.util.List<java.lang.String> getDeselectableRoutes() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.CharSequence getName() { return null; }
    public java.lang.String getOriginalId() { return null; }
    public java.lang.String getOwnerPackageName() { return null; }
    public java.lang.String getProviderId() { return null; }
    public int getReleaseType() { return 0; }
    public java.util.List<java.lang.String> getSelectableRoutes() { return null; }
    public java.util.List<java.lang.String> getSelectedRoutes() { return null; }
    public java.lang.String getTransferInitiatorPackageName() { return null; }
    public android.os.UserHandle getTransferInitiatorUserHandle() { return null; }
    public int getTransferReason() { return 0; }
    public java.util.List<java.lang.String> getTransferableRoutes() { return null; }
    public int getVolume() { return 0; }
    public int getVolumeHandling() { return 0; }
    public int getVolumeMax() { return 0; }
    public int hashCode() { return 0; }
    public boolean isSystemSession() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mClientPackageName;
        private android.os.Bundle mControlHints;
        private final java.util.List<java.lang.String> mDeselectableRoutes = null;
        private boolean mIsSystemSession;
        private java.lang.CharSequence mName;
        private final java.lang.String mOriginalId = null;
        private java.lang.String mOwnerPackageName;
        private java.lang.String mProviderId;
        private int mReleaseType;
        private final java.util.List<java.lang.String> mSelectableRoutes = null;
        private final java.util.List<java.lang.String> mSelectedRoutes = null;
        private java.lang.String mTransferInitiatorPackageName;
        private android.os.UserHandle mTransferInitiatorUserHandle;
        private int mTransferReason;
        private final java.util.List<java.lang.String> mTransferableRoutes = null;
        private int mVolume;
        private int mVolumeHandling;
        private int mVolumeMax;
        public Builder(android.media.RoutingSessionInfo p0) {}
        public Builder(android.media.RoutingSessionInfo p0, java.lang.String p1) {}
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.media.RoutingSessionInfo.Builder addDeselectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder addSelectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder addSelectedRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder addTransferableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo build() { return null; }
        public android.media.RoutingSessionInfo.Builder clearDeselectableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder clearSelectableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder clearSelectedRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder clearTransferableRoutes() { return null; }
        public android.media.RoutingSessionInfo.Builder removeDeselectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeSelectableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeSelectedRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder removeTransferableRoute(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setClientPackageName(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setControlHints(android.os.Bundle p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setName(java.lang.CharSequence p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setOwnerPackageName(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setProviderId(java.lang.String p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setReleaseType(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setSystemSession(boolean p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setTransferInitiator(android.os.UserHandle p0, java.lang.String p1) { return null; }
        public android.media.RoutingSessionInfo.Builder setTransferReason(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolume(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolumeHandling(int p0) { return null; }
        public android.media.RoutingSessionInfo.Builder setVolumeMax(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReleaseType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransferReason {
    }
}
