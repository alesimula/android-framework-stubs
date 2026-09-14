package android.app.admin.policy;

public final class CrossDevice {
    public static final android.app.admin.PolicyIdentifier<java.lang.Integer> TASK_CONTINUITY_HANDOFF = null;
    public static final int TASK_CONTINUITY_HANDOFF_ALLOWED = 1;
    public static final int TASK_CONTINUITY_HANDOFF_DISALLOWED = 2;
    private CrossDevice() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TaskContinuityHandoffValue {
    }
}
