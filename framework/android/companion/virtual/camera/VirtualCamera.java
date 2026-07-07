package android.companion.virtual.camera;

@android.annotation.SystemApi
public final class VirtualCamera implements java.io.Closeable {
    private static java.lang.Boolean sVirtualCameraSupported;
    private final java.lang.String mCameraId = null;
    private final android.companion.virtual.camera.VirtualCameraConfig mConfig = null;
    private final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    public VirtualCamera(android.companion.virtual.IVirtualDevice p0, java.lang.String p1, android.companion.virtual.camera.VirtualCameraConfig p2) {}
    public static boolean isSupported() { return false; }
    public void close() {}
    public void closeSessionOnError() {}
    public android.companion.virtual.camera.VirtualCameraConfig getConfig() { return null; }
    public java.lang.String getId() { return null; }
    public void notifyRequestError(long p0) {}
}
