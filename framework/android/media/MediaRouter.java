package android.media;

public class MediaRouter {
    static final boolean $assertionsDisabled = false;
    public static final int AVAILABILITY_FLAG_IGNORE_DEFAULT_ROUTE = 1;
    public static final int CALLBACK_FLAG_PASSIVE_DISCOVERY = 8;
    public static final int CALLBACK_FLAG_PERFORM_ACTIVE_SCAN = 1;
    public static final int CALLBACK_FLAG_REQUEST_DISCOVERY = 4;
    public static final int CALLBACK_FLAG_UNFILTERED_EVENTS = 2;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final boolean DEBUG_RESTORE_ROUTE = true;
    public static final java.lang.String MIRRORING_GROUP_ID = "android.media.mirroring_group";
    static final int ROUTE_TYPE_ANY = 8388615;
    public static final int ROUTE_TYPE_LIVE_AUDIO = 1;
    public static final int ROUTE_TYPE_LIVE_VIDEO = 2;
    public static final int ROUTE_TYPE_REMOTE_DISPLAY = 4;
    public static final int ROUTE_TYPE_USER = 8388608;
    private static final java.lang.String TAG = "MediaRouter";
    static final java.util.HashMap<android.content.Context, android.media.MediaRouter> sRouters = null;
    static android.media.MediaRouter.Static sStatic;
    public MediaRouter(android.content.Context p0) {}
    static void addRouteStatic(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteAdded(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteChanged(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteChanged(android.media.MediaRouter.RouteInfo p0, int p1) {}
    static void dispatchRouteGrouped(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteGroup p1, int p2) {}
    static void dispatchRoutePresentationDisplayChanged(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteRemoved(android.media.MediaRouter.RouteInfo p0) {}
    static void dispatchRouteSelected(int p0, android.media.MediaRouter.RouteInfo p1) {}
    static void dispatchRouteUngrouped(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouter.RouteGroup p1) {}
    static void dispatchRouteUnselected(int p0, android.media.MediaRouter.RouteInfo p1) {}
    static void dispatchRouteVolumeChanged(android.media.MediaRouter.RouteInfo p0) {}
    private int findCallbackInfo(android.media.MediaRouter.Callback p0) { return 0; }
    private static android.hardware.display.WifiDisplay findWifiDisplay(android.hardware.display.WifiDisplay[] p0, java.lang.String p1) { return null; }
    private static android.media.MediaRouter.RouteInfo findWifiDisplayRoute(android.hardware.display.WifiDisplay p0) { return null; }
    static android.media.MediaRouter.RouteInfo getRouteAtStatic(int p0) { return null; }
    static int getRouteCountStatic() { return 0; }
    static int getWifiDisplayStatusCode(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return 0; }
    static boolean isWifiDisplayEnabled(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return false; }
    static android.media.MediaRouter.RouteInfo makeWifiDisplayRoute(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplayStatus p1) { return null; }
    static boolean matchesDeviceAddress(android.hardware.display.WifiDisplay p0, android.media.MediaRouter.RouteInfo p1) { return false; }
    static void removeRouteStatic(android.media.MediaRouter.RouteInfo p0) {}
    static void selectDefaultRouteStatic() {}
    static void selectRouteStatic(int p0, android.media.MediaRouter.RouteInfo p1, boolean p2) {}
    private static boolean shouldShowWifiDisplay(android.hardware.display.WifiDisplay p0, android.hardware.display.WifiDisplay p1) { return false; }
    static void systemVolumeChanged(int p0) {}
    static java.lang.String typesToString(int p0) { return null; }
    static void updateRoute(android.media.MediaRouter.RouteInfo p0) {}
    private static void updateWifiDisplayRoute(android.media.MediaRouter.RouteInfo p0, android.hardware.display.WifiDisplay p1, android.hardware.display.WifiDisplayStatus p2, boolean p3) {}
    static void updateWifiDisplayStatus(android.hardware.display.WifiDisplayStatus p0) {}
    public void addCallback(int p0, android.media.MediaRouter.Callback p1) {}
    public void addCallback(int p0, android.media.MediaRouter.Callback p1, int p2) {}
    public void addRouteInt(android.media.MediaRouter.RouteInfo p0) {}
    public void addUserRoute(android.media.MediaRouter.UserRouteInfo p0) {}
    public void clearUserRoutes() {}
    public android.media.MediaRouter.RouteCategory createRouteCategory(int p0, boolean p1) { return null; }
    public android.media.MediaRouter.RouteCategory createRouteCategory(java.lang.CharSequence p0, boolean p1) { return null; }
    public android.media.MediaRouter.UserRouteInfo createUserRoute(android.media.MediaRouter.RouteCategory p0) { return null; }
    public android.media.MediaRouter.RouteCategory getCategoryAt(int p0) { return null; }
    public int getCategoryCount() { return 0; }
    public android.media.MediaRouter.RouteInfo getDefaultRoute() { return null; }
    public android.media.MediaRouter.RouteInfo getFallbackRoute() { return null; }
    public android.media.MediaRouter.RouteInfo getRouteAt(int p0) { return null; }
    public int getRouteCount() { return 0; }
    public android.media.MediaRouter.RouteInfo getSelectedRoute() { return null; }
    public android.media.MediaRouter.RouteInfo getSelectedRoute(int p0) { return null; }
    public android.media.MediaRouter.RouteCategory getSystemCategory() { return null; }
    public boolean isRouteAvailable(int p0, int p1) { return false; }
    public void rebindAsUser(int p0) {}
    public void removeCallback(android.media.MediaRouter.Callback p0) {}
    public void removeRouteInt(android.media.MediaRouter.RouteInfo p0) {}
    public void removeUserRoute(android.media.MediaRouter.UserRouteInfo p0) {}
    public void selectRoute(int p0, android.media.MediaRouter.RouteInfo p1) {}
    public void selectRouteInt(int p0, android.media.MediaRouter.RouteInfo p1, boolean p2) {}
    public void setRouterGroupId(java.lang.String p0) {}

    public static abstract class Callback {
        public Callback() {}
        public abstract void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3);
        public void onRoutePresentationDisplayChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public abstract void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
        public abstract void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2);
        public abstract void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2);
        public abstract void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2);
        public abstract void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1);
    }

    static class CallbackInfo {
        public final android.media.MediaRouter.Callback cb = null;
        public int flags;
        public final android.media.MediaRouter router = null;
        public int type;
        public CallbackInfo(android.media.MediaRouter.Callback p0, int p1, int p2, android.media.MediaRouter p3) {}
        public boolean filterRouteEvent(int p0) { return false; }
        public boolean filterRouteEvent(android.media.MediaRouter.RouteInfo p0) { return false; }
    }

    public static class RouteCategory {
        final boolean mGroupable = false;
        boolean mIsSystem;
        java.lang.CharSequence mName;
        int mNameResId;
        int mTypes;
        RouteCategory(int p0, int p1, boolean p2) {}
        RouteCategory(java.lang.CharSequence p0, int p1, boolean p2) {}
        public java.lang.CharSequence getName() { return null; }
        public java.lang.CharSequence getName(android.content.Context p0) { return null; }
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public java.util.List<android.media.MediaRouter.RouteInfo> getRoutes(java.util.List<android.media.MediaRouter.RouteInfo> p0) { return null; }
        public int getSupportedTypes() { return 0; }
        public boolean isGroupable() { return false; }
        public boolean isSystem() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static class RouteGroup extends android.media.MediaRouter.RouteInfo {
        final java.util.ArrayList<android.media.MediaRouter.RouteInfo> mRoutes = null;
        private boolean mUpdateName;
        RouteGroup(android.media.MediaRouter.RouteCategory p0) { super(null); }
        public void addRoute(android.media.MediaRouter.RouteInfo p0) {}
        public void addRoute(android.media.MediaRouter.RouteInfo p0, int p1) {}
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public android.media.MediaRouter.RouteInfo getRouteAt(int p0) { return null; }
        public int getRouteCount() { return 0; }
        void memberNameChanged(android.media.MediaRouter.RouteInfo p0, java.lang.CharSequence p1) {}
        void memberStatusChanged(android.media.MediaRouter.RouteInfo p0, java.lang.CharSequence p1) {}
        void memberVolumeChanged(android.media.MediaRouter.RouteInfo p0) {}
        public void removeRoute(int p0) {}
        public void removeRoute(android.media.MediaRouter.RouteInfo p0) {}
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        void routeUpdated() {}
        public void setIconDrawable(android.graphics.drawable.Drawable p0) {}
        public void setIconResource(int p0) {}
        public java.lang.String toString() { return null; }
        void updateName() {}
        void updateVolume() {}
    }

    public static class RouteInfo {
        private static final int DEFAULT_PLAYBACK_MAX_VOLUME = 15;
        private static final int DEFAULT_PLAYBACK_VOLUME = 15;
        public static final int DEVICE_TYPE_BLUETOOTH = 3;
        public static final int DEVICE_TYPE_SPEAKER = 2;
        public static final int DEVICE_TYPE_TV = 1;
        public static final int DEVICE_TYPE_UNKNOWN = 0;
        public static final int PLAYBACK_TYPE_LOCAL = 0;
        public static final int PLAYBACK_TYPE_REMOTE = 1;
        public static final int PLAYBACK_VOLUME_FIXED = 0;
        public static final int PLAYBACK_VOLUME_VARIABLE = 1;
        public static final int STATUS_AVAILABLE = 3;
        public static final int STATUS_CONNECTED = 6;
        public static final int STATUS_CONNECTING = 2;
        public static final int STATUS_IN_USE = 5;
        public static final int STATUS_NONE = 0;
        public static final int STATUS_NOT_AVAILABLE = 4;
        public static final int STATUS_SCANNING = 1;
        final android.media.MediaRouter.RouteCategory mCategory = null;
        java.lang.CharSequence mDescription;
        java.lang.String mDeviceAddress;
        int mDeviceType;
        boolean mEnabled;
        java.lang.String mGlobalRouteId;
        android.media.MediaRouter.RouteGroup mGroup;
        android.graphics.drawable.Drawable mIcon;
        java.lang.CharSequence mName;
        int mNameResId;
        int mPlaybackStream;
        int mPlaybackType;
        android.view.Display mPresentationDisplay;
        int mPresentationDisplayId;
        private int mRealStatusCode;
        final android.media.IRemoteVolumeObserver.Stub mRemoteVolObserver = null;
        private int mResolvedStatusCode;
        private java.lang.CharSequence mStatus;
        int mSupportedTypes;
        private java.lang.Object mTag;
        android.media.MediaRouter.VolumeCallbackInfo mVcb;
        int mVolume;
        int mVolumeHandling;
        int mVolumeMax;
        public RouteInfo(android.media.MediaRouter.RouteCategory p0) {}
        private android.view.Display choosePresentationDisplay() { return null; }
        private boolean displayAddressEquals(android.view.Display p0) { return false; }
        public android.view.Display[] getAllPresentationDisplays() { return null; }
        public android.media.MediaRouter.RouteCategory getCategory() { return null; }
        public android.media.MediaRouter.RouteInfo getDefaultAudioVideo() { return null; }
        public java.lang.CharSequence getDescription() { return null; }
        public java.lang.String getDeviceAddress() { return null; }
        public int getDeviceType() { return 0; }
        public android.media.MediaRouter.RouteGroup getGroup() { return null; }
        public android.graphics.drawable.Drawable getIconDrawable() { return null; }
        public java.lang.CharSequence getName() { return null; }
        public java.lang.CharSequence getName(android.content.Context p0) { return null; }
        java.lang.CharSequence getName(android.content.res.Resources p0) { return null; }
        public int getPlaybackStream() { return 0; }
        public int getPlaybackType() { return 0; }
        public android.view.Display getPresentationDisplay() { return null; }
        public java.lang.String getRouteId() { return null; }
        public java.lang.CharSequence getStatus() { return null; }
        public int getStatusCode() { return 0; }
        public int getSupportedTypes() { return 0; }
        public java.lang.Object getTag() { return null; }
        public int getVolume() { return 0; }
        public int getVolumeHandling() { return 0; }
        public int getVolumeMax() { return 0; }
        public boolean isBluetooth() { return false; }
        public boolean isConnecting() { return false; }
        public boolean isDefault() { return false; }
        public boolean isEnabled() { return false; }
        public boolean isSelected() { return false; }
        public boolean matchesTypes(int p0) { return false; }
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        boolean resolveStatusCode() { return false; }
        void routeUpdated() {}
        public void select() {}
        boolean setRealStatusCode(int p0) { return false; }
        void setStatusInt(java.lang.CharSequence p0) {}
        public void setTag(java.lang.Object p0) {}
        public java.lang.String toString() { return null; }
        public boolean updatePresentationDisplay() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DeviceType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface PlaybackType {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface PlaybackVolume {
        }
    }

    public static class SimpleCallback extends android.media.MediaRouter.Callback {
        public SimpleCallback() { super(); }
        public void onRouteAdded(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteGrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2, int p3) {}
        public void onRouteRemoved(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
        public void onRouteSelected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteUngrouped(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1, android.media.MediaRouter.RouteGroup p2) {}
        public void onRouteUnselected(android.media.MediaRouter p0, int p1, android.media.MediaRouter.RouteInfo p2) {}
        public void onRouteVolumeChanged(android.media.MediaRouter p0, android.media.MediaRouter.RouteInfo p1) {}
    }

    static class Static implements android.hardware.display.DisplayManager.DisplayListener {
        boolean mActivelyScanningWifiDisplays;
        final android.media.IAudioRoutesObserver.Stub mAudioRoutesObserver = null;
        final android.media.IAudioService mAudioService = null;
        android.media.MediaRouter.RouteInfo mBluetoothA2dpRoute;
        final java.util.concurrent.CopyOnWriteArrayList<android.media.MediaRouter.CallbackInfo> mCallbacks = null;
        final boolean mCanConfigureWifiDisplays = false;
        final java.util.ArrayList<android.media.MediaRouter.RouteCategory> mCategories = null;
        android.media.IMediaRouterClient mClient;
        android.media.MediaRouterClientState mClientState;
        final android.media.AudioRoutesInfo mCurAudioRoutesInfo = null;
        int mCurrentUserId;
        android.media.MediaRouter.RouteInfo mDefaultAudioVideo;
        boolean mDiscoverRequestActiveScan;
        int mDiscoveryRequestRouteTypes;
        final android.hardware.display.DisplayManager mDisplayService = null;
        final android.os.Handler mHandler = null;
        boolean mIsBluetoothA2dpOn;
        final android.media.IMediaRouterService mMediaRouterService = null;
        final java.lang.String mPackageName = null;
        java.lang.String mPreviousActiveWifiDisplayAddress;
        final android.content.res.Resources mResources = null;
        final java.util.ArrayList<android.media.MediaRouter.RouteInfo> mRoutes = null;
        android.media.MediaRouter.RouteInfo mSelectedRoute;
        android.util.SparseIntArray mStreamVolume;
        final android.media.MediaRouter.RouteCategory mSystemCategory = null;
        Static(android.content.Context p0) {}
        private void updatePresentationDisplays(int p0) {}
        android.media.MediaRouter.RouteInfo findGlobalRoute(java.lang.String p0) { return null; }
        public android.view.Display[] getAllPresentationDisplays() { return null; }
        int getStreamVolume(int p0) { return 0; }
        void handleGroupRouteSelected(java.lang.String p0) {}
        boolean isBluetoothA2dpOn() { return false; }
        boolean isPlaybackActive() { return false; }
        android.media.MediaRouter.RouteInfo makeGlobalRoute(android.media.MediaRouterClientState.RouteInfo p0) { return null; }
        public void onDisplayAdded(int p0) {}
        public void onDisplayChanged(int p0) {}
        public void onDisplayRemoved(int p0) {}
        void publishClientDiscoveryRequest() {}
        void publishClientSelectedRoute(boolean p0) {}
        void rebindAsUser(int p0) {}
        void requestSetVolume(android.media.MediaRouter.RouteInfo p0, int p1) {}
        void requestUpdateVolume(android.media.MediaRouter.RouteInfo p0, int p1) {}
        public void setRouterGroupId(java.lang.String p0) {}
        void setSelectedRoute(android.media.MediaRouter.RouteInfo p0, boolean p1) {}
        void startMonitoringRoutes(android.content.Context p0) {}
        void updateAudioRoutes(android.media.AudioRoutesInfo p0) {}
        void updateClientState() {}
        void updateDiscoveryRequest() {}
        void updateGlobalRoute(android.media.MediaRouter.RouteInfo p0, android.media.MediaRouterClientState.RouteInfo p1) {}

        final class Client extends android.media.IMediaRouterClient.Stub {
            Client(android.media.MediaRouter.Static p0) { super(); }
            public void onGroupRouteSelected(java.lang.String p0) {}
            public void onRestoreRoute() {}
            public void onStateChanged() {}
        }
    }

    public static class UserRouteInfo extends android.media.MediaRouter.RouteInfo {
        android.media.RemoteControlClient mRcc;
        android.media.MediaRouter.UserRouteInfo.SessionVolumeProvider mSvp;
        UserRouteInfo(android.media.MediaRouter.RouteCategory p0) { super(null); }
        private void configureSessionVolume() {}
        private void updatePlaybackInfoOnRcc() {}
        public android.media.RemoteControlClient getRemoteControlClient() { return null; }
        public void requestSetVolume(int p0) {}
        public void requestUpdateVolume(int p0) {}
        public void setDescription(java.lang.CharSequence p0) {}
        public void setIconDrawable(android.graphics.drawable.Drawable p0) {}
        public void setIconResource(int p0) {}
        public void setName(int p0) {}
        public void setName(java.lang.CharSequence p0) {}
        public void setPlaybackStream(int p0) {}
        public void setPlaybackType(int p0) {}
        public void setRemoteControlClient(android.media.RemoteControlClient p0) {}
        public void setStatus(java.lang.CharSequence p0) {}
        public void setVolume(int p0) {}
        public void setVolumeCallback(android.media.MediaRouter.VolumeCallback p0) {}
        public void setVolumeHandling(int p0) {}
        public void setVolumeMax(int p0) {}

        class SessionVolumeProvider extends android.media.VolumeProvider {
            SessionVolumeProvider(android.media.MediaRouter.UserRouteInfo p0, int p1, int p2, int p3) { super(0, 0, 0); }
            public void onAdjustVolume(int p0) {}
            public void onSetVolumeTo(int p0) {}
        }
    }

    public static abstract class VolumeCallback {
        public VolumeCallback() {}
        public abstract void onVolumeSetRequest(android.media.MediaRouter.RouteInfo p0, int p1);
        public abstract void onVolumeUpdateRequest(android.media.MediaRouter.RouteInfo p0, int p1);
    }

    static class VolumeCallbackInfo {
        public final android.media.MediaRouter.RouteInfo route = null;
        public final android.media.MediaRouter.VolumeCallback vcb = null;
        public VolumeCallbackInfo(android.media.MediaRouter.VolumeCallback p0, android.media.MediaRouter.RouteInfo p1) {}
    }

    static class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        VolumeChangeReceiver() { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    static class WifiDisplayStatusChangedReceiver extends android.content.BroadcastReceiver {
        WifiDisplayStatusChangedReceiver() { super(); }
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }
}
