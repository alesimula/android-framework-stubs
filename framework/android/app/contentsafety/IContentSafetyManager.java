package android.app.contentsafety;

public interface IContentSafetyManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.contentsafety.IContentSafetyManager";
    public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException;
    public java.lang.String getRemoteSandboxedServicePackageName() throws android.os.RemoteException;
    public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException;
    public java.lang.String getRemoteSettingsServicePackageName() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException;
    @java.lang.Deprecated
    public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException;
    public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException;
    public void requestIsFeatureEnabled(int p0, com.android.internal.infra.AndroidFuture p1, android.app.contentsafety.IIsFeatureEnabledCallback p2) throws android.os.RemoteException;

    public static class Default implements android.app.contentsafety.IContentSafetyManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException {}
        public java.lang.String getRemoteSandboxedServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException { return null; }
        public java.lang.String getRemoteSettingsServicePackageName() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException { return null; }
        @java.lang.Deprecated
        public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException {}
        public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException {}
        public void requestIsFeatureEnabled(int p0, com.android.internal.infra.AndroidFuture p1, android.app.contentsafety.IIsFeatureEnabledCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contentsafety.IContentSafetyManager {
        static final int TRANSACTION_cancelClassification = 8;
        static final int TRANSACTION_getRemoteSandboxedServicePackageName = 5;
        static final int TRANSACTION_getRemoteServicePackageName = 3;
        static final int TRANSACTION_getRemoteSettingsServicePackageName = 6;
        static final int TRANSACTION_getSupportedMimeTypes = 7;
        static final int TRANSACTION_requestCheckContent = 2;
        static final int TRANSACTION_requestClassification = 9;
        static final int TRANSACTION_requestIsFeatureEnabled = 4;
        public Stub() { super(); }
        public static android.app.contentsafety.IContentSafetyManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.contentsafety.IContentSafetyManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelClassification(java.util.List<android.content.LocusId> p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getRemoteSandboxedServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getRemoteServicePackageName() throws android.os.RemoteException { return null; }
            public java.lang.String getRemoteSettingsServicePackageName() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getSupportedMimeTypes() throws android.os.RemoteException { return null; }
            @java.lang.Deprecated
            public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException {}
            public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException {}
            public void requestIsFeatureEnabled(int p0, com.android.internal.infra.AndroidFuture p1, android.app.contentsafety.IIsFeatureEnabledCallback p2) throws android.os.RemoteException {}
        }
    }
}
