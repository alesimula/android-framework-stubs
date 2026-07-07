package android.hardware.usb;

public interface IUsbManager extends android.os.IInterface {
    public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException;
    public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException;
    public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException;
    public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException;
    public long getCurrentFunctions() throws android.os.RemoteException;
    public int getCurrentUsbSpeed() throws android.os.RemoteException;
    public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException;
    public int getGadgetHalVersion() throws android.os.RemoteException;
    public int getMaxPacketSize(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPackagesWithDevicePermission(android.hardware.usb.UsbDevice p0) throws android.os.RemoteException;
    public int getPciTunnelingControlAllowedStatus() throws android.os.RemoteException;
    public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException;
    public long getScreenUnlockedFunctions() throws android.os.RemoteException;
    public int getUsbHalVersion() throws android.os.RemoteException;
    public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void grantDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException;
    public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasAccessoryPermissionWithIdentity(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasDevicePermissionWithIdentity(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException;
    public boolean isAccessoryFfsEnabled() throws android.os.RemoteException;
    public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isModeChangeSupported(java.lang.String p0) throws android.os.RemoteException;
    public boolean isPciTunnelingEnabled() throws android.os.RemoteException;
    public boolean isUvcGadgetSupportEnabled() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openAccessoryForInputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.usb.AoaConnectionInputHandle openAccessoryForInputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openAccessoryForOutputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.usb.AoaConnectionOutputHandle openAccessoryForOutputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean registerForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException;
    public boolean registerForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException;
    public boolean registerForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException;
    public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public void resetUsbGadget() throws android.os.RemoteException;
    public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException;
    public void revokeDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setAuthorizationResponse(android.hardware.usb.UsbDevice p0, int p1, boolean p2) throws android.os.RemoteException;
    public void setCurrentFunction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public void setCurrentFunctions(long p0, int p1) throws android.os.RemoteException;
    public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setPciTunnelingEnabled(boolean p0) throws android.os.RemoteException;
    public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException;
    public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException;
    public void unregisterForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException;
    public void unregisterForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException;
    public void unregisterForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbManager {
        public Default() {}
        public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException {}
        public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException { return false; }
        public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException { return null; }
        public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException { return null; }
        public long getCurrentFunctions() throws android.os.RemoteException { return 0L; }
        public int getCurrentUsbSpeed() throws android.os.RemoteException { return 0; }
        public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException {}
        public int getGadgetHalVersion() throws android.os.RemoteException { return 0; }
        public int getMaxPacketSize(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return 0; }
        public java.util.List<java.lang.String> getPackagesWithDevicePermission(android.hardware.usb.UsbDevice p0) throws android.os.RemoteException { return null; }
        public int getPciTunnelingControlAllowedStatus() throws android.os.RemoteException { return 0; }
        public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException { return null; }
        public long getScreenUnlockedFunctions() throws android.os.RemoteException { return 0L; }
        public int getUsbHalVersion() throws android.os.RemoteException { return 0; }
        public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void grantDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
        public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasAccessoryPermissionWithIdentity(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasDevicePermissionWithIdentity(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public boolean isAccessoryFfsEnabled() throws android.os.RemoteException { return false; }
        public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isModeChangeSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isPciTunnelingEnabled() throws android.os.RemoteException { return false; }
        public boolean isUvcGadgetSupportEnabled() throws android.os.RemoteException { return false; }
        public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openAccessoryForInputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.hardware.usb.AoaConnectionInputHandle openAccessoryForInputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openAccessoryForOutputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.hardware.usb.AoaConnectionOutputHandle openAccessoryForOutputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public boolean registerForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException { return false; }
        public boolean registerForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException { return false; }
        public boolean registerForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException { return false; }
        public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public void resetUsbGadget() throws android.os.RemoteException {}
        public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
        public void revokeDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setAuthorizationResponse(android.hardware.usb.UsbDevice p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void setCurrentFunction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
        public void setCurrentFunctions(long p0, int p1) throws android.os.RemoteException {}
        public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setPciTunnelingEnabled(boolean p0) throws android.os.RemoteException {}
        public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException {}
        public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException {}
        public void unregisterForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException {}
        public void unregisterForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException {}
        public void unregisterForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbManager";
        static final int TRANSACTION_addAccessoryPackagesToPreferenceDenied = 14;
        static final int TRANSACTION_addDevicePackagesToPreferenceDenied = 13;
        static final int TRANSACTION_clearDefaults = 29;
        static final int TRANSACTION_enableContaminantDetection = 50;
        static final int TRANSACTION_enableLimitPowerTransfer = 49;
        static final int TRANSACTION_enableUsbData = 41;
        static final int TRANSACTION_enableUsbDataWhileDocked = 42;
        static final int TRANSACTION_getControlFd = 44;
        static final int TRANSACTION_getCurrentAccessory = 3;
        static final int TRANSACTION_getCurrentFunctions = 34;
        static final int TRANSACTION_getCurrentUsbSpeed = 35;
        static final int TRANSACTION_getDeviceList = 1;
        static final int TRANSACTION_getGadgetHalVersion = 36;
        static final int TRANSACTION_getMaxPacketSize = 7;
        static final int TRANSACTION_getPackagesWithDevicePermission = 26;
        static final int TRANSACTION_getPciTunnelingControlAllowedStatus = 56;
        static final int TRANSACTION_getPortStatus = 46;
        static final int TRANSACTION_getPorts = 45;
        static final int TRANSACTION_getScreenUnlockedFunctions = 38;
        static final int TRANSACTION_getUsbHalVersion = 43;
        static final int TRANSACTION_grantAccessoryPermission = 24;
        static final int TRANSACTION_grantDevicePermission = 23;
        static final int TRANSACTION_hasAccessoryPermission = 19;
        static final int TRANSACTION_hasAccessoryPermissionWithIdentity = 20;
        static final int TRANSACTION_hasDefaults = 28;
        static final int TRANSACTION_hasDevicePermission = 17;
        static final int TRANSACTION_hasDevicePermissionWithIdentity = 18;
        static final int TRANSACTION_isAccessoryFfsEnabled = 10;
        static final int TRANSACTION_isFunctionEnabled = 30;
        static final int TRANSACTION_isModeChangeSupported = 47;
        static final int TRANSACTION_isPciTunnelingEnabled = 55;
        static final int TRANSACTION_isUvcGadgetSupportEnabled = 31;
        static final int TRANSACTION_openAccessory = 4;
        static final int TRANSACTION_openAccessoryForInputStream = 5;
        static final int TRANSACTION_openAccessoryForInputStreamEncapsulated = 9;
        static final int TRANSACTION_openAccessoryForOutputStream = 6;
        static final int TRANSACTION_openAccessoryForOutputStreamEncapsulated = 8;
        static final int TRANSACTION_openDevice = 2;
        static final int TRANSACTION_registerForBc12TypeEvents = 57;
        static final int TRANSACTION_registerForDisplayPortEvents = 52;
        static final int TRANSACTION_registerForPowerProfileInfoEvents = 59;
        static final int TRANSACTION_removeAccessoryPackagesFromPreferenceDenied = 16;
        static final int TRANSACTION_removeDevicePackagesFromPreferenceDenied = 15;
        static final int TRANSACTION_requestAccessoryPermission = 22;
        static final int TRANSACTION_requestDevicePermission = 21;
        static final int TRANSACTION_resetUsbGadget = 39;
        static final int TRANSACTION_resetUsbPort = 40;
        static final int TRANSACTION_revokeDevicePermission = 25;
        static final int TRANSACTION_setAccessoryPackage = 12;
        static final int TRANSACTION_setAuthorizationResponse = 27;
        static final int TRANSACTION_setCurrentFunction = 33;
        static final int TRANSACTION_setCurrentFunctions = 32;
        static final int TRANSACTION_setDevicePackage = 11;
        static final int TRANSACTION_setPciTunnelingEnabled = 54;
        static final int TRANSACTION_setPortRoles = 48;
        static final int TRANSACTION_setScreenUnlockedFunctions = 37;
        static final int TRANSACTION_setUsbDeviceConnectionHandler = 51;
        static final int TRANSACTION_unregisterForBc12TypeEvents = 58;
        static final int TRANSACTION_unregisterForDisplayPortEvents = 53;
        static final int TRANSACTION_unregisterForPowerProfileInfoEvents = 60;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.hardware.usb.IUsbManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void getControlFd_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentFunctions_enforcePermission() throws java.lang.SecurityException {}
        protected void getCurrentUsbSpeed_enforcePermission() throws java.lang.SecurityException {}
        protected void getGadgetHalVersion_enforcePermission() throws java.lang.SecurityException {}
        protected void getPackagesWithDevicePermission_enforcePermission() throws java.lang.SecurityException {}
        protected void getPciTunnelingControlAllowedStatus_enforcePermission() throws java.lang.SecurityException {}
        protected void getPorts_enforcePermission() throws java.lang.SecurityException {}
        protected void getScreenUnlockedFunctions_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getUsbHalVersion_enforcePermission() throws java.lang.SecurityException {}
        protected void grantAccessoryPermission_enforcePermission() throws java.lang.SecurityException {}
        protected void grantDevicePermission_enforcePermission() throws java.lang.SecurityException {}
        protected void hasAccessoryPermissionWithIdentity_enforcePermission() throws java.lang.SecurityException {}
        protected void hasDevicePermissionWithIdentity_enforcePermission() throws java.lang.SecurityException {}
        protected void isModeChangeSupported_enforcePermission() throws java.lang.SecurityException {}
        protected void isPciTunnelingEnabled_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void resetUsbGadget_enforcePermission() throws java.lang.SecurityException {}
        protected void revokeDevicePermission_enforcePermission() throws java.lang.SecurityException {}
        protected void setAuthorizationResponse_enforcePermission() throws java.lang.SecurityException {}
        protected void setCurrentFunctions_enforcePermission() throws java.lang.SecurityException {}
        protected void setPciTunnelingEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void setScreenUnlockedFunctions_enforcePermission() throws java.lang.SecurityException {}
        protected void setUsbDeviceConnectionHandler_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.hardware.usb.IUsbManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException {}
            public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException { return false; }
            public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException { return null; }
            public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException { return null; }
            public long getCurrentFunctions() throws android.os.RemoteException { return 0L; }
            public int getCurrentUsbSpeed() throws android.os.RemoteException { return 0; }
            public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException {}
            public int getGadgetHalVersion() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getMaxPacketSize(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return 0; }
            public java.util.List<java.lang.String> getPackagesWithDevicePermission(android.hardware.usb.UsbDevice p0) throws android.os.RemoteException { return null; }
            public int getPciTunnelingControlAllowedStatus() throws android.os.RemoteException { return 0; }
            public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException { return null; }
            public long getScreenUnlockedFunctions() throws android.os.RemoteException { return 0L; }
            public int getUsbHalVersion() throws android.os.RemoteException { return 0; }
            public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void grantDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, boolean p3) throws android.os.RemoteException {}
            public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasAccessoryPermissionWithIdentity(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasDevicePermissionWithIdentity(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public boolean isAccessoryFfsEnabled() throws android.os.RemoteException { return false; }
            public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isModeChangeSupported(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isPciTunnelingEnabled() throws android.os.RemoteException { return false; }
            public boolean isUvcGadgetSupportEnabled() throws android.os.RemoteException { return false; }
            public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openAccessoryForInputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.hardware.usb.AoaConnectionInputHandle openAccessoryForInputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openAccessoryForOutputStream(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.hardware.usb.AoaConnectionOutputHandle openAccessoryForOutputStreamEncapsulated(android.hardware.usb.UsbAccessory p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public boolean registerForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException { return false; }
            public boolean registerForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException { return false; }
            public boolean registerForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException { return false; }
            public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public void resetUsbGadget() throws android.os.RemoteException {}
            public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
            public void revokeDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setAuthorizationResponse(android.hardware.usb.UsbDevice p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void setCurrentFunction(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException {}
            public void setCurrentFunctions(long p0, int p1) throws android.os.RemoteException {}
            public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setPciTunnelingEnabled(boolean p0) throws android.os.RemoteException {}
            public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException {}
            public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException {}
            public void unregisterForBc12TypeEvents(android.hardware.usb.IBc12TypeListener p0) throws android.os.RemoteException {}
            public void unregisterForDisplayPortEvents(android.hardware.usb.IDisplayPortAltModeInfoListener p0) throws android.os.RemoteException {}
            public void unregisterForPowerProfileInfoEvents(android.hardware.usb.IPowerProfileInfoListener p0) throws android.os.RemoteException {}
        }
    }
}
