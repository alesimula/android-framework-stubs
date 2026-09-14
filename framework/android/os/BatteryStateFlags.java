package android.os;

final class BatteryStateFlags {
    static final int FLAG_BATTERY_DEFENDER_ACTIVE = 8;
    static final int FLAG_BATTERY_LEVEL = 1;
    static final int FLAG_BATTERY_STATUS = 2;
    static final int FLAG_BATTERY_TIME_REMAINING_ESTIMATE = 512;
    static final int FLAG_EXTREME_POWER_SAVE = 64;
    static final int FLAG_INCOMPATIBLE_CHARGING = 16;
    static final int FLAG_PLUGGED_IN = 4;
    static final int FLAG_PLUGGED_TYPE = 1024;
    static final int FLAG_POWER_SAVE = 32;
    static final int FLAG_SHOW_BATTERY_PERCENT_SETTING = 256;
    static final int FLAG_STATE_UNKNOWN = 128;
    private BatteryStateFlags() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BatteryStateFlag {
    }
}
