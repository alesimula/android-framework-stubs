package android.hardware.input;

@android.annotation.SystemApi
public class VirtualTouchscreen implements java.io.Closeable {
    private static final java.lang.String TAG = "VirtualTouchscreen";
    private final android.hardware.input.VirtualTouchscreenConfig mConfig = null;
    private final android.hardware.input.IVirtualTouchscreen mVirtualTouchscreen = null;
    public VirtualTouchscreen(android.hardware.input.VirtualTouchscreenConfig p0, android.hardware.input.IVirtualTouchscreen p1) {}
    public void close() {}
    @android.annotation.SystemApi
    public int getInputDeviceId() { return 0; }
    public void sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) {}
    public java.lang.String toString() { return null; }
}
