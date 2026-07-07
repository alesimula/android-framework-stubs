package android.hardware.input;

@android.annotation.SystemApi
public class VirtualMouse implements java.io.Closeable {
    private static final java.lang.String TAG = "VirtualMouse";
    static final long VIRTUAL_MOUSE_CURSOR_POTION_IN_LOGICAL_COORDINATES = 431622043L;
    private final android.hardware.input.VirtualMouseConfig mConfig = null;
    private final android.hardware.input.IVirtualMouse mVirtualMouse = null;
    public VirtualMouse(android.hardware.input.VirtualMouseConfig p0, android.hardware.input.IVirtualMouse p1) {}
    public void close() {}
    public android.graphics.PointF getCursorPosition() { return null; }
    @android.annotation.SystemApi
    public int getInputDeviceId() { return 0; }
    public void sendButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) {}
    public void sendRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) {}
    public void sendScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) {}
    public java.lang.String toString() { return null; }
}
