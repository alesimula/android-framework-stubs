package android.hardware.hid;

public class HidFmqSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "HidFmqSession";
    private static final java.lang.ref.Cleaner sCleaner = null;
    private final java.lang.ref.Cleaner.Cleanable mCleanable = null;
    private final android.hardware.hid.HidFmqSession.CleanupAction mCleanupAction = null;
    private long mNativeReader;
    public HidFmqSession(android.hardware.common.fmq.MQDescriptor<android.hardware.hid.HidReportPacket, java.lang.Byte> p0) {}
    private static void closeDescriptorFds(android.hardware.common.fmq.MQDescriptor<?, ?> p0) {}
    private static native void nativeClose(long p0);
    private static native long nativeCreateFmqReader(int[] p0, int[] p1, long[] p2, android.os.ParcelFileDescriptor[] p3, int[] p4, int p5, int p6);
    private static native long nativeGetWeak(long p0);
    private static native boolean nativeReadPacket(long p0, android.hardware.hid.HidReportPacket p1);
    public void close() {}
    public boolean readBlocking(android.hardware.hid.HidReportPacket p0) throws java.io.IOException { return false; }

    private static class CleanupAction implements java.lang.Runnable {
        private final long mCleanupNativeReader = 0L;
        CleanupAction(long p0) {}
        public void run() {}
    }
}
