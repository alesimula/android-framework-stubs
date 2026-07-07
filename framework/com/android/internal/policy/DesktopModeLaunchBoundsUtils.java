package com.android.internal.policy;

public final class DesktopModeLaunchBoundsUtils {
    public static final float DESKTOP_MODE_INITIAL_BOUNDS_SCALE = Float.valueOf(0.0f);
    public static final int DESKTOP_MODE_LANDSCAPE_APP_PADDING = Integer.valueOf(0);
    public static final float WINDOW_HEIGHT_PROPORTION = 0.375f;
    public DesktopModeLaunchBoundsUtils() {}
    public static com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection cascadeOneStep(android.graphics.Rect p0, android.graphics.Rect p1, com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection p2, int p3) { return null; }
    public static void cascadeWindowStepped(android.graphics.Rect p0, android.graphics.Rect p1, java.util.List<android.graphics.Rect> p2, android.content.res.Resources p3) {}
    public static android.graphics.Rect centerInScreen(android.util.Size p0, android.graphics.Rect p1) { return null; }
    private static int dx(com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection p0, int p1) { return 0; }
    private static int dy(com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection p0, int p1) { return 0; }
    private static com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection getCascadingDirection(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1, android.graphics.Rect p2, int p3) { return null; }
    public static boolean haveSameBoundsWithThreshold(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return false; }
    private static com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection inverseHorizontally(com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection p0) { return null; }
    private static com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection inverseVertically(com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection p0) { return null; }
    public static boolean isMaximizedOrSnapped(android.graphics.Rect p0, android.graphics.Rect p1) { return false; }

    public static enum CascadingDirection {
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        NONE,
        TOP_LEFT,
        TOP_RIGHT;
        private static final com.android.internal.policy.DesktopModeLaunchBoundsUtils.CascadingDirection[] $VALUES = null;
        private CascadingDirection() {}
    }
}
