package com.android.internal.os;

public class BatteryStatsHistoryIterator implements java.util.Iterator<android.os.BatteryStats.HistoryItem>, java.lang.AutoCloseable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "BatteryStatsHistoryItr";
    private long mBaseMonotonicTime;
    private long mBaseTimeUtc;
    private final com.android.internal.os.BatteryStatsHistory mBatteryStatsHistory = null;
    private boolean mClosed;
    private final com.android.internal.os.PowerStats.DescriptorRegistry mDescriptorRegistry = null;
    private final long mEndTimeMs = 0L;
    private android.os.BatteryStats.HistoryItem mHistoryItem;
    private final android.util.SparseArray<android.os.BatteryStats.HistoryTag> mHistoryTags = null;
    private int mItemIndex;
    private final int mMaxHistoryItems = 0;
    private boolean mNextItemReady;
    private java.util.Queue<com.android.internal.os.BatteryStatsHistory.BatteryHistoryParcelContainer> mParcelContainers;
    private int mParcelDataPosition;
    private final android.os.BatteryStats.HistoryStepDetails mReadHistoryStepDetails = null;
    private final long mStartTimeMs = 0L;
    private boolean mTimeInitialized;
    public BatteryStatsHistoryIterator(com.android.internal.os.BatteryStatsHistory p0, long p1, long p2) {}
    private boolean advance() { return false; }
    private static int extractSignedBitField(int p0, int p1, int p2) { return 0; }
    private static void readBatteryLevelInts(int p0, int p1, android.os.BatteryStats.HistoryItem p2) {}
    private void readHistoryDelta(android.os.Parcel p0, android.os.BatteryStats.HistoryItem p1) {}
    private boolean readHistoryTag(android.os.Parcel p0, int p1, android.os.BatteryStats.HistoryTag p2) { return false; }
    public void close() {}
    public boolean hasNext() { return false; }
    public android.os.BatteryStats.HistoryItem next() { return null; }
}
