package android.app;

public class AppInteractionException extends java.lang.Exception {
    public static final int ERROR_ACCESS_DENIED_AUTO_DENIED = 3;
    public static final int ERROR_ACCESS_DENIED_UNKNOWN = 1;
    public static final int ERROR_ACCESS_DENIED_USER_DENIED = 2;
    public static final int ERROR_UNKNOWN = 0;
    private final android.os.Bundle mExtras = null;
    AppInteractionException(java.lang.String p0) { super(); }
    AppInteractionException(java.lang.String p0, android.os.Bundle p1) { super(); }
    static android.app.AppInteractionException create(int p0, java.lang.String p1) { return null; }
    public android.os.Bundle getExtras() { return null; }
}
