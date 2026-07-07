package android.media.tv.extension.teletext;

public interface ITeletextPageSubCode extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.teletext.ITeletextPageSubCode";
    public boolean getTeletextHasTopInfo(java.lang.String p0) throws android.os.RemoteException;
    public int getTeletextPageNumber(java.lang.String p0) throws android.os.RemoteException;
    public int getTeletextPageSubCode(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getTeletextTopBlockList(java.lang.String p0) throws android.os.RemoteException;
    public android.os.Bundle getTeletextTopGroupList(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.os.Bundle getTeletextTopPageList(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setTeletextPageNumber(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setTeletextPageSubCode(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.teletext.ITeletextPageSubCode {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean getTeletextHasTopInfo(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int getTeletextPageNumber(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int getTeletextPageSubCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.os.Bundle getTeletextTopBlockList(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTeletextTopGroupList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.Bundle getTeletextTopPageList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setTeletextPageNumber(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void setTeletextPageSubCode(java.lang.String p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.teletext.ITeletextPageSubCode {
        static final int TRANSACTION_getTeletextHasTopInfo = 5;
        static final int TRANSACTION_getTeletextPageNumber = 1;
        static final int TRANSACTION_getTeletextPageSubCode = 3;
        static final int TRANSACTION_getTeletextTopBlockList = 6;
        static final int TRANSACTION_getTeletextTopGroupList = 7;
        static final int TRANSACTION_getTeletextTopPageList = 8;
        static final int TRANSACTION_setTeletextPageNumber = 2;
        static final int TRANSACTION_setTeletextPageSubCode = 4;
        public Stub() { super(); }
        public static android.media.tv.extension.teletext.ITeletextPageSubCode asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.teletext.ITeletextPageSubCode {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean getTeletextHasTopInfo(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int getTeletextPageNumber(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int getTeletextPageSubCode(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.os.Bundle getTeletextTopBlockList(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTeletextTopGroupList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.os.Bundle getTeletextTopPageList(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setTeletextPageNumber(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void setTeletextPageSubCode(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
