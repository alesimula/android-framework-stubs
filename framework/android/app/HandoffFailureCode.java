package android.app;

public final class HandoffFailureCode {
    public static final int HANDOFF_FAILURE_APP_DID_NOT_REPORT_HANDOFF_DATA = 7;
    public static final int HANDOFF_FAILURE_EMPTY_TASK = 5;
    public static final int HANDOFF_FAILURE_INTERNAL_ERROR = 4;
    public static final int HANDOFF_FAILURE_TIMEOUT = 1;
    public static final int HANDOFF_FAILURE_UNKNOWN_TASK = 3;
    public static final int HANDOFF_FAILURE_UNSUPPORTED_DEVICE = 2;
    public static final int HANDOFF_FAILURE_UNSUPPORTED_TASK = 6;
    private HandoffFailureCode() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureCode {
    }
}
