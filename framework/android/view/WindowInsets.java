package android.view;

public final class WindowInsets {
    public static final android.view.WindowInsets CONSUMED = null;
    private final boolean mCompatIgnoreVisibility = false;
    private final int mCompatInsetsTypes = 0;
    private final android.view.DisplayCutout mDisplayCutout = null;
    private final boolean mDisplayCutoutConsumed = false;
    private final android.view.DisplayShape mDisplayShape = null;
    private final boolean mForceConsumingOpaqueCaptionBar = false;
    private final int mForceConsumingTypes = 0;
    private final int mFrameHeight = 0;
    private final int mFrameWidth = 0;
    private final boolean mIsRound = false;
    private final android.view.PrivacyIndicatorBounds mPrivacyIndicatorBounds = null;
    private final android.view.RoundedCorners mRoundedCorners = null;
    private final boolean mStableInsetsConsumed = false;
    private final int mSuppressScrimTypes = 0;
    private final boolean mSystemWindowInsetsConsumed = false;
    private android.graphics.Rect mTempRect;
    private final android.graphics.Rect[][] mTypeBoundingRectsMap = null;
    private final android.graphics.Insets[] mTypeInsetsMap = null;
    private final android.graphics.Rect[][] mTypeMaxBoundingRectsMap = null;
    private final android.graphics.Insets[] mTypeMaxInsetsMap = null;
    private final boolean[] mTypeVisibilityMap = null;
    public WindowInsets(android.graphics.Rect p0) {}
    public WindowInsets(android.view.WindowInsets p0) {}
    public WindowInsets(android.graphics.Insets[] p0, android.graphics.Insets[] p1, boolean[] p2, boolean p3, int p4, boolean p5, int p6, android.view.DisplayCutout p7, android.view.RoundedCorners p8, android.view.PrivacyIndicatorBounds p9, android.view.DisplayShape p10, int p11, boolean p12, android.graphics.Rect[][] p13, android.graphics.Rect[][] p14, int p15, int p16) {}
    public static void assignCompatInsets(android.graphics.Insets[] p0, android.graphics.Rect p1) {}
    public static android.graphics.Insets[] createCompatTypeMap(android.graphics.Rect p0) { return null; }
    private static boolean[] createCompatVisibilityMap(android.graphics.Insets[] p0) { return null; }
    private static android.view.DisplayCutout displayCutoutCopyConstructorArgument(android.view.WindowInsets p0) { return null; }
    private java.util.List<android.graphics.Rect> getBoundingRects(android.graphics.Rect[][] p0, int p1) { return null; }
    static android.graphics.Insets getInsets(android.graphics.Insets[] p0, int p1) { return null; }
    static android.graphics.Rect[] insetBoundingRects(android.graphics.Rect[] p0, int p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    static android.graphics.Rect[][] insetBoundingRects(android.graphics.Rect[][] p0, int p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    static android.graphics.Insets insetInsets(android.graphics.Insets p0, int p1, int p2, int p3, int p4) { return null; }
    private static android.graphics.Insets[] insetInsets(android.graphics.Insets[] p0, int p1, int p2, int p3, int p4) { return null; }
    private static android.graphics.Rect insetRect(android.graphics.Rect p0, int p1, int p2, int p3, int p4, int p5, int p6) { return null; }
    private static void setInsets(android.graphics.Insets[] p0, int p1, android.graphics.Insets p2) {}
    private static java.lang.String toShortString(android.graphics.Insets p0) { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeDisplayCutout() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeStableInsets() { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets consumeSystemWindowInsets() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.graphics.Rect> getBoundingRects(int p0) { return null; }
    public java.util.List<android.graphics.Rect> getBoundingRectsIgnoringVisibility(int p0) { return null; }
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public android.view.DisplayShape getDisplayShape() { return null; }
    public int getForceConsumingTypes() { return 0; }
    public android.util.Size getFrame() { return null; }
    public android.graphics.Insets getInsets(int p0) { return null; }
    public android.graphics.Insets getInsetsIgnoringVisibility(int p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getMandatorySystemGestureInsets() { return null; }
    public android.graphics.Rect getPrivacyIndicatorBounds() { return null; }
    public android.view.RoundedCorner getRoundedCorner(int p0) { return null; }
    @java.lang.Deprecated
    public int getStableInsetBottom() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetLeft() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetRight() { return 0; }
    @java.lang.Deprecated
    public int getStableInsetTop() { return 0; }
    @java.lang.Deprecated
    public android.graphics.Insets getStableInsets() { return null; }
    public int getSuppressScrimTypes() { return 0; }
    @java.lang.Deprecated
    public android.graphics.Insets getSystemGestureInsets() { return null; }
    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetRight() { return 0; }
    @java.lang.Deprecated
    public int getSystemWindowInsetTop() { return 0; }
    @java.lang.Deprecated
    public android.graphics.Insets getSystemWindowInsets() { return null; }
    @java.lang.Deprecated
    public android.graphics.Rect getSystemWindowInsetsAsRect() { return null; }
    @java.lang.Deprecated
    public android.graphics.Insets getTappableElementInsets() { return null; }
    public boolean hasInsets() { return false; }
    @java.lang.Deprecated
    public boolean hasStableInsets() { return false; }
    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() { return false; }
    public int hashCode() { return 0; }
    public android.view.WindowInsets inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.WindowInsets inset(android.graphics.Insets p0) { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets inset(android.graphics.Rect p0) { return null; }
    public android.view.WindowInsets insetUnchecked(int p0, int p1, int p2, int p3) { return null; }
    public boolean isConsumed() { return false; }
    public boolean isForceConsumingOpaqueCaptionBar() { return false; }
    public boolean isRound() { return false; }
    boolean isSystemWindowInsetsConsumed() { return false; }
    public boolean isVisible(int p0) { return false; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(int p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    public android.view.WindowInsets replaceSystemWindowInsets(android.graphics.Rect p0) { return null; }
    java.lang.String toDiffString(android.view.WindowInsets p0) { return null; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private boolean mCompatIgnoreVisibility;
        private int mCompatInsetTypes;
        private android.view.DisplayCutout mDisplayCutout;
        private android.view.DisplayShape mDisplayShape;
        private boolean mForceConsumingOpaqueCaptionBar;
        private int mForceConsumingTypes;
        private int mFrameHeight;
        private int mFrameWidth;
        private boolean mIsRound;
        private android.view.PrivacyIndicatorBounds mPrivacyIndicatorBounds;
        private android.view.RoundedCorners mRoundedCorners;
        private boolean mStableInsetsConsumed;
        private int mSuppressScrimTypes;
        private boolean mSystemInsetsConsumed;
        private final android.graphics.Rect[][] mTypeBoundingRectsMap = null;
        private final android.graphics.Insets[] mTypeInsetsMap = null;
        private final android.graphics.Rect[][] mTypeMaxBoundingRectsMap = null;
        private final android.graphics.Insets[] mTypeMaxInsetsMap = null;
        private final boolean[] mTypeVisibilityMap = null;
        public Builder() {}
        public Builder(android.view.WindowInsets p0) {}
        public android.view.WindowInsets build() { return null; }
        public android.view.WindowInsets.Builder setBoundingRects(int p0, java.util.List<android.graphics.Rect> p1) { return null; }
        public android.view.WindowInsets.Builder setBoundingRectsIgnoringVisibility(int p0, java.util.List<android.graphics.Rect> p1) { return null; }
        public android.view.WindowInsets.Builder setDisplayCutout(android.view.DisplayCutout p0) { return null; }
        public android.view.WindowInsets.Builder setDisplayShape(android.view.DisplayShape p0) { return null; }
        public android.view.WindowInsets.Builder setForceConsumingOpaqueCaptionBar(boolean p0) { return null; }
        public android.view.WindowInsets.Builder setForceConsumingTypes(int p0) { return null; }
        public android.view.WindowInsets.Builder setFrame(int p0, int p1) { return null; }
        public android.view.WindowInsets.Builder setInsets(int p0, android.graphics.Insets p1) { return null; }
        public android.view.WindowInsets.Builder setInsetsIgnoringVisibility(int p0, android.graphics.Insets p1) throws java.lang.IllegalArgumentException { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setMandatorySystemGestureInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setPrivacyIndicatorBounds(android.graphics.Rect p0) { return null; }
        public android.view.WindowInsets.Builder setPrivacyIndicatorBounds(android.view.PrivacyIndicatorBounds p0) { return null; }
        public android.view.WindowInsets.Builder setRound(boolean p0) { return null; }
        public android.view.WindowInsets.Builder setRoundedCorner(int p0, android.view.RoundedCorner p1) { return null; }
        public android.view.WindowInsets.Builder setRoundedCorners(android.view.RoundedCorners p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setStableInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setSuppressScrimTypes(int p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setSystemGestureInsets(android.graphics.Insets p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setSystemWindowInsets(android.graphics.Insets p0) { return null; }
        @java.lang.Deprecated
        public android.view.WindowInsets.Builder setTappableElementInsets(android.graphics.Insets p0) { return null; }
        public android.view.WindowInsets.Builder setVisible(int p0, boolean p1) { return null; }
    }

    public static final class Side {
        public static final int BOTTOM = 8;
        public static final int LEFT = 1;
        public static final int RIGHT = 4;
        public static final int TOP = 2;
        private Side() {}
        public static int all() { return 0; }
        public static java.lang.String toString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InsetsSide {
        }
    }

    public static final class Type {
        static final int ALL = 511;
        static final int CAPTION_BAR = 4;
        static final int DEFAULT_VISIBLE = 503;
        static final int DISPLAY_CUTOUT = 128;
        static final int IME = 8;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int SYSTEM_OVERLAYS = 256;
        static final int TAPPABLE_ELEMENT = 64;
        public static final int[] TYPES = null;
        private Type() {}
        public static int all() { return 0; }
        public static int captionBar() { return 0; }
        public static int defaultVisible() { return 0; }
        public static int displayCutout() { return 0; }
        public static boolean hasCompatSystemBars(int p0) { return false; }
        public static int ime() { return 0; }
        public static int indexOf(int p0) { return 0; }
        public static int mandatorySystemGestures() { return 0; }
        public static int navigationBars() { return 0; }
        public static int statusBars() { return 0; }
        public static int systemBars() { return 0; }
        public static int systemGestures() { return 0; }
        public static int systemOverlays() { return 0; }
        public static int tappableElement() { return 0; }
        public static java.lang.String toString(int p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InsetsType {
        }
    }
}
