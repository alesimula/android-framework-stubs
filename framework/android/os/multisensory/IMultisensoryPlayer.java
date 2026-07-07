package android.os.multisensory;

public interface IMultisensoryPlayer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.multisensory.IMultisensoryPlayer";
    public void cancel() throws android.os.RemoteException;
    public void getCapabilities(android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback p0) throws android.os.RemoteException;
    public void load(int p0, android.os.VibrationEffect p1, java.lang.String p2, android.os.multisensory.IMultisensoryPlayerLoadCallback p3) throws android.os.RemoteException;
    public void openRealtimeSession(int p0, android.os.multisensory.MultisensoryContinuousEffect p1, android.os.VibrationAttributes p2, android.media.AudioAttributes p3, android.os.multisensory.IMultisensoryPlayerSessionCallback p4) throws android.os.RemoteException;
    public void play(int p0, android.os.VibrationAttributes p1, android.media.AudioAttributes p2) throws android.os.RemoteException;
    public void setPlayerId(long p0) throws android.os.RemoteException;

    public static class Default implements android.os.multisensory.IMultisensoryPlayer {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancel() throws android.os.RemoteException {}
        public void getCapabilities(android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback p0) throws android.os.RemoteException {}
        public void load(int p0, android.os.VibrationEffect p1, java.lang.String p2, android.os.multisensory.IMultisensoryPlayerLoadCallback p3) throws android.os.RemoteException {}
        public void openRealtimeSession(int p0, android.os.multisensory.MultisensoryContinuousEffect p1, android.os.VibrationAttributes p2, android.media.AudioAttributes p3, android.os.multisensory.IMultisensoryPlayerSessionCallback p4) throws android.os.RemoteException {}
        public void play(int p0, android.os.VibrationAttributes p1, android.media.AudioAttributes p2) throws android.os.RemoteException {}
        public void setPlayerId(long p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.multisensory.IMultisensoryPlayer {
        static final int TRANSACTION_cancel = 5;
        static final int TRANSACTION_getCapabilities = 6;
        static final int TRANSACTION_load = 3;
        static final int TRANSACTION_openRealtimeSession = 7;
        static final int TRANSACTION_play = 4;
        static final int TRANSACTION_setPlayerId = 2;
        public Stub() { super(); }
        public static android.os.multisensory.IMultisensoryPlayer asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.multisensory.IMultisensoryPlayer {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancel() throws android.os.RemoteException {}
            public void getCapabilities(android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void load(int p0, android.os.VibrationEffect p1, java.lang.String p2, android.os.multisensory.IMultisensoryPlayerLoadCallback p3) throws android.os.RemoteException {}
            public void openRealtimeSession(int p0, android.os.multisensory.MultisensoryContinuousEffect p1, android.os.VibrationAttributes p2, android.media.AudioAttributes p3, android.os.multisensory.IMultisensoryPlayerSessionCallback p4) throws android.os.RemoteException {}
            public void play(int p0, android.os.VibrationAttributes p1, android.media.AudioAttributes p2) throws android.os.RemoteException {}
            public void setPlayerId(long p0) throws android.os.RemoteException {}
        }
    }
}
