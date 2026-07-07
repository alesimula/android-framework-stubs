package android.app.admin;

public class DevicePolicyEventLogger {
    private java.lang.String mAdminPackageName;
    private boolean mBooleanValue;
    private final int mEventId = 0;
    private int mIntValue;
    private java.lang.String[] mStringArrayValue;
    private long mTimePeriodMs;
    private DevicePolicyEventLogger(int p0) {}
    public static android.app.admin.DevicePolicyEventLogger createEvent(int p0) { return null; }
    private static byte[] stringArrayValueToBytes(java.lang.String[] p0) { return null; }
    public java.lang.String getAdminPackageName() { return null; }
    public boolean getBoolean() { return false; }
    public int getEventId() { return 0; }
    public int getInt() { return 0; }
    public java.lang.String[] getStringArray() { return null; }
    public long getTimePeriod() { return 0L; }
    public android.app.admin.DevicePolicyEventLogger setAdmin(android.content.ComponentName p0) { return null; }
    public android.app.admin.DevicePolicyEventLogger setAdmin(java.lang.String p0) { return null; }
    public android.app.admin.DevicePolicyEventLogger setBoolean(boolean p0) { return null; }
    public android.app.admin.DevicePolicyEventLogger setInt(int p0) { return null; }
    public android.app.admin.DevicePolicyEventLogger setStrings(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { return null; }
    public android.app.admin.DevicePolicyEventLogger setStrings(java.lang.String p0, java.lang.String[] p1) { return null; }
    public android.app.admin.DevicePolicyEventLogger setStrings(java.lang.String... p0) { return null; }
    public android.app.admin.DevicePolicyEventLogger setTimePeriod(long p0) { return null; }
    public void write() {}
}
