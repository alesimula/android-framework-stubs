package android.app;

public final class AnrTypes {
    public static final int ANR_TYPE_APPLICATION_START = 10;
    public static final int ANR_TYPE_APP_TRIGGERED = 7;
    public static final int ANR_TYPE_BROADCAST_OF_INTENT = 3;
    public static final int ANR_TYPE_CONTENT_PROVIDER_NOT_RESPONDING = 6;
    public static final int ANR_TYPE_EXECUTE_SERVICE = 5;
    public static final int ANR_TYPE_FOREGROUND_SHORT_SERVICE_TIMEOUT = 8;
    public static final int ANR_TYPE_INPUT_DISPATCH = 2;
    public static final int ANR_TYPE_INPUT_DISPATCH_NO_FOCUSED_WINDOW = 1;
    public static final int ANR_TYPE_JOB_SERVICE_START = 9;
    public static final int ANR_TYPE_OTHER = 0;
    public static final int ANR_TYPE_START_FOREGROUND_SERVICE = 4;
    private AnrTypes() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AnrType {
    }
}
