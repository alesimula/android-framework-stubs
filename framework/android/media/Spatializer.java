package android.media;

public class Spatializer {
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int HEAD_TRACKING_MODE_DISABLED = -1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int HEAD_TRACKING_MODE_OTHER = 0;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int HEAD_TRACKING_MODE_RELATIVE_DEVICE = 2;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int HEAD_TRACKING_MODE_RELATIVE_WORLD = 1;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final int HEAD_TRACKING_MODE_UNSUPPORTED = -2;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MCHAN_BED_PLUS_OBJECTS = 2;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL = 1;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_NONE = 0;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_OTHER = -1;
    private static final java.lang.String TAG = "Spatializer";
    private final android.media.AudioManager mAm = null;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.Spatializer.OnHeadTrackerAvailableListener> mHeadTrackerListenerMgr = null;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.Spatializer.OnHeadTrackingModeChangedListener> mHeadTrackingListenerMgr = null;
    private android.media.Spatializer.SpatializerOutputDispatcherStub mOutputDispatcher;
    private android.media.CallbackUtil.ListenerInfo<android.media.Spatializer.OnSpatializerOutputChangedListener> mOutputListener;
    private final java.lang.Object mOutputListenerLock = null;
    private android.media.Spatializer.SpatializerPoseDispatcherStub mPoseDispatcher;
    private android.media.CallbackUtil.ListenerInfo<android.media.Spatializer.OnHeadToSoundstagePoseUpdatedListener> mPoseListener;
    private final java.lang.Object mPoseListenerLock = null;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.Spatializer.OnSpatializerStateChangedListener> mStateListenerMgr = null;
    protected Spatializer(android.media.AudioManager p0) {}
    public static final java.lang.String headtrackingModeToString(int p0) { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void addCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) {}
    public void addOnHeadTrackerAvailableListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadTrackerAvailableListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void addOnHeadTrackingModeChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadTrackingModeChangedListener p1) {}
    public void addOnSpatializerStateChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnSpatializerStateChangedListener p1) {}
    public boolean canBeSpatialized(android.media.AudioAttributes p0, android.media.AudioFormat p1) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void clearOnHeadToSoundstagePoseUpdatedListener() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void clearOnSpatializerOutputChangedListener() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public java.util.List<android.media.AudioDeviceAttributes> getCompatibleAudioDevices() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public int getDesiredHeadTrackingMode() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void getEffectParameter(int p0, byte[] p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public int getHeadTrackingMode() { return 0; }
    public int getImmersiveAudioLevel() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public int getOutput() { return 0; }
    public java.util.List<java.lang.Integer> getSpatializedChannelMasks() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public java.util.List<java.lang.Integer> getSupportedHeadTrackingModes() { return null; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public boolean hasHeadTracker(android.media.AudioDeviceAttributes p0) { return false; }
    public boolean isAvailable() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public boolean isAvailableForDevice(android.media.AudioDeviceAttributes p0) { return false; }
    public boolean isEnabled() { return false; }
    public boolean isHeadTrackerAvailable() { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public boolean isHeadTrackerEnabled(android.media.AudioDeviceAttributes p0) { return false; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void recenterHeadTracker() {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void removeCompatibleAudioDevice(android.media.AudioDeviceAttributes p0) {}
    public void removeOnHeadTrackerAvailableListener(android.media.Spatializer.OnHeadTrackerAvailableListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void removeOnHeadTrackingModeChangedListener(android.media.Spatializer.OnHeadTrackingModeChangedListener p0) {}
    public void removeOnSpatializerStateChangedListener(android.media.Spatializer.OnSpatializerStateChangedListener p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setDesiredHeadTrackingMode(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setEffectParameter(int p0, byte[] p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setEnabled(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setGlobalTransform(float[] p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setHeadTrackerEnabled(boolean p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setOnHeadToSoundstagePoseUpdatedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnHeadToSoundstagePoseUpdatedListener p1) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setOnSpatializerOutputChangedListener(java.util.concurrent.Executor p0, android.media.Spatializer.OnSpatializerOutputChangedListener p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingModeSet {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HeadTrackingModeSupported {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImmersiveAudioLevel {
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnHeadToSoundstagePoseUpdatedListener {
        public void onHeadToSoundstagePoseUpdated(android.media.Spatializer p0, float[] p1);
    }

    public static interface OnHeadTrackerAvailableListener {
        public void onHeadTrackerAvailableChanged(android.media.Spatializer p0, boolean p1);
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnHeadTrackingModeChangedListener {
        public void onDesiredHeadTrackingModeChanged(android.media.Spatializer p0, int p1);
        public void onHeadTrackingModeChanged(android.media.Spatializer p0, int p1);
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static interface OnSpatializerOutputChangedListener {
        public void onSpatializerOutputChanged(android.media.Spatializer p0, int p1);
    }

    public static interface OnSpatializerStateChangedListener {
        public void onSpatializerAvailableChanged(android.media.Spatializer p0, boolean p1);
        public void onSpatializerEnabledChanged(android.media.Spatializer p0, boolean p1);
    }

    private final class SpatializerHeadTrackerAvailableDispatcherStub extends android.media.ISpatializerHeadTrackerAvailableCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        private SpatializerHeadTrackerAvailableDispatcherStub(android.media.Spatializer p0) { super(); }
        public void dispatchSpatializerHeadTrackerAvailable(boolean p0) {}
        public void register(boolean p0) {}
    }

    private final class SpatializerHeadTrackingDispatcherStub extends android.media.ISpatializerHeadTrackingModeCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        private SpatializerHeadTrackingDispatcherStub(android.media.Spatializer p0) { super(); }
        public void dispatchSpatializerActualHeadTrackingModeChanged(int p0) {}
        public void dispatchSpatializerDesiredHeadTrackingModeChanged(int p0) {}
        public void register(boolean p0) {}
    }

    private final class SpatializerInfoDispatcherStub extends android.media.ISpatializerCallback.Stub implements android.media.CallbackUtil.DispatcherStub {
        private SpatializerInfoDispatcherStub(android.media.Spatializer p0) { super(); }
        public void dispatchSpatializerAvailableChanged(boolean p0) {}
        public void dispatchSpatializerEnabledChanged(boolean p0) {}
        public void register(boolean p0) {}
    }

    private final class SpatializerOutputDispatcherStub extends android.media.ISpatializerOutputCallback.Stub {
        private SpatializerOutputDispatcherStub(android.media.Spatializer p0) { super(); }
        public void dispatchSpatializerOutputChanged(int p0) {}
    }

    private final class SpatializerPoseDispatcherStub extends android.media.ISpatializerHeadToSoundStagePoseCallback.Stub {
        private SpatializerPoseDispatcherStub(android.media.Spatializer p0) { super(); }
        public void dispatchPoseChanged(float[] p0) {}
    }
}
