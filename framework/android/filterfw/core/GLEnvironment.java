package android.filterfw.core;

public class GLEnvironment {
    private int glEnvId;
    private boolean mManageContext;
    public GLEnvironment() {}
    private GLEnvironment(android.filterfw.core.NativeAllocatorTag p0) {}
    public static boolean isAnyContextActive() { return false; }
    private native boolean nativeActivate();
    private native boolean nativeActivateSurfaceId(int p0);
    private native int nativeAddSurface(android.view.Surface p0);
    private native int nativeAddSurfaceFromMediaRecorder(android.media.MediaRecorder p0);
    private native int nativeAddSurfaceWidthHeight(android.view.Surface p0, int p1, int p2);
    private native boolean nativeAllocate();
    private native boolean nativeDeactivate();
    private native boolean nativeDeallocate();
    private native boolean nativeDisconnectSurfaceMediaSource(android.media.MediaRecorder p0);
    private native boolean nativeInitWithCurrentContext();
    private native boolean nativeInitWithNewContext();
    private native boolean nativeIsActive();
    private static native boolean nativeIsAnyContextActive();
    private native boolean nativeIsContextActive();
    private native boolean nativeRemoveSurfaceId(int p0);
    private native boolean nativeSetSurfaceTimestamp(long p0);
    private native boolean nativeSwapBuffers();
    public void activate() {}
    public void activateSurfaceWithId(int p0) {}
    public void deactivate() {}
    protected void finalize() throws java.lang.Throwable {}
    public void initWithCurrentContext() {}
    public void initWithNewContext() {}
    public boolean isActive() { return false; }
    public boolean isContextActive() { return false; }
    public int registerSurface(android.view.Surface p0) { return 0; }
    public int registerSurfaceFromMediaRecorder(android.media.MediaRecorder p0) { return 0; }
    public int registerSurfaceTexture(android.graphics.SurfaceTexture p0, int p1, int p2) { return 0; }
    public void setSurfaceTimestamp(long p0) {}
    public void swapBuffers() {}
    public void tearDown() {}
    public void unregisterSurfaceId(int p0) {}
}
