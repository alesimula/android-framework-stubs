package android.os;

public final class BatteryUsageStats implements android.os.Parcelable, java.io.Closeable {
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_ALL_APPS = 1;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_COUNT = 2;
    public static final int AGGREGATE_BATTERY_CONSUMER_SCOPE_DEVICE = 0;
    private static final long BATTERY_CONSUMER_CURSOR_WINDOW_SIZE = 20000000L;
    public static final android.os.Parcelable.Creator<android.os.BatteryUsageStats> CREATOR = null;
    private static final int STATSD_PULL_ATOM_MAX_BYTES = 45000;
    private static final java.lang.String TAG = "BatteryUsageStats";
    private static final int[] UID_USAGE_TIME_PROCESS_STATES = null;
    private static final double WEIGHT_BACKGROUND_STATE = 8.333333333333333e-05;
    private static final double WEIGHT_CONSUMED_POWER = 1.0;
    private static final double WEIGHT_FOREGROUND_STATE = 2.777777777777778e-05;
    static final java.lang.String XML_ATTR_BATTERY_CAPACITY = "battery_capacity";
    static final java.lang.String XML_ATTR_BATTERY_REMAINING = "battery_remaining";
    static final java.lang.String XML_ATTR_CHARGE_REMAINING = "charge_remaining";
    static final java.lang.String XML_ATTR_DISCHARGE_DURATION = "discharge_duration";
    static final java.lang.String XML_ATTR_DISCHARGE_LOWER = "discharge_lower";
    static final java.lang.String XML_ATTR_DISCHARGE_PERCENT = "discharge_pct";
    static final java.lang.String XML_ATTR_DISCHARGE_UPPER = "discharge_upper";
    static final java.lang.String XML_ATTR_DURATION = "duration";
    static final java.lang.String XML_ATTR_END_TIMESTAMP = "end_timestamp";
    static final java.lang.String XML_ATTR_HIGHEST_DRAIN_PACKAGE = "highest_drain_package";
    static final java.lang.String XML_ATTR_ID = "id";
    static final java.lang.String XML_ATTR_POWER = "power";
    static final java.lang.String XML_ATTR_POWER_STATE = "power_state";
    static final java.lang.String XML_ATTR_PREFIX_CUSTOM_COMPONENT = "custom_component_";
    static final java.lang.String XML_ATTR_PREFIX_INCLUDES_POWER_STATE_DATA = "includes_power_state_data";
    static final java.lang.String XML_ATTR_PREFIX_INCLUDES_PROC_STATE_DATA = "includes_proc_state_data";
    static final java.lang.String XML_ATTR_PREFIX_INCLUDES_SCREEN_STATE_DATA = "includes_screen_state_data";
    static final java.lang.String XML_ATTR_PROCESS_STATE = "process_state";
    static final java.lang.String XML_ATTR_SCOPE = "scope";
    static final java.lang.String XML_ATTR_SCREEN_STATE = "screen_state";
    static final java.lang.String XML_ATTR_START_TIMESTAMP = "start_timestamp";
    static final java.lang.String XML_ATTR_TIME_IN_BACKGROUND = "time_in_background";
    static final java.lang.String XML_ATTR_TIME_IN_FOREGROUND = "time_in_foreground";
    static final java.lang.String XML_ATTR_TIME_IN_FOREGROUND_SERVICE = "time_in_foreground_service";
    static final java.lang.String XML_ATTR_UID = "uid";
    static final java.lang.String XML_ATTR_USER_ID = "user_id";
    static final java.lang.String XML_TAG_AGGREGATE = "aggregate";
    static final java.lang.String XML_TAG_BATTERY_USAGE_STATS = "battery_usage_stats";
    static final java.lang.String XML_TAG_COMPONENT = "component";
    static final java.lang.String XML_TAG_POWER_COMPONENTS = "power_components";
    static final java.lang.String XML_TAG_UID = "uid";
    static final java.lang.String XML_TAG_USER = "user";
    private static volatile boolean sInstanceLeakDetectionEnabled;
    private static java.util.Map<android.database.CursorWindow, java.lang.Exception> sInstances;
    private final android.os.AggregateBatteryConsumer[] mAggregateBatteryConsumers = null;
    private final double mBatteryCapacityMah = 0.0;
    private final android.os.BatteryConsumer.BatteryConsumerDataLayout mBatteryConsumerDataLayout = null;
    private android.database.CursorWindow mBatteryConsumersCursorWindow;
    private final com.android.internal.os.BatteryStatsHistory mBatteryStatsHistory = null;
    private final long mBatteryTimeRemainingMs = 0L;
    private final long mChargeTimeRemainingMs = 0L;
    private final java.lang.String[] mCustomPowerComponentNames = null;
    private final long mDischargeDurationMs = 0L;
    private final int mDischargePercentage = 0;
    private final double mDischargedPowerLowerBound = 0.0;
    private final double mDischargedPowerUpperBound = 0.0;
    private final boolean mIncludesPowerStateData = false;
    private final boolean mIncludesProcessStateData = false;
    private final boolean mIncludesScreenStateData = false;
    private final long mPreferredHistoryDurationMs = 0L;
    private final long mStatsDurationMs = 0L;
    private final long mStatsEndTimestampMs = 0L;
    private final long mStatsStartTimestampMs = 0L;
    private final java.util.List<android.os.UidBatteryConsumer> mUidBatteryConsumers = null;
    private final java.util.List<android.os.UserBatteryConsumer> mUserBatteryConsumers = null;
    private BatteryUsageStats(android.os.BatteryUsageStats.Builder p0) {}
    private BatteryUsageStats(android.os.Parcel p0) {}
    public static void assertAllInstancesClosed() {}
    public static android.os.BatteryUsageStats.Builder createBuilderFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.os.BatteryUsageStats createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void dumpPowerComponents(java.io.PrintWriter p0, int p1, int p2, java.lang.String p3) {}
    private void dumpSortedBatteryConsumers(java.io.PrintWriter p0, java.lang.String p1, java.util.List<? extends android.os.BatteryConsumer> p2) {}
    public static void enableInstanceLeakDetection() {}
    private double getUidBatteryConsumerWeight(android.os.UidBatteryConsumer p0) { return 0.0; }
    private static void onCursorWindowAllocated(android.database.CursorWindow p0) {}
    private static void onCursorWindowReleased(android.database.CursorWindow p0) {}
    private void printPowerComponent(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, double p3, double p4, long p5) {}
    private void writeStatsProto(android.util.proto.ProtoOutputStream p0, int p1) {}
    private void writeUidBatteryConsumersProto(android.util.proto.ProtoOutputStream p0, int p1) {}
    public void close() throws java.io.IOException {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public void dumpToProto(java.io.FileDescriptor p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public android.os.AggregateBatteryConsumer getAggregateBatteryConsumer(int p0) { return null; }
    public double getBatteryCapacity() { return 0.0; }
    public long getBatteryTimeRemainingMs() { return 0L; }
    public long getChargeTimeRemainingMs() { return 0L; }
    public double getConsumedPower() { return 0.0; }
    public java.lang.String[] getCustomPowerComponentNames() { return null; }
    public long getDischargeDurationMs() { return 0L; }
    public int getDischargePercentage() { return 0; }
    public android.util.Range<java.lang.Double> getDischargedPowerRange() { return null; }
    public long getStatsDuration() { return 0L; }
    public long getStatsEndTimestamp() { return 0L; }
    public byte[] getStatsProto() { return null; }
    public long getStatsStartTimestamp() { return 0L; }
    public java.util.List<android.os.UidBatteryConsumer> getUidBatteryConsumers() { return null; }
    public java.util.List<android.os.UserBatteryConsumer> getUserBatteryConsumers() { return null; }
    public boolean isProcessStateDataIncluded() { return false; }
    public com.android.internal.os.BatteryStatsHistoryIterator iterateBatteryStatsHistory() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AggregateBatteryConsumerScope {
    }

    public static final class Builder {
        private final android.os.AggregateBatteryConsumer.Builder[] mAggregateBatteryConsumersBuilders = null;
        private double mBatteryCapacityMah;
        private final android.os.BatteryConsumer.BatteryConsumerDataLayout mBatteryConsumerDataLayout = null;
        private final android.database.CursorWindow mBatteryConsumersCursorWindow = null;
        private com.android.internal.os.BatteryStatsHistory mBatteryStatsHistory;
        private long mBatteryTimeRemainingMs;
        private long mChargeTimeRemainingMs;
        private final java.lang.String[] mCustomPowerComponentNames = null;
        private long mDischargeDurationMs;
        private int mDischargePercentage;
        private double mDischargedPowerLowerBoundMah;
        private double mDischargedPowerUpperBoundMah;
        private final boolean mIncludesPowerStateData = false;
        private final boolean mIncludesProcessStateData = false;
        private final boolean mIncludesScreenStateData = false;
        private final double mMinConsumedPowerThreshold = 0.0;
        private long mPreferredHistoryDurationMs;
        private long mStatsDurationMs;
        private long mStatsEndTimestampMs;
        private long mStatsStartTimestampMs;
        private final android.util.SparseArray<android.os.UidBatteryConsumer.Builder> mUidBatteryConsumerBuilders = null;
        private final android.util.SparseArray<android.os.UserBatteryConsumer.Builder> mUserBatteryConsumerBuilders = null;
        public Builder(java.lang.String[] p0) {}
        public Builder(java.lang.String[] p0, boolean p1, boolean p2, boolean p3, double p4) {}
        public android.os.BatteryUsageStats.Builder add(android.os.BatteryUsageStats p0) { return null; }
        public android.os.BatteryUsageStats.Builder addDischargeDurationMs(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder addDischargePercentage(int p0) { return null; }
        public android.os.BatteryUsageStats.Builder addDischargedPowerRange(double p0, double p1) { return null; }
        public android.os.BatteryUsageStats build() { return null; }
        public void discard() {}
        void dump(java.io.PrintWriter p0) {}
        public android.os.AggregateBatteryConsumer.Builder getAggregateBatteryConsumerBuilder(int p0) { return null; }
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(int p0) { return null; }
        public android.os.UidBatteryConsumer.Builder getOrCreateUidBatteryConsumerBuilder(android.os.BatteryStats.Uid p0) { return null; }
        public android.os.UserBatteryConsumer.Builder getOrCreateUserBatteryConsumerBuilder(int p0) { return null; }
        public long getStatsDuration() { return 0L; }
        public android.util.SparseArray<android.os.UidBatteryConsumer.Builder> getUidBatteryConsumerBuilders() { return null; }
        public boolean isPowerStateDataNeeded() { return false; }
        public boolean isProcessStateDataNeeded() { return false; }
        public boolean isScreenStateDataNeeded() { return false; }
        public boolean isSupportedPowerComponent(int p0) { return false; }
        public android.os.BatteryUsageStats.Builder setBatteryCapacity(double p0) { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryHistory(com.android.internal.os.BatteryStatsHistory p0, long p1) { return null; }
        public android.os.BatteryUsageStats.Builder setBatteryTimeRemainingMs(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setChargeTimeRemainingMs(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsDuration(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsEndTimestamp(long p0) { return null; }
        public android.os.BatteryUsageStats.Builder setStatsStartTimestamp(long p0) { return null; }
    }
}
