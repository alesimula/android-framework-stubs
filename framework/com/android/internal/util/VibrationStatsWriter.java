package com.android.internal.util;

public class VibrationStatsWriter {
    private static final java.lang.String TAG = "VibrationStatsWriter";
    public static final int VIBRATION_PATTERN_PLAYED = 2;
    public static final int VIBRATION_PATTERN_SAVED = 1;
    private static com.android.internal.util.VibrationStatsWriter sVibrationStatsWriter;
    private final android.content.Context mContext = null;
    private final boolean mInitialized = false;
    private final java.util.Map<java.lang.String, java.lang.Integer> mNotificationVibrationPatternIdMap = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> mRingtoneVibrationPatternIdMap = null;
    private VibrationStatsWriter(android.content.Context p0) {}
    public static com.android.internal.util.VibrationStatsWriter getInstance(android.content.Context p0) { return null; }
    private static void loadVibrationPatternsIntoMap(android.content.Context p0, int p1, java.util.Map<java.lang.String, java.lang.Integer> p2) {}
    public static void setInstance(com.android.internal.util.VibrationStatsWriter p0) {}
    private int toVibrationPatternId(int p0, java.lang.String p1) { return 0; }
    public void logCustomVibrationPatternEvent(int p0, int p1, int p2, int p3, boolean p4) {}
    public void logCustomVibrationPatternEventIfNeeded(int p0, int p1, android.net.Uri p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VibrationPatternEventType {
    }
}
