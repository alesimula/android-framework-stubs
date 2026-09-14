package android.app;

public class AppInteractionDeniedException extends android.app.AppInteractionException {
    public static final int REASON_AUTO_DENIED = 2;
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_USER_DENIED = 1;
    private final int mReason = 0;
    public AppInteractionDeniedException(java.lang.String p0, int p1) { super((java.lang.String)null); }
    public AppInteractionDeniedException(java.lang.String p0, int p1, android.os.Bundle p2) { super((java.lang.String)null); }
    public int getReason() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }
}
