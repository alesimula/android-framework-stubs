package android.os;

class PowerComponents {
    private static final java.lang.String TAG = "PowerComponents";
    private static final java.lang.String XML_TAG_CUSTOM_COMPONENT_COMPAT = "custom_component";
    private final android.os.BatteryConsumer.BatteryConsumerData mData = null;
    PowerComponents(android.os.BatteryConsumer.BatteryConsumerData p0) {}
    PowerComponents(android.os.PowerComponents.Builder p0) {}
    private void dump(java.lang.StringBuilder p0, int p1, int p2, int p3, int p4, boolean p5) {}
    static void parseXml(com.android.modules.utils.TypedXmlPullParser p0, android.os.PowerComponents.Builder p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void writePowerComponentUsage(android.util.proto.ProtoOutputStream p0, long p1, int p2, long p3, long p4) {}
    private void writePowerUsageSlice(android.util.proto.ProtoOutputStream p0, int p1, long p2, long p3, int p4) {}
    private boolean writeStatsProtoImpl(android.util.proto.ProtoOutputStream p0) { return false; }
    void dump(java.io.PrintWriter p0, int p1, int p2, boolean p3) {}
    public double getConsumedPower(int p0, int p1, int p2, int p3) { return 0.0; }
    public double getConsumedPower(android.os.BatteryConsumer.Dimensions p0) { return 0.0; }
    public double getConsumedPower(android.os.BatteryConsumer.Key p0) { return 0.0; }
    public java.lang.String getCustomPowerComponentName(int p0) { return null; }
    public long getUsageDurationMillis(int p0, int p1, int p2, int p3) { return 0L; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Dimensions p0) { return 0L; }
    public long getUsageDurationMillis(android.os.BatteryConsumer.Key p0) { return 0L; }
    boolean hasStatsProtoData() { return false; }
    void writeStatsProto(android.util.proto.ProtoOutputStream p0) {}
    void writeToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}

    static final class Builder {
        private final android.os.BatteryConsumer.BatteryConsumerData mData = null;
        private final double mMinConsumedPowerThreshold = 0.0;
        Builder(android.os.BatteryConsumer.BatteryConsumerData p0, double p1) {}
        private void addPowerAndDuration(android.os.BatteryConsumer.BatteryConsumerData p0) {}
        public android.os.PowerComponents.Builder addConsumedPower(android.os.BatteryConsumer.Key p0, double p1) { return null; }
        public void addPowerAndDuration(android.os.PowerComponents.Builder p0) {}
        public void addPowerAndDuration(android.os.PowerComponents p0) {}
        public android.os.PowerComponents.Builder addUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
        public android.os.PowerComponents build() { return null; }
        public double getTotalPower() { return 0.0; }
        @java.lang.Deprecated
        public android.os.PowerComponents.Builder setConsumedPower(android.os.BatteryConsumer.Key p0, double p1) { return null; }
        @java.lang.Deprecated
        public android.os.PowerComponents.Builder setUsageDurationMillis(android.os.BatteryConsumer.Key p0, long p1) { return null; }
    }
}
