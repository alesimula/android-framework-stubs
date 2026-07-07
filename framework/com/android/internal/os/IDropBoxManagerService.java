package com.android.internal.os;

public interface IDropBoxManagerService extends android.os.IInterface {
    public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException;
    public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException;
    public com.android.internal.os.IDropBoxManagerService.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException;
    public com.android.internal.os.IDropBoxManagerService.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException;
    public boolean isTagEnabledWithException(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.os.IDropBoxManagerService {
        public Default() {}
        public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException {}
        public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public com.android.internal.os.IDropBoxManagerService.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public com.android.internal.os.IDropBoxManagerService.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isTagEnabledWithException(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
    }

    public static class Entry implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.android.internal.os.IDropBoxManagerService.Entry> CREATOR = null;
        public byte[] data;
        public android.os.ParcelFileDescriptor fd;
        public int flags;
        public java.lang.String tag;
        public long timestampMillis;
        public Entry() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IDropBoxManagerService {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.os.IDropBoxManagerService";
        static final int TRANSACTION_addData = 1;
        static final int TRANSACTION_addFile = 2;
        static final int TRANSACTION_getNextEntry = 5;
        static final int TRANSACTION_getNextEntryWithAttribution = 6;
        static final int TRANSACTION_isTagEnabled = 3;
        static final int TRANSACTION_isTagEnabledWithException = 4;
        public Stub() { super(); }
        public static com.android.internal.os.IDropBoxManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements com.android.internal.os.IDropBoxManagerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addData(java.lang.String p0, byte[] p1, int p2) throws android.os.RemoteException {}
            public void addFile(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public com.android.internal.os.IDropBoxManagerService.Entry getNextEntry(java.lang.String p0, long p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public com.android.internal.os.IDropBoxManagerService.Entry getNextEntryWithAttribution(java.lang.String p0, long p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public boolean isTagEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean isTagEnabledWithException(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        }
    }
}
