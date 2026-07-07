package android.media.metrics;

public interface IMediaMetricsManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public static final java.lang.String HASH = "notfrozen";
    public static final int VERSION = 1;
    public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getFirstPackageName(int p0) throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException;
    public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException;
    public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException;
    public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.reported.ReportedEditingEndedEvent p1, int p2) throws android.os.RemoteException;
    public void reportNetworkEvent(java.lang.String p0, android.media.metrics.reported.ReportedNetworkEvent p1, int p2) throws android.os.RemoteException;
    public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackErrorEvent p1, int p2) throws android.os.RemoteException;
    public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackMetrics p1, int p2) throws android.os.RemoteException;
    public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackStateEvent p1, int p2) throws android.os.RemoteException;
    public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.reported.ReportedTrackChangeEvent p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.media.metrics.IMediaMetricsManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getFirstPackageName(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getInterfaceHash() { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException { return null; }
        public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException { return null; }
        public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException {}
        public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.reported.ReportedEditingEndedEvent p1, int p2) throws android.os.RemoteException {}
        public void reportNetworkEvent(java.lang.String p0, android.media.metrics.reported.ReportedNetworkEvent p1, int p2) throws android.os.RemoteException {}
        public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackErrorEvent p1, int p2) throws android.os.RemoteException {}
        public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackMetrics p1, int p2) throws android.os.RemoteException {}
        public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackStateEvent p1, int p2) throws android.os.RemoteException {}
        public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.reported.ReportedTrackChangeEvent p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.media.metrics.IMediaMetricsManager {
        static final int TRANSACTION_checkPermission = 15;
        static final int TRANSACTION_getBundleSessionId = 11;
        static final int TRANSACTION_getEditingSessionId = 10;
        static final int TRANSACTION_getFirstPackageName = 14;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getPlaybackSessionId = 2;
        static final int TRANSACTION_getRecordingSessionId = 3;
        static final int TRANSACTION_getTranscodingSessionId = 9;
        static final int TRANSACTION_releaseSessionId = 13;
        static final int TRANSACTION_reportBundleMetrics = 12;
        static final int TRANSACTION_reportEditingEndedEvent = 8;
        static final int TRANSACTION_reportNetworkEvent = 4;
        static final int TRANSACTION_reportPlaybackErrorEvent = 5;
        static final int TRANSACTION_reportPlaybackMetrics = 1;
        static final int TRANSACTION_reportPlaybackStateEvent = 6;
        static final int TRANSACTION_reportTrackChangeEvent = 7;
        public Stub() { super(); }
        public static android.media.metrics.IMediaMetricsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.metrics.IMediaMetricsManager {
            private java.lang.String mCachedHash;
            private int mCachedVersion;
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public boolean checkPermission(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public java.lang.String getBundleSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getEditingSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getFirstPackageName(int p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public java.lang.String getPlaybackSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getRecordingSessionId(int p0) throws android.os.RemoteException { return null; }
            public java.lang.String getTranscodingSessionId(int p0) throws android.os.RemoteException { return null; }
            public void releaseSessionId(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void reportBundleMetrics(java.lang.String p0, android.os.PersistableBundle p1, int p2) throws android.os.RemoteException {}
            public void reportEditingEndedEvent(java.lang.String p0, android.media.metrics.reported.ReportedEditingEndedEvent p1, int p2) throws android.os.RemoteException {}
            public void reportNetworkEvent(java.lang.String p0, android.media.metrics.reported.ReportedNetworkEvent p1, int p2) throws android.os.RemoteException {}
            public void reportPlaybackErrorEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackErrorEvent p1, int p2) throws android.os.RemoteException {}
            public void reportPlaybackMetrics(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackMetrics p1, int p2) throws android.os.RemoteException {}
            public void reportPlaybackStateEvent(java.lang.String p0, android.media.metrics.reported.ReportedPlaybackStateEvent p1, int p2) throws android.os.RemoteException {}
            public void reportTrackChangeEvent(java.lang.String p0, android.media.metrics.reported.ReportedTrackChangeEvent p1, int p2) throws android.os.RemoteException {}
        }
    }
}
