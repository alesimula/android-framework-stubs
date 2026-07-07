package android.service.messaging;

public interface IAlternativeMessageTransportService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.messaging.IAlternativeMessageTransportService";
    public void upgradeMessage(android.net.Uri p0, android.service.messaging.IMessageUpgradeCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.messaging.IAlternativeMessageTransportService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void upgradeMessage(android.net.Uri p0, android.service.messaging.IMessageUpgradeCallback p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.messaging.IAlternativeMessageTransportService {
        static final int TRANSACTION_upgradeMessage = 1;
        public Stub() { super(); }
        public static android.service.messaging.IAlternativeMessageTransportService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.messaging.IAlternativeMessageTransportService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void upgradeMessage(android.net.Uri p0, android.service.messaging.IMessageUpgradeCallback p1) throws android.os.RemoteException {}
        }
    }
}
