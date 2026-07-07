package android.os;

public interface IVibratorManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IVibratorManagerService";
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public int getCapabilities() throws android.os.RemoteException;
    public int[] getVibratorIds() throws android.os.RemoteException;
    public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException;
    public boolean isVibrating(int p0) throws android.os.RemoteException;
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException;
    public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException;
    public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException;
    public void startHapticGeneratorSession(int p0, android.os.vibrator.HapticGeneratorSession.Config p1, android.os.vibrator.IHapticGeneratorSessionCallback p2) throws android.os.RemoteException;
    public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException;
    public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException;

    public static class Default implements android.os.IVibratorManagerService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public int getCapabilities() throws android.os.RemoteException { return 0; }
        public int[] getVibratorIds() throws android.os.RemoteException { return null; }
        public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
        public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
        public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException {}
        public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException {}
        public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
        public void startHapticGeneratorSession(int p0, android.os.vibrator.HapticGeneratorSession.Config p1, android.os.vibrator.IHapticGeneratorSessionCallback p2) throws android.os.RemoteException {}
        public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException { return null; }
        public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVibratorManagerService {
        static final java.lang.String[] PERMISSIONS_startVendorVibrationSession = null;
        static final int TRANSACTION_cancelVibrate = 9;
        static final int TRANSACTION_getCapabilities = 2;
        static final int TRANSACTION_getVibratorIds = 1;
        static final int TRANSACTION_getVibratorInfo = 3;
        static final int TRANSACTION_isVibrating = 4;
        static final int TRANSACTION_performHapticFeedback = 10;
        static final int TRANSACTION_performHapticFeedbackForInputDevice = 11;
        static final int TRANSACTION_registerVibratorStateListener = 5;
        static final int TRANSACTION_setAlwaysOnEffect = 7;
        static final int TRANSACTION_startHapticGeneratorSession = 13;
        static final int TRANSACTION_startVendorVibrationSession = 12;
        static final int TRANSACTION_unregisterVibratorStateListener = 6;
        static final int TRANSACTION_vibrate = 8;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.IVibratorManagerService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void isVibrating_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerVibratorStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void startHapticGeneratorSession_enforcePermission() throws java.lang.SecurityException {}
        protected void startVendorVibrationSession_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterVibratorStateListener_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.os.IVibratorManagerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public int getCapabilities() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getVibratorIds() throws android.os.RemoteException { return null; }
            public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
            public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
            public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException {}
            public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException {}
            public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
            public void startHapticGeneratorSession(int p0, android.os.vibrator.HapticGeneratorSession.Config p1, android.os.vibrator.IHapticGeneratorSessionCallback p2) throws android.os.RemoteException {}
            public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException { return null; }
            public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException {}
        }
    }
}
