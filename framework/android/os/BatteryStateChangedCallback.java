package android.os;

public interface BatteryStateChangedCallback {
    public static final int ERROR_PROPERTY_UNAVAILABLE = 1;
    public void onError(int p0, java.lang.String p1);
    public void onStateChanged(android.os.BatteryStateFilter p0, android.os.BatteryState p1);
}
