package android.view;

public class WindowLayout {
    private static final boolean DEBUG = false;
    static final int MAX_X = 100000;
    static final int MAX_Y = 100000;
    static final int MIN_X = -100000;
    static final int MIN_Y = -100000;
    private static final java.lang.String TAG = null;
    public static final int UNSPECIFIED_LENGTH = -1;
    private final android.graphics.Rect mTempDisplayCutoutSafeExceptMaybeBarsRect = null;
    private final android.graphics.Rect mTempRect = null;
    public WindowLayout() {}
    public static void computeSurfaceSize(android.view.WindowManager.LayoutParams p0, android.graphics.Rect p1, int p2, int p3, android.graphics.Rect p4, boolean p5, android.graphics.Point p6) {}
    public static void extendFrameByCutout(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    private static void intersectOrClamp(android.graphics.Rect p0, android.graphics.Rect p1) {}
    public void computeFrames(android.view.WindowManager.LayoutParams p0, android.view.InsetsState p1, android.graphics.Rect p2, android.graphics.Rect p3, int p4, int p5, int p6, int p7, float p8, android.window.ClientWindowFrames p9) {}
    boolean isLocallyManaged() { return false; }
}
