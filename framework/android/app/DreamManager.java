package android.app;

public class DreamManager {
    public static final int DREAM_START_REASON_HDMI_STANDBY = 8;
    public static final int DREAM_START_REASON_PLAYLIST_CHANGED = 2;
    public static final int DREAM_START_REASON_POWER_BUTTON = 6;
    public static final int DREAM_START_REASON_POWER_MANAGER_REQUESTED = 1;
    public static final int DREAM_START_REASON_SHELL_REQUESTED = 7;
    public static final int DREAM_START_REASON_SYSTEM_COMPONENT_CLEARED = 4;
    public static final int DREAM_START_REASON_SYSTEM_COMPONENT_SET = 3;
    public static final int DREAM_START_REASON_TEST_REQUESTED = 5;
    public static final int DREAM_START_REASON_UNKNOWN = 0;
    public static final int DREAM_STOP_REASON_ACTIVITY_STARTED = 19;
    public static final int DREAM_STOP_REASON_ATTACH_TO_SERVICE_FAILED = 10;
    public static final int DREAM_STOP_REASON_BINDER_DIED = 14;
    public static final int DREAM_STOP_REASON_BIND_TO_SERVICE_FAILED = 11;
    public static final int DREAM_STOP_REASON_BIND_TO_SERVICE_FORBIDDEN = 12;
    public static final int DREAM_STOP_REASON_DREAM_FINISHED = 1;
    public static final int DREAM_STOP_REASON_DREAM_RESTARTED = 2;
    public static final int DREAM_STOP_REASON_HOME_BUTTON_SHORT_PRESS = 7;
    public static final int DREAM_STOP_REASON_POWER_BUTTON_SHORT_PRESS = 6;
    public static final int DREAM_STOP_REASON_POWER_MANAGER_CLEANED_UP = 5;
    public static final int DREAM_STOP_REASON_POWER_MANAGER_REQUESTED = 4;
    public static final int DREAM_STOP_REASON_PREVIOUS_DREAM_CLEANED_UP = 18;
    public static final int DREAM_STOP_REASON_SERVICE_DISCONNECTED = 15;
    public static final int DREAM_STOP_REASON_SHELL_REQUESTED = 16;
    public static final int DREAM_STOP_REASON_SLOW_TO_CONNECT = 8;
    public static final int DREAM_STOP_REASON_SLOW_TO_FINISH = 9;
    public static final int DREAM_STOP_REASON_START_ACTIVITY_FAILED = 13;
    public static final int DREAM_STOP_REASON_UNKNOWN = 0;
    public static final int DREAM_STOP_REASON_USER_SWITCHED = 17;
    public static final int DREAM_STOP_REASON_WAKE_UP_REQUESTED = 3;
    private final android.content.Context mContext = null;
    private final com.android.internal.util.ClientListenerMultiplexer<android.app.DreamManager.DreamListener, android.service.dreams.IDreamManager, android.service.dreams.IDreamManagerListener> mMultiplexer = null;
    private final android.service.dreams.IDreamManager mService = null;
    public DreamManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    private void assertDreamSwitcherFlag() {}
    public static java.lang.String dreamStartReasonToString(int p0) { return null; }
    public static java.lang.String dreamStopReasonToString(int p0) { return null; }
    public static boolean isDreamStartFailure(int p0) { return false; }
    public boolean areDreamsSupported() { return false; }
    public boolean canStartDreaming(boolean p0) { return false; }
    public android.service.dreams.DreamPlaylist getDreamPlaylist() { return null; }
    public boolean isDreaming() { return false; }
    public boolean isScreensaverEnabled() { return false; }
    public void registerListener(java.util.concurrent.Executor p0, android.app.DreamManager.DreamListener p1) {}
    public void setActiveDream(android.content.ComponentName p0) {}
    public boolean setActiveDreamComponent(android.content.ComponentName p0) { return false; }
    public void setDevicePostured(boolean p0, int p1) {}
    public void setDreamIsObscured(boolean p0) {}
    public void setDreamOverlay(android.content.ComponentName p0) {}
    public void setScreensaverEnabled(boolean p0) {}
    public void setSystemDreamComponent(android.content.ComponentName p0) {}
    public void startDream() {}
    public void stopDream() {}
    public void unregisterListener(android.app.DreamManager.DreamListener p0) {}

    private final class DreamEventListener extends android.service.dreams.IDreamManagerListener.Stub {
        private DreamEventListener(android.app.DreamManager p0) { super(); }
        public void onPlaylistChanged(android.service.dreams.DreamPlaylist p0) {}
    }

    public static interface DreamListener {
        default public void onPlaylistChanged(android.service.dreams.DreamPlaylist p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DreamStartReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DreamStopReason {
    }
}
