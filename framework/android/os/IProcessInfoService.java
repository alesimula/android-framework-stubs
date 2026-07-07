package android.os;

public interface IProcessInfoService extends android.os.IInterface {
    public void getProcessStatesAndOomScoresFromPids(int[] p0, int[] p1, int[] p2) throws android.os.RemoteException;
    public void getProcessStatesFromPids(int[] p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.os.IProcessInfoService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getProcessStatesAndOomScoresFromPids(int[] p0, int[] p1, int[] p2) throws android.os.RemoteException {}
        public void getProcessStatesFromPids(int[] p0, int[] p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IProcessInfoService {
        public static final java.lang.String DESCRIPTOR = "android.os.IProcessInfoService";
        static final int TRANSACTION_getProcessStatesAndOomScoresFromPids = 2;
        static final int TRANSACTION_getProcessStatesFromPids = 1;
        public Stub() { super(); }
        public static android.os.IProcessInfoService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IProcessInfoService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void getProcessStatesAndOomScoresFromPids(int[] p0, int[] p1, int[] p2) throws android.os.RemoteException {}
            public void getProcessStatesFromPids(int[] p0, int[] p1) throws android.os.RemoteException {}
        }
    }
}
