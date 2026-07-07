package android.app.admin.policy;

public class DateTime {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> AUTO_TIME = null;
    public static final int AUTO_TIME_DISABLED = 3;
    public static final int AUTO_TIME_DISABLED_UNENFORCED = 1;
    public static final int AUTO_TIME_ENABLED = 4;
    public static final int AUTO_TIME_ENABLED_UNENFORCED = 2;
    public static final int AUTO_TIME_USER_CHOICE = 0;
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> AUTO_TIME_ZONE = null;
    public static final int AUTO_TIME_ZONE_DISABLED = 3;
    public static final int AUTO_TIME_ZONE_DISABLED_UNENFORCED = 1;
    public static final int AUTO_TIME_ZONE_ENABLED = 4;
    public static final int AUTO_TIME_ZONE_ENABLED_UNENFORCED = 2;
    public static final int AUTO_TIME_ZONE_USER_CHOICE = 0;
    private DateTime() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoTimeValue {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoTimeZoneValue {
    }
}
