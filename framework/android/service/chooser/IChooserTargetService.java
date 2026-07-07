package android.service.chooser;

public interface IChooserTargetService extends android.os.IInterface {
    public void getChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1, android.service.chooser.IChooserTargetResult p2) throws android.os.RemoteException;

    public static class Default implements android.service.chooser.IChooserTargetService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1, android.service.chooser.IChooserTargetResult p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.chooser.IChooserTargetService {
        public static final java.lang.String DESCRIPTOR = "android.service.chooser.IChooserTargetService";
        static final int TRANSACTION_getChooserTargets = 1;
        public Stub() { super(); }
        public static android.service.chooser.IChooserTargetService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.chooser.IChooserTargetService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getChooserTargets(android.content.ComponentName p0, android.content.IntentFilter p1, android.service.chooser.IChooserTargetResult p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
