package android.os;

@android.annotation.SystemApi
public final class BatteryStatsManager {
    public static final int NUM_WIFI_STATES = 8;
    public static final int NUM_WIFI_SUPPL_STATES = 13;
    public static final int WIFI_STATE_OFF = 0;
    public static final int WIFI_STATE_OFF_SCANNING = 1;
    public static final int WIFI_STATE_ON_CONNECTED_P2P = 5;
    public static final int WIFI_STATE_ON_CONNECTED_STA = 4;
    public static final int WIFI_STATE_ON_CONNECTED_STA_P2P = 6;
    public static final int WIFI_STATE_ON_DISCONNECTED = 3;
    public static final int WIFI_STATE_ON_NO_NETWORKS = 2;
    public static final int WIFI_STATE_SOFT_AP = 7;
    public static final int WIFI_SUPPL_STATE_ASSOCIATED = 7;
    public static final int WIFI_SUPPL_STATE_ASSOCIATING = 6;
    public static final int WIFI_SUPPL_STATE_AUTHENTICATING = 5;
    public static final int WIFI_SUPPL_STATE_COMPLETED = 10;
    public static final int WIFI_SUPPL_STATE_DISCONNECTED = 1;
    public static final int WIFI_SUPPL_STATE_DORMANT = 11;
    public static final int WIFI_SUPPL_STATE_FOUR_WAY_HANDSHAKE = 8;
    public static final int WIFI_SUPPL_STATE_GROUP_HANDSHAKE = 9;
    public static final int WIFI_SUPPL_STATE_INACTIVE = 3;
    public static final int WIFI_SUPPL_STATE_INTERFACE_DISABLED = 2;
    public static final int WIFI_SUPPL_STATE_INVALID = 0;
    public static final int WIFI_SUPPL_STATE_SCANNING = 4;
    public static final int WIFI_SUPPL_STATE_UNINITIALIZED = 12;
    private final com.android.internal.app.IBatteryStats mBatteryStats = null;
    public BatteryStatsManager(com.android.internal.app.IBatteryStats p0) {}
    private static int getDataConnectionPowerState(boolean p0) { return 0; }
    public android.os.BatteryUsageStats getBatteryUsageStats() { return null; }
    public android.os.BatteryUsageStats getBatteryUsageStats(android.os.BatteryUsageStatsQuery p0) { return null; }
    public java.util.List<android.os.BatteryUsageStats> getBatteryUsageStats(java.util.List<android.os.BatteryUsageStatsQuery> p0) { return null; }
    public android.os.BluetoothBatteryStats getBluetoothBatteryStats() { return null; }
    public android.os.connectivity.CellularBatteryStats getCellularBatteryStats() { return null; }
    public android.os.WakeLockStats getWakeLockStats() { return null; }
    public android.os.connectivity.WifiBatteryStats getWifiBatteryStats() { return null; }
    public void reportBleScanReset() {}
    public void reportBleScanResults(android.os.WorkSource p0, int p1) {}
    public void reportBleScanStarted(android.os.WorkSource p0, boolean p1) {}
    public void reportBleScanStopped(android.os.WorkSource p0, boolean p1) {}
    @java.lang.Deprecated
    public void reportBluetoothOff(int p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public void reportBluetoothOn(int p0, int p1, java.lang.String p2) {}
    public void reportFullWifiLockAcquiredFromSource(android.os.WorkSource p0) {}
    public void reportFullWifiLockReleasedFromSource(android.os.WorkSource p0) {}
    public void reportMobileRadioPowerState(boolean p0, int p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void reportNetworkInterfaceForTransports(java.lang.String p0, int[] p1) throws java.lang.RuntimeException {}
    public void reportWifiBatchedScanStartedFromSource(android.os.WorkSource p0, int p1) {}
    public void reportWifiBatchedScanStoppedFromSource(android.os.WorkSource p0) {}
    public void reportWifiMulticastDisabled(android.os.WorkSource p0) {}
    public void reportWifiMulticastEnabled(android.os.WorkSource p0) {}
    public void reportWifiOff() {}
    public void reportWifiOn() {}
    public void reportWifiRadioPowerState(boolean p0, int p1) {}
    public void reportWifiRssiChanged(int p0) {}
    public void reportWifiScanStartedFromSource(android.os.WorkSource p0) {}
    public void reportWifiScanStoppedFromSource(android.os.WorkSource p0) {}
    public void reportWifiState(int p0, java.lang.String p1) {}
    public void reportWifiSupplicantStateChanged(int p0, boolean p1) {}
    public void resetBattery(boolean p0) {}
    public void setBatteryLevel(int p0, boolean p1) {}
    public void setChargerAcOnline(boolean p0, boolean p1) {}
    public void suspendBatteryInput() {}
    public void unplugBattery(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WifiSupplState {
    }
}
