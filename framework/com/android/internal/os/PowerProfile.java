package com.android.internal.os;

public class PowerProfile {
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String CPU_CLUSTER_POWER_COUNT = "cpu.cluster_power.cluster";
    private static final java.lang.String CPU_CORE_POWER_PREFIX = "cpu.core_power.cluster";
    private static final java.lang.String CPU_CORE_SPEED_PREFIX = "cpu.core_speeds.cluster";
    private static final java.lang.String CPU_PER_CLUSTER_CORE_COUNT = "cpu.clusters.cores";
    private static final java.lang.String CPU_POWER_BRACKETS_PREFIX = "cpu.power_brackets.policy";
    private static final java.lang.String CPU_SCALING_POLICY_POWER_POLICY = "cpu.scaling_policy_power.policy";
    private static final java.lang.String CPU_SCALING_STEP_POWER_POLICY = "cpu.scaling_step_power.policy";
    @java.lang.Deprecated
    public static final java.lang.String POWER_AMBIENT_DISPLAY = "ambient.on";
    public static final java.lang.String POWER_AUDIO = "audio";
    public static final java.lang.String POWER_BATTERY_CAPACITY = "battery.capacity";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_ACTIVE = "bluetooth.active";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_AT_CMD = "bluetooth.at";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_IDLE = "bluetooth.controller.idle";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_OPERATING_VOLTAGE = "bluetooth.controller.voltage";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_RX = "bluetooth.controller.rx";
    public static final java.lang.String POWER_BLUETOOTH_CONTROLLER_TX = "bluetooth.controller.tx";
    @java.lang.Deprecated
    public static final java.lang.String POWER_BLUETOOTH_ON = "bluetooth.on";
    public static final int POWER_BRACKETS_UNSPECIFIED = -1;
    public static final java.lang.String POWER_CAMERA = "camera.avg";
    public static final java.lang.String POWER_CPU_ACTIVE = "cpu.active";
    public static final java.lang.String POWER_CPU_IDLE = "cpu.idle";
    public static final java.lang.String POWER_CPU_SUSPEND = "cpu.suspend";
    public static final java.lang.String POWER_FLASHLIGHT = "camera.flashlight";
    public static final java.lang.String POWER_GPS_ON = "gps.on";
    public static final java.lang.String POWER_GPS_OPERATING_VOLTAGE = "gps.voltage";
    public static final java.lang.String POWER_GPS_SIGNAL_QUALITY_BASED = "gps.signalqualitybased";
    public static final java.lang.String POWER_GROUP_DISPLAY_AMBIENT = "ambient.on.display";
    public static final java.lang.String POWER_GROUP_DISPLAY_SCREEN_FULL = "screen.full.display";
    public static final java.lang.String POWER_GROUP_DISPLAY_SCREEN_ON = "screen.on.display";
    public static final java.lang.String POWER_MEMORY = "memory.bandwidths";
    public static final java.lang.String POWER_MODEM_CONTROLLER_IDLE = "modem.controller.idle";
    public static final java.lang.String POWER_MODEM_CONTROLLER_OPERATING_VOLTAGE = "modem.controller.voltage";
    public static final java.lang.String POWER_MODEM_CONTROLLER_RX = "modem.controller.rx";
    public static final java.lang.String POWER_MODEM_CONTROLLER_SLEEP = "modem.controller.sleep";
    public static final java.lang.String POWER_MODEM_CONTROLLER_TX = "modem.controller.tx";
    public static final java.lang.String POWER_RADIO_ACTIVE = "radio.active";
    public static final java.lang.String POWER_RADIO_ON = "radio.on";
    public static final java.lang.String POWER_RADIO_SCANNING = "radio.scanning";
    @java.lang.Deprecated
    public static final java.lang.String POWER_SCREEN_FULL = "screen.full";
    @java.lang.Deprecated
    public static final java.lang.String POWER_SCREEN_ON = "screen.on";
    public static final java.lang.String POWER_VIDEO = "video";
    public static final java.lang.String POWER_WIFI_ACTIVE = "wifi.active";
    public static final java.lang.String POWER_WIFI_BATCHED_SCAN = "wifi.batchedscan";
    public static final java.lang.String POWER_WIFI_CONTROLLER_IDLE = "wifi.controller.idle";
    public static final java.lang.String POWER_WIFI_CONTROLLER_OPERATING_VOLTAGE = "wifi.controller.voltage";
    public static final java.lang.String POWER_WIFI_CONTROLLER_RX = "wifi.controller.rx";
    public static final java.lang.String POWER_WIFI_CONTROLLER_TX = "wifi.controller.tx";
    public static final java.lang.String POWER_WIFI_CONTROLLER_TX_LEVELS = "wifi.controller.tx_levels";
    public static final java.lang.String POWER_WIFI_ON = "wifi.on";
    public static final java.lang.String POWER_WIFI_SCAN = "wifi.scan";
    private static final long SUBSYSTEM_FIELDS_MASK = -1L;
    private static final long SUBSYSTEM_MASK = 64424509440L;
    public static final long SUBSYSTEM_MODEM = 4294967296L;
    public static final long SUBSYSTEM_NONE = 0L;
    public static final java.lang.String TAG = "PowerProfile";
    private static final java.lang.String TAG_ARRAY = "array";
    private static final java.lang.String TAG_ARRAYITEM = "value";
    private static final java.lang.String TAG_DEVICE = "device";
    private static final java.lang.String TAG_ITEM = "item";
    private static final java.lang.String TAG_MODEM = "modem";
    private static final java.lang.Object sLock = null;
    static final com.android.internal.power.ModemPowerProfile sModemPowerProfile = null;
    static final java.util.HashMap<java.lang.String, java.lang.Double[]> sPowerArrayMap = null;
    static final java.util.HashMap<java.lang.String, java.lang.Double> sPowerItemMap = null;
    private com.android.internal.os.PowerProfile.CpuClusterKey[] mCpuClusters;
    private int mCpuPowerBracketCount;
    private android.util.SparseArray<com.android.internal.os.PowerProfile.CpuScalingPolicyPower> mCpuScalingPolicies;
    private int mNumDisplays;
    public PowerProfile() {}
    public PowerProfile(android.content.Context p0) {}
    public PowerProfile(android.content.Context p0, boolean p1) {}
    private static void getDefaultValuesFromConfig(android.content.res.Resources p0) {}
    private static java.lang.String getOrdinalPowerType(java.lang.String p0, int p1) { return null; }
    private void handleDeprecatedModemConstant(int p0, java.lang.String p1, int p2) {}
    private void initCpuClusters() {}
    private void initCpuPowerBrackets() {}
    private void initCpuScalingPolicies() {}
    private void initDisplays() {}
    private void initLocked() {}
    private void initLocked(android.content.Context p0, int p1) {}
    private void initModem() {}
    private static void readPowerValuesFromXml(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) {}
    private void writePowerConstantArrayToProto(android.util.proto.ProtoOutputStream p0, java.lang.String p1, long p2) {}
    private void writePowerConstantToProto(android.util.proto.ProtoOutputStream p0, java.lang.String p1, long p2) {}
    public void dump(java.io.PrintWriter p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0) {}
    public double getAverageBatteryDrainMa(long p0) { return 0.0; }
    public double getAverageBatteryDrainOrDefaultMa(long p0, double p1) { return 0.0; }
    public double getAveragePower(java.lang.String p0) { return 0.0; }
    public double getAveragePower(java.lang.String p0, int p1) { return 0.0; }
    @java.lang.Deprecated
    public double getAveragePowerForCpuCluster(int p0) { return 0.0; }
    @java.lang.Deprecated
    public double getAveragePowerForCpuCore(int p0, int p1) { return 0.0; }
    public double getAveragePowerForCpuScalingPolicy(int p0) { return 0.0; }
    public double getAveragePowerForCpuScalingStep(int p0, int p1) { return 0.0; }
    public double getAveragePowerForOrdinal(java.lang.String p0, int p1) { return 0.0; }
    public double getAveragePowerForOrdinal(java.lang.String p0, int p1, double p2) { return 0.0; }
    public double getAveragePowerOrDefault(java.lang.String p0, double p1) { return 0.0; }
    public double getBatteryCapacity() { return 0.0; }
    public int getCpuPowerBracketCount() { return 0; }
    public int getCpuPowerBracketForScalingStep(int p0, int p1) { return 0; }
    @java.lang.Deprecated
    public int getNumCoresInCpuCluster(int p0) { return 0; }
    @java.lang.Deprecated
    public int getNumCpuClusters() { return 0; }
    public int getNumDisplays() { return 0; }
    public int getNumElements(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public int getNumSpeedStepsInCpuCluster(int p0) { return 0; }
    public void initForTesting(org.xmlpull.v1.XmlPullParser p0) {}
    public void initForTesting(org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1) {}

    private static class CpuClusterKey {
        public final java.lang.String clusterPowerKey = null;
        public final java.lang.String corePowerKey = null;
        public final java.lang.String freqKey = null;
        public final int numCpus = 0;
        private CpuClusterKey(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3) {}
    }

    private static class CpuScalingPolicyPower {
        public final double policyPower = 0.0;
        public int[] powerBrackets;
        public final double[] stepPower = null;
        private CpuScalingPolicyPower(double p0, double[] p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerGroup {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Subsystem {
    }
}
