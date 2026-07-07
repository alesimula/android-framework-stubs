package android.os;

public final class WakeLockStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.WakeLockStats> CREATOR = null;
    private final java.util.List<android.os.WakeLockStats.WakeLock> mAggregatedWakeLocks = null;
    private final java.util.List<android.os.WakeLockStats.WakeLock> mWakeLocks = null;
    private WakeLockStats(android.os.Parcel p0) {}
    public WakeLockStats(java.util.List<android.os.WakeLockStats.WakeLock> p0, java.util.List<android.os.WakeLockStats.WakeLock> p1) {}
    public int describeContents() { return 0; }
    public java.util.List<android.os.WakeLockStats.WakeLock> getAggregatedWakeLocks() { return null; }
    public java.util.List<android.os.WakeLockStats.WakeLock> getWakeLocks() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class WakeLock {
        public static final java.lang.String NAME_AGGREGATED = "wakelockstats_aggregated";
        public final android.os.WakeLockStats.WakeLockData backgroundWakeLockData = null;
        public final boolean isAggregated = false;
        public final java.lang.String name = null;
        public final android.os.WakeLockStats.WakeLockData totalWakeLockData = null;
        public final int uid = 0;
        public WakeLock(int p0, java.lang.String p1, boolean p2, android.os.WakeLockStats.WakeLockData p3, android.os.WakeLockStats.WakeLockData p4) {}
        private WakeLock(android.os.Parcel p0) {}
        public static boolean isDataValid(android.os.WakeLockStats.WakeLockData p0, android.os.WakeLockStats.WakeLockData p1) { return false; }
        private void writeToParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
    }

    public static class WakeLockData {
        public static final android.os.WakeLockStats.WakeLockData EMPTY = null;
        public final long timeHeldMs = 0L;
        public final int timesAcquired = 0;
        public final long totalTimeHeldMs = 0L;
        public WakeLockData(int p0, long p1, long p2) {}
        private WakeLockData(android.os.Parcel p0) {}
        private boolean isEmpty() { return false; }
        private void writeToParcel(android.os.Parcel p0) {}
        public boolean isDataValid() { return false; }
        public java.lang.String toString() { return null; }
    }
}
