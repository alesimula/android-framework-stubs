package android.service.contentsafety;

public interface IContentSafetySandboxedService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.contentsafety.IContentSafetySandboxedService";
    @java.lang.Deprecated
    public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException;
    public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException;
    public void requestLoadFeature(android.os.Bundle p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.ILoadFeatureCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.contentsafety.IContentSafetySandboxedService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        @java.lang.Deprecated
        public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException {}
        public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException {}
        public void requestLoadFeature(android.os.Bundle p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.ILoadFeatureCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.contentsafety.IContentSafetySandboxedService {
        static final int TRANSACTION_requestCheckContent = 2;
        static final int TRANSACTION_requestClassification = 4;
        static final int TRANSACTION_requestLoadFeature = 3;
        public Stub() { super(); }
        public static android.service.contentsafety.IContentSafetySandboxedService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.contentsafety.IContentSafetySandboxedService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            @java.lang.Deprecated
            public void requestCheckContent(int p0, android.os.Bundle p1, com.android.internal.infra.AndroidFuture p2, android.app.contentsafety.ICheckContentCallback p3) throws android.os.RemoteException {}
            public void requestClassification(java.util.List<android.app.contentsafety.ClassifiableContent> p0, android.app.contentsafety.ICheckContentCallback p1) throws android.os.RemoteException {}
            public void requestLoadFeature(android.os.Bundle p0, com.android.internal.infra.AndroidFuture p1, android.service.contentsafety.ILoadFeatureCallback p2) throws android.os.RemoteException {}
        }
    }
}
