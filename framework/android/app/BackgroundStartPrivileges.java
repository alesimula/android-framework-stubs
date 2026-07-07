package android.app;

public final class BackgroundStartPrivileges {
    public static final android.app.BackgroundStartPrivileges ALLOW_BAL = null;
    public static final android.app.BackgroundStartPrivileges ALLOW_FGS = null;
    public static final android.app.BackgroundStartPrivileges NONE = null;
    private final boolean mAllowsBackgroundActivityStarts = false;
    private final boolean mAllowsBackgroundForegroundServiceStarts = false;
    private final android.os.IBinder mOriginatingToken = null;
    private BackgroundStartPrivileges(boolean p0, boolean p1, android.os.IBinder p2) {}
    public static android.app.BackgroundStartPrivileges allowBackgroundActivityStarts(android.os.IBinder p0) { return null; }
    public static android.app.BackgroundStartPrivileges merge(java.util.List<android.app.BackgroundStartPrivileges> p0) { return null; }
    public boolean allowsAny() { return false; }
    public boolean allowsBackgroundActivityStarts() { return false; }
    public boolean allowsBackgroundFgsStarts() { return false; }
    public boolean allowsNothing() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.IBinder getOriginatingToken() { return null; }
    public int hashCode() { return 0; }
    public android.app.BackgroundStartPrivileges merge(android.app.BackgroundStartPrivileges p0) { return null; }
    public java.lang.String toString() { return null; }
}
