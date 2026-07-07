package android.os;

public final class OomKillRecord {
    private long mAnonRssInKb;
    private long mFileRssInKb;
    private short mOomScoreAdj;
    private long mPgTablesInKb;
    private int mPid;
    private java.lang.String mProcessName;
    private long mShmemRssInKb;
    private long mTimeStampInMillis;
    private long mTotalVmInKb;
    private int mUid;
    public OomKillRecord(long p0, int p1, int p2, java.lang.String p3, short p4, long p5, long p6, long p7, long p8, long p9) {}
    public short getOomScoreAdj() { return 0; }
    public int getPid() { return 0; }
    public java.lang.String getProcessName() { return null; }
    public long getTimestampMilli() { return 0L; }
    public int getUid() { return 0; }
    public void logKillOccurred() {}
}
