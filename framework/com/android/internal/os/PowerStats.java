package com.android.internal.os;

public final class PowerStats {
    public static final int MAX_STATE_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    public static final int MAX_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    public static final int MAX_UID_STATS_ARRAY_LENGTH = Integer.valueOf(0);
    private static final byte PARCEL_FORMAT_VERSION = 2;
    private static final int PARCEL_FORMAT_VERSION_MASK = 255;
    private static final int PARCEL_FORMAT_VERSION_SHIFT = Integer.valueOf(0);
    private static final int STATE_STATS_ARRAY_LENGTH_MASK = 16711680;
    private static final int STATE_STATS_ARRAY_LENGTH_SHIFT = Integer.valueOf(0);
    private static final int STATS_ARRAY_LENGTH_MASK = 65280;
    private static final int STATS_ARRAY_LENGTH_SHIFT = Integer.valueOf(0);
    private static final java.lang.String TAG = "PowerStats";
    private static final int UID_STATS_ARRAY_LENGTH_MASK = -16777216;
    private static final int UID_STATS_ARRAY_LENGTH_SHIFT = Integer.valueOf(0);
    private static final com.android.internal.os.BatteryStatsHistory.VarintParceler VARINT_PARCELER = null;
    public final com.android.internal.os.PowerStats.Descriptor descriptor = null;
    public long durationMs;
    public final android.util.SparseArray<long[]> stateStats = null;
    public long[] stats;
    public final android.util.SparseArray<long[]> uidStats = null;
    public PowerStats(com.android.internal.os.PowerStats.Descriptor p0) {}
    public static com.android.internal.os.PowerStats readFromParcel(android.os.Parcel p0, com.android.internal.os.PowerStats.DescriptorRegistry p1) { return null; }
    public void dump(android.util.IndentingPrintWriter p0) {}
    public java.lang.String formatForBatteryHistory(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0) {}

    public static class Descriptor {
        public static final java.lang.String EXTRA_DEVICE_STATS_FORMAT = "format-device";
        public static final java.lang.String EXTRA_STATE_STATS_FORMAT = "format-state";
        public static final java.lang.String EXTRA_UID_STATS_FORMAT = "format-uid";
        private static final java.lang.String XML_ATTR_ID = "id";
        private static final java.lang.String XML_ATTR_NAME = "name";
        private static final java.lang.String XML_ATTR_STATE_KEY = "key";
        private static final java.lang.String XML_ATTR_STATE_LABEL = "label";
        private static final java.lang.String XML_ATTR_STATE_STATS_ARRAY_LENGTH = "state-stats-array-length";
        private static final java.lang.String XML_ATTR_STATS_ARRAY_LENGTH = "stats-array-length";
        private static final java.lang.String XML_ATTR_UID_STATS_ARRAY_LENGTH = "uid-stats-array-length";
        public static final java.lang.String XML_TAG_DESCRIPTOR = "descriptor";
        private static final java.lang.String XML_TAG_EXTRAS = "extras";
        private static final java.lang.String XML_TAG_STATE = "state";
        public final android.os.PersistableBundle extras = null;
        private com.android.internal.os.PowerStats.PowerStatsFormatter mDeviceStatsFormatter;
        private com.android.internal.os.PowerStats.PowerStatsFormatter mStateStatsFormatter;
        private com.android.internal.os.PowerStats.PowerStatsFormatter mUidStatsFormatter;
        public final java.lang.String name = null;
        public final int powerComponentId = 0;
        public final android.util.SparseArray<java.lang.String> stateLabels = null;
        public final int stateStatsArrayLength = 0;
        public final int statsArrayLength = 0;
        public final int uidStatsArrayLength = 0;
        public Descriptor(int p0, int p1, android.util.SparseArray<java.lang.String> p2, int p3, int p4, android.os.PersistableBundle p5) {}
        public Descriptor(int p0, java.lang.String p1, int p2, android.util.SparseArray<java.lang.String> p3, int p4, int p5, android.os.PersistableBundle p6) {}
        public static com.android.internal.os.PowerStats.Descriptor createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
        public static com.android.internal.os.PowerStats.Descriptor readSummaryFromParcel(android.os.Parcel p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public com.android.internal.os.PowerStats.PowerStatsFormatter getDeviceStatsFormatter() { return null; }
        public java.lang.String getStateLabel(int p0) { return null; }
        public com.android.internal.os.PowerStats.PowerStatsFormatter getStateStatsFormatter() { return null; }
        public com.android.internal.os.PowerStats.PowerStatsFormatter getUidStatsFormatter() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeSummaryToParcel(android.os.Parcel p0) {}
        public void writeXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
    }

    public static class DescriptorRegistry {
        private final android.util.SparseArray<com.android.internal.os.PowerStats.Descriptor> mDescriptors = null;
        public DescriptorRegistry() {}
        public com.android.internal.os.PowerStats.Descriptor get(int p0) { return null; }
        public void register(com.android.internal.os.PowerStats.Descriptor p0) {}
    }

    public static class PowerStatsFormatter {
        private static final double NANO_TO_MILLI_MULTIPLIER = 1e-06;
        private static final java.util.regex.Pattern SECTION_PATTERN = null;
        private final java.util.List<com.android.internal.os.PowerStats.PowerStatsFormatter.Section> mSections = null;
        public PowerStatsFormatter(java.lang.String p0) {}
        private java.lang.String format(java.util.List<com.android.internal.os.PowerStats.PowerStatsFormatter.Section> p0, long[] p1) { return null; }
        private java.util.List<com.android.internal.os.PowerStats.PowerStatsFormatter.Section> parseFormat(java.lang.String p0) { return null; }
        public java.lang.String format(long[] p0) { return null; }

        private static class Section {
            public java.lang.String label;
            public int length;
            public boolean optional;
            public int position;
            public boolean typePower;
            private Section() {}
        }
    }
}
