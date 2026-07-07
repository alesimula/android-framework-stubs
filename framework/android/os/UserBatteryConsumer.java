package android.os;

public class UserBatteryConsumer extends android.os.BatteryConsumer {
    static final int COLUMN_COUNT = 2;
    private static final int COLUMN_INDEX_USER_ID = 1;
    static final int CONSUMER_TYPE_USER = 2;
    UserBatteryConsumer(android.os.BatteryConsumer.BatteryConsumerData p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    private UserBatteryConsumer(android.os.UserBatteryConsumer.Builder p0) { super((android.os.BatteryConsumer.BatteryConsumerData)null); }
    static void createFromXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.BatteryUsageStats.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void dump(java.io.PrintWriter p0, boolean p1) {}
    public int getUserId() { return 0; }
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    public static final class Builder extends android.os.BatteryConsumer.BaseBuilder<android.os.UserBatteryConsumer.Builder> {
        private java.util.List<android.os.UidBatteryConsumer.Builder> mUidBatteryConsumers;
        Builder(android.os.BatteryConsumer.BatteryConsumerData p0, int p1, double p2) { super(null, 0, 0.0); }
        public void addUidBatteryConsumer(android.os.UidBatteryConsumer.Builder p0) {}
        public android.os.UserBatteryConsumer build() { return null; }
    }
}
