package android.os;

public interface IHintManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IHintManager";
    public void closeSessionChannel() throws android.os.RemoteException;
    public android.os.IHintManager.SessionCreationReturn createHintSessionWithConfig(android.os.IBinder p0, int p1, android.os.SessionCreationConfig p2, android.hardware.power.SessionConfig p3) throws android.os.RemoteException;
    public android.os.IHintManager.HintManagerClientData getClientData() throws android.os.RemoteException;
    public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.os.CpuHeadroomParamsInternal p0) throws android.os.RemoteException;
    public long getCpuHeadroomMinIntervalMillis() throws android.os.RemoteException;
    public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.os.GpuHeadroomParamsInternal p0) throws android.os.RemoteException;
    public long getGpuHeadroomMinIntervalMillis() throws android.os.RemoteException;
    public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException;
    public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException;
    public void passSessionManagerBinder(android.os.IBinder p0) throws android.os.RemoteException;
    public android.os.IHintManager.HintManagerClientData registerClient(android.os.IHintManager.IHintManagerClient p0) throws android.os.RemoteException;
    public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.os.IHintManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void closeSessionChannel() throws android.os.RemoteException {}
        public android.os.IHintManager.SessionCreationReturn createHintSessionWithConfig(android.os.IBinder p0, int p1, android.os.SessionCreationConfig p2, android.hardware.power.SessionConfig p3) throws android.os.RemoteException { return null; }
        public android.os.IHintManager.HintManagerClientData getClientData() throws android.os.RemoteException { return null; }
        public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.os.CpuHeadroomParamsInternal p0) throws android.os.RemoteException { return null; }
        public long getCpuHeadroomMinIntervalMillis() throws android.os.RemoteException { return 0L; }
        public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.os.GpuHeadroomParamsInternal p0) throws android.os.RemoteException { return null; }
        public long getGpuHeadroomMinIntervalMillis() throws android.os.RemoteException { return 0L; }
        public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException { return null; }
        public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void passSessionManagerBinder(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IHintManager.HintManagerClientData registerClient(android.os.IHintManager.IHintManagerClient p0) throws android.os.RemoteException { return null; }
        public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException {}
    }

    public static class HintManagerClientData implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.IHintManager.HintManagerClientData> CREATOR = null;
        public int maxCpuHeadroomThreads;
        public int maxGraphicsPipelineThreads;
        public int powerHalVersion;
        public long preferredRateNanos;
        public android.hardware.power.SupportInfo supportInfo;
        public HintManagerClientData() {}
        private int describeContents(java.lang.Object p0) { return 0; }
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface IHintManagerClient extends android.os.IInterface {
        public static final java.lang.String DESCRIPTOR = "android.os.IHintManager.IHintManagerClient";
        public void receiveChannelConfig(android.hardware.power.ChannelConfig p0) throws android.os.RemoteException;

        public static class Default implements android.os.IHintManager.IHintManagerClient {
            public Default() {}
            public android.os.IBinder asBinder() { return null; }
            public void receiveChannelConfig(android.hardware.power.ChannelConfig p0) throws android.os.RemoteException {}
        }

        public static abstract class Stub extends android.os.Binder implements android.os.IHintManager.IHintManagerClient {
            static final int TRANSACTION_receiveChannelConfig = 1;
            public Stub() { super(); }
            public static android.os.IHintManager.IHintManagerClient asInterface(android.os.IBinder p0) { return null; }
            public static java.lang.String getDefaultTransactionName(int p0) { return null; }
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getTransactionName(int p0) { return null; }
            public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

            private static final class Proxy implements android.os.IHintManager.IHintManagerClient {
                private android.os.IBinder mRemote;
                Proxy(android.os.IBinder p0) {}
                public android.os.IBinder asBinder() { return null; }
                public final java.lang.String getInterfaceDescriptor() { return null; }
                public void receiveChannelConfig(android.hardware.power.ChannelConfig p0) throws android.os.RemoteException {}
            }
        }
    }

    public static class SessionCreationReturn implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.os.IHintManager.SessionCreationReturn> CREATOR = null;
        public boolean pipelineThreadLimitExceeded;
        public android.os.IHintSession session;
        public int tag;
        public SessionCreationReturn() {}
        public int describeContents() { return 0; }
        public final void readFromParcel(android.os.Parcel p0) {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IHintManager {
        static final int TRANSACTION_closeSessionChannel = 5;
        static final int TRANSACTION_createHintSessionWithConfig = 1;
        static final int TRANSACTION_getClientData = 12;
        static final int TRANSACTION_getCpuHeadroom = 6;
        static final int TRANSACTION_getCpuHeadroomMinIntervalMillis = 7;
        static final int TRANSACTION_getGpuHeadroom = 8;
        static final int TRANSACTION_getGpuHeadroomMinIntervalMillis = 9;
        static final int TRANSACTION_getHintSessionThreadIds = 3;
        static final int TRANSACTION_getSessionChannel = 4;
        static final int TRANSACTION_passSessionManagerBinder = 10;
        static final int TRANSACTION_registerClient = 11;
        static final int TRANSACTION_setHintSessionThreads = 2;
        public Stub() { super(); }
        public static android.os.IHintManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IHintManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void closeSessionChannel() throws android.os.RemoteException {}
            public android.os.IHintManager.SessionCreationReturn createHintSessionWithConfig(android.os.IBinder p0, int p1, android.os.SessionCreationConfig p2, android.hardware.power.SessionConfig p3) throws android.os.RemoteException { return null; }
            public android.os.IHintManager.HintManagerClientData getClientData() throws android.os.RemoteException { return null; }
            public android.hardware.power.CpuHeadroomResult getCpuHeadroom(android.os.CpuHeadroomParamsInternal p0) throws android.os.RemoteException { return null; }
            public long getCpuHeadroomMinIntervalMillis() throws android.os.RemoteException { return 0L; }
            public android.hardware.power.GpuHeadroomResult getGpuHeadroom(android.os.GpuHeadroomParamsInternal p0) throws android.os.RemoteException { return null; }
            public long getGpuHeadroomMinIntervalMillis() throws android.os.RemoteException { return 0L; }
            public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void passSessionManagerBinder(android.os.IBinder p0) throws android.os.RemoteException {}
            public android.os.IHintManager.HintManagerClientData registerClient(android.os.IHintManager.IHintManagerClient p0) throws android.os.RemoteException { return null; }
            public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException {}
        }
    }
}
