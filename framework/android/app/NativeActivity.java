package android.app;

public class NativeActivity extends android.app.Activity implements android.view.SurfaceHolder.Callback2, android.view.InputQueue.Callback, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private static final java.lang.String KEY_NATIVE_SAVED_STATE = "android:native_state";
    public static final java.lang.String META_DATA_FUNC_NAME = "android.app.func_name";
    public static final java.lang.String META_DATA_LIB_NAME = "android.app.lib_name";
    private android.view.InputQueue mCurInputQueue;
    private android.view.SurfaceHolder mCurSurfaceHolder;
    private boolean mDestroyed;
    private boolean mDispatchingUnhandledKey;
    private android.view.inputmethod.InputMethodManager mIMM;
    int mLastContentHeight;
    int mLastContentWidth;
    int mLastContentX;
    int mLastContentY;
    final int[] mLocation = null;
    private android.app.NativeActivity.NativeContentView mNativeContentView;
    private long mNativeHandle;
    public NativeActivity() { super(); }
    private static java.lang.String getAbsolutePath(java.io.File p0) { return null; }
    private native java.lang.String getDlError();
    private native long loadNativeCode(java.lang.String p0, java.lang.String p1, android.os.MessageQueue p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, int p6, android.content.res.AssetManager p7, byte[] p8, java.lang.ClassLoader p9, java.lang.String p10);
    private native void onConfigurationChangedNative(long p0);
    private native void onContentRectChangedNative(long p0, int p1, int p2, int p3, int p4);
    private native void onInputQueueCreatedNative(long p0, long p1);
    private native void onInputQueueDestroyedNative(long p0, long p1);
    private native void onLowMemoryNative(long p0);
    private native void onPauseNative(long p0);
    private native void onResumeNative(long p0);
    private native byte[] onSaveInstanceStateNative(long p0);
    private native void onStartNative(long p0);
    private native void onStopNative(long p0);
    private native void onSurfaceChangedNative(long p0, android.view.Surface p1, int p2, int p3, int p4);
    private native void onSurfaceCreatedNative(long p0, android.view.Surface p1);
    private native void onSurfaceDestroyedNative(long p0);
    private native void onSurfaceRedrawNeededNative(long p0, android.view.Surface p1);
    private native void onWindowFocusChangedNative(long p0, boolean p1);
    private native void unloadNativeCode(long p0);
    void hideIme(int p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public void onGlobalLayout() {}
    public void onInputQueueCreated(android.view.InputQueue p0) {}
    public void onInputQueueDestroyed(android.view.InputQueue p0) {}
    public void onLowMemory() {}
    protected void onPause() {}
    protected void onResume() {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onStart() {}
    protected void onStop() {}
    public void onWindowFocusChanged(boolean p0) {}
    void setWindowFlags(int p0, int p1) {}
    void setWindowFormat(int p0) {}
    void showIme(int p0) {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void surfaceRedrawNeeded(android.view.SurfaceHolder p0) {}

    static class NativeContentView extends android.view.View {
        android.app.NativeActivity mActivity;
        public NativeContentView(android.content.Context p0) { super((android.content.Context)null); }
        public NativeContentView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    }
}
