package android.media.permission;

public class ClearCallingIdentityContext implements android.media.permission.SafeCloseable {
    private final long mRestoreKey = 0L;
    private ClearCallingIdentityContext() {}
    public static android.media.permission.SafeCloseable create() { return null; }
    public void close() {}
}
