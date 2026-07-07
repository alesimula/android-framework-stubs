package android.view;

public final class DisplayCutout {
    public static final int BOUNDS_POSITION_BOTTOM = 3;
    public static final int BOUNDS_POSITION_LEFT = 0;
    public static final int BOUNDS_POSITION_LENGTH = 4;
    public static final int BOUNDS_POSITION_RIGHT = 2;
    public static final int BOUNDS_POSITION_TOP = 1;
    private static final java.lang.Object CACHE_LOCK = null;
    private static final android.view.DisplayCutout.CutoutPathParserInfo EMPTY_PARSER_INFO = null;
    public static final java.lang.String EMULATION_OVERLAY_CATEGORY = "com.android.internal.display_cutout_emulation";
    static final int[] INVALID_OVERRIDES = null;
    private static final int INVALID_SIDE_OVERRIDE = -1;
    public static final android.view.DisplayCutout NO_CUTOUT = null;
    private static final android.util.Pair<android.graphics.Path, android.view.DisplayCutout> NULL_PAIR = null;
    private static final java.lang.String SIDE_STRING_BOTTOM = "bottom";
    private static final java.lang.String SIDE_STRING_LEFT = "left";
    private static final java.lang.String SIDE_STRING_RIGHT = "right";
    private static final java.lang.String SIDE_STRING_TOP = "top";
    private static final java.lang.String TAG = "DisplayCutout";
    private static final android.graphics.Rect ZERO_RECT = null;
    private static android.util.Pair<android.graphics.Path, android.view.DisplayCutout> sCachedCutout;
    private static android.graphics.Path sCachedCutoutPath;
    private static android.view.DisplayCutout.CutoutPathParserInfo sCachedCutoutPathParserInfo;
    private static float sCachedDensity;
    private static int sCachedDisplayHeight;
    private static int sCachedDisplayWidth;
    private static float sCachedPhysicalPixelDisplaySizeRatio;
    private static int[] sCachedSideOverrides;
    private static java.lang.String sCachedSpec;
    private static android.graphics.Insets sCachedWaterfallInsets;
    private final android.view.DisplayCutout.Bounds mBounds = null;
    private final android.view.DisplayCutout.CutoutPathParserInfo mCutoutPathParserInfo = null;
    private final android.graphics.Rect mSafeInsets = null;
    private int[] mSideOverrides;
    private final android.graphics.Insets mWaterfallInsets = null;
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) {}
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Insets p5) {}
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Insets p5, android.view.DisplayCutout.CutoutPathParserInfo p6) {}
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Insets p5, android.view.DisplayCutout.CutoutPathParserInfo p6, int[] p7) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Insets p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Rect p5, android.view.DisplayCutout.CutoutPathParserInfo p6, boolean p7) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Insets p1, android.view.DisplayCutout.Bounds p2, android.view.DisplayCutout.CutoutPathParserInfo p3) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Insets p1, android.view.DisplayCutout.Bounds p2, android.view.DisplayCutout.CutoutPathParserInfo p3, int[] p4) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Insets p1, android.graphics.Rect[] p2, android.view.DisplayCutout.CutoutPathParserInfo p3, boolean p4) {}
    @java.lang.Deprecated
    public DisplayCutout(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1) {}
    private static int atLeastZero(int p0) { return 0; }
    private static android.graphics.Rect computeSafeInsets(int p0, int p1, android.graphics.Insets p2, android.graphics.Rect[] p3) { return null; }
    public static android.graphics.Rect computeSafeInsets(int p0, int p1, android.view.DisplayCutout p2) { return null; }
    public static android.view.DisplayCutout constructDisplayCutout(android.graphics.Rect[] p0, android.graphics.Insets p1, android.view.DisplayCutout.CutoutPathParserInfo p2) { return null; }
    public static android.graphics.Rect[] extractBoundsFromList(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1) { return null; }
    private static int findCutoutInsetForSide(int p0, int p1, android.graphics.Rect p2, int p3) { return 0; }
    public static android.view.DisplayCutout fromBoundingRect(int p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.view.DisplayCutout fromBounds(android.graphics.Rect[] p0) { return null; }
    public static android.view.DisplayCutout fromResourcesRectApproximation(android.content.res.Resources p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
    public static android.view.DisplayCutout fromSpec(java.lang.String p0, int p1, int p2, float p3, android.graphics.Insets p4, int[] p5) { return null; }
    private static android.graphics.Rect getCopyOrRef(android.graphics.Rect p0, boolean p1) { return null; }
    private static java.lang.String getDisplayCutoutApproximationRect(android.content.res.Resources p0, java.lang.String p1) { return null; }
    private static java.lang.String getDisplayCutoutPath(android.content.res.Resources p0, java.lang.String p1) { return null; }
    private static int[] getDisplayCutoutSideOverrides(android.content.res.Resources p0, java.lang.String p1) throws java.lang.IllegalArgumentException { return null; }
    public static boolean getFillBuiltInDisplayCutout(android.content.res.Resources p0, java.lang.String p1) { return false; }
    public static boolean getMaskBuiltInDisplayCutout(android.content.res.Resources p0, java.lang.String p1) { return false; }
    private static int getRotationToOverride(int p0, android.graphics.Rect[] p1, int p2) { return 0; }
    private static int getSideOverride(int[] p0, int p1) { return 0; }
    private static android.graphics.Insets getWaterfallInsets(android.content.res.Resources p0, java.lang.String p1) { return null; }
    private android.graphics.Rect insetInsets(int p0, int p1, int p2, int p3, android.graphics.Rect p4) { return null; }
    private static android.graphics.Insets loadWaterfallInset(android.content.res.Resources p0) { return null; }
    private static android.util.Pair<android.graphics.Path, android.view.DisplayCutout> pathAndDisplayCutoutFromSpec(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, int p5, float p6, android.graphics.Insets p7, int[] p8) { return null; }
    private static java.lang.String sideOverridesToString(int[] p0) { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.Rect getBoundingRectBottom() { return null; }
    public android.graphics.Rect getBoundingRectLeft() { return null; }
    public android.graphics.Rect getBoundingRectRight() { return null; }
    public android.graphics.Rect getBoundingRectTop() { return null; }
    public java.util.List<android.graphics.Rect> getBoundingRects() { return null; }
    public android.graphics.Rect[] getBoundingRectsAll() { return null; }
    public android.graphics.Path getCutoutPath() { return null; }
    public android.view.DisplayCutout.CutoutPathParserInfo getCutoutPathParserInfo() { return null; }
    public android.view.DisplayCutout getRotated(int p0, int p1, int p2, int p3) { return null; }
    public int getSafeInsetBottom() { return 0; }
    public int getSafeInsetLeft() { return 0; }
    public int getSafeInsetRight() { return 0; }
    public int getSafeInsetTop() { return 0; }
    public android.graphics.Rect getSafeInsets() { return null; }
    public android.graphics.Insets getWaterfallInsets() { return null; }
    public int hashCode() { return 0; }
    public android.view.DisplayCutout inset(int p0, int p1, int p2, int p3) { return null; }
    public boolean isBoundsEmpty() { return false; }
    public boolean isEmpty() { return false; }
    public android.view.DisplayCutout replaceSafeInsets(android.graphics.Rect p0) { return null; }
    public java.lang.String toString() { return null; }

    private static class Bounds {
        private final android.graphics.Rect[] mRects = null;
        private Bounds(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, boolean p4) {}
        private Bounds(android.graphics.Rect[] p0, boolean p1) {}
        private android.graphics.Rect getRect(int p0) { return null; }
        private android.graphics.Rect[] getRects() { return null; }
        private boolean isEmpty() { return false; }
        private void scale(float p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BoundsPosition {
    }

    public static final class Builder {
        private final android.graphics.Rect mBoundingRectBottom = null;
        private final android.graphics.Rect mBoundingRectLeft = null;
        private final android.graphics.Rect mBoundingRectRight = null;
        private final android.graphics.Rect mBoundingRectTop = null;
        private android.graphics.Path mCutoutPath;
        private android.graphics.Insets mSafeInsets;
        private android.graphics.Insets mWaterfallInsets;
        public Builder() {}
        public android.view.DisplayCutout build() { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectBottom(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectLeft(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectRight(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectTop(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setCutoutPath(android.graphics.Path p0) { return null; }
        public android.view.DisplayCutout.Builder setSafeInsets(android.graphics.Insets p0) { return null; }
        public android.view.DisplayCutout.Builder setWaterfallInsets(android.graphics.Insets p0) { return null; }
    }

    public static class CutoutPathParserInfo {
        private final java.lang.String mCutoutSpec = null;
        private final float mDensity = 0.0f;
        private final int mDisplayHeight = 0;
        private final int mDisplayWidth = 0;
        private final int mPhysicalDisplayHeight = 0;
        private final int mPhysicalDisplayWidth = 0;
        private final float mPhysicalPixelDisplaySizeRatio = 0.0f;
        private final int mRotation = 0;
        private final float mScale = 0.0f;
        public CutoutPathParserInfo(int p0, int p1, int p2, int p3, float p4, java.lang.String p5, int p6, float p7, float p8) {}
        public CutoutPathParserInfo(android.view.DisplayCutout.CutoutPathParserInfo p0) {}
        private boolean hasCutout() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getCutoutSpec() { return null; }
        public float getDensity() { return 0.0f; }
        public int getDisplayHeight() { return 0; }
        public int getDisplayWidth() { return 0; }
        public int getPhysicalDisplayHeight() { return 0; }
        public int getPhysicalDisplayWidth() { return 0; }
        public float getPhysicalPixelDisplaySizeRatio() { return 0.0f; }
        public int getRotation() { return 0; }
        public float getScale() { return 0.0f; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class ParcelableWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.DisplayCutout.ParcelableWrapper> CREATOR = null;
        private android.view.DisplayCutout mInner;
        public ParcelableWrapper() {}
        public ParcelableWrapper(android.view.DisplayCutout p0) {}
        public static android.view.DisplayCutout readCutoutFromParcel(android.os.Parcel p0) { return null; }
        public static void writeCutoutToParcel(android.view.DisplayCutout p0, android.os.Parcel p1, int p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.view.DisplayCutout get() { return null; }
        public int hashCode() { return 0; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void scale(float p0) {}
        public void set(android.view.DisplayCutout.ParcelableWrapper p0) {}
        public void set(android.view.DisplayCutout p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
