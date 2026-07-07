package android.graphics;

public class GraphicsStatsService extends android.view.IGraphicsStats.Stub {
    private static final int AID_STATSD = 1066;
    private static final int DELETE_OLD = 2;
    public static final java.lang.String GRAPHICS_STATS_SERVICE = "graphicsstats";
    private static final int SAVE_BUFFER = 1;
    private static final java.lang.String TAG = "GraphicsStatsService";
    private java.util.ArrayList<android.graphics.GraphicsStatsService.ActiveBuffer> mActive;
    private final android.app.AlarmManager mAlarmManager = null;
    private final android.app.AppOpsManager mAppOps = null;
    private final int mAshmemSize = 0;
    private final android.content.Context mContext = null;
    private final java.lang.Object mFileAccessLock = null;
    private java.io.File mGraphicsStatsDir;
    private final java.lang.Object mLock = null;
    private boolean mRotateIsScheduled;
    private android.os.Handler mWriteOutHandler;
    private final byte[] mZeroData = null;
    public GraphicsStatsService(android.content.Context p0) { super(); }
    private void addToSaveQueue(android.graphics.GraphicsStatsService.ActiveBuffer p0) {}
    private void deleteOldBuffers() {}
    private void deleteRecursiveLocked(java.io.File p0) {}
    private java.util.HashSet<java.io.File> dumpActiveLocked(long p0, java.util.ArrayList<android.graphics.GraphicsStatsService.HistoricalBuffer> p1) { return null; }
    private void dumpHistoricalLocked(long p0, java.util.HashSet<java.io.File> p1) {}
    private android.graphics.GraphicsStatsService.ActiveBuffer fetchActiveBuffersLocked(android.view.IGraphicsStatsCallback p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException { return null; }
    private static native void nAddToDump(long p0, java.lang.String p1);
    private static native void nAddToDump(long p0, java.lang.String p1, int p2, java.lang.String p3, long p4, long p5, long p6, byte[] p7);
    private static native long nCreateDump(int p0, boolean p1);
    private static native void nFinishDump(long p0);
    private static native void nFinishDumpInMemory(long p0, long p1, boolean p2);
    private static native int nGetAshmemSize();
    private static native void nSaveBuffer(java.lang.String p0, int p1, java.lang.String p2, long p3, long p4, long p5, byte[] p6);
    private static native void nativeDestructor();
    private native void nativeInit();
    private java.util.Calendar normalizeDate(long p0) { return null; }
    private void onAlarm() {}
    private java.io.File pathForApp(android.graphics.GraphicsStatsService.BufferInfo p0) { return null; }
    private void processDied(android.graphics.GraphicsStatsService.ActiveBuffer p0) {}
    private void pullGraphicsStats(boolean p0, long p1) throws android.os.RemoteException {}
    private void pullGraphicsStatsImpl(boolean p0, long p1) {}
    private android.os.ParcelFileDescriptor requestBufferForProcessLocked(android.view.IGraphicsStatsCallback p0, int p1, int p2, java.lang.String p3, long p4) throws android.os.RemoteException { return null; }
    private void saveBuffer(android.graphics.GraphicsStatsService.HistoricalBuffer p0) {}
    private void scheduleRotateLocked() {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.os.ParcelFileDescriptor requestBufferForProcess(java.lang.String p0, android.view.IGraphicsStatsCallback p1) throws android.os.RemoteException { return null; }

    private final class ActiveBuffer implements android.os.IBinder.DeathRecipient {
        final android.view.IGraphicsStatsCallback mCallback = null;
        final android.graphics.GraphicsStatsService.BufferInfo mInfo = null;
        java.nio.ByteBuffer mMapping;
        final int mPid = 0;
        android.os.SharedMemory mProcessBuffer;
        final android.os.IBinder mToken = null;
        final int mUid = 0;
        ActiveBuffer(android.graphics.GraphicsStatsService p0, android.view.IGraphicsStatsCallback p1, int p2, int p3, java.lang.String p4, long p5) throws android.os.RemoteException, java.io.IOException {}
        public void binderDied() {}
        void closeAllBuffers() {}
        android.os.ParcelFileDescriptor getPfd() { return null; }
        void readBytes(byte[] p0, int p1) throws java.io.IOException {}
    }

    private final class BufferInfo {
        long mEndTime;
        final java.lang.String mPackageName = null;
        long mStartTime;
        final int mUid = 0;
        final long mVersionCode = 0L;
        BufferInfo(android.graphics.GraphicsStatsService p0, int p1, java.lang.String p2, long p3, long p4) {}
    }

    private final class HistoricalBuffer {
        final byte[] mData = null;
        final android.graphics.GraphicsStatsService.BufferInfo mInfo = null;
        HistoricalBuffer(android.graphics.GraphicsStatsService p0, android.graphics.GraphicsStatsService.ActiveBuffer p1) throws java.io.IOException {}
    }
}
