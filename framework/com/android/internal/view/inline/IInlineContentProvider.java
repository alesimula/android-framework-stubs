package com.android.internal.view.inline;

public interface IInlineContentProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.view.inline.IInlineContentProvider";
    public void onSurfacePackageReleased() throws android.os.RemoteException;
    public void provideContent(int p0, int p1, com.android.internal.view.inline.IInlineContentCallback p2) throws android.os.RemoteException;
    public void requestSurfacePackage() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.inline.IInlineContentProvider {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onSurfacePackageReleased() throws android.os.RemoteException {}
        public void provideContent(int p0, int p1, com.android.internal.view.inline.IInlineContentCallback p2) throws android.os.RemoteException {}
        public void requestSurfacePackage() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.inline.IInlineContentProvider {
        static final int TRANSACTION_onSurfacePackageReleased = 3;
        static final int TRANSACTION_provideContent = 1;
        static final int TRANSACTION_requestSurfacePackage = 2;
        public Stub() { super(); }
        public static com.android.internal.view.inline.IInlineContentProvider asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.view.inline.IInlineContentProvider {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSurfacePackageReleased() throws android.os.RemoteException {}
            public void provideContent(int p0, int p1, com.android.internal.view.inline.IInlineContentCallback p2) throws android.os.RemoteException {}
            public void requestSurfacePackage() throws android.os.RemoteException {}
        }
    }
}
