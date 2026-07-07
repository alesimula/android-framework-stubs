package android.os;

public final class BatteryUsageStatsQuery implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStatsQuery> CREATOR = null;
    public static final android.os.BatteryUsageStatsQuery DEFAULT = null;
    private static final long DEFAULT_MAX_STATS_AGE_MS = 300000L;
    private static final long DEFAULT_PREFERRED_HISTORY_DURATION_MS = Long.valueOf(0L);
    public static final int FLAG_BATTERY_USAGE_STATS_ACCUMULATED = 128;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_HISTORY = 2;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_POWER_STATE = 64;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_PROCESS_STATE_DATA = 8;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_SCREEN_STATE = 32;
    public static final int FLAG_BATTERY_USAGE_STATS_INCLUDE_VIRTUAL_UIDS = 16;
    public static final int FLAG_BATTERY_USAGE_STATS_POWER_PROFILE_MODEL = 1;
    private final long mAggregatedFromTimestamp = 0L;
    private final long mAggregatedToTimestamp = 0L;
    private final int mFlags = 0;
    private final long mMaxStatsAgeMs = 0L;
    private final double mMinConsumedPowerThreshold = 0.0;
    private long mMonotonicEndTime;
    private long mMonotonicStartTime;
    private final int[] mPowerComponents = null;
    private final long mPreferredHistoryDurationMs = 0L;
    private final int[] mUserIds = null;
    private BatteryUsageStatsQuery(android.os.BatteryUsageStatsQuery.Builder p0) {}
    private BatteryUsageStatsQuery(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getAggregatedFromTimestamp() { return 0L; }
    public long getAggregatedToTimestamp() { return 0L; }
    public int getFlags() { return 0; }
    public long getMaxStatsAge() { return 0L; }
    public double getMinConsumedPowerThreshold() { return 0.0; }
    public long getMonotonicEndTime() { return 0L; }
    public long getMonotonicStartTime() { return 0L; }
    public int[] getPowerComponents() { return null; }
    public long getPreferredHistoryDurationMs() { return 0L; }
    public int[] getUserIds() { return null; }
    public boolean isPowerStateDataNeeded() { return false; }
    public boolean isProcessStateDataNeeded() { return false; }
    public boolean isScreenStateDataNeeded() { return false; }
    public boolean shouldForceUsePowerProfileModel() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BatteryUsageStatsFlags {
    }

    public static final class Builder {
        private long mAggregateFromTimestamp;
        private long mAggregateToTimestamp;
        private int mFlags;
        private long mMaxStatsAgeMs;
        private double mMinConsumedPowerThreshold;
        private long mMonotonicEndTime;
        private long mMonotonicStartTime;
        private int[] mPowerComponents;
        private long mPreferredHistoryDurationMs;
        private android.util.IntArray mUserIds;
        public Builder() {}
        public android.os.BatteryUsageStatsQuery.Builder accumulated() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder addUser(android.os.UserHandle p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder aggregateSnapshots(long p0, long p1) { return null; }
        public android.os.BatteryUsageStatsQuery build() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeBatteryHistory() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includePowerComponents(int[] p0) { return null; }
        @java.lang.Deprecated
        public android.os.BatteryUsageStatsQuery.Builder includePowerModels() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includePowerStateData() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeProcessStateData() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeScreenStateData() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder includeVirtualUids() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder monotonicTimeRange(long p0, long p1) { return null; }
        @java.lang.Deprecated
        public android.os.BatteryUsageStatsQuery.Builder powerProfileModeledOnly() { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setMaxStatsAgeMs(long p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setMinConsumedPowerThreshold(double p0) { return null; }
        public android.os.BatteryUsageStatsQuery.Builder setPreferredHistoryDurationMs(long p0) { return null; }
    }
}
