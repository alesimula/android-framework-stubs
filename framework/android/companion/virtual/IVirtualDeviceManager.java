package android.companion.virtual;

public interface IVirtualDeviceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDeviceManager";
    public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException;
    public android.os.IBinder getAudioFocusEnvironment(int p0) throws android.os.RemoteException;
    public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException;
    public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException;
    public android.companion.virtual.computercontrol.IComputerControlConsentManager getComputerControlConsentManager() throws android.os.RemoteException;
    public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException;
    public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException;
    public int getDevicePolicyForDisplayId(int p0, int p1) throws android.os.RemoteException;
    public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException;
    public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException;
    public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException;
    public boolean isComputerControlAvailable(android.content.AttributionSource p0) throws android.os.RemoteException;
    public boolean isPackageApprovedToRunComputerControlAutomation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isPackageTargetableForComputerControlAutomation(java.lang.String p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException;
    public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException;
    public void playSoundEffect(int p0, int p1) throws android.os.RemoteException;
    public void registerAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException;
    public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException;
    public void requestComputerControlSession(android.app.IApplicationThread p0, android.content.AttributionSource p1, android.companion.virtual.computercontrol.ComputerControlSessionParams p2, android.companion.virtual.computercontrol.IComputerControlSessionCallback p3) throws android.os.RemoteException;
    public void unregisterAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException;
    public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException;
    public boolean validateAutomatedAppLaunchWarningIntent(android.content.Intent p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDeviceManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException { return null; }
        public android.os.IBinder getAudioFocusEnvironment(int p0) throws android.os.RemoteException { return null; }
        public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
        public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
        public android.companion.virtual.computercontrol.IComputerControlConsentManager getComputerControlConsentManager() throws android.os.RemoteException { return null; }
        public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
        public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
        public int getDevicePolicyForDisplayId(int p0, int p1) throws android.os.RemoteException { return 0; }
        public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
        public boolean isComputerControlAvailable(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
        public boolean isPackageApprovedToRunComputerControlAutomation(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isPackageTargetableForComputerControlAutomation(java.lang.String p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
        public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
        public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException { return false; }
        public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
        public void registerAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException {}
        public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
        public void requestComputerControlSession(android.app.IApplicationThread p0, android.content.AttributionSource p1, android.companion.virtual.computercontrol.ComputerControlSessionParams p2, android.companion.virtual.computercontrol.IComputerControlSessionCallback p3) throws android.os.RemoteException {}
        public void unregisterAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException {}
        public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
        public boolean validateAutomatedAppLaunchWarningIntent(android.content.Intent p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDeviceManager {
        static final int TRANSACTION_createVirtualDevice = 1;
        static final int TRANSACTION_getAllPersistentDeviceIds = 21;
        static final int TRANSACTION_getAudioFocusEnvironment = 22;
        static final int TRANSACTION_getAudioPlaybackSessionId = 17;
        static final int TRANSACTION_getAudioRecordingSessionId = 18;
        static final int TRANSACTION_getComputerControlConsentManager = 3;
        static final int TRANSACTION_getDeviceIdForDisplayId = 12;
        static final int TRANSACTION_getDevicePolicy = 15;
        static final int TRANSACTION_getDevicePolicyForDisplayId = 16;
        static final int TRANSACTION_getDisplayNameForPersistentDeviceId = 13;
        static final int TRANSACTION_getVirtualDevice = 5;
        static final int TRANSACTION_getVirtualDevices = 4;
        static final int TRANSACTION_isComputerControlAvailable = 11;
        static final int TRANSACTION_isPackageApprovedToRunComputerControlAutomation = 23;
        static final int TRANSACTION_isPackageTargetableForComputerControlAutomation = 24;
        static final int TRANSACTION_isValidVirtualDeviceId = 14;
        static final int TRANSACTION_isVirtualDeviceOwnedMirrorDisplay = 20;
        static final int TRANSACTION_playSoundEffect = 19;
        static final int TRANSACTION_registerAutomatedPackageListener = 8;
        static final int TRANSACTION_registerVirtualDeviceListener = 6;
        static final int TRANSACTION_requestComputerControlSession = 2;
        static final int TRANSACTION_unregisterAutomatedPackageListener = 9;
        static final int TRANSACTION_unregisterVirtualDeviceListener = 7;
        static final int TRANSACTION_validateAutomatedAppLaunchWarningIntent = 10;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.companion.virtual.IVirtualDeviceManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void createVirtualDevice_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isPackageApprovedToRunComputerControlAutomation_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.IVirtualDeviceManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.companion.virtual.IVirtualDevice createVirtualDevice(android.os.IBinder p0, android.content.AttributionSource p1, int p2, android.companion.virtual.VirtualDeviceParams p3, android.companion.virtual.IVirtualDeviceActivityListener p4, android.companion.virtual.IVirtualDeviceSoundEffectListener p5) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getAllPersistentDeviceIds() throws android.os.RemoteException { return null; }
            public android.os.IBinder getAudioFocusEnvironment(int p0) throws android.os.RemoteException { return null; }
            public int getAudioPlaybackSessionId(int p0) throws android.os.RemoteException { return 0; }
            public int getAudioRecordingSessionId(int p0) throws android.os.RemoteException { return 0; }
            public android.companion.virtual.computercontrol.IComputerControlConsentManager getComputerControlConsentManager() throws android.os.RemoteException { return null; }
            public int getDeviceIdForDisplayId(int p0) throws android.os.RemoteException { return 0; }
            public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
            public int getDevicePolicyForDisplayId(int p0, int p1) throws android.os.RemoteException { return 0; }
            public java.lang.CharSequence getDisplayNameForPersistentDeviceId(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.companion.virtual.VirtualDevice getVirtualDevice(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.companion.virtual.VirtualDevice> getVirtualDevices() throws android.os.RemoteException { return null; }
            public boolean isComputerControlAvailable(android.content.AttributionSource p0) throws android.os.RemoteException { return false; }
            public boolean isPackageApprovedToRunComputerControlAutomation(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isPackageTargetableForComputerControlAutomation(java.lang.String p0, int p1, android.content.AttributionSource p2) throws android.os.RemoteException { return false; }
            public boolean isValidVirtualDeviceId(int p0) throws android.os.RemoteException { return false; }
            public boolean isVirtualDeviceOwnedMirrorDisplay(int p0) throws android.os.RemoteException { return false; }
            public void playSoundEffect(int p0, int p1) throws android.os.RemoteException {}
            public void registerAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException {}
            public void registerVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
            public void requestComputerControlSession(android.app.IApplicationThread p0, android.content.AttributionSource p1, android.companion.virtual.computercontrol.ComputerControlSessionParams p2, android.companion.virtual.computercontrol.IComputerControlSessionCallback p3) throws android.os.RemoteException {}
            public void unregisterAutomatedPackageListener(android.companion.virtual.computercontrol.IAutomatedPackageListener p0) throws android.os.RemoteException {}
            public void unregisterVirtualDeviceListener(android.companion.virtual.IVirtualDeviceListener p0) throws android.os.RemoteException {}
            public boolean validateAutomatedAppLaunchWarningIntent(android.content.Intent p0) throws android.os.RemoteException { return false; }
        }
    }
}
