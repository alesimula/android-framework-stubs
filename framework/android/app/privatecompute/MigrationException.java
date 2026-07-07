package android.app.privatecompute;

public final class MigrationException extends java.lang.Exception {
    public static final int ERROR_INVOCATION_FAILED = 1;
    public static final int ERROR_TIMEOUT = 2;
    private final int mErrorCode = 0;
    public MigrationException(int p0, java.lang.String p1) { super(); }
    public int getErrorCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MigrationError {
    }
}
