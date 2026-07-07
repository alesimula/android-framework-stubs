package android.media;

@android.annotation.SystemApi
public class AudioDeviceVolumeManager {
    public static final int ADJUST_MODE_END = 2;
    public static final int ADJUST_MODE_NORMAL = 0;
    public static final int ADJUST_MODE_START = 1;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE = 3;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_ADJUST_ONLY = 5;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_ABSOLUTE_MULTI_MODE = 4;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FIXED = 2;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_FULL = 1;
    public static final int DEVICE_VOLUME_BEHAVIOR_UNSET = -1;
    @android.annotation.SystemApi
    public static final int DEVICE_VOLUME_BEHAVIOR_VARIABLE = 0;
    private static final java.lang.String TAG = "AudioDeviceVolumeManager";
    private static android.media.IAudioService sService;
    private final android.media.CallbackUtil.LazyListenerManager<android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener> mDeviceVolumeBehaviorChangedListenerMgr = null;
    private android.media.AudioDeviceVolumeManager.DeviceVolumeDispatcherStub mDeviceVolumeDispatcherStub;
    private final java.lang.Object mDeviceVolumeListenerLock = null;
    private java.util.ArrayList<android.media.AudioDeviceVolumeManager.ListenerInfo> mDeviceVolumeListeners;
    private final java.lang.String mPackageName = null;
    public AudioDeviceVolumeManager(android.content.Context p0) {}
    private void baseSetDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3, boolean p4, int p5) {}
    public static void enforceValidVolumeBehavior(int p0) {}
    private static android.media.IAudioService getService() { return null; }
    public static java.lang.String volumeBehaviorName(int p0) { return null; }
    public void addOnDeviceVolumeBehaviorChangedListener(java.util.concurrent.Executor p0, android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p1) throws java.lang.SecurityException {}
    @android.annotation.SystemApi
    public void adjustVolumeForDevice(android.media.VolumeInfo p0, int p1, android.media.AudioDeviceAttributes p2) {}
    @android.annotation.SystemApi
    public android.media.VolumeInfo getDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) { return null; }
    @android.annotation.SystemApi
    public int getDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0) { return 0; }
    public int getInputGainIndex(android.media.AudioDeviceAttributes p0) { return 0; }
    public int getMaxInputGainIndex() { return 0; }
    public int getMinInputGainIndex() { return 0; }
    public boolean isFullVolumeDevice() { return false; }
    public boolean isInputGainFixed(android.media.AudioDeviceAttributes p0) { return false; }
    @android.annotation.SystemApi
    public void notifyAbsoluteVolumeChanged(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    public void removeOnDeviceVolumeBehaviorChangedListener(android.media.AudioDeviceVolumeManager.OnDeviceVolumeBehaviorChangedListener p0) {}
    public void resetDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0) {}
    public void setDeviceAbsoluteMultiVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3) {}
    public void setDeviceAbsoluteMultiVolumeBehavior(android.media.AudioDeviceAttributes p0, java.util.List<android.media.VolumeInfo> p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    public void setDeviceAbsoluteVolumeAdjustOnlyBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, java.util.concurrent.Executor p2, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p3) {}
    public void setDeviceAbsoluteVolumeBehavior(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, boolean p2, java.util.concurrent.Executor p3, android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p4) {}
    @android.annotation.SystemApi
    public void setDeviceVolume(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}
    @android.annotation.SystemApi
    public void setDeviceVolumeBehavior(android.media.AudioDeviceAttributes p0, int p1) {}
    public void setInputGainIndex(android.media.AudioDeviceAttributes p0, int p1) {}
    @android.annotation.SystemApi
    public void setVolumeForDevice(android.media.VolumeInfo p0, android.media.AudioDeviceAttributes p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AbsoluteDeviceVolumeBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehavior {
    }

    private final class DeviceVolumeBehaviorDispatcherStub extends android.media.IDeviceVolumeBehaviorDispatcher.Stub implements android.media.CallbackUtil.DispatcherStub {
        private DeviceVolumeBehaviorDispatcherStub(android.media.AudioDeviceVolumeManager p0) { super(); }
        public void dispatchDeviceVolumeBehaviorChanged(android.media.AudioDeviceAttributes p0, int p1) {}
        public void register(boolean p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeviceVolumeBehaviorState {
    }

    final class DeviceVolumeDispatcherStub extends android.media.IAudioDeviceVolumeDispatcher.Stub {
        DeviceVolumeDispatcherStub(android.media.AudioDeviceVolumeManager p0) { super(); }
        public void dispatchDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3) {}
        public void dispatchDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1) {}
        public void register(boolean p0, android.media.AudioDeviceAttributes p1, java.util.List<android.media.VolumeInfo> p2, boolean p3, int p4) {}
    }

    static class ListenerInfo {
        final android.media.AudioDeviceAttributes mDevice = null;
        final java.util.concurrent.Executor mExecutor = null;
        final boolean mHandlesVolumeAdjustment = false;
        final android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener mListener = null;
        ListenerInfo(android.media.AudioDeviceVolumeManager.OnAudioDeviceVolumeChangedListener p0, java.util.concurrent.Executor p1, android.media.AudioDeviceAttributes p2, boolean p3) {}
    }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static interface OnAudioDeviceVolumeChangedListener {
        public void onAudioDeviceVolumeAdjusted(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1, int p2, int p3);
        public void onAudioDeviceVolumeChanged(android.media.AudioDeviceAttributes p0, android.media.VolumeInfo p1);
    }

    public static interface OnDeviceVolumeBehaviorChangedListener {
        public void onDeviceVolumeBehaviorChanged(android.media.AudioDeviceAttributes p0, int p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustmentMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VolumeAdjustmentNoMute {
    }
}
