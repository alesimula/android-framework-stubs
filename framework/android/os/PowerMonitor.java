package android.os;

public final class PowerMonitor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.PowerMonitor> CREATOR = null;
    public static final int POWER_MONITOR_TYPE_CONSUMER = 0;
    public static final int POWER_MONITOR_TYPE_MEASUREMENT = 1;
    public final int index = 0;
    private final java.lang.String mName = null;
    private final int mType = 0;
    public PowerMonitor(int p0, int p1, java.lang.String p2) {}
    private PowerMonitor(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getName() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerMonitorType {
    }
}
