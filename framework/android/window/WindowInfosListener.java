package android.window;

public abstract class WindowInfosListener {
    private final long mNativeListener = 0L;
    public WindowInfosListener() {}
    private static native long nativeCreate(android.window.WindowInfosListener p0);
    private static native long nativeGetFinalizer();
    private static native android.util.Pair<android.view.InputWindowHandle[], android.window.WindowInfosListener.DisplayInfo[]> nativeRegister(long p0);
    private static native void nativeUnregister(long p0);
    public abstract void onWindowInfosChanged(android.view.InputWindowHandle[] p0, android.window.WindowInfosListener.DisplayInfo[] p1);
    public android.util.Pair<android.view.InputWindowHandle[], android.window.WindowInfosListener.DisplayInfo[]> register() { return null; }
    public void unregister() {}

    public static final class DisplayInfo {
        public final int mDisplayId = 0;
        public final android.util.Size mLogicalSize = null;
        public final android.graphics.Matrix mTransform = null;
        public DisplayInfo(int p0, int p1, int p2, android.graphics.Matrix p3) {}
        public java.lang.String toString() { return null; }
    }
}
