package android.os;

public final class BatteryStateFilter {
    private final int mFlags = 0;
    BatteryStateFilter(android.os.BatteryStateFilter.Builder p0) {}
    int getFlags() { return 0; }
    public boolean isBatteryDefenderActiveIncluded() { return false; }
    public boolean isBatteryLevelIncluded() { return false; }
    public boolean isBatteryStatusIncluded() { return false; }
    public boolean isBatteryTimeRemainingEstimateIncluded() { return false; }
    public boolean isExtremePowerSaveIncluded() { return false; }
    public boolean isIncompatibleChargingIncluded() { return false; }
    public boolean isPluggedInIncluded() { return false; }
    public boolean isPluggedTypeIncluded() { return false; }
    public boolean isPowerSaveIncluded() { return false; }
    public boolean isShowBatteryPercentSettingIncluded() { return false; }
    public boolean isStateUnknownIncluded() { return false; }

    public static final class Builder {
        private int mFlags;
        public Builder() {}
        public android.os.BatteryStateFilter build() { return null; }
        public android.os.BatteryStateFilter.Builder setBatteryDefenderActiveIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setBatteryLevelIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setBatteryStatusIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setBatteryTimeRemainingEstimateIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setExtremePowerSaveIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setIncompatibleChargingIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setPluggedInIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setPluggedTypeIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setPowerSaveIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setShowBatteryPercentSettingIncluded(boolean p0) { return null; }
        public android.os.BatteryStateFilter.Builder setStateUnknownIncluded(boolean p0) { return null; }
    }
}
