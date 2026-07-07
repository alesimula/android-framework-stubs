package com.android.internal.statusbar;

public interface IAppClipsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.statusbar.IAppClipsService";
    public boolean canLaunchCaptureContentActivityForNote(int p0) throws android.os.RemoteException;
    public int canLaunchCaptureContentActivityForNoteInternal(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.statusbar.IAppClipsService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean canLaunchCaptureContentActivityForNote(int p0) throws android.os.RemoteException { return false; }
        public int canLaunchCaptureContentActivityForNoteInternal(int p0) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.statusbar.IAppClipsService {
        static final int TRANSACTION_canLaunchCaptureContentActivityForNote = 1;
        static final int TRANSACTION_canLaunchCaptureContentActivityForNoteInternal = 2;
        public Stub() { super(); }
        public static com.android.internal.statusbar.IAppClipsService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.statusbar.IAppClipsService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public boolean canLaunchCaptureContentActivityForNote(int p0) throws android.os.RemoteException { return false; }
            public int canLaunchCaptureContentActivityForNoteInternal(int p0) throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
