package android.hardware.display;

public class AmbientDisplayConfiguration {
    private static final java.lang.String[] DOZE_SETTINGS = null;
    private static final java.lang.String[] NON_USER_CONFIGURABLE_DOZE_SETTINGS = null;
    private static final java.lang.String TAG = "AmbientDisplayConfig";
    private final boolean mAlwaysOnByDefault = false;
    private final android.content.Context mContext = null;
    private final boolean mDoubleTapGestureEnabledByDefault = false;
    private final boolean mDozeEnabledByDefault = false;
    private final boolean mPickupGestureEnabledByDefault = false;
    private final boolean mScreenOffUdfpsAvailable = false;
    private final boolean mTapGestureEnabledByDefault = false;
    final android.util.SparseArray<java.util.Map<java.lang.String, java.lang.String>> mUsersInitialValues = null;
    public AmbientDisplayConfiguration(android.content.Context p0) {}
    private boolean alwaysOnDisplayAvailable() { return false; }
    private boolean alwaysOnDisplayDebuggingEnabled() { return false; }
    private boolean boolSetting(java.lang.String p0, int p1, int p2) { return false; }
    private boolean boolSettingDefaultOff(java.lang.String p0, int p1) { return false; }
    private boolean boolSettingDefaultOn(java.lang.String p0, int p1) { return false; }
    private java.lang.String getDozeSetting(java.lang.String p0, int p1) { return null; }
    private boolean pulseOnLongPressAvailable() { return false; }
    private void putDozeSetting(java.lang.String p0, java.lang.String p1, int p2) {}
    public boolean accessibilityInversionEnabled(int p0) { return false; }
    public boolean alwaysOnAvailable() { return false; }
    public boolean alwaysOnAvailableForUser(int p0) { return false; }
    public boolean alwaysOnEnabled(int p0) { return false; }
    public boolean ambientDisplayAvailable() { return false; }
    public java.lang.String ambientDisplayComponent() { return null; }
    public void disableDozeSettings(int p0) {}
    public void disableDozeSettings(boolean p0, int p1) {}
    public boolean doubleTapGestureEnabled(int p0) { return false; }
    public boolean doubleTapSensorAvailable() { return false; }
    public java.lang.String doubleTapSensorType() { return null; }
    public boolean dozePickupSensorAvailable() { return false; }
    public boolean dozeSuppressed(int p0) { return false; }
    public boolean enabled(int p0) { return false; }
    public long getWakeLockScreenDebounce() { return 0L; }
    public java.lang.String longPressSensorType() { return null; }
    public boolean pickupGestureEnabled(int p0) { return false; }
    public boolean pulseOnLongPressEnabled(int p0) { return false; }
    public boolean pulseOnNotificationAvailable() { return false; }
    public boolean pulseOnNotificationEnabled(int p0) { return false; }
    public boolean quickPickupSensorEnabled(int p0) { return false; }
    public java.lang.String quickPickupSensorType() { return null; }
    public void restoreDozeSettings(int p0) {}
    public boolean screenOffUdfpsEnabled(int p0) { return false; }
    public boolean tapGestureEnabled(int p0) { return false; }
    public boolean tapSensorAvailable() { return false; }
    public java.lang.String[] tapSensorTypeMapping() { return null; }
    public java.lang.String udfpsLongPressSensorType() { return null; }
    public boolean wakeDisplayGestureEnabled(int p0) { return false; }
    public boolean wakeLockScreenGestureEnabled(int p0) { return false; }
    public boolean wakeScreenGestureAvailable() { return false; }
}
