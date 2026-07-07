package android.security.trusttoken;

public class TrustTokenUnavailableException extends java.lang.IllegalStateException {
    public static final int ERROR_ATTESTATION = 4;
    public static final int ERROR_BOOT_NOT_COMPLETE = 7;
    public static final int ERROR_INVALID_TOKENS = 3;
    public static final int ERROR_MASTER_KEY = 5;
    public static final int ERROR_NO_PROVIDER = 6;
    public static final int ERROR_NO_VALID_ANCHOR = 1;
    public static final int ERROR_TOKEN_EXHAUSTED = 2;
    private final int mErrorCode = 0;
    public TrustTokenUnavailableException(int p0) { super(); }
    public TrustTokenUnavailableException(int p0, java.lang.String p1) { super(); }
    public TrustTokenUnavailableException(int p0, java.lang.String p1, java.lang.Throwable p2) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ErrorCode {
    }
}
