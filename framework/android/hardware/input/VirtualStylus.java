package android.hardware.input;

@android.annotation.SystemApi
public class VirtualStylus implements java.io.Closeable {
    private static final java.lang.String TAG = "VirtualStylus";
    private final android.hardware.input.VirtualStylusConfig mConfig = null;
    private final android.hardware.input.IVirtualStylus mVirtualStylus = null;
    public VirtualStylus(android.hardware.input.VirtualStylusConfig p0, android.hardware.input.IVirtualStylus p1) {}
    public void close() {}
    @android.annotation.SystemApi
    public int getInputDeviceId() { return 0; }
    public void sendButtonEvent(android.hardware.input.VirtualStylusButtonEvent p0) {}
    public void sendMotionEvent(android.hardware.input.VirtualStylusMotionEvent p0) {}
    public java.lang.String toString() { return null; }
}
