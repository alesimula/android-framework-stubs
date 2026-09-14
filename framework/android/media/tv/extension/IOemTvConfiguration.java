package android.media.tv.extension;

public interface IOemTvConfiguration extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.IOemTvConfiguration";
    public static final java.lang.String FEATURE_ATV_SCAN = "atv_scan";
    public static final java.lang.String FEATURE_BLUE_MUTE = "blue_mute";
    public static final java.lang.String FEATURE_CI = "ci";
    public static final java.lang.String FEATURE_GINGA = "ginga";
    public static final java.lang.String FEATURE_HBBTV = "hbbtv";
    public static final java.lang.String FEATURE_OAD = "oad";
    public static final java.lang.String FEATURE_PVR = "pvr";
    public static final java.lang.String FEATURE_PVR_ACTIVE_ACTIVITY = "pvr_active_activity";
    public static final java.lang.String FEATURE_PVR_ACTIVE_CLASS = "pvr_active_class";
    public static final java.lang.String FEATURE_PVR_ACTIVE_ENABLE = "pvr_active_enable";
    public static final java.lang.String FEATURE_TELETEXT_ENABLE_COLUMN = "teletext_enable_column";
    public static final java.lang.String FEATURE_TIMESHIFT = "timeshift";
    public static final java.lang.String FEATURE_VIRTUAL_RCU = "virtual_rcu";
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
