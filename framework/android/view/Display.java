package android.view;

public final class Display {
    private static final int CACHED_APP_SIZE_DURATION_MILLIS = 20;
    public static final int COLOR_MODE_ADOBE_RGB = 8;
    public static final int COLOR_MODE_BT601_525 = 3;
    public static final int COLOR_MODE_BT601_525_UNADJUSTED = 4;
    public static final int COLOR_MODE_BT601_625 = 1;
    public static final int COLOR_MODE_BT601_625_UNADJUSTED = 2;
    public static final int COLOR_MODE_BT709 = 5;
    public static final int COLOR_MODE_DCI_P3 = 6;
    public static final int COLOR_MODE_DEFAULT = 0;
    public static final int COLOR_MODE_DISPLAY_P3 = 9;
    public static final int COLOR_MODE_INVALID = -1;
    public static final int COLOR_MODE_SRGB = 7;
    private static final boolean DEBUG = false;
    public static final int DEFAULT_DISPLAY = 0;
    public static final int DEFAULT_DISPLAY_GROUP = 0;
    public static final int DISPLAY_MODE_ID_FOR_FRAME_RATE_OVERRIDE = 255;
    public static final int FLAG_ALLOWS_CONTENT_MODE_SWITCH = 32768;
    public static final int FLAG_ALWAYS_UNLOCKED = 512;
    public static final int FLAG_AUTO_MIRROR = 65536;
    public static final int FLAG_CAN_SHOW_WITH_INSECURE_KEYGUARD = 32;
    public static final int FLAG_OWN_DISPLAY_GROUP = 256;
    public static final int FLAG_OWN_FOCUS = 2048;
    public static final int FLAG_PRESENTATION = 8;
    public static final int FLAG_PRIVATE = 4;
    public static final int FLAG_REAR = 8192;
    public static final int FLAG_ROTATES_WITH_CONTENT = 16384;
    public static final int FLAG_ROUND = 16;
    public static final int FLAG_SCALING_DISABLED = 1073741824;
    public static final int FLAG_SECURE = 2;
    public static final int FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS = 64;
    public static final int FLAG_STEAL_TOP_FOCUS_DISABLED = 4096;
    public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = 1;
    public static final int FLAG_TOUCH_FEEDBACK_DISABLED = 1024;
    public static final int FLAG_TRUSTED = 128;
    public static final int FRAME_RATE_CATEGORY_HIGH = 1;
    public static final int FRAME_RATE_CATEGORY_NORMAL = 0;
    public static final int INVALID_DISPLAY = -1;
    public static final int INVALID_DISPLAY_GROUP = -1;
    public static final int INVALID_DISPLAY_HEIGHT = -1;
    public static final float INVALID_DISPLAY_REFRESH_RATE = 0.0f;
    public static final int INVALID_DISPLAY_WIDTH = -1;
    public static final int REMOVE_MODE_DESTROY_CONTENT = 1;
    public static final int REMOVE_MODE_MOVE_CONTENT_TO_PRIMARY = 0;
    public static final int STATE_DOZE = 3;
    public static final int STATE_DOZE_SUSPEND = 4;
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 2;
    public static final int STATE_ON_SUSPEND = 6;
    public static final int STATE_REASON_ACCESSIBILITY = 8;
    public static final int STATE_REASON_DEFAULT_POLICY = 1;
    public static final int STATE_REASON_DRAW_WAKE_LOCK = 2;
    public static final int STATE_REASON_DREAM_MANAGER = 5;
    public static final int STATE_REASON_KEY = 6;
    public static final int STATE_REASON_MOTION = 7;
    public static final int STATE_REASON_OFFLOAD = 3;
    public static final int STATE_REASON_TILT = 4;
    public static final int STATE_REASON_UNKNOWN = 0;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_VR = 5;
    private static final java.lang.String TAG = "Display";
    public static final int TYPE_EXTERNAL = 2;
    public static final int TYPE_INTERNAL = 1;
    public static final int TYPE_MAX = 5;
    public static final int TYPE_OVERLAY = 4;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIRTUAL = 5;
    public static final int TYPE_WIFI = 3;
    private int mCachedAppHeightCompat;
    private int mCachedAppWidthCompat;
    private java.util.List<android.view.FrameRateVelocityPoint> mCachedFrameRateVelocityMapping;
    private android.view.DisplayAdjustments mDisplayAdjustments;
    private final int mDisplayId = 0;
    private android.view.DisplayInfo mDisplayInfo;
    private final int mFlags = 0;
    private final android.hardware.display.DisplayManagerGlobal mGlobal = null;
    private java.util.ArrayList<android.view.Display.HdrSdrRatioListenerWrapper> mHdrSdrRatioListeners;
    private boolean mIsValid;
    private long mLastCachedAppSizeUpdate;
    private android.view.DisplayInfo mLastCachedDisplayInfo;
    private final java.lang.Object mLock = null;
    private final java.lang.String mOwnerPackageName = null;
    private final int mOwnerUid = 0;
    private boolean mRefreshRateChangesRegistered;
    private final android.content.res.Resources mResources = null;
    private final android.util.DisplayMetrics mTempMetrics = null;
    public Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.content.res.Resources p3) {}
    public Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.view.DisplayAdjustments p3) {}
    private Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.view.DisplayAdjustments p3, android.content.res.Resources p4) {}
    private void adjustMetrics(android.util.DisplayMetrics p0, int p1, int p2) {}
    private void adjustSize(android.graphics.Point p0, int p1, int p2) {}
    private boolean contains(int[] p0, int p1) { return false; }
    private int findHdrSdrRatioListenerLocked(java.util.function.Consumer<android.view.Display> p0) { return 0; }
    private int getLocalRotation() { return 0; }
    public static boolean hasAccess(int p0, int p1, int p2, int p3) { return false; }
    public static boolean isActiveState(int p0) { return false; }
    public static boolean isDozeState(int p0) { return false; }
    public static boolean isHeightValid(int p0) { return false; }
    public static boolean isOffState(int p0) { return false; }
    public static boolean isOnState(int p0) { return false; }
    public static boolean isRefreshRateValid(float p0) { return false; }
    public static boolean isSuspendedState(int p0) { return false; }
    public static boolean isWidthValid(int p0) { return false; }
    private static boolean noFlip(int p0, int p1) { return false; }
    private boolean shouldReportMaxBounds() { return false; }
    public static java.lang.String stateReasonToString(int p0) { return null; }
    public static java.lang.String stateToString(int p0) { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    private void updateCachedAppSizeIfNeededLocked() {}
    private void updateDisplayInfoLocked() {}
    public boolean canHostTasks() { return false; }
    public boolean canStealTopFocus() { return false; }
    public void clearUserPreferredDisplayMode() {}
    public android.view.DisplayAddress getAddress() { return null; }
    public long getAppVsyncOffsetNanos() { return 0L; }
    public float getBrightnessDefault() { return 0.0f; }
    public android.hardware.display.BrightnessInfo getBrightnessInfo() { return null; }
    public int getColorMode() { return 0; }
    public int getCommittedState() { return 0; }
    public void getCurrentSizeRange(android.graphics.Point p0, android.graphics.Point p1) {}
    public android.view.DisplayCutout getCutout() { return null; }
    public android.view.Display.Mode getDefaultMode() { return null; }
    public android.hardware.display.DeviceProductInfo getDeviceProductInfo() { return null; }
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    public android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport() { return null; }
    public int getDisplayId() { return 0; }
    public boolean getDisplayInfo(android.view.DisplayInfo p0) { return false; }
    public int getFlags() { return 0; }
    public java.util.List<android.view.FrameRateVelocityPoint> getFrameRateVelocityMapping() { return null; }
    public android.view.Display.HdrCapabilities getHdrCapabilities() { return null; }
    public float getHdrSdrRatio() { return 0.0f; }
    @java.lang.Deprecated
    public int getHeight() { return 0; }
    public float getHighestHdrSdrRatio() { return 0.0f; }
    public int getInstallOrientation() { return 0; }
    public int getLayerStack() { return 0; }
    public int getMaximumSizeDimension() { return 0; }
    @java.lang.Deprecated
    public void getMetrics(android.util.DisplayMetrics p0) {}
    public float getMinSizeDimensionDp() { return 0.0f; }
    public android.view.Display.Mode getMode() { return null; }
    public java.lang.String getName() { return null; }
    @java.lang.Deprecated
    public int getOrientation() { return 0; }
    public android.hardware.OverlayProperties getOverlaySupport() { return null; }
    public java.lang.String getOwnerPackageName() { return null; }
    public int getOwnerUid() { return 0; }
    @java.lang.Deprecated
    public int getPixelFormat() { return 0; }
    public android.graphics.ColorSpace getPreferredWideGamutColorSpace() { return null; }
    public long getPresentationDeadlineNanos() { return 0L; }
    @java.lang.Deprecated
    public void getRealMetrics(android.util.DisplayMetrics p0) {}
    @java.lang.Deprecated
    public void getRealSize(android.graphics.Point p0) {}
    @java.lang.Deprecated
    public void getRectSize(android.graphics.Rect p0) {}
    public float getRefreshRate() { return 0.0f; }
    public int getRemoveMode() { return 0; }
    public int[] getReportedHdrTypes() { return null; }
    public int getRotation() { return 0; }
    public android.view.RoundedCorner getRoundedCorner(int p0) { return null; }
    public android.view.DisplayShape getShape() { return null; }
    @java.lang.Deprecated
    public void getSize(android.graphics.Point p0) {}
    public int getState() { return 0; }
    public float getSuggestedFrameRate(int p0) { return 0.0f; }
    public int[] getSupportedColorModes() { return null; }
    public android.view.Display.Mode[] getSupportedModes() { return null; }
    public float[] getSupportedRefreshRates() { return null; }
    public float[] getSupportedRefreshRatesLegacy() { return null; }
    public android.graphics.ColorSpace[] getSupportedWideColorGamut() { return null; }
    public android.view.Display.Mode getSystemPreferredDisplayMode() { return null; }
    public android.view.Display.Mode[] getSystemSupportedModes() { return null; }
    public int getType() { return 0; }
    public java.lang.String getUniqueId() { return null; }
    public android.view.Display.Mode getUserPreferredDisplayMode() { return null; }
    @java.lang.Deprecated
    public int getWidth() { return 0; }
    public boolean hasAccess(int p0) { return false; }
    public boolean hasArrSupport() { return false; }
    public boolean isHdr() { return false; }
    public boolean isHdrSdrRatioAvailable() { return false; }
    public boolean isInternal() { return false; }
    public boolean isMinimalPostProcessingSupported() { return false; }
    public boolean isPublicPresentation() { return false; }
    public boolean isTrusted() { return false; }
    public boolean isValid() { return false; }
    public boolean isWideColorGamut() { return false; }
    public void registerHdrSdrRatioChangedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.Display> p1) {}
    public void requestColorMode(int p0) {}
    public void resetUserPreferredDisplayMode() {}
    public void setUserPreferredDisplayMode(android.view.Display.Mode p0) {}
    public void setUserPreferredDisplayMode(android.view.Display.Mode p0, boolean p1) {}
    public java.lang.String toString() { return null; }
    public void unregisterHdrSdrRatioChangedListener(java.util.function.Consumer<android.view.Display> p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateCategory {
    }

    public static final class HdrCapabilities implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.Display.HdrCapabilities> CREATOR = null;
        public static final int[] HDR_TYPES = null;
        public static final int HDR_TYPE_DOLBY_VISION = 1;
        public static final int HDR_TYPE_HDR10 = 2;
        public static final int HDR_TYPE_HDR10_PLUS = 4;
        public static final int HDR_TYPE_HLG = 3;
        public static final int HDR_TYPE_HLG_PLUS = 6;
        public static final int HDR_TYPE_INVALID = -1;
        public static final float INVALID_LUMINANCE = -1.0f;
        private float mMaxAverageLuminance;
        private float mMaxLuminance;
        private float mMinLuminance;
        private int[] mSupportedHdrTypes;
        public HdrCapabilities() {}
        private HdrCapabilities(android.os.Parcel p0) {}
        public HdrCapabilities(int[] p0, float p1, float p2, float p3) {}
        public static java.lang.String hdrTypeToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public float getDesiredMaxAverageLuminance() { return 0.0f; }
        public float getDesiredMaxLuminance() { return 0.0f; }
        public float getDesiredMinLuminance() { return 0.0f; }
        @java.lang.Deprecated
        public int[] getSupportedHdrTypes() { return null; }
        public int hashCode() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HdrType {
        }
    }

    private class HdrSdrRatioListenerWrapper implements android.hardware.display.DisplayManager.DisplayListener {
        float mLastReportedRatio;
        java.util.function.Consumer<android.view.Display> mListener;
        private HdrSdrRatioListenerWrapper(java.util.function.Consumer<android.view.Display> p0) {}
        public void onDisplayAdded(int p0) {}
        public void onDisplayChanged(int p0) {}
        public void onDisplayRemoved(int p0) {}
    }

    public static final class Mode implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.Display.Mode> CREATOR = null;
        public static final android.view.Display.Mode[] EMPTY_ARRAY = null;
        public static final int FLAG_ANISOTROPY_CORRECTION = 4;
        public static final int FLAG_ARR_RENDER_RATE = 1;
        public static final int FLAG_SIZE_OVERRIDE = 2;
        public static final int INVALID_MODE_ID = -1;
        private final float[] mAlternativeRefreshRates = null;
        private final int mFlags = 0;
        private final int mHeight = 0;
        private final int mModeId = 0;
        private final int mParentModeId = 0;
        private final float mPeakRefreshRate = 0.0f;
        private final int mSfModeId = 0;
        private final int[] mSupportedHdrTypes = null;
        private final float mVsyncRate = 0.0f;
        private final int mWidth = 0;
        public Mode(int p0, int p1, float p2) {}
        public Mode(int p0, int p1, int p2, float p3) {}
        public Mode(int p0, int p1, int p2, float p3, float p4, float[] p5, int[] p6) {}
        public Mode(int p0, int p1, int p2, float p3, float[] p4, int[] p5) {}
        public Mode(int p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7, float[] p8, int[] p9) {}
        private Mode(android.os.Parcel p0) {}
        private static java.lang.String flagsToString(int p0) { return null; }
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equalsExceptRefreshRate(android.view.Display.Mode p0) { return false; }
        public float[] getAlternativeRefreshRates() { return null; }
        public int getFlags() { return 0; }
        public int getModeId() { return 0; }
        public int getParentModeId() { return 0; }
        public int getPhysicalHeight() { return 0; }
        public int getPhysicalWidth() { return 0; }
        public float getRefreshRate() { return 0.0f; }
        public int getSfModeId() { return 0; }
        public int[] getSupportedHdrTypes() { return null; }
        public float getVsyncRate() { return 0.0f; }
        public int hashCode() { return 0; }
        public boolean isRefreshRateSet() { return false; }
        public boolean isResolutionSet() { return false; }
        public boolean isSynthetic() { return false; }
        public boolean matches(int p0, int p1) { return false; }
        public boolean matches(int p0, int p1, float p2) { return false; }
        public boolean matchesIfValid(int p0, int p1, float p2) { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private int mHeight;
            private float mRefreshRate;
            private int mWidth;
            public Builder() {}
            public android.view.Display.Mode build() { return null; }
            public android.view.Display.Mode.Builder setRefreshRate(float p0) { return null; }
            public android.view.Display.Mode.Builder setResolution(int p0, int p1) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ModeFlags {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StateReason {
    }
}
