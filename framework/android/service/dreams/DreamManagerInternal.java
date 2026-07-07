package android.service.dreams;

public abstract class DreamManagerInternal {
    public static final int DREAM_START_REASON_PLAYLIST_CHANGED = 2;
    public static final int DREAM_START_REASON_POWER_MANAGER_REQUESTED = 1;
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
    public DreamManagerInternal() {}
    public static java.lang.String dreamStartReasonToString(int p0) { return null; }
    public static java.lang.String dreamStopReasonToString(int p0) { return null; }
    public static boolean isDreamStartFailure(int p0) { return false; }
    public abstract boolean canStartDreaming(boolean p0);
    public abstract boolean dreamConditionActive();
    public abstract boolean isDreaming();
    public abstract void registerDreamManagerPolicyListener(android.service.dreams.DreamManagerInternal.DreamManagerPolicyListener p0);
    public abstract void registerDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);
    public abstract void requestDream();
    public abstract void startDream(boolean p0, int p1);
    public abstract void stopDream(boolean p0, int p1);
    public abstract void unregisterDreamManagerPolicyListener(android.service.dreams.DreamManagerInternal.DreamManagerPolicyListener p0);
    public abstract void unregisterDreamManagerStateListener(android.service.dreams.DreamManagerInternal.DreamManagerStateListener p0);

    public static interface DreamManagerPolicyListener {
        default public void onDreamPolicyChanged(android.service.dreams.DreamPolicy p0) {}
        default public void onKeepDreamingWhenUnpluggingChanged(boolean p0) {}
    }

    public static interface DreamManagerStateListener {
        default public void onDreamingStarted() {}
        default public void onDreamingStopped(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DreamStartReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DreamStopReason {
    }
}
