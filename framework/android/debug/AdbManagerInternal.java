package android.debug;

public abstract class AdbManagerInternal {
    public AdbManagerInternal() {}
    public abstract java.io.File getAdbKeysFile();
    public abstract java.io.File getAdbTempKeysFile();
    public abstract boolean isAdbEnabled(byte p0);
    public abstract void notifyKeyFilesUpdated();
    public abstract void registerTransport(android.debug.IAdbTransport p0);
    public abstract void unregisterTransport(android.debug.IAdbTransport p0);
}
