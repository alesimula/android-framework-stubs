package android.hardware.input;

@android.annotation.SystemApi
public class VirtualKeyboard implements java.io.Closeable {
    private static final java.lang.String TAG = "VirtualKeyboard";
    private static final int UNSUPPORTED_KEY_CODE = 23;
    private final android.hardware.input.VirtualKeyboardConfig mConfig = null;
    private final android.hardware.input.IVirtualKeyboard mVirtualKeyboard = null;
    public VirtualKeyboard(android.hardware.input.VirtualKeyboardConfig p0, android.hardware.input.IVirtualKeyboard p1) {}
    public void close() {}
    @android.annotation.SystemApi
    public int getInputDeviceId() { return 0; }
    public int getInputDeviceIdForTest() { return 0; }
    public void sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) {}
    public java.lang.String toString() { return null; }
}
