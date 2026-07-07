package android.hardware.input;

@android.annotation.SystemApi
public class VirtualDpad implements java.io.Closeable {
    private static final java.util.Set<java.lang.Integer> SUPPORTED_KEY_CODES = null;
    private static final java.lang.String TAG = "VirtualDpad";
    private final android.hardware.input.VirtualDpadConfig mConfig = null;
    private final android.hardware.input.IVirtualDpad mVirtualDpad = null;
    public VirtualDpad(android.hardware.input.VirtualDpadConfig p0, android.hardware.input.IVirtualDpad p1) {}
    public static boolean isKeyCodeSupported(int p0) { return false; }
    public void close() {}
    @android.annotation.SystemApi
    public int getInputDeviceId() { return 0; }
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
    public java.lang.String toString() { return null; }
}
