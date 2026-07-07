package android.content;

public class SyncStatusInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.SyncStatusInfo> CREATOR = null;
    private static final int MAX_EVENT_COUNT = 10;
    private static final int SOURCE_COUNT = 6;
    private static final java.lang.String TAG = "Sync";
    static final int VERSION = 6;
    public final int authorityId = 0;
    public long initialFailureTime;
    public boolean initialize;
    public java.lang.String lastFailureMesg;
    public int lastFailureSource;
    public long lastFailureTime;
    public int lastSuccessSource;
    public long lastSuccessTime;
    public long lastTodayResetTime;
    private final java.util.ArrayList<java.lang.Long> mLastEventTimes = null;
    private final java.util.ArrayList<java.lang.String> mLastEvents = null;
    public boolean pending;
    public final long[] perSourceLastFailureTimes = null;
    public final long[] perSourceLastSuccessTimes = null;
    private java.util.ArrayList<java.lang.Long> periodicSyncTimes;
    public final android.content.SyncStatusInfo.Stats todayStats = null;
    public final android.content.SyncStatusInfo.Stats totalStats = null;
    public final android.content.SyncStatusInfo.Stats yesterdayStats = null;
    public SyncStatusInfo(int p0) {}
    public SyncStatusInfo(int p0, android.content.SyncStatusInfo p1) {}
    public SyncStatusInfo(android.content.SyncStatusInfo p0) {}
    public SyncStatusInfo(android.os.Parcel p0) {}
    private static boolean areSameDates(long p0, long p1) { return false; }
    private static void copy(long[] p0, long[] p1) {}
    private void copyFrom(android.content.SyncStatusInfo p0) {}
    private void ensurePeriodicSyncTimeSize(int p0) {}
    public void addEvent(java.lang.String p0) {}
    public void addPeriodicSyncTime(long p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getEvent(int p0) { return null; }
    public int getEventCount() { return 0; }
    public long getEventTime(int p0) { return 0L; }
    public int getLastFailureMesgAsInt(int p0) { return 0; }
    public long getPeriodicSyncTime(int p0) { return 0L; }
    public int getPeriodicSyncTimesSize() { return 0; }
    public void maybeResetTodayStats(boolean p0, boolean p1) {}
    public void populateLastEventsInformation(java.util.ArrayList<android.util.Pair<java.lang.Long, java.lang.String>> p0) {}
    public void removePeriodicSyncTime(int p0) {}
    public void setLastFailure(int p0, long p1, java.lang.String p2) {}
    public void setLastSuccess(int p0, long p1) {}
    public void setPeriodicSyncTime(int p0, long p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Stats {
        public int numCancels;
        public int numFailures;
        public int numSourceFeed;
        public int numSourceLocal;
        public int numSourceOther;
        public int numSourcePeriodic;
        public int numSourcePoll;
        public int numSourceUser;
        public int numSyncs;
        public long totalElapsedTime;
        public Stats() {}
        public void clear() {}
        public void copyTo(android.content.SyncStatusInfo.Stats p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0) {}
    }
}
