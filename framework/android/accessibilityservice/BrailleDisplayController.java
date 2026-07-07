package android.accessibilityservice;

public interface BrailleDisplayController {
    public static final java.lang.String TEST_BRAILLE_DISPLAY_BUS_BLUETOOTH = "BUS_BLUETOOTH";
    public static final java.lang.String TEST_BRAILLE_DISPLAY_DESCRIPTOR = "DESCRIPTOR";
    public static final java.lang.String TEST_BRAILLE_DISPLAY_HIDRAW_PATH = "HIDRAW_PATH";
    public static final java.lang.String TEST_BRAILLE_DISPLAY_NAME = "NAME";
    public static final java.lang.String TEST_BRAILLE_DISPLAY_UNIQUE_ID = "UNIQUE_ID";
    public static void checkApiFlagIsEnabled() {}
    public static void setTestBrailleDisplayData(android.accessibilityservice.AccessibilityService p0, java.util.List<android.os.Bundle> p1) {}
    public void connect(android.bluetooth.BluetoothDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1);
    public void connect(android.bluetooth.BluetoothDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2);
    public void connect(android.hardware.usb.UsbDevice p0, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p1);
    public void connect(android.hardware.usb.UsbDevice p0, java.util.concurrent.Executor p1, android.accessibilityservice.BrailleDisplayController.BrailleDisplayCallback p2);
    public void disconnect();
    public boolean isConnected();
    public void write(byte[] p0) throws java.io.IOException;

    public static interface BrailleDisplayCallback {
        public static final int FLAG_ERROR_BRAILLE_DISPLAY_NOT_FOUND = 2;
        public static final int FLAG_ERROR_CANNOT_ACCESS = 1;
        public void onConnected(byte[] p0);
        public void onConnectionFailed(int p0);
        public void onDisconnected();
        public void onInput(byte[] p0);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ErrorCode {
        }
    }
}
