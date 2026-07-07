package android.media;

public interface IPreferredMixerAttributesDispatcher extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IPreferredMixerAttributesDispatcher";
    public void dispatchPrefMixerAttributesChanged(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException;

    public static class Default implements android.media.IPreferredMixerAttributesDispatcher {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void dispatchPrefMixerAttributesChanged(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IPreferredMixerAttributesDispatcher {
        static final int TRANSACTION_dispatchPrefMixerAttributesChanged = 1;
        public Stub() { super(); }
        public static android.media.IPreferredMixerAttributesDispatcher asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IPreferredMixerAttributesDispatcher {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void dispatchPrefMixerAttributesChanged(android.media.AudioAttributes p0, int p1, android.media.AudioMixerAttributes p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}
