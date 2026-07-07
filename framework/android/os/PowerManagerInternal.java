package android.os;

public abstract class PowerManagerInternal {
    public static final int BOOST_DISPLAY_UPDATE_IMMINENT = 1;
    public static final int BOOST_INTERACTION = 0;
    public static final int MODE_DEVICE_IDLE = 8;
    public static final int MODE_DISPLAY_CHANGE = 17;
    public static final int MODE_DISPLAY_INACTIVE = 9;
    public static final int MODE_DOUBLE_TAP_TO_WAKE = 0;
    public static final int MODE_EXPENSIVE_RENDERING = 6;
    public static final int MODE_FIXED_PERFORMANCE = 3;
    public static final int MODE_INTERACTIVE = 7;
    public static final int MODE_LAUNCH = 5;
    public static final int MODE_LOW_POWER = 1;
    public static final int MODE_SUSTAINED_PERFORMANCE = 2;
    public static final int MODE_VR = 4;
    public static final int WAKEFULNESS_ASLEEP = 0;
    public static final int WAKEFULNESS_AWAKE = 1;
    public static final int WAKEFULNESS_DOZING = 3;
    public static final int WAKEFULNESS_DREAMING = 2;
    public PowerManagerInternal() {}
    public static java.lang.String getLockLevelString(int p0) { return null; }
    public static boolean isInteractive(int p0) { return false; }
    public static int wakefulnessToProtoEnum(int p0) { return 0; }
    public static java.lang.String wakefulnessToString(int p0) { return null; }
    public abstract void finishUidChanges();
    public abstract android.os.PowerManagerInternal.UidChangesBatch getBatchProxy();
    public abstract android.os.PowerManager.SleepData getLastGoToSleep();
    public abstract android.os.PowerManager.WakeData getLastWakeup();
    public abstract android.os.PowerSaveState getLowPowerState(int p0);
    public abstract void goToSleepPerGroup(android.util.IntArray p0, long p1, int p2, int p3);
    public abstract boolean interceptPowerKeyDown(android.view.KeyEvent p0);
    public abstract boolean isAmbientDisplaySuppressed();
    public abstract boolean isAnyDefaultAdjacentGroupInteractive();
    public abstract boolean isDefaultGroupAdjacent(int p0);
    public abstract boolean isGroupInteractive(int p0);
    public abstract void nap(long p0, boolean p1);
    public void registerLowPowerModeObserver(int p0, java.util.function.Consumer<android.os.PowerSaveState> p1) {}
    public abstract void registerLowPowerModeObserver(android.os.PowerManagerInternal.LowPowerModeListener p0);
    public abstract void registerUserActivityListener(android.os.PowerManagerInternal.UserActivityListener p0);
    public abstract boolean setDeviceIdleMode(boolean p0);
    public abstract void setDeviceIdleTempWhitelist(int[] p0);
    public abstract void setDeviceIdleWhitelist(int[] p0);
    public abstract void setDevicePostured(boolean p0);
    public abstract void setDozeOverrideFromDreamManager(int p0, int p1, float p2, boolean p3);
    public abstract void setDrawWakeLockOverrideFromSidekick(boolean p0);
    public abstract void setForceDisableWakelocks(boolean p0);
    public abstract void setForceDisableWakelocksByDisplay(boolean p0, android.util.IntArray p1);
    public abstract void setForceDisableWakelocksByPowerGroup(boolean p0, android.util.IntArray p1);
    public abstract boolean setLightDeviceIdleMode(boolean p0);
    public abstract void setLowPowerStandbyActive(boolean p0);
    public abstract void setLowPowerStandbyAllowlist(int[] p0);
    public abstract void setMaximumScreenOffTimeoutFromDeviceAdmin(int p0, long p1);
    public abstract void setPowerBoost(int p0, int p1);
    public abstract void setPowerMode(int p0, boolean p1);
    public abstract void setUserActivityTimeoutOverrideFromWindowManager(long p0);
    public abstract void setUserInactiveOverrideFromWindowManager();
    public abstract void setWakeUpDelegate(android.os.PowerManagerInternal.WakeUpDelegate p0);
    public abstract void startUidChanges();
    public abstract void uidActive(int p0);
    public abstract void uidGone(int p0);
    public abstract void uidIdle(int p0);
    public abstract void unregisterUserActivityListener(android.os.PowerManagerInternal.UserActivityListener p0);
    public abstract void updateSettings();
    public abstract void updateUidProcState(int p0, int p1);
    public abstract void wakeupPerGroup(android.util.IntArray p0, long p1, int p2, java.lang.String p3, java.lang.String p4, int p5);
    public abstract boolean wasDeviceIdleFor(long p0);

    public static interface LowPowerModeListener {
        public int getServiceType();
        public void onLowPowerModeChanged(android.os.PowerSaveState p0);
    }

    public static interface UidChangesBatch {
        public void finishUidChanges();
        public void startUidChanges();
        public void uidActive(int p0);
        public void uidGone(int p0);
        public void uidIdle(int p0);
        public void updateUidProcState(int p0, int p1);
    }

    public static interface UserActivityListener {
        public void onUserActivity(long p0, int p1, int p2);
    }

    public static interface WakeUpDelegate {
        public boolean sleep(long p0, int p1, int p2);
        public boolean wakeUp(long p0, int p1, java.lang.String p2, int p3);
    }
}
