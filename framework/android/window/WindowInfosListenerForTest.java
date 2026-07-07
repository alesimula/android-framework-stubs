package android.window;

public class WindowInfosListenerForTest {
    private static final java.lang.String TAG = "WindowInfosListenerForTest";
    private final android.util.ArrayMap<java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>>, java.util.function.BiConsumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>, java.util.List<android.window.WindowInfosListenerForTest.DisplayInfo>>> mConsumersToBiConsumers = null;
    private final android.util.ArrayMap<java.util.function.BiConsumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>, java.util.List<android.window.WindowInfosListenerForTest.DisplayInfo>>, android.window.WindowInfosListener> mListeners = null;
    public WindowInfosListenerForTest() {}
    private static android.util.Pair<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>, java.util.List<android.window.WindowInfosListenerForTest.DisplayInfo>> buildParams(android.view.InputWindowHandle[] p0, android.window.WindowInfosListener.DisplayInfo[] p1) { return null; }
    public void addWindowInfosListener(java.util.function.BiConsumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>, java.util.List<android.window.WindowInfosListenerForTest.DisplayInfo>> p0) {}
    @java.lang.Deprecated
    public void addWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}
    public void removeWindowInfosListener(java.util.function.BiConsumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>, java.util.List<android.window.WindowInfosListenerForTest.DisplayInfo>> p0) {}
    @java.lang.Deprecated
    public void removeWindowInfosListener(java.util.function.Consumer<java.util.List<android.window.WindowInfosListenerForTest.WindowInfo>> p0) {}

    public static class DisplayInfo {
        public final int displayId = 0;
        public final android.graphics.Matrix transform = null;
        DisplayInfo(int p0, android.graphics.Matrix p1) {}
        public java.lang.String toString() { return null; }
    }

    public static class WindowInfo {
        public final android.graphics.Rect bounds = null;
        public final int displayId = 0;
        public final boolean isDuplicateTouchToWallpaper = false;
        public final boolean isFocusable = false;
        public final boolean isTouchable = false;
        public final boolean isTrustedOverlay = false;
        public final boolean isVisible = false;
        public final boolean isWatchOutsideTouch = false;
        public final java.lang.String name = null;
        public final android.graphics.Region touchableRegion = null;
        public final android.graphics.Matrix transform = null;
        public final android.os.IBinder windowToken = null;
        WindowInfo(android.os.IBinder p0, java.lang.String p1, int p2, android.graphics.Rect p3, android.graphics.Region p4, int p5, android.graphics.Matrix p6) {}
        public java.lang.String toString() { return null; }
    }
}
