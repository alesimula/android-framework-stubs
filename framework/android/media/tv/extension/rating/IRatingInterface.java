package android.media.tv.extension.rating;

public interface IRatingInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.rating.IRatingInterface";
    public java.util.List<android.media.tv.extension.rating.RatingRegionInfo> getRRTRatingInfo() throws android.os.RemoteException;
    public void registerRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException;
    public boolean setRRTRatingInfo(java.util.List<android.media.tv.extension.rating.RatingRegionInfo> p0) throws android.os.RemoteException;
    public boolean setResetRrt5() throws android.os.RemoteException;
    public void unregisterRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.rating.IRatingInterface {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public java.util.List<android.media.tv.extension.rating.RatingRegionInfo> getRRTRatingInfo() throws android.os.RemoteException { return null; }
        public void registerRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException {}
        public boolean setRRTRatingInfo(java.util.List<android.media.tv.extension.rating.RatingRegionInfo> p0) throws android.os.RemoteException { return false; }
        public boolean setResetRrt5() throws android.os.RemoteException { return false; }
        public void unregisterRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.rating.IRatingInterface {
        static final int TRANSACTION_getRRTRatingInfo = 1;
        static final int TRANSACTION_registerRrtUpdateListener = 4;
        static final int TRANSACTION_setRRTRatingInfo = 2;
        static final int TRANSACTION_setResetRrt5 = 3;
        static final int TRANSACTION_unregisterRrtUpdateListener = 5;
        public Stub() { super(); }
        public static android.media.tv.extension.rating.IRatingInterface asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.rating.IRatingInterface {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.media.tv.extension.rating.RatingRegionInfo> getRRTRatingInfo() throws android.os.RemoteException { return null; }
            public void registerRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException {}
            public boolean setRRTRatingInfo(java.util.List<android.media.tv.extension.rating.RatingRegionInfo> p0) throws android.os.RemoteException { return false; }
            public boolean setResetRrt5() throws android.os.RemoteException { return false; }
            public void unregisterRrtUpdateListener(android.media.tv.extension.rating.IRatingUpdateListener p0) throws android.os.RemoteException {}
        }
    }
}
