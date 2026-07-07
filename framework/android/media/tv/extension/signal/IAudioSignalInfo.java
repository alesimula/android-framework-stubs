package android.media.tv.extension.signal;

public interface IAudioSignalInfo extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.signal.IAudioSignalInfo";
    public void addAudioSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IAudioSignalInfoListener p1) throws android.os.RemoteException;
    public android.os.Bundle getAudioSignalInfo(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getMtsSelectedTrackId() throws android.os.RemoteException;
    public void notifyMtsSelectTrackFlag(boolean p0) throws android.os.RemoteException;
    public void removeAudioSignalInfoListener(android.media.tv.extension.signal.IAudioSignalInfoListener p0) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.signal.IAudioSignalInfo {
        public Default() {}
        public void addAudioSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IAudioSignalInfoListener p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.Bundle getAudioSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getMtsSelectedTrackId() throws android.os.RemoteException { return null; }
        public void notifyMtsSelectTrackFlag(boolean p0) throws android.os.RemoteException {}
        public void removeAudioSignalInfoListener(android.media.tv.extension.signal.IAudioSignalInfoListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.signal.IAudioSignalInfo {
        static final int TRANSACTION_addAudioSignalInfoListener = 4;
        static final int TRANSACTION_getAudioSignalInfo = 1;
        static final int TRANSACTION_getMtsSelectedTrackId = 3;
        static final int TRANSACTION_notifyMtsSelectTrackFlag = 2;
        static final int TRANSACTION_removeAudioSignalInfoListener = 5;
        public Stub() { super(); }
        public static android.media.tv.extension.signal.IAudioSignalInfo asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.signal.IAudioSignalInfo {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addAudioSignalInfoListener(java.lang.String p0, android.media.tv.extension.signal.IAudioSignalInfoListener p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.Bundle getAudioSignalInfo(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getMtsSelectedTrackId() throws android.os.RemoteException { return null; }
            public void notifyMtsSelectTrackFlag(boolean p0) throws android.os.RemoteException {}
            public void removeAudioSignalInfoListener(android.media.tv.extension.signal.IAudioSignalInfoListener p0) throws android.os.RemoteException {}
        }
    }
}
