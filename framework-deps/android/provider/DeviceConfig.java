package android.provider;

public class DeviceConfig {
    public DeviceConfig() {}
    public boolean getBoolean(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    public void addOnPropertiesChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.provider.DeviceConfig.OnPropertiesChangedListener p2) {}
    public java.lang.String getString(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int getInt(java.lang.String p0, java.lang.String p1, int p2) { return 0; }
    public long getLong(java.lang.String p0, java.lang.String p1, long p2) { return 0L; }
    public boolean deleteProperty(java.lang.String p0, java.lang.String p1) { return false; }
    public float getFloat(java.lang.String p0, java.lang.String p1, float p2) { return 0.0f; }
    public android.provider.DeviceConfig.Properties getProperties(java.lang.String p0, java.lang.String[] p1) { return null; }
    public java.lang.String getProperty(java.lang.String p0, java.lang.String p1) { return null; }
    public void removeOnPropertiesChangedListener(android.provider.DeviceConfig.OnPropertiesChangedListener p0) {}
    public void resetToDefaults(int p0, java.lang.String p1) {}
    public boolean setProperties(android.provider.DeviceConfig.Properties p0) { return false; }
    public boolean setProperty(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }

    public static interface OnPropertiesChangedListener {
    }

    public static class BadConfigException extends java.lang.Exception {
        public BadConfigException() { super(); }
        public BadConfigException(java.lang.String p0) { super(p0); }
        public BadConfigException(java.lang.String p0, java.lang.Throwable p1) { super(p0, p1); }
        public BadConfigException(java.lang.Throwable p0) { super(p0); }
    }

    public static class Properties {
        public Properties() {}
        public java.util.Set getKeyset() { return null; }
        public boolean getBoolean(java.lang.String p0, boolean p1) { return false; }
        public int getInt(java.lang.String p0, int p1) { return 0; }
        public long getLong(java.lang.String p0, long p1) { return 0L; }
        public java.lang.String getNamespace() { return null; }
        public java.lang.String getString(java.lang.String p0, java.lang.String p1) { return null; }
    }

    public static interface MonitorCallback {
    }
}
