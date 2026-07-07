package android.os.multisensory;

public interface IMultisensoryRealtimeSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.multisensory.IMultisensoryRealtimeSession";
    public void close(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException;
    public void start(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException;
    public void update(java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p0) throws android.os.RemoteException;

    public static class Default implements android.os.multisensory.IMultisensoryRealtimeSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException {}
        public void start(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException {}
        public void update(java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.multisensory.IMultisensoryRealtimeSession {
        static final int TRANSACTION_close = 4;
        static final int TRANSACTION_start = 2;
        static final int TRANSACTION_update = 3;
        public Stub() { super(); }
        public static android.os.multisensory.IMultisensoryRealtimeSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.multisensory.IMultisensoryRealtimeSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void start(android.os.multisensory.IMultisensoryPlayerSessionCallback p0) throws android.os.RemoteException {}
            public void update(java.util.List<android.os.multisensory.MultisensoryContinuousEffectModifier> p0) throws android.os.RemoteException {}
        }
    }
}
