package android.hardware.biometrics.fingerprint;

public interface IFingerprint extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "0a40e5aa0a942c5a4e577ffa6ade668ac294e269";
    public static final int VERSION = 5;
    public android.hardware.biometrics.fingerprint.ISession createSession(int p0, int p1, android.hardware.biometrics.fingerprint.ISessionCallback p2) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException;

    public static class Default implements android.hardware.biometrics.fingerprint.IFingerprint {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.hardware.biometrics.fingerprint.ISession createSession(int p0, int p1, android.hardware.biometrics.fingerprint.ISessionCallback p2) throws android.os.RemoteException { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.IFingerprint {
        static final int TRANSACTION_createSession = 2;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getSensorProps = 1;
        public Stub() { super(); }
        public static android.hardware.biometrics.fingerprint.IFingerprint asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.biometrics.fingerprint.IFingerprint {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.hardware.biometrics.fingerprint.ISession createSession(int p0, int p1, android.hardware.biometrics.fingerprint.ISessionCallback p2) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException { return null; }
        }
    }
}
