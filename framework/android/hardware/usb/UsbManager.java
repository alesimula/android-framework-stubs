package android.hardware.usb;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public class UsbManager {
    public static final java.lang.String ACTION_USB_ACCESSORY_ATTACHED = "android.hardware.usb.action.USB_ACCESSORY_ATTACHED";
    public static final java.lang.String ACTION_USB_ACCESSORY_DETACHED = "android.hardware.usb.action.USB_ACCESSORY_DETACHED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_ACCESSORY_HANDSHAKE = "android.hardware.usb.action.USB_ACCESSORY_HANDSHAKE";
    public static final java.lang.String ACTION_USB_DEVICE_ATTACHED = "android.hardware.usb.action.USB_DEVICE_ATTACHED";
    public static final java.lang.String ACTION_USB_DEVICE_DETACHED = "android.hardware.usb.action.USB_DEVICE_DETACHED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_PERMISSION_CHANGED = "android.hardware.usb.action.USB_PERMISSION_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_PORT_CHANGED = "android.hardware.usb.action.USB_PORT_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_PORT_COMPLIANCE_CHANGED = "android.hardware.usb.action.USB_PORT_COMPLIANCE_CHANGED";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_USB_STATE = "android.hardware.usb.action.USB_STATE";
    public static final java.lang.String EXTRA_ACCESSORY = "accessory";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_HANDSHAKE_END = "android.hardware.usb.extra.ACCESSORY_HANDSHAKE_END";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_START = "android.hardware.usb.extra.ACCESSORY_START";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_STRING_COUNT = "android.hardware.usb.extra.ACCESSORY_STRING_COUNT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ACCESSORY_UEVENT_TIME = "android.hardware.usb.extra.ACCESSORY_UEVENT_TIME";
    public static final java.lang.String EXTRA_CAN_BE_DEFAULT = "android.hardware.usb.extra.CAN_BE_DEFAULT";
    public static final java.lang.String EXTRA_DEVICE = "device";
    public static final java.lang.String EXTRA_PACKAGE = "android.hardware.usb.extra.PACKAGE";
    public static final java.lang.String EXTRA_PERMISSION_GRANTED = "permission";
    public static final java.lang.String EXTRA_PORT = "port";
    public static final java.lang.String EXTRA_PORT_STATUS = "portStatus";
    @android.annotation.SystemApi
    public static final long FUNCTION_ACCESSORY = 2L;
    @android.annotation.SystemApi
    public static final long FUNCTION_ADB = 1L;
    @android.annotation.SystemApi
    public static final long FUNCTION_AUDIO_SOURCE = 64L;
    @android.annotation.SystemApi
    public static final long FUNCTION_MIDI = 8L;
    @android.annotation.SystemApi
    public static final long FUNCTION_MTP = 4L;
    private static final java.util.Map<java.lang.String, java.lang.Long> FUNCTION_NAME_TO_CODE = null;
    @android.annotation.SystemApi
    public static final long FUNCTION_NCM = 1024L;
    @android.annotation.SystemApi
    public static final long FUNCTION_NONE = 0L;
    @android.annotation.SystemApi
    public static final long FUNCTION_PTP = 16L;
    @android.annotation.SystemApi
    public static final long FUNCTION_RNDIS = 32L;
    @android.annotation.SystemApi
    public static final long FUNCTION_UVC = 128L;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_NOT_SUPPORTED = -1;
    public static final java.lang.String GADGET_HAL_UNKNOWN = "unknown";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_0 = 10;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_1 = 11;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V1_2 = 12;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int GADGET_HAL_V2_0 = 20;
    public static final java.lang.String GADGET_HAL_VERSION_1_0 = "V1_0";
    public static final java.lang.String GADGET_HAL_VERSION_1_1 = "V1_1";
    public static final java.lang.String GADGET_HAL_VERSION_1_2 = "V1_2";
    public static final java.lang.String GADGET_HAL_VERSION_2_0 = "V2_0";
    @android.annotation.SystemApi
    public static final int PCI_TUNNEL_CTRL_DISALLOWED_BY_APM = 4;
    @android.annotation.SystemApi
    public static final int PCI_TUNNEL_CTRL_DISALLOWED_BY_ENTERPRISE_POLICY = 3;
    @android.annotation.SystemApi
    public static final int PCI_TUNNEL_CTRL_DISALLOWED_FOR_NONADMIN_USER = 2;
    @android.annotation.SystemApi
    public static final int PCI_TUNNEL_CTRL_SUPPORTED = 0;
    @android.annotation.SystemApi
    public static final int PCI_TUNNEL_CTRL_UNSUPPORTED = 1;
    private static final long SETTABLE_FUNCTIONS = 1212L;
    private static final java.lang.String TAG = "UsbManager";
    @android.annotation.SystemApi
    public static final java.lang.String USB_CONFIGURED = "configured";
    @android.annotation.SystemApi
    public static final java.lang.String USB_CONNECTED = "connected";
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_10G = 10240;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_20G = 20480;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_40G = 40960;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_5G = 5120;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_FULL_SPEED = 12;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_HIGH_SPEED = 480;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_LOW_SPEED = 2;
    @android.annotation.SystemApi
    public static final int USB_DATA_TRANSFER_RATE_UNKNOWN = -1;
    public static final java.lang.String USB_DATA_UNLOCKED = "unlocked";
    public static final java.lang.String USB_FUNCTION_ACCESSORY = "accessory";
    public static final java.lang.String USB_FUNCTION_ADB = "adb";
    public static final java.lang.String USB_FUNCTION_AUDIO_SOURCE = "audio_source";
    public static final java.lang.String USB_FUNCTION_MIDI = "midi";
    public static final java.lang.String USB_FUNCTION_MTP = "mtp";
    @android.annotation.SystemApi
    public static final java.lang.String USB_FUNCTION_NCM = "ncm";
    public static final java.lang.String USB_FUNCTION_NONE = "none";
    public static final java.lang.String USB_FUNCTION_PTP = "ptp";
    @android.annotation.SystemApi
    public static final java.lang.String USB_FUNCTION_RNDIS = "rndis";
    public static final java.lang.String USB_FUNCTION_UVC = "uvc";
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_NOT_SUPPORTED = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_RETRY = -2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_0 = 10;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_1 = 11;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_2 = 12;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V1_3 = 13;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int USB_HAL_V2_0 = 20;
    public static final java.lang.String USB_HOST_CONNECTED = "host_connected";
    private static final java.util.concurrent.atomic.AtomicInteger sUsbOperationCount = null;
    private android.util.ArrayMap<android.hardware.usb.UsbAccessory, android.hardware.usb.UsbManager.AccessoryHandle> mAccessoryHandleMap;
    private final java.lang.Object mAccessoryHandleMapLock = null;
    private android.util.ArrayMap<android.hardware.usb.UsbManager.Bc12TypeListener, java.util.concurrent.Executor> mBc12TypeListeners;
    private final java.lang.Object mBc12TypeListenersLock = null;
    private android.hardware.usb.UsbManager.Bc12TypeDispatchingListener mBc12TypeServiceListener;
    private final android.content.Context mContext = null;
    private android.util.ArrayMap<android.hardware.usb.UsbManager.DisplayPortAltModeInfoListener, java.util.concurrent.Executor> mDisplayPortListeners;
    private final java.lang.Object mDisplayPortListenersLock = null;
    private android.hardware.usb.UsbManager.DisplayPortAltModeInfoDispatchingListener mDisplayPortServiceListener;
    private android.util.ArrayMap<android.hardware.usb.UsbManager.PowerProfileInfoListener, java.util.concurrent.Executor> mPowerProfileInfoListeners;
    private final java.lang.Object mPowerProfileInfoListenersLock = null;
    private android.hardware.usb.UsbManager.PowerProfileInfoDispatchingListener mPowerProfileInfoServiceListener;
    private final android.hardware.usb.IUsbManager mService = null;
    public UsbManager(android.content.Context p0, android.hardware.usb.IUsbManager p1) {}
    public static boolean areSettableFunctions(long p0) { return false; }
    private void closeHandleForAccessory(android.hardware.usb.UsbAccessory p0, boolean p1) throws java.io.IOException {}
    private android.hardware.usb.UsbManager.AccessoryHandle getModifiedHandleForClosingStream(boolean p0, android.hardware.usb.UsbManager.AccessoryHandle p1) { return null; }
    private android.hardware.usb.UsbManager.AccessoryHandle getModifiedHandleForOpeningStream(boolean p0, android.hardware.usb.UsbManager.AccessoryHandle p1) { return null; }
    private boolean isPortDisabled(android.hardware.usb.UsbPort p0) { return false; }
    @android.annotation.SystemApi
    public static boolean isUvcSupportEnabled() { return false; }
    private android.hardware.usb.UsbManager.AccessoryHandle openHandleForAccessory(android.hardware.usb.UsbAccessory p0, boolean p1) throws android.os.RemoteException { return null; }
    private boolean registerBc12TypeEventsIfNeededLocked() { return false; }
    private boolean registerDisplayPortAltModeEventsIfNeededLocked() { return false; }
    private boolean registerPowerProfileInfoEventsIfNeededLocked() { return false; }
    private boolean setUsbDataSignal(java.util.List<android.hardware.usb.UsbPort> p0, boolean p1, boolean p2) { return false; }
    private void unregisterBc12TypeEventsLocked() {}
    private void unregisterDisplayPortAltModeEventsLocked() {}
    private void unregisterPowerProfileInfoEventsLocked() {}
    public static long usbFunctionsFromString(java.lang.String p0) { return 0L; }
    public static java.lang.String usbFunctionsToString(long p0) { return null; }
    public static java.lang.String usbGadgetHalVersionToString(int p0) { return null; }
    public static int usbSpeedToBandwidth(int p0) { return 0; }
    void enableContaminantDetection(android.hardware.usb.UsbPort p0, boolean p1) {}
    void enableLimitPowerTransfer(android.hardware.usb.UsbPort p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) {}
    boolean enableUsbData(android.hardware.usb.UsbPort p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) { return false; }
    public boolean enableUsbDataSignal(boolean p0) { return false; }
    void enableUsbDataWhileDocked(android.hardware.usb.UsbPort p0, int p1, android.hardware.usb.IUsbOperationInternal p2) {}
    public android.hardware.usb.UsbAccessory[] getAccessoryList() { return null; }
    public android.os.ParcelFileDescriptor getControlFd(long p0) { return null; }
    @android.annotation.SystemApi
    public long getCurrentFunctions() { return 0L; }
    public java.util.HashMap<java.lang.String, android.hardware.usb.UsbDevice> getDeviceList() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public int getGadgetHalVersion() { return 0; }
    public java.util.List<java.lang.String> getPackagesWithPermission(android.hardware.usb.UsbDevice p0) { return null; }
    @android.annotation.SystemApi
    public int getPciTunnelingControlAllowedStatus() { return 0; }
    android.hardware.usb.UsbPortStatus getPortStatus(android.hardware.usb.UsbPort p0) { return null; }
    @android.annotation.SystemApi
    public java.util.List<android.hardware.usb.UsbPort> getPorts() { return null; }
    public long getScreenUnlockedFunctions() { return 0L; }
    @android.annotation.SystemApi
    public int getUsbBandwidthMbps() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public int getUsbHalVersion() { return 0; }
    public void grantPermission(android.hardware.usb.UsbDevice p0) {}
    @android.annotation.SystemApi
    public void grantPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) {}
    public void grantPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) {}
    public boolean hasPermission(android.hardware.usb.UsbAccessory p0) { return false; }
    public boolean hasPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2, int p3) { return false; }
    public boolean hasPermission(android.hardware.usb.UsbDevice p0) { return false; }
    public boolean hasPermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, int p3) { return false; }
    @java.lang.Deprecated
    public boolean isFunctionEnabled(java.lang.String p0) { return false; }
    boolean isModeChangeSupported(android.hardware.usb.UsbPort p0) { return false; }
    @android.annotation.SystemApi
    public boolean isPciTunnelingEnabled() { return false; }
    public boolean isUvcGadgetSupportEnabled() { return false; }
    public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) { return null; }
    public java.io.InputStream openAccessoryInputStream(android.hardware.usb.UsbAccessory p0) { return null; }
    public java.io.OutputStream openAccessoryOutputStream(android.hardware.usb.UsbAccessory p0) { return null; }
    public android.hardware.usb.UsbDeviceConnection openDevice(android.hardware.usb.UsbDevice p0) { return null; }
    @android.annotation.SystemApi
    public void registerBc12TypeListener(java.util.concurrent.Executor p0, android.hardware.usb.UsbManager.Bc12TypeListener p1) {}
    @android.annotation.SystemApi
    public void registerDisplayPortAltModeInfoListener(java.util.concurrent.Executor p0, android.hardware.usb.UsbManager.DisplayPortAltModeInfoListener p1) {}
    @android.annotation.SystemApi
    public void registerPowerProfileInfoListener(java.util.concurrent.Executor p0, android.hardware.usb.UsbManager.PowerProfileInfoListener p1) {}
    public void requestPermission(android.hardware.usb.UsbAccessory p0, android.app.PendingIntent p1) {}
    public void requestPermission(android.hardware.usb.UsbDevice p0, android.app.PendingIntent p1) {}
    @android.annotation.SystemApi
    public void resetUsbGadget() {}
    void resetUsbPort(android.hardware.usb.UsbPort p0, int p1, android.hardware.usb.IUsbOperationInternal p2) {}
    @android.annotation.SystemApi
    public void revokePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setCurrentFunction(java.lang.String p0, boolean p1) {}
    @android.annotation.SystemApi
    public void setCurrentFunctions(long p0) {}
    @android.annotation.SystemApi
    public void setPciTunnelingEnabled(boolean p0) {}
    void setPortRoles(android.hardware.usb.UsbPort p0, int p1, int p2) {}
    public void setScreenUnlockedFunctions(long p0) {}
    public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) {}
    @android.annotation.SystemApi
    public void unregisterBc12TypeListener(android.hardware.usb.UsbManager.Bc12TypeListener p0) {}
    @android.annotation.SystemApi
    public void unregisterDisplayPortAltModeInfoListener(android.hardware.usb.UsbManager.DisplayPortAltModeInfoListener p0) {}
    @android.annotation.SystemApi
    public void unregisterPowerProfileInfoListener(android.hardware.usb.UsbManager.PowerProfileInfoListener p0) {}

    private class AccessoryAutoCloseInputStream extends java.io.FileInputStream {
        private final android.hardware.usb.UsbAccessory mAccessory = null;
        private final boolean mIsAccessoryFfsEnabled = false;
        private final android.os.ParcelFileDescriptor mPfd = null;
        AccessoryAutoCloseInputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2) { super((java.io.FileDescriptor)null); }
        AccessoryAutoCloseInputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2, boolean p3) { super((java.io.FileDescriptor)null); }
        public void close() throws java.io.IOException {}
    }

    private class AccessoryAutoCloseOutputStream extends java.io.FileOutputStream {
        private final android.hardware.usb.UsbAccessory mAccessory = null;
        private final boolean mIsAccessoryFfsEnabled = false;
        private final int mMaxPacketSize = 0;
        private final android.os.ParcelFileDescriptor mPfd = null;
        AccessoryAutoCloseOutputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2) { super((java.io.FileDescriptor)null); }
        AccessoryAutoCloseOutputStream(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbAccessory p1, android.os.ParcelFileDescriptor p2, int p3, boolean p4) { super((java.io.FileDescriptor)null); }
        private void sendZlp() {}
        public void close() throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }

    private static class AccessoryHandle {
        private final boolean mInputStreamOpened = false;
        private final boolean mOutputStreamOpened = false;
        private final android.os.ParcelFileDescriptor mPfd = null;
        AccessoryHandle(android.os.ParcelFileDescriptor p0, boolean p1, boolean p2) {}
        public android.os.ParcelFileDescriptor getPfd() { return null; }
        public boolean isInputStreamOpened() { return false; }
        public boolean isOpen() { return false; }
        public boolean isOutputStreamOpened() { return false; }
    }

    private class Bc12TypeDispatchingListener extends android.hardware.usb.IBc12TypeListener.Stub {
        android.hardware.usb.UsbManager mUsbManager;
        Bc12TypeDispatchingListener(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbManager p1) { super(); }
        public void onPartnerBc12TypeChanged(android.hardware.usb.ParcelableUsbPort p0, int p1) {}
    }

    @android.annotation.SystemApi
    public static interface Bc12TypeListener {
        public void onPartnerBc12TypeChanged(android.hardware.usb.UsbPort p0, int p1);
    }

    private class DisplayPortAltModeInfoDispatchingListener extends android.hardware.usb.IDisplayPortAltModeInfoListener.Stub {
        private DisplayPortAltModeInfoDispatchingListener(android.hardware.usb.UsbManager p0) { super(); }
        public void onDisplayPortAltModeInfoChanged(java.lang.String p0, android.hardware.usb.DisplayPortAltModeInfo p1) {}
    }

    @android.annotation.SystemApi
    public static interface DisplayPortAltModeInfoListener {
        public void onDisplayPortAltModeInfoChanged(java.lang.String p0, android.hardware.usb.DisplayPortAltModeInfo p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PciTunnelControlAllowedStatus {
    }

    private class PowerProfileInfoDispatchingListener extends android.hardware.usb.IPowerProfileInfoListener.Stub {
        android.hardware.usb.UsbManager mUsbManager;
        PowerProfileInfoDispatchingListener(android.hardware.usb.UsbManager p0, android.hardware.usb.UsbManager p1) { super(); }
        public void onPowerProfileInfoChanged(android.hardware.usb.ParcelableUsbPort p0, android.hardware.usb.UsbPortStatus p1) {}
    }

    @android.annotation.SystemApi
    public static interface PowerProfileInfoListener {
        public void onPowerProfileInfoChanged(android.hardware.usb.UsbPort p0, android.hardware.usb.UsbPortStatus p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbFunctionMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbGadgetHalVersion {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsbHalVersion {
    }
}
