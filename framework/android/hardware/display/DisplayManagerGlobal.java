package android.hardware.display;

public final class DisplayManagerGlobal {
    private static final java.lang.String CACHE_KEY_DISPLAY_INFO_API = "display_info";
    private static final boolean DEBUG = Boolean.valueOf(false);
    public static final int EVENT_DISPLAY_ADDED = 2;
    public static final int EVENT_DISPLAY_BASIC_CHANGED = 4;
    public static final int EVENT_DISPLAY_BRIGHTNESS_CHANGED = 128;
    public static final int EVENT_DISPLAY_COMMITTED_STATE_CHANGED = 32;
    public static final int EVENT_DISPLAY_CONNECTED = 1;
    public static final int EVENT_DISPLAY_DISCONNECTED = 512;
    public static final int EVENT_DISPLAY_HDR_SDR_RATIO_CHANGED = 64;
    public static final int EVENT_DISPLAY_REFRESH_RATE_CHANGED = 8;
    public static final int EVENT_DISPLAY_REMOVED = 256;
    public static final int EVENT_DISPLAY_STATE_CHANGED = 16;
    private static final java.lang.String EXTRA_LOGGING_PACKAGE_NAME = null;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_ADDED = 4L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_BASIC_CHANGED = 8L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_BRIGHTNESS_CHANGED = 256L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_COMMITTED_STATE_CHANGED = 64L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_CONNECTION_CHANGED = 2L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_HDR_SDR_RATIO_CHANGED = 128L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_REFRESH_RATE = 16L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_REMOVED = 512L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_SNAPSHOT = 1024L;
    public static final long INTERNAL_EVENT_FLAG_DISPLAY_STATE = 32L;
    public static final long INTERNAL_EVENT_FLAG_TOPOLOGY_UPDATED = 1L;
    private static final java.lang.String TAG = "DisplayManager";
    private static java.lang.String sCurrentPackageName;
    private static boolean sExtraDisplayListenerLogging;
    private static android.hardware.display.DisplayManagerGlobal sInstance;
    private volatile android.hardware.display.DisplayManagerGlobal.DisplayManagerCallback mCallback;
    private boolean mDispatchNativeCallbacks;
    private android.app.PropertyInvalidatedCache<java.lang.Integer, android.view.DisplayInfo> mDisplayCache;
    private final android.hardware.display.DisplayManagerGlobal.DisplayIdsCache mDisplayIdsCache = null;
    private final android.util.SparseArray<android.view.DisplayInfo> mDisplayInfoCache = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.hardware.display.DisplayManagerGlobal.DisplayListenerDelegate> mDisplayListeners = null;
    private final android.hardware.display.IDisplayManager mDm = null;
    private final android.hardware.display.DisplayManagerInternal mDmInternal = null;
    private final java.lang.Object mLock = null;
    private float mNativeCallbackReportedRefreshRate;
    private final android.hardware.OverlayProperties mOverlayProperties = null;
    private long mRegisteredInternalEventFlag;
    private boolean mShouldImplicitlyRegisterAdded;
    private boolean mShouldImplicitlyRegisterConnected;
    private boolean mShouldImplicitlyRegisterRrChanges;
    private final android.os.Binder mToken = null;
    private final java.util.concurrent.CopyOnWriteArrayList<android.hardware.display.DisplayManagerGlobal.DisplayTopologyListenerDelegate> mTopologyListeners = null;
    private final android.graphics.ColorSpace mWideColorSpace = null;
    private int mWifiDisplayScanNestCount;
    public DisplayManagerGlobal(android.hardware.display.IDisplayManager p0) {}
    private long calculateEventsMaskLocked() { return 0L; }
    private static java.lang.String eventToString(int p0) { return null; }
    public static java.lang.String eventsToString(int p0) { return null; }
    private static boolean extraLogging() { return false; }
    private int findDisplayListenerLocked(android.hardware.display.DisplayManager.DisplayListener p0) { return 0; }
    private android.hardware.display.DisplayManagerGlobal.DisplayTopologyListenerDelegate findTopologyListenerLocked(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0) { return null; }
    private android.view.DisplayInfo getDisplayInfoInternal(int p0) { return null; }
    public static android.hardware.display.DisplayManagerGlobal getInstance() { return null; }
    private static android.os.Looper getLooperForHandler(android.os.Handler p0) { return null; }
    private void handleDisplayEvents(int p0, int p1, boolean p2) {}
    private void handleDisplaySnapshot(int[] p0, int[] p1) {}
    private static boolean initExtraLogging() { return false; }
    public static void invalidateLocalDisplayInfoCaches() {}
    private long mapPrivateEventFlags(long p0) { return 0L; }
    private long mapPublicEventFlags(long p0) { return 0L; }
    private void maybeLogAllDisplayListeners() {}
    private void maybeLogAllTopologyListeners() {}
    private static native void nSignalNativeCallbacks(float p0);
    private void registerCallbackIfNeeded() {}
    private void updateCallbackIfNeededLocked() {}
    public boolean areUserDisabledHdrTypesAllowed() { return false; }
    public boolean canAccessPrivateDisplays(int p0) { return false; }
    public void connectWifiDisplay(java.lang.String p0) {}
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.content.Context p0, android.media.projection.MediaProjection p1, android.hardware.display.VirtualDisplayConfig p2, android.hardware.display.VirtualDisplay.Callback p3, java.util.concurrent.Executor p4) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplayWrapper(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, int p2) { return null; }
    public void disableConnectedDisplay(int p0) {}
    public void disableLocalDisplayInfoCaches() {}
    public void disconnectWifiDisplay() {}
    public void enableConnectedDisplay(int p0) {}
    public void forgetWifiDisplay(java.lang.String p0) {}
    public java.util.List<android.hardware.display.AmbientBrightnessDayStats> getAmbientBrightnessStats() { return null; }
    public float getBrightness(int p0) { return 0.0f; }
    public float getBrightness(int p0, int p1) { return 0.0f; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForDisplay(java.lang.String p0, int p1) { return null; }
    public android.hardware.display.BrightnessConfiguration getBrightnessConfigurationForUser(int p0) { return null; }
    public java.util.List<android.hardware.display.BrightnessChangeEvent> getBrightnessEvents(java.lang.String p0) { return null; }
    public android.hardware.display.BrightnessInfo getBrightnessInfo(int p0) { return null; }
    public android.view.Display getCompatibleDisplay(int p0, android.content.res.Resources p1) { return null; }
    public android.view.Display getCompatibleDisplay(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.hardware.display.BrightnessConfiguration getDefaultBrightnessConfiguration() { return null; }
    public float getDefaultDozeBrightness(int p0) { return 0.0f; }
    public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(int p0) { return null; }
    public int[] getDisplayIds() { return null; }
    public int[] getDisplayIds(boolean p0) { return null; }
    public android.view.DisplayInfo getDisplayInfo(int p0) { return null; }
    public java.util.concurrent.CopyOnWriteArrayList<android.hardware.display.DisplayManagerGlobal.DisplayListenerDelegate> getDisplayListeners() { return null; }
    public android.hardware.display.DisplayTopology getDisplayTopology() { return null; }
    public float[] getDozeBrightnessSensorValueToBrightness(int p0) { return null; }
    public int getExternalDisplayConnectionPreference(java.lang.String p0) { return 0; }
    public android.hardware.display.HdrConversionMode getHdrConversionMode() { return null; }
    public android.hardware.display.HdrConversionMode getHdrConversionModeSetting() { return null; }
    public float getHighestHdrSdrRatio(int p0) { return 0.0f; }
    public android.util.Pair<float[], float[]> getMinimumBrightnessCurve() { return null; }
    public android.hardware.OverlayProperties getOverlaySupport() { return null; }
    public android.graphics.ColorSpace getPreferredWideGamutColorSpace() { return null; }
    public android.view.Display getRealDisplay(int p0) { return null; }
    public int getRefreshRateSwitchingType() { return 0; }
    public android.graphics.Point getStableDisplaySize() { return null; }
    public int[] getSupportedHdrOutputTypes() { return null; }
    public android.view.Display.Mode getSystemPreferredDisplayMode(int p0) { return null; }
    public int[] getUserDisabledHdrTypes() { return null; }
    public android.view.Display.Mode getUserPreferredDisplayMode(int p0) { return null; }
    public int getUserPreferredHdrMode(int p0) { return 0; }
    public android.hardware.display.WifiDisplayStatus getWifiDisplayStatus() { return null; }
    public void handleDisplayChangeFromWindowManager(int p0) {}
    public boolean isMinimalPostProcessingRequested(int p0) { return false; }
    public boolean isUidPresentOnDisplay(int p0, int p1) { return false; }
    public long mapFiltersToInternalEventFlag(long p0, long p1) { return 0L; }
    public void overrideHdrTypes(int p0, int[] p1) {}
    public void pauseWifiDisplay() {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, java.lang.String p3) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, android.os.Handler p1, long p2, java.lang.String p3, boolean p4) {}
    public void registerDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0, java.util.concurrent.Executor p1, long p2, java.lang.String p3, boolean p4) {}
    public void registerForRefreshRateChanges() {}
    public void registerNativeChoreographerForRefreshRateCallbacks() {}
    public void registerTopologyListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.hardware.display.DisplayTopology> p1, java.lang.String p2) {}
    public void releaseVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1) {}
    public void renameWifiDisplay(java.lang.String p0, java.lang.String p1) {}
    public void requestColorMode(int p0, int p1) {}
    public void requestDisplayModes(int p0, int[] p1) {}
    public boolean requestDisplayPower(int p0, int p1) { return false; }
    public void resetImplicitRefreshRateCallbackStatus() {}
    public void resetUserPreferredDisplayMode(int p0) {}
    public void resizeVirtualDisplay(android.hardware.display.IVirtualDisplayCallback p0, int p1, int p2, int p3) {}
    public void resumeWifiDisplay() {}
    public void setAppRequestEnabledForTesting(boolean p0) {}
    public void setAreUserDisabledHdrTypesAllowed(boolean p0) {}
    public void setBrightness(int p0, float p1) {}
    public void setBrightness(int p0, float p1, int p2) {}
    public void setBrightnessConfigurationForDisplay(android.hardware.display.BrightnessConfiguration p0, java.lang.String p1, int p2, java.lang.String p3) {}
    public void setBrightnessConfigurationForUser(android.hardware.display.BrightnessConfiguration p0, int p1, java.lang.String p2) {}
    public void setDisplayTopology(android.hardware.display.DisplayTopology p0) {}
    public void setExternalDisplayConnectionPreference(java.lang.String p0, int p1) {}
    public void setHdrConversionMode(android.hardware.display.HdrConversionMode p0) {}
    public void setRefreshRateSwitchingType(int p0) {}
    public void setShouldAlwaysRespectAppRequestedMode(boolean p0) {}
    public void setTemporaryAutoBrightnessAdjustment(float p0) {}
    public void setTemporaryBrightness(int p0, float p1) {}
    public boolean setTemporaryBrightnessMode(int p0, int p1) { return false; }
    public void setUserDisabledHdrTypes(int[] p0) {}
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1) {}
    public void setUserPreferredDisplayMode(int p0, android.view.Display.Mode p1, boolean p2) {}
    public void setUserPreferredHdrMode(int p0, int p1) {}
    void setVirtualDisplayRotation(android.hardware.display.IVirtualDisplayCallback p0, int p1) {}
    public void setVirtualDisplaySurface(android.hardware.display.IVirtualDisplayCallback p0, android.view.Surface p1) {}
    public boolean shouldAlwaysRespectAppRequestedMode() { return false; }
    public void startWifiDisplayScan() {}
    public void stopWifiDisplayScan() {}
    public void unregisterDisplayListener(android.hardware.display.DisplayManager.DisplayListener p0) {}
    public void unregisterNativeChoreographerForRefreshRateCallbacks() {}
    public void unregisterTopologyListener(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayEvent {
    }

    public static class DisplayIdsCache {
        private static final int FLAG_ADDED = 4;
        private static final int FLAG_CONNECTED = 2;
        private static final int FLAG_LOCALLY_CONTROLLED = 1;
        private static final int LOCALLY_ADDED_MASK = 7;
        private static final int LOCALLY_REMOVED_MASK = 1;
        private static final boolean mIsValidationEnabled = Boolean.valueOf(false);
        private int[] mAddedIdsCacheArray;
        private int[] mConnectedIdsCacheArray;
        private final android.util.SparseIntArray mIdsCache = null;
        private boolean mIsAddedCacheValid;
        private boolean mIsAddedCachingEnabled;
        private boolean mIsConnectedCacheValid;
        private boolean mIsConnectedCachingEnabled;
        public DisplayIdsCache() {}
        private void clearFlagsForNotControlledLocally(int p0) {}
        private void clearIdsByFlags(int p0) {}
        private void endLocalControl(int p0) {}
        private int[] filterIdsMatchingFlag(int p0) { return null; }
        private int getIndexAndValidateNotAdded(int p0) { return 0; }
        private int getIndexAndValidateNotConnected(int p0) { return 0; }
        private void invalidateArrayCaches() {}
        public void evictLocked(int p0) {}
        public int[] getAddedLocked() { return null; }
        public int[] getConnectedLocked() { return null; }
        public void injectLocked(int p0) {}
        boolean isCacheValidLocked(boolean p0) { return false; }
        boolean isCachingEnabledLocked(boolean p0) { return false; }
        public void setAddedCachingEnabledLocked(boolean p0) {}
        public void setConnectedCachingEnabledLocked(boolean p0) {}
        public int updateCacheLocked(int p0, int p1) { return 0; }
        public void updateCacheLocked(int[] p0, int[] p1) {}
    }

    public static final class DisplayListenerDelegate {
        public volatile long internalEventFlagsMask;
        private final android.view.DisplayInfo mDisplayInfo = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.concurrent.atomic.AtomicLong mGenerationId = null;
        private final boolean mIsEventFilterExplicit = false;
        private final android.hardware.display.DisplayManager.DisplayListener mListener = null;
        private final java.lang.String mPackageName = null;
        DisplayListenerDelegate(android.hardware.display.DisplayManager.DisplayListener p0, java.util.concurrent.Executor p1, long p2, java.lang.String p3, boolean p4) {}
        private void handleDisplayEventInner(int p0, int p1, android.view.DisplayInfo p2, boolean p3) {}
        private void handleDisplayEventsInner(int p0, int p1, android.view.DisplayInfo p2, boolean p3) {}
        private void implicitlyRegisterForRRChanges() {}
        void clearEvents() {}
        public boolean isEventFilterExplicit() { return false; }
        void sendDisplayEvents(int p0, int p1, android.view.DisplayInfo p2, boolean p3) {}
        void setEventsMask(long p0) {}
        public java.lang.String toString() { return null; }
    }

    private final class DisplayManagerCallback extends android.hardware.display.IDisplayManagerCallback.Stub {
        private DisplayManagerCallback(android.hardware.display.DisplayManagerGlobal p0) { super(); }
        public void onDisplayEvent(int p0, int p1) {}
        public void onDisplaySnapshot(int[] p0, int[] p1) {}
        public void onTopologyChanged(android.hardware.display.DisplayTopology p0) {}
    }

    private static final class DisplayTopologyListenerDelegate {
        private final java.util.concurrent.Executor mExecutor = null;
        private final java.util.function.Consumer<android.hardware.display.DisplayTopology> mListener = null;
        private final java.lang.String mPackageName = null;
        DisplayTopologyListenerDelegate(java.util.function.Consumer<android.hardware.display.DisplayTopology> p0, java.util.concurrent.Executor p1, java.lang.String p2) {}
        void onTopologyChanged(android.hardware.display.DisplayTopology p0) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InternalEventFlag {
    }

    public static final class VirtualDisplayCallback extends android.hardware.display.IVirtualDisplayCallback.Stub {
        private final android.hardware.display.VirtualDisplay.Callback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        public VirtualDisplayCallback(android.hardware.display.VirtualDisplay.Callback p0, java.util.concurrent.Executor p1) { super(); }
        public void onPaused() {}
        public void onResumed() {}
        public void onStopped() {}
    }
}
