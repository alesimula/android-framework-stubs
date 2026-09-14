package android.service.personalcontext.embedded;

public interface IRemoteViewsReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.personalcontext.embedded.IRemoteViewsReceiver";
    public void onReceiveRemoteViews(android.widget.RemoteViews p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.personalcontext.embedded.IRemoteViewsReceiver {
        static final int TRANSACTION_onReceiveRemoteViews = 1;
        public Stub() { super(); }
        public static android.service.personalcontext.embedded.IRemoteViewsReceiver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.personalcontext.embedded.IRemoteViewsReceiver {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onReceiveRemoteViews(android.widget.RemoteViews p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.personalcontext.embedded.IRemoteViewsReceiver {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onReceiveRemoteViews(android.widget.RemoteViews p0) throws android.os.RemoteException {}
    }
}
