package android.view;

public interface IRemoteAnimationRunner extends android.os.IInterface {
    public void onAnimationCancelled() throws android.os.RemoteException;
    public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException;

    public static class Default implements android.view.IRemoteAnimationRunner {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onAnimationCancelled() throws android.os.RemoteException {}
        public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IRemoteAnimationRunner {
        public static final java.lang.String DESCRIPTOR = "android.view.IRemoteAnimationRunner";
        static final int TRANSACTION_onAnimationCancelled = 2;
        static final int TRANSACTION_onAnimationStart = 1;
        public Stub() { super(); }
        public static android.view.IRemoteAnimationRunner asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IRemoteAnimationRunner {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onAnimationCancelled() throws android.os.RemoteException {}
            public void onAnimationStart(int p0, android.view.RemoteAnimationTarget[] p1, android.view.RemoteAnimationTarget[] p2, android.view.RemoteAnimationTarget[] p3, android.view.IRemoteAnimationFinishedCallback p4) throws android.os.RemoteException {}
        }
    }
}
