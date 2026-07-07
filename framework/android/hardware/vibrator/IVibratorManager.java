package android.hardware.vibrator;

public interface IVibratorManager extends android.os.IInterface {
    public static final int CAP_CONTEXT_AWARE_VIBRATION = 1024;
    public static final int CAP_HAPTIC_GENERATOR = 512;
    public static final int CAP_MIXED_TRIGGER_COMPOSE = 64;
    public static final int CAP_MIXED_TRIGGER_ON = 16;
    public static final int CAP_MIXED_TRIGGER_PERFORM = 32;
    public static final int CAP_PREPARE_COMPOSE = 8;
    public static final int CAP_PREPARE_ON = 2;
    public static final int CAP_PREPARE_PERFORM = 4;
    public static final int CAP_START_SESSIONS = 256;
    public static final int CAP_SYNC = 1;
    public static final int CAP_TRIGGER_CALLBACK = 128;
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "dec155403ea3aa5395b0226de399873712b16082";
    public static final int VERSION = 4;
    public void cancelSynced() throws android.os.RemoteException;
    public void clearSessions() throws android.os.RemoteException;
    public int getCapabilities() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException;
    public int[] getVibratorIds() throws android.os.RemoteException;
    public void prepareSynced(int[] p0) throws android.os.RemoteException;
    public void setVibrationMetadata(android.hardware.vibrator.VibrationMetadata[] p0) throws android.os.RemoteException;
    public android.hardware.vibrator.HapticGeneratorSession startHapticGeneratorSession(int[] p0, android.hardware.vibrator.HapticGeneratorConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException;
    public android.hardware.vibrator.IVibrationSession startSession(int[] p0, android.hardware.vibrator.VibrationSessionConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException;
    public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.vibrator.IVibratorManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelSynced() throws android.os.RemoteException {}
        public void clearSessions() throws android.os.RemoteException {}
        public int getCapabilities() throws android.os.RemoteException { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException { return null; }
        public int[] getVibratorIds() throws android.os.RemoteException { return null; }
        public void prepareSynced(int[] p0) throws android.os.RemoteException {}
        public void setVibrationMetadata(android.hardware.vibrator.VibrationMetadata[] p0) throws android.os.RemoteException {}
        public android.hardware.vibrator.HapticGeneratorSession startHapticGeneratorSession(int[] p0, android.hardware.vibrator.HapticGeneratorConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return null; }
        public android.hardware.vibrator.IVibrationSession startSession(int[] p0, android.hardware.vibrator.VibrationSessionConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return null; }
        public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.vibrator.IVibratorManager {
        static final int TRANSACTION_cancelSynced = 6;
        static final int TRANSACTION_clearSessions = 8;
        static final int TRANSACTION_getCapabilities = 1;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getVibrator = 3;
        static final int TRANSACTION_getVibratorIds = 2;
        static final int TRANSACTION_prepareSynced = 4;
        static final int TRANSACTION_setVibrationMetadata = 10;
        static final int TRANSACTION_startHapticGeneratorSession = 9;
        static final int TRANSACTION_startSession = 7;
        static final int TRANSACTION_triggerSynced = 5;
        public Stub() { super(); }
        public static android.hardware.vibrator.IVibratorManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.vibrator.IVibratorManager {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelSynced() throws android.os.RemoteException {}
            public void clearSessions() throws android.os.RemoteException {}
            public int getCapabilities() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public android.hardware.vibrator.IVibrator getVibrator(int p0) throws android.os.RemoteException { return null; }
            public int[] getVibratorIds() throws android.os.RemoteException { return null; }
            public void prepareSynced(int[] p0) throws android.os.RemoteException {}
            public void setVibrationMetadata(android.hardware.vibrator.VibrationMetadata[] p0) throws android.os.RemoteException {}
            public android.hardware.vibrator.HapticGeneratorSession startHapticGeneratorSession(int[] p0, android.hardware.vibrator.HapticGeneratorConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return null; }
            public android.hardware.vibrator.IVibrationSession startSession(int[] p0, android.hardware.vibrator.VibrationSessionConfig p1, android.hardware.vibrator.IVibratorCallback p2) throws android.os.RemoteException { return null; }
            public void triggerSynced(android.hardware.vibrator.IVibratorCallback p0) throws android.os.RemoteException {}
        }
    }
}
