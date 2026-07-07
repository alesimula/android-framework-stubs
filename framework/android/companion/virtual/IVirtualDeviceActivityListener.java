package android.companion.virtual;

public interface IVirtualDeviceActivityListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDeviceActivityListener";
    public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) throws android.os.RemoteException;
    public void onActivityLaunchRequested(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void onAuthenticationPrompt(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void onDisplayEmpty(int p0) throws android.os.RemoteException;
    public void onSecureWindowHidden(int p0) throws android.os.RemoteException;
    public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDeviceActivityListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) throws android.os.RemoteException {}
        public void onActivityLaunchRequested(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void onAuthenticationPrompt(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onDisplayEmpty(int p0) throws android.os.RemoteException {}
        public void onSecureWindowHidden(int p0) throws android.os.RemoteException {}
        public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDeviceActivityListener {
        static final int TRANSACTION_onActivityLaunchBlocked = 3;
        static final int TRANSACTION_onActivityLaunchRequested = 6;
        static final int TRANSACTION_onAuthenticationPrompt = 7;
        static final int TRANSACTION_onDisplayEmpty = 2;
        static final int TRANSACTION_onSecureWindowHidden = 5;
        static final int TRANSACTION_onSecureWindowShown = 4;
        static final int TRANSACTION_onTopActivityChanged = 1;
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDeviceActivityListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.IVirtualDeviceActivityListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onActivityLaunchBlocked(int p0, android.content.ComponentName p1, android.os.UserHandle p2, android.content.IntentSender p3) throws android.os.RemoteException {}
            public void onActivityLaunchRequested(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void onAuthenticationPrompt(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onDisplayEmpty(int p0) throws android.os.RemoteException {}
            public void onSecureWindowHidden(int p0) throws android.os.RemoteException {}
            public void onSecureWindowShown(int p0, android.content.ComponentName p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        }
    }
}
