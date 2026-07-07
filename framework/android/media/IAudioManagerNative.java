package android.media;

public interface IAudioManagerNative extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.IAudioManagerNative";
    public void permissionUpdateBarrier(boolean p0) throws android.os.RemoteException;
    public void playbackHardeningEvent(int p0, byte p1, boolean p2, byte p3, int p4) throws android.os.RemoteException;
    public void portMuteEvent(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.media.IAudioManagerNative {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void permissionUpdateBarrier(boolean p0) throws android.os.RemoteException {}
        public void playbackHardeningEvent(int p0, byte p1, boolean p2, byte p3, int p4) throws android.os.RemoteException {}
        public void portMuteEvent(int p0, int p1) throws android.os.RemoteException {}
    }

    public static @interface HardeningExemptionReason {
        public static final byte ALARM = 4;
        public static final byte FLAG_DISABLED = 3;
        public static final byte NONE = 0;
        public static final byte OVERRIDE = 5;
        public static final byte PRIVILEGED_APP = 2;
        public static final byte SYSTEM_USAGE = 1;
        public static final byte TARGET_SDK = 6;
    }

    public static @interface HardeningType {
        public static final byte FULL = 1;
        public static final byte PARTIAL = 0;
    }

    public static abstract class Stub extends android.os.Binder implements android.media.IAudioManagerNative {
        static final int TRANSACTION_permissionUpdateBarrier = 2;
        static final int TRANSACTION_playbackHardeningEvent = 1;
        static final int TRANSACTION_portMuteEvent = 3;
        public Stub() { super(); }
        public static android.media.IAudioManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.IAudioManagerNative {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void permissionUpdateBarrier(boolean p0) throws android.os.RemoteException {}
            public void playbackHardeningEvent(int p0, byte p1, boolean p2, byte p3, int p4) throws android.os.RemoteException {}
            public void portMuteEvent(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
