package com.android.modules.expresslog;

public final class StatsExpressLog {
    public static final byte ANNOTATION_ID_DEFAULT_STATE = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_EXCLUSIVE_STATE = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_IS_UID = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_PRIMARY_FIELD = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_PRIMARY_FIELD_FIRST_UID = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_STATE_NESTED = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_TRIGGER_STATE_RESET = Byte.valueOf((byte)0);
    public static final byte ANNOTATION_ID_TRUNCATE_TIMESTAMP = Byte.valueOf((byte)0);
    public static final int EXPRESS_EVENT_REPORTED = 528;
    public static final int EXPRESS_HISTOGRAM_SAMPLE_REPORTED = 593;
    public static final int EXPRESS_UID_EVENT_REPORTED = 644;
    public static final int EXPRESS_UID_HISTOGRAM_SAMPLE_REPORTED = 658;
    public StatsExpressLog() {}
    public static void write(int p0, long p1, long p2) {}
    public static void write(int p0, long p1, long p2, int p3) {}
    public static void write(int p0, long p1, long p2, int p3, int p4) {}
}
