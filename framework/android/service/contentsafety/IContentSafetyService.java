package android.service.contentsafety;

public interface IContentSafetyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentsafety.IContentSafetyService";
    public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException;
    public void notifySandboxedServiceConnected() throws android.os.RemoteException;
    public void notifySandboxedServiceDisconnected() throws android.os.RemoteException;
    public void notifySettingsServiceConnected() throws android.os.RemoteException;
    public void notifySettingsServiceDisconnected() throws android.os.RemoteException;
    public void ready() throws android.os.RemoteException;
    public void requestGetFeature(int p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.IGetFeatureCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.contentsafety.IContentSafetyService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException { return null; }
        public void notifySandboxedServiceConnected() throws android.os.RemoteException {}
        public void notifySandboxedServiceDisconnected() throws android.os.RemoteException {}
        public void notifySettingsServiceConnected() throws android.os.RemoteException {}
        public void notifySettingsServiceDisconnected() throws android.os.RemoteException {}
        public void ready() throws android.os.RemoteException {}
        public void requestGetFeature(int p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.IGetFeatureCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentsafety.IContentSafetyService {
        static final int TRANSACTION_cancelClassification = 9;
        static final int TRANSACTION_getSupportedMimeTypes = 8;
        static final int TRANSACTION_notifySandboxedServiceConnected = 3;
        static final int TRANSACTION_notifySandboxedServiceDisconnected = 4;
        static final int TRANSACTION_notifySettingsServiceConnected = 6;
        static final int TRANSACTION_notifySettingsServiceDisconnected = 7;
        static final int TRANSACTION_ready = 5;
        static final int TRANSACTION_requestGetFeature = 2;
        public Stub() { super(); }
        public static android.service.contentsafety.IContentSafetyService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentsafety.IContentSafetyService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException { return null; }
            public void notifySandboxedServiceConnected() throws android.os.RemoteException {}
            public void notifySandboxedServiceDisconnected() throws android.os.RemoteException {}
            public void notifySettingsServiceConnected() throws android.os.RemoteException {}
            public void notifySettingsServiceDisconnected() throws android.os.RemoteException {}
            public void ready() throws android.os.RemoteException {}
            public void requestGetFeature(int p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.IGetFeatureCallback p2) throws android.os.RemoteException {}
        }
    }
}
