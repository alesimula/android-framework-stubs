package android.app.privatecompute;

@android.annotation.SystemApi
public class PccAuditException extends java.lang.Exception {
    public static final int ERROR_UNAVAILABLE = 2;
    public static final int ERROR_UNKNOWN = 1;
    private final int mErrorCode = 0;
    public PccAuditException(int p0, java.lang.String p1) { super(); }
    public PccAuditException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public PccAuditException(java.lang.String p0) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
