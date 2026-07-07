package android.media.tv.extension;

public interface IOemTvConfiguration extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.IOemTvConfiguration";
    public java.lang.String getStringConfig(java.lang.String p0) throws android.os.RemoteException;
    public boolean isFeatureEnabled(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.IOemTvConfiguration {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getStringConfig(java.lang.String p0) throws android.os.RemoteException { return null; }
        public boolean isFeatureEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.IOemTvConfiguration {
        static final int TRANSACTION_getStringConfig = 2;
        static final int TRANSACTION_isFeatureEnabled = 1;
        public Stub() { super(); }
        public static android.media.tv.extension.IOemTvConfiguration asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.IOemTvConfiguration {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getStringConfig(java.lang.String p0) throws android.os.RemoteException { return null; }
            public boolean isFeatureEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        }
    }
}
