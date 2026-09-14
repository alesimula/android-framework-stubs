package android.os;

public final class BatteryState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.BatteryState> CREATOR = null;
    private final boolean mBatteryDefenderActive = false;
    private final int mBatteryLevel = 0;
    private final int mBatteryStatus = 0;
    private final long mBatteryTimeRemainingEstimateMillis = 0L;
    private final boolean mExtremePowerSaveEnabled = false;
    private final boolean mIncompatibleCharging = false;
    private final boolean mPluggedIn = false;
    private final int mPluggedType = 0;
    private final boolean mPowerSaveEnabled = false;
    private final boolean mShowBatteryPercentSettingEnabled = false;
    private final boolean mStateUnknown = false;
    private BatteryState(android.os.BatteryState.Builder p0) {}
    private BatteryState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getBatteryLevel() { return 0; }
    public int getBatteryStatus() { return 0; }
    public long getBatteryTimeRemainingEstimateMillis() { return 0L; }
    public int getPluggedType() { return 0; }
    public boolean isBatteryDefenderActive() { return false; }
    public boolean isExtremePowerSaveEnabled() { return false; }
    public boolean isIncompatibleCharging() { return false; }
    public boolean isPluggedIn() { return false; }
    public boolean isPowerSaveEnabled() { return false; }
    public boolean isShowBatteryPercentSettingEnabled() { return false; }
    public boolean isStateUnknown() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mBatteryDefenderActive;
        private int mBatteryLevel;
        private int mBatteryStatus;
        private long mBatteryTimeRemainingEstimateMillis;
        private boolean mExtremePowerSaveEnabled;
        private boolean mIncompatibleCharging;
        private boolean mPluggedIn;
        private int mPluggedType;
        private boolean mPowerSaveEnabled;
        private boolean mShowBatteryPercentSettingEnabled;
        private boolean mStateUnknown;
        public Builder() {}
        public android.os.BatteryState build() { return null; }
        public android.os.BatteryState.Builder setBatteryDefenderActive(boolean p0) { return null; }
        public android.os.BatteryState.Builder setBatteryLevel(int p0) { return null; }
        public android.os.BatteryState.Builder setBatteryStatus(int p0) { return null; }
        public android.os.BatteryState.Builder setBatteryTimeRemainingEstimateMillis(long p0) { return null; }
        public android.os.BatteryState.Builder setExtremePowerSaveEnabled(boolean p0) { return null; }
        public android.os.BatteryState.Builder setIncompatibleCharging(boolean p0) { return null; }
        public android.os.BatteryState.Builder setPluggedIn(boolean p0) { return null; }
        public android.os.BatteryState.Builder setPluggedType(int p0) { return null; }
        public android.os.BatteryState.Builder setPowerSaveEnabled(boolean p0) { return null; }
        public android.os.BatteryState.Builder setShowBatteryPercentSettingEnabled(boolean p0) { return null; }
        public android.os.BatteryState.Builder setStateUnknown(boolean p0) { return null; }
    }
}
