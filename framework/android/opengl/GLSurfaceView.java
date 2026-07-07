package android.opengl;

public class GLSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback2 {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    private static final boolean LOG_ATTACH_DETACH = false;
    private static final boolean LOG_EGL = false;
    private static final boolean LOG_PAUSE_RESUME = false;
    private static final boolean LOG_RENDERER = false;
    private static final boolean LOG_RENDERER_DRAW_FRAME = false;
    private static final boolean LOG_SURFACE = false;
    private static final boolean LOG_THREADS = false;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;
    private static final java.lang.String TAG = "GLSurfaceView";
    private static final android.opengl.GLSurfaceView.GLThreadManager sGLThreadManager = null;
    private int mDebugFlags;
    private boolean mDetached;
    private android.opengl.GLSurfaceView.EGLConfigChooser mEGLConfigChooser;
    private int mEGLContextClientVersion;
    private android.opengl.GLSurfaceView.EGLContextFactory mEGLContextFactory;
    private android.opengl.GLSurfaceView.EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private android.opengl.GLSurfaceView.GLThread mGLThread;
    private android.opengl.GLSurfaceView.GLWrapper mGLWrapper;
    private boolean mPreserveEGLContextOnPause;
    private android.opengl.GLSurfaceView.Renderer mRenderer;
    private final java.lang.ref.WeakReference<android.opengl.GLSurfaceView> mThisWeakRef = null;
    public GLSurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public GLSurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void checkRenderThreadState() {}
    private void init() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getDebugFlags() { return 0; }
    public boolean getPreserveEGLContextOnPause() { return false; }
    public int getRenderMode() { return 0; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onPause() {}
    public void onResume() {}
    public void queueEvent(java.lang.Runnable p0) {}
    public void requestRender() {}
    public void setDebugFlags(int p0) {}
    public void setEGLConfigChooser(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void setEGLConfigChooser(android.opengl.GLSurfaceView.EGLConfigChooser p0) {}
    public void setEGLConfigChooser(boolean p0) {}
    public void setEGLContextClientVersion(int p0) {}
    public void setEGLContextFactory(android.opengl.GLSurfaceView.EGLContextFactory p0) {}
    public void setEGLWindowSurfaceFactory(android.opengl.GLSurfaceView.EGLWindowSurfaceFactory p0) {}
    public void setGLWrapper(android.opengl.GLSurfaceView.GLWrapper p0) {}
    public void setPreserveEGLContextOnPause(boolean p0) {}
    public void setRenderMode(int p0) {}
    public void setRenderer(android.opengl.GLSurfaceView.Renderer p0) {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    @java.lang.Deprecated
    public void surfaceRedrawNeeded(android.view.SurfaceHolder p0) {}
    public void surfaceRedrawNeededAsync(android.view.SurfaceHolder p0, java.lang.Runnable p1) {}

    private abstract class BaseConfigChooser implements android.opengl.GLSurfaceView.EGLConfigChooser {
        protected int[] mConfigSpec;
        public BaseConfigChooser(android.opengl.GLSurfaceView p0, int[] p1) {}
        private int[] filterConfigSpec(int[] p0) { return null; }
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1) { return null; }
        abstract javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2);
    }

    private class ComponentSizeChooser extends android.opengl.GLSurfaceView.BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue;
        public ComponentSizeChooser(android.opengl.GLSurfaceView p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(null, null); }
        private int findConfigAttrib(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, int p3, int p4) { return 0; }
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig[] p2) { return null; }
    }

    private class DefaultContextFactory implements android.opengl.GLSurfaceView.EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;
        private DefaultContextFactory(android.opengl.GLSurfaceView p0) {}
        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2) { return null; }
        public void destroyContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLContext p2) {}
    }

    private static class DefaultWindowSurfaceFactory implements android.opengl.GLSurfaceView.EGLWindowSurfaceFactory {
        private DefaultWindowSurfaceFactory() {}
        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, java.lang.Object p3) { return null; }
        public void destroySurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLSurface p2) {}
    }

    public static interface EGLConfigChooser {
        public javax.microedition.khronos.egl.EGLConfig chooseConfig(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1);
    }

    public static interface EGLContextFactory {
        public javax.microedition.khronos.egl.EGLContext createContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2);
        public void destroyContext(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLContext p2);
    }

    private static class EglHelper {
        javax.microedition.khronos.egl.EGL10 mEgl;
        javax.microedition.khronos.egl.EGLConfig mEglConfig;
        javax.microedition.khronos.egl.EGLContext mEglContext;
        javax.microedition.khronos.egl.EGLDisplay mEglDisplay;
        javax.microedition.khronos.egl.EGLSurface mEglSurface;
        private java.lang.ref.WeakReference<android.opengl.GLSurfaceView> mGLSurfaceViewWeakRef;
        public EglHelper(java.lang.ref.WeakReference<android.opengl.GLSurfaceView> p0) {}
        private void destroySurfaceImp() {}
        public static java.lang.String formatEglError(java.lang.String p0, int p1) { return null; }
        public static void logEglErrorAsWarning(java.lang.String p0, java.lang.String p1, int p2) {}
        private void throwEglException(java.lang.String p0) {}
        public static void throwEglException(java.lang.String p0, int p1) {}
        javax.microedition.khronos.opengles.GL createGL() { return null; }
        public boolean createSurface() { return false; }
        public void destroySurface() {}
        public void finish() {}
        public void start() {}
        public int swap() { return 0; }
    }

    public static interface EGLWindowSurfaceFactory {
        public javax.microedition.khronos.egl.EGLSurface createWindowSurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLConfig p2, java.lang.Object p3);
        public void destroySurface(javax.microedition.khronos.egl.EGL10 p0, javax.microedition.khronos.egl.EGLDisplay p1, javax.microedition.khronos.egl.EGLSurface p2);
    }

    static class GLThread extends java.lang.Thread {
        private android.opengl.GLSurfaceView.EglHelper mEglHelper;
        private java.util.ArrayList<java.lang.Runnable> mEventQueue;
        private boolean mExited;
        private java.lang.Runnable mFinishDrawingRunnable;
        private boolean mFinishedCreatingEglSurface;
        private java.lang.ref.WeakReference<android.opengl.GLSurfaceView> mGLSurfaceViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private int mHeight;
        private boolean mPaused;
        private boolean mRenderComplete;
        private int mRenderMode;
        private boolean mRequestPaused;
        private boolean mRequestRender;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSizeChanged;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private boolean mWantRenderNotification;
        private int mWidth;
        GLThread(java.lang.ref.WeakReference<android.opengl.GLSurfaceView> p0) { super(); }
        private void guardedRun() throws java.lang.InterruptedException {}
        private boolean readyToDraw() { return false; }
        private void stopEglContextLocked() {}
        private void stopEglSurfaceLocked() {}
        public boolean ableToDraw() { return false; }
        public int getRenderMode() { return 0; }
        public void onPause() {}
        public void onResume() {}
        public void onWindowResize(int p0, int p1) {}
        public void queueEvent(java.lang.Runnable p0) {}
        public void requestExitAndWait() {}
        public void requestReleaseEglContextLocked() {}
        public void requestRender() {}
        public void requestRenderAndNotify(java.lang.Runnable p0) {}
        public void run() {}
        public void setRenderMode(int p0) {}
        public void surfaceCreated() {}
        public void surfaceDestroyed() {}
    }

    private static class GLThreadManager {
        private static java.lang.String TAG;
        private GLThreadManager() {}
        public void releaseEglContextLocked(android.opengl.GLSurfaceView.GLThread p0) {}
        public void threadExiting(android.opengl.GLSurfaceView.GLThread p0) {}
    }

    public static interface GLWrapper {
        public javax.microedition.khronos.opengles.GL wrap(javax.microedition.khronos.opengles.GL p0);
    }

    static class LogWriter extends java.io.Writer {
        private java.lang.StringBuilder mBuilder;
        LogWriter() { super(); }
        private void flushBuilder() {}
        public void close() {}
        public void flush() {}
        public void write(char[] p0, int p1, int p2) {}
    }

    public static interface Renderer {
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 p0);
        public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 p0, int p1, int p2);
        public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1);
    }

    private class SimpleEGLConfigChooser extends android.opengl.GLSurfaceView.ComponentSizeChooser {
        public SimpleEGLConfigChooser(android.opengl.GLSurfaceView p0, boolean p1) { super(null, 0, 0, 0, 0, 0, 0); }
    }
}
