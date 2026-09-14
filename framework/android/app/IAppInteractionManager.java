package android.app;

public interface IAppInteractionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IAppInteractionManager";
    public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException;
    public void createSession(int p0, java.lang.String p1, java.lang.String[] p2, int p3, android.app.IAppInteractionSessionCreateCallback p4) throws android.os.RemoteException;
    public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public android.app.AppInteractionAccessInfo getAccessInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public java.util.Map getInteractorAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getInteractorPackageNames(int p0) throws android.os.RemoteException;
    public java.util.Map getTargetAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException;
    public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException;

    public static class Default implements android.app.IAppInteractionManager {
        public Default() {}
        public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void createSession(int p0, java.lang.String p1, java.lang.String[] p2, int p3, android.app.IAppInteractionSessionCreateCallback p4) throws android.os.RemoteException {}
        public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public android.app.AppInteractionAccessInfo getAccessInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public java.util.Map getInteractorAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getInteractorPackageNames(int p0) throws android.os.RemoteException { return null; }
        public java.util.Map getTargetAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
        public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAppInteractionManager {
        static final int TRANSACTION_addOnAccessChangedListener = 7;
        static final int TRANSACTION_createSession = 9;
        static final int TRANSACTION_getAccessFlags = 1;
        static final int TRANSACTION_getAccessInfo = 6;
        static final int TRANSACTION_getInteractorAccessFlags = 4;
        static final int TRANSACTION_getInteractorPackageNames = 3;
        static final int TRANSACTION_getTargetAccessFlags = 5;
        static final int TRANSACTION_removeOnAccessChangedListener = 8;
        static final int TRANSACTION_updateAccessFlags = 2;
        public Stub() { super(); }
        public static android.app.IAppInteractionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IAppInteractionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void createSession(int p0, java.lang.String p1, java.lang.String[] p2, int p3, android.app.IAppInteractionSessionCreateCallback p4) throws android.os.RemoteException {}
            public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public android.app.AppInteractionAccessInfo getAccessInfo(java.lang.String p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public java.util.Map getInteractorAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getInteractorPackageNames(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.Map getTargetAccessFlags(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
            public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException { return false; }
        }
    }
}
