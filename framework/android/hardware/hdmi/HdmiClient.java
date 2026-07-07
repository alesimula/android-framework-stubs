package android.hardware.hdmi;

@android.annotation.SystemApi
public abstract class HdmiClient {
    private static final java.lang.String TAG = "HdmiClient";
    private static final int UNKNOWN_VENDOR_ID = 16777215;
    private android.hardware.hdmi.IHdmiVendorCommandListener mIHdmiVendorCommandListener;
    final android.hardware.hdmi.IHdmiControlService mService = null;
    HdmiClient(android.hardware.hdmi.IHdmiControlService p0) {}
    private static android.hardware.hdmi.IHdmiControlCallback getCallbackWrapper(int p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiClient.OnDeviceSelectedListener p2) { return null; }
    private static android.hardware.hdmi.IHdmiVendorCommandListener getListenerWrapper(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0) { return null; }
    public android.hardware.hdmi.HdmiDeviceInfo getActiveSource() { return null; }
    abstract int getDeviceType();
    public void selectDevice(int p0, java.util.concurrent.Executor p1, android.hardware.hdmi.HdmiClient.OnDeviceSelectedListener p2) {}
    public void sendKeyEvent(int p0, boolean p1) {}
    public void sendVendorCommand(int p0, byte[] p1, boolean p2) {}
    public void sendVolumeKeyEvent(int p0, boolean p1) {}
    public void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0) {}
    public void setVendorCommandListener(android.hardware.hdmi.HdmiControlManager.VendorCommandListener p0, int p1) {}

    public static interface OnDeviceSelectedListener {
        public void onDeviceSelected(int p0, int p1);
    }
}
