package android.hardware.location;

public class ActivityRecognitionHardware extends android.hardware.location.IActivityRecognitionHardware.Stub {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final java.lang.String ENFORCE_HW_PERMISSION_MESSAGE = "Permission 'android.permission.LOCATION_HARDWARE' not granted to access ActivityRecognitionHardware";
    private static final int EVENT_TYPE_COUNT = 3;
    private static final int EVENT_TYPE_DISABLED = 0;
    private static final int EVENT_TYPE_ENABLED = 1;
    private static final java.lang.String HARDWARE_PERMISSION = "android.permission.LOCATION_HARDWARE";
    private static final int INVALID_ACTIVITY_TYPE = -1;
    private static final int NATIVE_SUCCESS_RESULT = 0;
    private static final java.lang.String TAG = "ActivityRecognitionHW";
    private static android.hardware.location.ActivityRecognitionHardware sSingletonInstance;
    private static final java.lang.Object sSingletonInstanceLock = null;
    private final android.content.Context mContext = null;
    private final android.hardware.location.ActivityRecognitionHardware.SinkList mSinks = null;
    private final java.lang.String[] mSupportedActivities = null;
    private final int mSupportedActivitiesCount = 0;
    private final int[][] mSupportedActivitiesEnabledEvents = null;
    private ActivityRecognitionHardware(android.content.Context p0) { super(); }
    private void checkPermissions() {}
    private java.lang.String[] fetchSupportedActivities() { return null; }
    private java.lang.String getActivityName(int p0) { return null; }
    private int getActivityType(java.lang.String p0) { return 0; }
    public static android.hardware.location.ActivityRecognitionHardware getInstance(android.content.Context p0) { return null; }
    public static boolean isSupported() { return false; }
    private static native void nativeClassInit();
    private native int nativeDisableActivityEvent(int p0, int p1);
    private native int nativeEnableActivityEvent(int p0, int p1, long p2);
    private native int nativeFlush();
    private native java.lang.String[] nativeGetSupportedActivities();
    private native void nativeInitialize();
    private static native boolean nativeIsSupported();
    private native void nativeRelease();
    private void onActivityChanged(android.hardware.location.ActivityRecognitionHardware.Event[] p0) {}
    public boolean disableActivityEvent(java.lang.String p0, int p1) { return false; }
    public boolean enableActivityEvent(java.lang.String p0, int p1, long p2) { return false; }
    public boolean flush() { return false; }
    public java.lang.String[] getSupportedActivities() { return null; }
    public boolean isActivitySupported(java.lang.String p0) { return false; }
    public boolean registerSink(android.hardware.location.IActivityRecognitionHardwareSink p0) { return false; }
    public boolean unregisterSink(android.hardware.location.IActivityRecognitionHardwareSink p0) { return false; }

    private static class Event {
        public int activity;
        public long timestamp;
        public int type;
        private Event() {}
    }

    private class SinkList extends android.os.RemoteCallbackList<android.hardware.location.IActivityRecognitionHardwareSink> {
        private SinkList(android.hardware.location.ActivityRecognitionHardware p0) { super(); }
        private void disableActivityEventIfEnabled(int p0, int p1) {}
        public void onCallbackDied(android.hardware.location.IActivityRecognitionHardwareSink p0) {}
    }
}
