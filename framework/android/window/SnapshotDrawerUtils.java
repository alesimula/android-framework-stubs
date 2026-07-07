package android.window;

public class SnapshotDrawerUtils {
    static final int FLAG_INHERIT_EXCLUDES = 830922810;
    private static final java.lang.String TAG = "SnapshotDrawerUtils";
    private static boolean sToolkitSetFrameRateReadOnlyFlagValue;
    public SnapshotDrawerUtils() {}
    public static android.view.WindowManager.LayoutParams createLayoutParameters(android.window.StartingWindowInfo p0, java.lang.CharSequence p1, int p2, int p3, android.os.IBinder p4) { return null; }
    public static void drawSnapshotOnSurface(android.view.WindowManager.LayoutParams p0, android.view.SurfaceControl p1, android.window.TaskSnapshot p2, android.graphics.Rect p3, java.lang.Runnable p4) {}
    public static void drawSnapshotOnSurface(android.view.WindowManager.LayoutParams p0, android.view.SurfaceControl p1, android.window.TaskSnapshot p2, android.graphics.Rect p3, boolean p4) {}
    public static android.app.ActivityManager.TaskDescription getOrCreateTaskDescription(android.app.ActivityManager.RunningTaskInfo p0) { return null; }

    private static class SnapshotSurface {
        private final int mContainerH = 0;
        private final int mContainerW = 0;
        private final android.view.SurfaceControl mRootSurface = null;
        private final android.window.TaskSnapshot mSnapshot = null;
        private final int mSnapshotH = 0;
        private final int mSnapshotW = 0;
        private final java.lang.CharSequence mTitle = null;
        private final android.view.SurfaceControl.Transaction mTransaction = null;
        SnapshotSurface(android.view.SurfaceControl p0, android.window.TaskSnapshot p1, android.graphics.Rect p2, java.lang.CharSequence p3) {}
        private void drawSizeMatchSnapshot() {}
        private void drawSizeMismatchSnapshot() {}
        void drawSnapshot(java.lang.Runnable p0, boolean p1) {}
    }

    public static class SystemBarBackgroundPainter {
        private final int mNavigationBarColor = 0;
        private final android.graphics.Paint mNavigationBarPaint = null;
        private final int mRequestedVisibleTypes = 0;
        private final float mScale = 0.0f;
        private final int mStatusBarColor = 0;
        private final android.graphics.Paint mStatusBarPaint = null;
        private final android.graphics.Rect mSystemBarInsets = null;
        private final int mWindowFlags = 0;
        private final int mWindowPrivateFlags = 0;
        private final int mWindowRenderingHints = 0;
        public SystemBarBackgroundPainter(int p0, int p1, int p2, int p3, android.app.ActivityManager.TaskDescription p4, float p5, int p6) {}
        private boolean isNavigationBarColorViewVisible() { return false; }
        public void drawDecors(android.graphics.Canvas p0, android.graphics.Rect p1) {}
        void drawNavigationBarBackground(android.graphics.Canvas p0) {}
        void drawStatusBarBackground(android.graphics.Canvas p0, android.graphics.Rect p1, int p2) {}
        int getStatusBarColorViewHeight() { return 0; }
        public void setInsets(android.graphics.Rect p0) {}
    }
}
