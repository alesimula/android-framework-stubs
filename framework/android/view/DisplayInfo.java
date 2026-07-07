package android.view;

public final class DisplayInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.DisplayInfo> CREATOR = null;
    public android.view.DisplayAddress address;
    public int appHeight;
    public long appVsyncOffsetNanos;
    public int appWidth;
    public float brightnessDefault;
    public float brightnessDim;
    public float brightnessMaximum;
    public float brightnessMinimum;
    public boolean canHostTasks;
    public int colorMode;
    public int committedState;
    public int defaultModeId;
    public android.hardware.display.DeviceProductInfo deviceProductInfo;
    public android.view.DisplayCutout displayCutout;
    public int displayGroupId;
    public int displayId;
    public android.view.DisplayShape displayShape;
    public int flags;
    public android.view.FrameRateCategoryRate frameRateCategoryRate;
    public java.util.List<android.view.FrameRateVelocityPoint> frameRateVelocityMapping;
    public boolean hasArrSupport;
    public android.view.Display.HdrCapabilities hdrCapabilities;
    public float hdrSdrRatio;
    public int installOrientation;
    public boolean isForceSdr;
    public int largestNominalAppHeight;
    public int largestNominalAppWidth;
    public int layerStack;
    public android.view.SurfaceControl.RefreshRateRange layoutLimitedRefreshRate;
    public int logicalDensityDpi;
    public int logicalHeight;
    public int logicalWidth;
    public boolean minimalPostProcessingSupported;
    public int modeId;
    public java.lang.String name;
    public java.lang.String ownerPackageName;
    public int ownerUid;
    public float physicalXDpi;
    public float physicalYDpi;
    public long presentationDeadlineNanos;
    public float refreshRateOverride;
    public int removeMode;
    public float renderFrameRate;
    public int rotation;
    public android.view.RoundedCorners roundedCorners;
    public int smallestNominalAppHeight;
    public int smallestNominalAppWidth;
    public int state;
    public int[] supportedColorModes;
    public android.view.Display.Mode[] supportedModes;
    public float[] supportedRefreshRates;
    public java.lang.String thermalBrightnessThrottlingDataId;
    public android.util.SparseArray<android.view.SurfaceControl.RefreshRateRange> thermalRefreshRateThrottling;
    public int type;
    public java.lang.String uniqueId;
    public int[] userDisabledHdrTypes;
    public int userPreferredModeId;
    public DisplayInfo() {}
    private DisplayInfo(android.os.Parcel p0) {}
    public DisplayInfo(android.view.DisplayInfo p0) {}
    private android.view.Display.Mode findMode(int p0) { return null; }
    private android.view.Display.Mode findModeOrNull(int p0) { return null; }
    private static java.lang.String flagsToString(int p0) { return null; }
    private void getMetricsWithSize(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2, int p3, int p4) {}
    private boolean hasDisplayInfoGroupChanged(android.view.DisplayInfo.DisplayInfoGroup p0, android.view.DisplayInfo p1) { return false; }
    private boolean hasStateChanged(android.view.DisplayInfo p0) { return false; }
    private boolean haveBasicPropertiesChanged(android.view.DisplayInfo p0) { return false; }
    private boolean haveColorAndBrightnessChanged(android.view.DisplayInfo p0) { return false; }
    private boolean haveDimensionsAndShapesChanged(android.view.DisplayInfo p0) { return false; }
    private boolean haveOrientationAndRotationChanged(android.view.DisplayInfo p0) { return false; }
    private boolean haveRefreshRateAndModeChanged(android.view.DisplayInfo p0) { return false; }
    private boolean isDisplayModeSizeEqual(android.view.DisplayInfo p0) { return false; }
    public void copyFrom(android.view.DisplayInfo p0) {}
    public int describeContents() { return 0; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(android.view.DisplayInfo p0) { return false; }
    public boolean equals(android.view.DisplayInfo p0, boolean p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.view.Display.Mode findDefaultModeByRefreshRate(float p0) { return null; }
    public void getAppMetrics(android.util.DisplayMetrics p0) {}
    public void getAppMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public void getAppMetrics(android.util.DisplayMetrics p0, android.view.DisplayAdjustments p1) {}
    public int getBasicChangedGroups(android.view.DisplayInfo p0) { return 0; }
    public int getBasicChangedGroups(android.view.DisplayInfo p0, java.util.EnumSet<android.view.DisplayInfo.DisplayInfoGroup> p1) { return 0; }
    public android.view.Display.Mode getDefaultMode() { return null; }
    public float[] getDefaultRefreshRates() { return null; }
    public float[] getDefaultRefreshRatesLegacy() { return null; }
    public void getLogicalMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public void getMaxBoundsMetrics(android.util.DisplayMetrics p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2) {}
    public android.view.Display.Mode getMode() { return null; }
    public int getNaturalHeight() { return 0; }
    public int getNaturalWidth() { return 0; }
    public float getRefreshRate() { return 0.0f; }
    public boolean hasAccess(int p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isHdr() { return false; }
    public boolean isWideColorGamut() { return false; }
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static enum DisplayInfoChangeSource {
        DISPLAY_MANAGER,
        DISPLAY_SWAP,
        OTHER,
        WINDOW_MANAGER;
        private static final android.view.DisplayInfo.DisplayInfoChangeSource[] $VALUES = null;
        private DisplayInfoChangeSource() {}
    }

    public static enum DisplayInfoGroup {
        BASIC_PROPERTIES,
        COLOR_AND_BRIGHTNESS,
        DIMENSIONS_AND_SHAPES,
        ORIENTATION_AND_ROTATION,
        REFRESH_RATE_AND_MODE,
        STATE;
        private static final android.view.DisplayInfo.DisplayInfoGroup[] $VALUES = null;
        private final int mMask = 0;
        private DisplayInfoGroup() {}
        public static java.lang.String displayInfoGroupsToString(int p0) { return null; }
        public int getMask() { return 0; }
    }
}
