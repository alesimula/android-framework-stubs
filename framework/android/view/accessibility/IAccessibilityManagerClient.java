package android.view.accessibility;

public interface IAccessibilityManagerClient extends android.os.IInterface {
    public void notifyServicesStateChanged(long p0) throws android.os.RemoteException;
    public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException;
    public void setRelevantEventTypes(int p0) throws android.os.RemoteException;
    public void setState(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityManagerClient {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void notifyServicesStateChanged(long p0) throws android.os.RemoteException {}
        public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
        public void setRelevantEventTypes(int p0) throws android.os.RemoteException {}
        public void setState(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityManagerClient {
        public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityManagerClient";
        static final int TRANSACTION_notifyServicesStateChanged = 2;
        static final int TRANSACTION_setFocusAppearance = 4;
        static final int TRANSACTION_setRelevantEventTypes = 3;
        static final int TRANSACTION_setState = 1;
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityManagerClient asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.accessibility.IAccessibilityManagerClient {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyServicesStateChanged(long p0) throws android.os.RemoteException {}
            public void setFocusAppearance(int p0, int p1) throws android.os.RemoteException {}
            public void setRelevantEventTypes(int p0) throws android.os.RemoteException {}
            public void setState(int p0) throws android.os.RemoteException {}
        }
    }
}
