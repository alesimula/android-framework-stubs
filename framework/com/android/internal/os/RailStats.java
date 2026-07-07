package com.android.internal.os;

public final class RailStats {
    private static final java.lang.String CELLULAR_SUBSYSTEM = "cellular";
    private static final java.lang.String TAG = "RailStats";
    private static final java.lang.String WIFI_SUBSYSTEM = "wifi";
    private long mCellularTotalEnergyUseduWs;
    private java.util.Map<java.lang.Long, com.android.internal.os.RailStats.RailInfoData> mRailInfoData;
    private boolean mRailStatsAvailability;
    private long mWifiTotalEnergyUseduWs;
    public RailStats() {}
    public long getCellularTotalEnergyUseduWs() { return 0L; }
    public com.android.internal.os.RailStats getRailStats() { return null; }
    public long getWifiTotalEnergyUseduWs() { return 0L; }
    public boolean isRailStatsAvailable() { return false; }
    public void reset() {}
    public void resetCellularTotalEnergyUsed() {}
    public void resetWifiTotalEnergyUsed() {}
    public void setRailStatsAvailability(boolean p0) {}
    public void updateRailData(long p0, java.lang.String p1, java.lang.String p2, long p3, long p4) {}

    public static class RailInfoData {
        private static final java.lang.String TAG = "RailInfoData";
        public long energyUsedSinceBootuWs;
        public long index;
        public java.lang.String railName;
        public java.lang.String subSystemName;
        public long timestampSinceBootMs;
        private RailInfoData(long p0, java.lang.String p1, java.lang.String p2, long p3, long p4) {}
        public void printData() {}
    }
}
