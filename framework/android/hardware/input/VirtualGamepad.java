package android.hardware.input;

public class VirtualGamepad implements java.lang.AutoCloseable {
    public static final java.util.Set<java.lang.Integer> SUPPORTED_KEY_CODES = null;
    private static final java.lang.String TAG = "VirtualGamepad";
    private final android.hardware.input.VirtualGamepadConfig mConfig = null;
    private final android.hardware.input.IVirtualGamepad mVirtualGamepad = null;
    public VirtualGamepad(android.hardware.input.VirtualGamepadConfig p0, android.hardware.input.IVirtualGamepad p1) {}
    public void close() {}
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
    public void sendMotionEvent(android.hardware.input.VirtualGamepadMotionEvent p0) {}
}
