package android.service.personalcontext.embedded;

@android.annotation.SystemApi
public class InsightSurfaceSessionException extends java.lang.Exception {
    public static final int ERROR_FAILED_TO_CREATE_SESSION = 1;
    private final int mErrorCode = 0;
    private final java.lang.String mMessage = null;
    public InsightSurfaceSessionException(int p0, java.lang.String p1) { super(); }
    public int getErrorCode() { return 0; }
    public java.lang.String getMessage() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ClientError {
    }
}
