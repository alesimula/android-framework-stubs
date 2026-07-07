package android.view;

public final class InputWindowHandle {
    public float alpha;
    public boolean canOccludePresentation;
    public android.util.Size contentSize;
    public long dispatchingTimeoutMillis;
    public int displayId;
    public android.os.IBinder focusTransferTarget;
    public final android.graphics.Rect frame = null;
    public android.view.InputApplicationHandle inputApplicationHandle;
    public int inputConfig;
    public int layerId;
    public int layoutParamsFlags;
    public int layoutParamsType;
    public java.lang.String name;
    public int ownerPid;
    public int ownerUid;
    public java.lang.String packageName;
    private long ptr;
    public boolean replaceTouchableRegionWithCrop;
    public float scaleFactor;
    public int surfaceInset;
    public android.os.IBinder token;
    public int touchOcclusionMode;
    public final android.graphics.Region touchableRegion = null;
    public java.lang.ref.WeakReference<android.view.SurfaceControl> touchableRegionSurfaceControl;
    public android.graphics.Matrix transform;
    private android.os.IBinder windowToken;
    public InputWindowHandle(android.view.InputApplicationHandle p0, int p1) {}
    public InputWindowHandle(android.view.InputWindowHandle p0) {}
    private native void nativeDispose();
    protected void finalize() throws java.lang.Throwable {}
    public android.os.IBinder getWindowToken() { return null; }
    public void replaceTouchableRegionWithCrop(android.view.SurfaceControl p0) {}
    public void setInputConfig(int p0, boolean p1) {}
    public void setTouchableRegion(android.graphics.Rect p0) {}
    public void setTouchableRegionCrop(android.view.SurfaceControl p0) {}
    public void setTrustedOverlay(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, boolean p2) {}
    public void setWindowToken(android.os.IBinder p0) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InputConfigFlags {
    }
}
