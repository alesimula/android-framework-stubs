package android.hardware.power;

public interface IPower extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "4642211f44ad39c8c592b3611e62d29974b784b5";
    public static final int VERSION = 7;
    public void closeSessionChannel(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.power.IPowerHintSession createHintSession(int p0, int p1, int[] p2, long p3) throws android.os.RemoteException;
    public android.hardware.power.IPowerHintSession createHintSessionWithConfig(int p0, int p1, int[] p2, long p3, int p4, android.hardware.power.SessionConfig p5) throws android.os.RemoteException;
    public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.hardware.power.CpuHeadroomParams p0) throws android.os.RemoteException;
    public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.hardware.power.GpuHeadroomParams p0) throws android.os.RemoteException;
    public long getHintSessionPreferredRate() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public android.hardware.power.ChannelConfig getSessionChannel(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.power.SupportInfo getSupportInfo() throws android.os.RemoteException;
    public boolean isBoostSupported(int p0) throws android.os.RemoteException;
    public boolean isModeSupported(int p0) throws android.os.RemoteException;
    public void sendCompositionData(android.hardware.power.CompositionData[] p0) throws android.os.RemoteException;
    public void sendCompositionUpdate(android.hardware.power.CompositionUpdate p0) throws android.os.RemoteException;
    public void setBoost(int p0, int p1) throws android.os.RemoteException;
    public void setMode(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.power.IPower {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void closeSessionChannel(int p0, int p1) throws android.os.RemoteException {}
        public android.hardware.power.IPowerHintSession createHintSession(int p0, int p1, int[] p2, long p3) throws android.os.RemoteException { return null; }
        public android.hardware.power.IPowerHintSession createHintSessionWithConfig(int p0, int p1, int[] p2, long p3, int p4, android.hardware.power.SessionConfig p5) throws android.os.RemoteException { return null; }
        public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.hardware.power.CpuHeadroomParams p0) throws android.os.RemoteException { return null; }
        public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.hardware.power.GpuHeadroomParams p0) throws android.os.RemoteException { return null; }
        public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public android.hardware.power.ChannelConfig getSessionChannel(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.power.SupportInfo getSupportInfo() throws android.os.RemoteException { return null; }
        public boolean isBoostSupported(int p0) throws android.os.RemoteException { return false; }
        public boolean isModeSupported(int p0) throws android.os.RemoteException { return false; }
        public void sendCompositionData(android.hardware.power.CompositionData[] p0) throws android.os.RemoteException {}
        public void sendCompositionUpdate(android.hardware.power.CompositionUpdate p0) throws android.os.RemoteException {}
        public void setBoost(int p0, int p1) throws android.os.RemoteException {}
        public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.power.IPower {
        static final int TRANSACTION_closeSessionChannel = 9;
        static final int TRANSACTION_createHintSession = 5;
        static final int TRANSACTION_createHintSessionWithConfig = 7;
        static final int TRANSACTION_getCpuHeadroom = 11;
        static final int TRANSACTION_getGpuHeadroom = 12;
        static final int TRANSACTION_getHintSessionPreferredRate = 6;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getSessionChannel = 8;
        static final int TRANSACTION_getSupportInfo = 10;
        static final int TRANSACTION_isBoostSupported = 4;
        static final int TRANSACTION_isModeSupported = 2;
        static final int TRANSACTION_sendCompositionData = 13;
        static final int TRANSACTION_sendCompositionUpdate = 14;
        static final int TRANSACTION_setBoost = 3;
        static final int TRANSACTION_setMode = 1;
        public Stub() { super(); }
        public static android.hardware.power.IPower asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.power.IPower {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void closeSessionChannel(int p0, int p1) throws android.os.RemoteException {}
            public android.hardware.power.IPowerHintSession createHintSession(int p0, int p1, int[] p2, long p3) throws android.os.RemoteException { return null; }
            public android.hardware.power.IPowerHintSession createHintSessionWithConfig(int p0, int p1, int[] p2, long p3, int p4, android.hardware.power.SessionConfig p5) throws android.os.RemoteException { return null; }
            public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.hardware.power.CpuHeadroomParams p0) throws android.os.RemoteException { return null; }
            public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.hardware.power.GpuHeadroomParams p0) throws android.os.RemoteException { return null; }
            public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public android.hardware.power.ChannelConfig getSessionChannel(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.power.SupportInfo getSupportInfo() throws android.os.RemoteException { return null; }
            public boolean isBoostSupported(int p0) throws android.os.RemoteException { return false; }
            public boolean isModeSupported(int p0) throws android.os.RemoteException { return false; }
            public void sendCompositionData(android.hardware.power.CompositionData[] p0) throws android.os.RemoteException {}
            public void sendCompositionUpdate(android.hardware.power.CompositionUpdate p0) throws android.os.RemoteException {}
            public void setBoost(int p0, int p1) throws android.os.RemoteException {}
            public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
