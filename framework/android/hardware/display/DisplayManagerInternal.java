package android.hardware.display;

public abstract class DisplayManagerInternal {
    public static final int REFRESH_RATE_LIMIT_HIGH_BRIGHTNESS_MODE = 1;
    public DisplayManagerInternal() {}
    public static boolean isValidBrightnessValue(float p0, int p1) { return false; }
    public abstract int createVirtualDisplay(android.hardware.display.VirtualDisplayConfig p0, android.hardware.display.IVirtualDisplayCallback p1, android.companion.virtual.IVirtualDevice p2, android.window.DisplayWindowPolicyController p3, java.lang.String p4, int p5);
    public abstract android.hardware.display.DisplayManagerInternal.AmbientLightSensorData getAmbientLightSensorData(int p0);
    public abstract int getConnectionPreference(java.lang.String p0);
    public abstract long getDisplayGroupFlags(int p0);
    public abstract android.util.IntArray getDisplayGroupIds();
    public abstract int getDisplayIdToMirror(int p0);
    public abstract int[] getDisplayIds(boolean p0);
    public abstract android.util.SparseArray<int[]> getDisplayIdsByGroupsIds();
    public abstract int[] getDisplayIdsForGroup(int p0);
    public abstract android.view.DisplayInfo getDisplayInfo(int p0);
    public abstract android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(int p0);
    public abstract android.graphics.Point getDisplayPosition(int p0);
    public abstract android.graphics.Point getDisplaySurfaceDefaultSize(int p0);
    public abstract android.window.DisplayWindowPolicyController getDisplayWindowPolicyController(int p0);
    public abstract android.hardware.display.DisplayedContentSample getDisplayedContentSample(int p0, long p1, long p2);
    public abstract android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(int p0);
    public abstract int getExternalDisplayCountInTopology();
    public abstract int getGroupIdForDisplay(int p0);
    public abstract android.util.SparseIntArray getGroupIdsByDisplayIds();
    public abstract android.hardware.input.HostUsiVersion getHostUsiVersion(int p0);
    public abstract void getNonOverrideDisplayInfo(int p0, android.view.DisplayInfo p1);
    public abstract android.hardware.display.DisplayManagerInternal.DisplayInfos getNonOverrideDisplayInfos();
    public abstract java.util.Set<android.view.DisplayInfo> getPossibleDisplayInfo(int p0);
    public abstract android.view.SurfaceControl.RefreshRateRange getRefreshRateForDisplayAndSensor(int p0, java.lang.String p1, java.lang.String p2);
    public abstract java.util.List<android.hardware.display.DisplayManagerInternal.RefreshRateLimitation> getRefreshRateLimitations(int p0);
    public abstract int getRefreshRateSwitchingType();
    public abstract void ignoreProximitySensorUntilChanged();
    public abstract void initPowerManagement(android.hardware.display.DisplayManagerInternal.DisplayPowerCallbacks p0, android.os.Handler p1, android.hardware.SensorManager p2);
    public abstract boolean isDisplayReadyForMirroring(int p0);
    public abstract boolean isProximitySensorAvailable(int p0);
    public abstract void onDisplayBelongToTopologyChanged(int p0, boolean p1);
    public abstract void onEarlyInteractivityChange(boolean p0);
    public abstract void onOverlayChanged();
    public abstract void onPresentation(int p0, boolean p1);
    public abstract void performTraversal(android.view.SurfaceControl.Transaction p0, android.util.SparseArray<android.view.SurfaceControl.Transaction> p1);
    public abstract void persistBrightnessTrackerState();
    public abstract void registerDisplayGroupListener(android.hardware.display.DisplayManagerInternal.DisplayGroupListener p0);
    public abstract android.hardware.display.DisplayManagerInternal.DisplayOffloadSession registerDisplayOffloader(int p0, android.hardware.display.DisplayManagerInternal.DisplayOffloader p1);
    public abstract void registerDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void registerMultiDisplayListener(android.hardware.display.DisplayManagerInternal.MultiDisplayListener p0, android.os.Handler p1);
    public abstract void reloadTopologies(int p0);
    public abstract boolean requestPowerState(int p0, android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p1, boolean p2);
    public abstract void setBrightnessCap(int p0, float p1, int p2);
    public abstract void setConnectionPreference(java.lang.String p0, int p1);
    public abstract void setDisplayAccessUIDs(android.util.SparseArray<android.util.IntArray> p0);
    public abstract void setDisplayInfoOverrideFromWindowManager(int p0, android.view.DisplayInfo p1);
    public abstract void setDisplayOffsets(int p0, int p1, int p2);
    public abstract void setDisplayProperties(int p0, boolean p1, float p2, int p3, float p4, float p5, boolean p6, boolean p7, boolean p8);
    public abstract void setDisplayScalingDisabled(int p0, boolean p1);
    public abstract boolean setDisplayedContentSamplingEnabled(int p0, boolean p1, int p2, int p3);
    public abstract void setPowerOptimization(int p0, boolean p1);
    public abstract void setScreenBrightnessOverrideFromWindowManager(android.util.SparseArray<android.hardware.display.DisplayManagerInternal.DisplayBrightnessOverrideRequest> p0);
    public abstract void setWindowManagerMirroring(int p0, boolean p1);
    public abstract void stylusGestureStarted(long p0);
    public abstract android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer systemScreenshot(int p0);
    public abstract void systemScreenshot(int p0, android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder p1, android.window.ScreenCaptureInternal.ScreenCaptureListener p2);
    public abstract void unregisterDisplayGroupListener(android.hardware.display.DisplayManagerInternal.DisplayGroupListener p0);
    public abstract void unregisterDisplayTransactionListener(android.hardware.display.DisplayManagerInternal.DisplayTransactionListener p0);
    public abstract void unregisterMultiDisplayListener(android.hardware.display.DisplayManagerInternal.MultiDisplayListener p0);
    public abstract android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer userScreenshot(int p0);

