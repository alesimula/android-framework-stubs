package android.os;

public final class UidBatteryConsumer extends android.os.BatteryConsumer {
    static final int COLUMN_COUNT = 3;
    static final int COLUMN_INDEX_PACKAGE_WITH_HIGHEST_DRAIN = 2;
    static final int COLUMN_INDEX_UID = 1;
    static final int CONSUMER_TYPE_UID = 1;
    public static final int STATE_BACKGROUND = 1;
    public static final int STATE_FOREGROUND = 0;
    UidBatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    private UidBatteryConsumer(android.os.UidBatteryConsumer.Builder p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    private void appendProcessStateData(java.lang.StringBuilder p0, int p1, boolean p2) {}
    static void createFromXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public java.lang.String getPackageWithHighestDrain() { return null; }
    public long getTimeInProcessStateMs(int p0) { return 0L; }
    @java.lang.Deprecated
    public long getTimeInStateMs(int p0) { return 0L; }
    public int getUid() { return 0; }
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UidBatteryConsumer.Builder> {
        private static final java.lang.String PACKAGE_NAME_UNINITIALIZED = "";
        private final android.os.BatteryStats.Uid mBatteryStatsUid = null;
        private boolean mExcludeFromBatteryUsageStats;
        private final boolean mIsVirtualUid = false;
        private java.lang.String mPackageWithHighestDrain;
        private final int mUid = 0;
        public Builder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1, double p2) { super(null, 0, 0.0); }
        public Builder(android.os.BatteryConsumer.BatteryConsumerData p0, android.os.BatteryStats.Uid p1, double p2) { super(null, 0, 0.0); }
        private Builder(android.os.BatteryConsumer.BatteryConsumerData p0, android.os.BatteryStats.Uid p1, int p2, double p3) { super(null, 0, 0.0); }
        public android.os.UidBatteryConsumer.Builder add(android.os.UidBatteryConsumer p0) { return null; }
        public android.os.UidBatteryConsumer build() { return null; }
        public android.os.UidBatteryConsumer.Builder excludeFromBatteryUsageStats() { return null; }
        public android.os.BatteryStats.Uid getBatteryStatsUid() { return null; }
        public int getUid() { return 0; }
        public boolean isExcludedFromBatteryUsageStats() { return false; }
        public boolean isVirtualUid() { return false; }
        public android.os.UidBatteryConsumer.Builder setPackageWithHighestDrain(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.os.UidBatteryConsumer.Builder setTimeInProcessStateMs(int p0, long p1) { return null; }
        @java.lang.Deprecated
        public android.os.UidBatteryConsumer.Builder setTimeInStateMs(int p0, long p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
