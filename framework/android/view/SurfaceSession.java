package android.view;

public final class SurfaceSession {
    private long mNativeClient;
    public SurfaceSession() {}
    private static native long nativeCreate();
    private static native void nativeDestroy(long p0);
    protected void finalize() throws java.lang.Throwable {}
    public void kill() {}
}