    public static final class AmbientLightSensorData {
        public java.lang.String sensorName;
        public java.lang.String sensorType;
        public AmbientLightSensorData(java.lang.String p0, java.lang.String p1) {}
        public java.lang.String toString() { return null; }
    }

    public static final class DisplayBrightnessOverrideRequest {
        private final float brightness = 0.0f;
        private final int brightnessUnit = 0;
        private final java.lang.CharSequence tag = null;
        public DisplayBrightnessOverrideRequest(float p0, java.lang.CharSequence p1, int p2) {}
        public float brightness() { return 0.0f; }
        public int brightnessUnit() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public java.lang.CharSequence tag() { return null; }
        public final java.lang.String toString() { return null; }
    }

    public static interface DisplayGroupListener {
        public void onDisplayGroupAdded(int p0);
        public void onDisplayGroupChanged(int p0);
        public void onDisplayGroupRemoved(int p0);
    }

    public static final class DisplayInfos {
        private final android.util.SparseArray<android.view.DisplayInfo> displayInfos = null;
        public DisplayInfos(android.util.SparseArray<android.view.DisplayInfo> p0) {}
        public android.util.SparseArray<android.view.DisplayInfo> displayInfos() { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    public static interface DisplayOffloader {
        public boolean allowAutoBrightnessInDoze();
        public void cancelBlockScreenOn();
        public void onBlockingScreenOn(java.lang.Runnable p0);
        public boolean startOffload(int p0);
        public void stopOffload(int p0);
    }

    public static interface DisplayOffloadSession {
        public static boolean isSupportedOffloadState(int p0) { return false; }
        public boolean allowAutoBrightnessInDoze();
        public boolean blockScreenOn(java.lang.Runnable p0);
        public void cancelBlockScreenOn();
        public float[] getAutoBrightnessLevels(int p0);
        public float[] getAutoBrightnessLuxLevels(int p0);
        public float getBrightness();
        public float getDozeBrightness();
        public boolean isActive();
        public void setDozeStateOverride(int p0);
        public void updateBrightness(float p0);
    }

    public static interface DisplayPowerCallbacks {
        public void acquireSuspendBlocker(java.lang.String p0);
        public void onDisplayStateChange(boolean p0, boolean p1);
        public void onProximityNegative();
        public void onProximityPositive();
        public void onStateChanged();
        public void releaseSuspendBlocker(java.lang.String p0);
    }

    public static class DisplayPowerRequest {
        public static final int POLICY_BRIGHT = 3;
        public static final int POLICY_DIM = 2;
        public static final int POLICY_DOZE = 1;
        public static final int POLICY_MAX = 3;
        public static final int POLICY_OFF = 0;
        public boolean blockScreenOn;
        public boolean boostScreenBrightness;
        public float dozeScreenBrightness;
        public int dozeScreenState;
        public int dozeScreenStateReason;
        public boolean lowPowerMode;
        public int policy;
        public int policyReason;
        public float screenAutoBrightnessAdjustmentOverride;
        public float screenBrightnessOverride;
        public java.lang.CharSequence screenBrightnessOverrideTag;
        public float screenLowPowerBrightnessFactor;
        public boolean useNormalBrightnessForDoze;
        public boolean useProximitySensor;
        public DisplayPowerRequest() {}
        public DisplayPowerRequest(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        private boolean floatEquals(float p0, float p1) { return false; }
        public static java.lang.String policyToString(int p0) { return null; }
        public void copyFrom(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) {}
        public boolean equals(android.hardware.display.DisplayManagerInternal.DisplayPowerRequest p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public boolean isBrightOrDim() { return false; }
        public java.lang.String toString() { return null; }
    }

    public static interface DisplayTransactionListener {
        public void onDisplayTransaction(android.view.SurfaceControl.Transaction p0);
    }

    public static interface MultiDisplayListener {
        public void onDisplaysChanged(android.hardware.display.DisplayManagerInternal.DisplayInfos p0, android.view.SurfaceControl.Transaction p1);
    }

    public static final class RefreshRateLimitation {
        public android.view.SurfaceControl.RefreshRateRange range;
        public int type;
        public RefreshRateLimitation(int p0, float p1, float p2) {}
        public RefreshRateLimitation(int p0, android.view.SurfaceControl.RefreshRateRange p1) {}
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RefreshRateLimitType {
    }
}
