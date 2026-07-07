package android.metrics;

@android.annotation.SystemApi
public class MetricsReader {
    private int[] LOGTAGS;
    private int mCheckpointTag;
    private java.util.Queue<android.metrics.LogMaker> mPendingQueue;
    private android.metrics.MetricsReader.LogReader mReader;
    private java.util.Queue<android.metrics.LogMaker> mSeenQueue;
    public MetricsReader() {}
    public void checkpoint() {}
    public boolean hasNext() { return false; }
    public android.metrics.LogMaker next() { return null; }
    public void read(long p0) {}
    public void reset() {}
    public void setLogReader(android.metrics.MetricsReader.LogReader p0) {}

    public static class Event {
        java.lang.Object mData;
        int mPid;
        long mTimeMillis;
        int mUid;
        public Event(long p0, int p1, int p2, java.lang.Object p3) {}
        Event(android.util.EventLog.Event p0) {}
        public java.lang.Object getData() { return null; }
        public int getProcessId() { return 0; }
        public long getTimeMillis() { return 0L; }
        public int getUid() { return 0; }
        public void setData(java.lang.Object p0) {}
    }

    public static class LogReader {
        public LogReader() {}
        public void readEvents(int[] p0, long p1, java.util.Collection<android.metrics.MetricsReader.Event> p2) throws java.io.IOException {}
        public void writeCheckpoint(int p0) {}
    }
}
