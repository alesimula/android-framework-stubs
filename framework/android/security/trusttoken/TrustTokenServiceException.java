package android.security.trusttoken;

@android.annotation.SystemApi
public final class TrustTokenServiceException extends java.lang.Exception {
    public static final int ERROR_CANCELLED = 4;
    public static final int ERROR_INTERNAL = 2;
    public static final int ERROR_INVALID_ARGUMENT = 1;
    public static final int ERROR_UNAVAILABLE = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorCode = 0;
    public TrustTokenServiceException(int p0, java.lang.String p1) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
