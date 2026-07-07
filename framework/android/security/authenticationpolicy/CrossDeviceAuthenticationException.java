package android.security.authenticationpolicy;

@android.annotation.SystemApi
public final class CrossDeviceAuthenticationException extends java.lang.Exception {
    public static final int ERROR_DECRYPTION_FAILED = 2;
    public static final int ERROR_INVALID_PACKAGE = 3;
    public static final int ERROR_INVALID_TIMESTAMP = 4;
    public static final int ERROR_NOT_IN_FOREGROUND = 6;
    public static final int ERROR_SERIALIZATION_FAILED = 5;
    public static final int ERROR_UNAUTHORIZED = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorCode = 0;
    public CrossDeviceAuthenticationException(int p0) { super(); }
    public CrossDeviceAuthenticationException(int p0, java.lang.String p1) { super(); }
    public CrossDeviceAuthenticationException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
