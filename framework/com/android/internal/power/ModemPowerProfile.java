package com.android.internal.power;

public class ModemPowerProfile {
    private static final java.lang.String ATTR_LEVEL = "level";
    private static final java.lang.String ATTR_NR_FREQUENCY = "nrFrequency";
    private static final java.lang.String ATTR_RAT = "rat";
    private static final int IGNORE = -1;
    public static final int MODEM_DRAIN_TYPE_IDLE = 268435456;
    private static final int MODEM_DRAIN_TYPE_MASK = -268435456;
    private static final android.util.SparseArray<java.lang.String> MODEM_DRAIN_TYPE_NAMES = null;
    public static final int MODEM_DRAIN_TYPE_RX = 536870912;
    public static final int MODEM_DRAIN_TYPE_SLEEP = 0;
    public static final int MODEM_DRAIN_TYPE_TX = 805306368;
    public static final int MODEM_NR_FREQUENCY_RANGE_DEFAULT = 0;
    public static final int MODEM_NR_FREQUENCY_RANGE_HIGH = 196608;
    public static final int MODEM_NR_FREQUENCY_RANGE_LOW = 65536;
    private static final int MODEM_NR_FREQUENCY_RANGE_MASK = 983040;
    public static final int MODEM_NR_FREQUENCY_RANGE_MID = 131072;
    public static final int MODEM_NR_FREQUENCY_RANGE_MMWAVE = 262144;
    private static final android.util.SparseArray<java.lang.String> MODEM_NR_FREQUENCY_RANGE_NAMES = null;
    public static final int MODEM_RAT_TYPE_DEFAULT = 0;
    public static final int MODEM_RAT_TYPE_LTE = 1048576;
    private static final int MODEM_RAT_TYPE_MASK = 15728640;
    private static final android.util.SparseArray<java.lang.String> MODEM_RAT_TYPE_NAMES = null;
    public static final int MODEM_RAT_TYPE_NR = 2097152;
    public static final int MODEM_TX_LEVEL_0 = 0;
    public static final int MODEM_TX_LEVEL_1 = 16777216;
    public static final int MODEM_TX_LEVEL_2 = 33554432;
    public static final int MODEM_TX_LEVEL_3 = 50331648;
    public static final int MODEM_TX_LEVEL_4 = 67108864;
    private static final int MODEM_TX_LEVEL_COUNT = 5;
    private static final int[] MODEM_TX_LEVEL_MAP = null;
    private static final int MODEM_TX_LEVEL_MASK = 251658240;
    private static final android.util.SparseArray<java.lang.String> MODEM_TX_LEVEL_NAMES = null;
    private static final java.lang.String TAG = "ModemPowerProfile";
    private static final java.lang.String TAG_ACTIVE = "active";
    private static final java.lang.String TAG_IDLE = "idle";
    private static final java.lang.String TAG_RECEIVE = "receive";
    private static final java.lang.String TAG_SLEEP = "sleep";
    private static final java.lang.String TAG_TRANSMIT = "transmit";
    private final android.util.SparseDoubleArray mPowerConstants = null;
    public ModemPowerProfile() {}
    private static void appendFieldToString(java.lang.StringBuilder p0, java.lang.String p1, android.util.SparseArray<java.lang.String> p2, int p3) {}
    public static long getAverageBatteryDrainKey(int p0, int p1, int p2, int p3) { return 0L; }
    private static int getTypeFromAttribute(org.xmlpull.v1.XmlPullParser p0, java.lang.String p1, android.util.SparseArray<java.lang.String> p2) { return 0; }
    public static java.lang.String keyToString(int p0) { return null; }
    private void parseActivePowerConstantsFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void clear() {}
    public void dump(java.io.PrintWriter p0) {}
    public double getAverageBatteryDrainMa(int p0) { return 0.0; }
    public void parseFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public void setPowerConstant(int p0, java.lang.String p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemDrainType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemNrFrequencyRange {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemRatType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ModemTxLevel {
    }
}
