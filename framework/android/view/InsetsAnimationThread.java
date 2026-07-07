package android.view;

public class InsetsAnimationThread extends android.os.HandlerThread {
    private static android.os.Handler sHandler;
    private static android.view.InsetsAnimationThread sInstance;
    private InsetsAnimationThread() { super((java.lang.String)null); }
    private static void ensureThreadLocked() {}
    public static android.view.InsetsAnimationThread get() { return null; }
    public static android.os.Handler getHandler() { return null; }
    public static void release() {}
}
