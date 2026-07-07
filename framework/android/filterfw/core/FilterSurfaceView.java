package android.filterfw.core;

public class FilterSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private static int STATE_ALLOCATED;
    private static int STATE_CREATED;
    private static int STATE_INITIALIZED;
    private int mFormat;
    private android.filterfw.core.GLEnvironment mGLEnv;
    private int mHeight;
    private android.view.SurfaceHolder.Callback mListener;
    private int mState;
    private int mSurfaceId;
    private int mWidth;
    public FilterSurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public FilterSurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void registerSurface() {}
    private void unregisterSurface() {}
    public void bindToListener(android.view.SurfaceHolder.Callback p0, android.filterfw.core.GLEnvironment p1) {}
    public android.filterfw.core.GLEnvironment getGLEnv() { return null; }
    public int getSurfaceId() { return 0; }
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void unbind() {}
}
