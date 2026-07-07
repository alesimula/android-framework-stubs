package android.content.res;

public class CompatibilityInfo implements android.os.Parcelable {
    private static final int ALWAYS_NEEDS_COMPAT = 2;
    public static final android.os.Parcelable.Creator<android.content.res.CompatibilityInfo> CREATOR = null;
    public static final android.content.res.CompatibilityInfo DEFAULT_COMPATIBILITY_INFO = null;
    public static final int DEFAULT_NORMAL_SHORT_DIMENSION = 320;
    private static final int HAS_OVERRIDE_SCALING = 32;
    public static final float MAXIMUM_ASPECT_RATIO = 1.7791666984558105f;
    private static final int NEEDS_COMPAT_RES = 16;
    private static final int NEEDS_SCREEN_COMPAT = 8;
    private static final int NEVER_NEEDS_COMPAT = 4;
    private static final int SCALING_REQUIRED = 1;
    private static final java.lang.String TAG = "CompatibilityInfo";
    private static android.content.res.CameraCompatibilityInfo sCameraCompatibilityInfo;
    private static int[] sOverrideDensityDisplayIds;
    private static float sOverrideDensityInvertScale;
    private static float sOverrideInvertedScale;
    public final int applicationDensity = 0;
    public final float applicationDensityInvertedScale = 0.0f;
    public final float applicationDensityScale = 0.0f;
    public final float applicationInvertedScale = 0.0f;
    public final float applicationScale = 0.0f;
    public android.content.res.CameraCompatibilityInfo cameraCompatibilityInfo;
    private final int mCompatibilityFlags = 0;
    public int[] overrideDensityDisplayIds;
    private CompatibilityInfo() {}
    private CompatibilityInfo(int p0, int p1, float p2, float p3) {}
    @java.lang.Deprecated
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3) {}
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3, float p4) {}
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3, float p4, float p5) {}
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3, float p4, float p5, int[] p6) {}
    private CompatibilityInfo(android.os.Parcel p0) {}
    public static void applyOverrideIfNeeded(android.content.res.Configuration p0) {}
    public static void applyOverrideIfNeeded(android.content.res.Configuration p0, int p1) {}
    private static void applyOverrideIfNeeded(android.content.res.Configuration p0, boolean p1) {}
    public static void applyOverrideIfNeeded(android.util.MergedConfiguration p0, int p1) {}
    public static float computeCompatibleScaling(android.util.DisplayMetrics p0, android.util.DisplayMetrics p1) { return 0.0f; }
    public static android.content.res.CameraCompatibilityInfo getCameraCompatibilityInfo() { return null; }
    public static float getOverrideDensityInvertedScale() { return 0.0f; }
    public static float getOverrideInvertedScale() { return 0.0f; }
    private static boolean hasOverrideScale() { return false; }
    private boolean isCameraCompatibilityInfoEqual(android.content.res.CompatibilityInfo p0) { return false; }
    private boolean isCompatibilityFlagsEqual(android.content.res.CompatibilityInfo p0) { return false; }
    private boolean isScaleEqual(android.content.res.CompatibilityInfo p0) { return false; }
    public static void resetCameraCompatibilityInfo() {}
    public static void scaleConfiguration(float p0, float p1, android.content.res.Configuration p2) {}
    public static void scaleConfiguration(float p0, android.content.res.Configuration p1) {}
    private static void scaleDisplayMetrics(float p0, float p1, android.util.DisplayMetrics p2, boolean p3) {}
    public static void setCameraCompatibilityInfo(android.content.res.CameraCompatibilityInfo p0) {}
    public static void setOverrideInvertedScale(float p0) {}
    public static void setOverrideInvertedScale(float p0, float p1, int[] p2) {}
    public boolean alwaysSupportsScreen() { return false; }
    public void applyDisplayMetricsIfNeeded(android.util.DisplayMetrics p0, boolean p1) {}
    public void applyToConfiguration(int p0, android.content.res.Configuration p1) {}
    public void applyToDisplayMetrics(android.util.DisplayMetrics p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCompatibilityChangesForConfig(android.content.res.CompatibilityInfo p0) { return 0; }
    public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
    public boolean hasOverrideScaling() { return false; }
    public int hashCode() { return 0; }
    public boolean isOverrideCameraCompatibilityInfoRequired() { return false; }
    public boolean isScalingRequired() { return false; }
    public boolean needsCompatResources() { return false; }
    public boolean neverSupportsScreen() { return false; }
    public boolean supportsScreen() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class CompatScale {
        public final float mDensityScaleFactor = 0.0f;
        public final int[] mOverrideDensityDisplayIds = null;
        public final float mScaleFactor = 0.0f;
        public CompatScale(float p0) {}
        public CompatScale(float p0, float p1) {}
        public CompatScale(float p0, float p1, int[] p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public class Translator {
        public final float applicationInvertedScale = 0.0f;
        public final float applicationScale = 0.0f;
        private android.graphics.Rect mContentInsetsBuffer;
        private android.graphics.Region mTouchableAreaBuffer;
        private android.graphics.Rect mVisibleInsetsBuffer;
        Translator(android.content.res.CompatibilityInfo p0) {}
        Translator(android.content.res.CompatibilityInfo p0, float p1, float p2) {}
        public android.graphics.Rect getTranslatedContentInsets(android.graphics.Rect p0) { return null; }
        public android.graphics.Region getTranslatedTouchableArea(android.graphics.Region p0) { return null; }
        public android.graphics.Rect getTranslatedVisibleInsets(android.graphics.Rect p0) { return null; }
        public void translateCanvas(android.graphics.Canvas p0) {}
        public void translateEventInScreenToAppWindow(android.view.MotionEvent p0) {}
        public void translateInsetsStateInScreenToAppWindow(android.view.InsetsState p0) {}
        public void translateLayoutParamsInAppWindowToScreen(android.view.WindowManager.LayoutParams p0) {}
        public float translateLengthInAppWindowToScreen(float p0) { return 0.0f; }
        public void translatePointInScreenToAppWindow(android.graphics.PointF p0) {}
        public void translateRectInAppWindowToScreen(android.graphics.Rect p0) {}
        public void translateRectInScreenToAppWindow(android.graphics.Rect p0) {}
        public void translateRegionInWindowToScreen(android.graphics.Region p0) {}
        public void translateSourceControlsInScreenToAppWindow(android.view.InsetsSourceControl[] p0) {}
        public void translateWindowLayout(android.view.WindowManager.LayoutParams p0) {}
    }
}
