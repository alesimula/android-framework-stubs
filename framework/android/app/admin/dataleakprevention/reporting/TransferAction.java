package android.app.admin.dataleakprevention.reporting;

public final class TransferAction {
    public static final int ACTION_TYPE_COPY_PASTE = 1;
    public static final int ACTION_TYPE_INTENT_SHARE = 4;
    public static final int ACTION_TYPE_SCREEN_CAPTURE_IMAGE = 2;
    public static final int ACTION_TYPE_SCREEN_CAPTURE_VIDEO = 3;
    public static final int ACTION_TYPE_UNSPECIFIED = 0;
    private final int mActionType = 0;
    public TransferAction(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getActionType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ActionType {
    }
}
