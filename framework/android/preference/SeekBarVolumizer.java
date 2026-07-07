package android.preference;

@java.lang.Deprecated
public class SeekBarVolumizer implements android.widget.SeekBar.OnSeekBarChangeListener, android.os.Handler.Callback {
    private static final int CHECK_RINGTONE_PLAYBACK_DELAY_MS = 1000;
    private static final int CHECK_UPDATE_SLIDER_LATER_MS = 500;
    private static final long DURATION_TO_START_DELAYING = Long.valueOf(0L);
    private static final int MSG_GROUP_VOLUME_CHANGED = 1;
    private static final int MSG_INIT_SAMPLE = 3;
    private static final int MSG_SET_STREAM_VOLUME = 0;
    private static final int MSG_START_SAMPLE = 1;
    private static final int MSG_STOP_SAMPLE = 2;
    private static final int MSG_UPDATE_SLIDER_MAYBE_LATER = 4;
    private static final long SET_STREAM_VOLUME_DELAY_MS = Long.valueOf(0L);
    private static final long START_SAMPLE_DELAY_MS = Long.valueOf(0L);
    private static final java.lang.String TAG = "SeekBarVolumizer";
    private static long sStopVolumeTime;
    private boolean mAffectedByRingerMode;
    private boolean mAllowAlarms;
    private boolean mAllowMedia;
    private boolean mAllowRinger;
    private android.media.AudioAttributes mAttributes;
    private final android.media.AudioManager mAudioManager = null;
    private final android.preference.SeekBarVolumizer.Callback mCallback = null;
    private final android.content.Context mContext = null;
    private final android.net.Uri mDefaultUri = null;
    private final boolean mDeviceHasProductStrategies = false;
    private android.os.Handler mHandler;
    private int mLastAudibleStreamVolume;
    private int mLastProgress;
    private final int mMaxStreamVolume = 0;
    private boolean mMuted;
    private final android.app.NotificationManager mNotificationManager = null;
    private boolean mNotificationOrRing;
    private android.app.NotificationManager.Policy mNotificationPolicy;
    private int mOriginalStreamVolume;
    private boolean mPlaySample;
    private final android.preference.SeekBarVolumizer.Receiver mReceiver = null;
    private int mRingerMode;
    private android.media.Ringtone mRingtone;
    private android.widget.SeekBar mSeekBar;
    private final int mStreamType = 0;
    private final android.preference.SeekBarVolumizer.H mUiHandler = null;
    private int mVolumeBeforeMute;
    private final android.media.AudioManager.VolumeGroupCallback mVolumeGroupCallback = null;
    private int mVolumeGroupId;
    private final android.os.Handler mVolumeHandler = null;
    private android.preference.SeekBarVolumizer.Observer mVolumeObserver;
    private int mZenMode;
    public SeekBarVolumizer(android.content.Context p0, int p1, android.net.Uri p2, android.preference.SeekBarVolumizer.Callback p3) {}
    public SeekBarVolumizer(android.content.Context p0, int p1, android.net.Uri p2, android.preference.SeekBarVolumizer.Callback p3, boolean p4) {}
    private android.media.AudioAttributes getAudioAttributesForLegacyStreamType(int p0) { return null; }
    private int getVolumeGroupIdForLegacyStreamType(int p0) { return 0; }
    private boolean hasAudioProductStrategies() { return false; }
    private static boolean isAlarmsStream(int p0) { return false; }
    private boolean isDelay() { return false; }
    private static boolean isMediaStream(int p0) { return false; }
    private static boolean isNotificationOrRing(int p0) { return false; }
    private boolean isZenMuted() { return false; }
    private void onInitSample() {}
    private void onStartSample() {}
    private void onStopSample() {}
    private void onUpdateSliderMaybeLater() {}
    private void postSetVolume(int p0) {}
    private void postStartSample() {}
    private void postStopSample() {}
    private void postUpdateSliderMaybeLater() {}
    private void registerVolumeGroupCb() {}
    private void setStopVolumeTime() {}
    private void unregisterVolumeGroupCb() {}
    private void updateSlider() {}
    public void changeVolumeBy(int p0) {}
    public android.widget.SeekBar getSeekBar() { return null; }
    public boolean handleMessage(android.os.Message p0) { return false; }
    public boolean isSamplePlaying() { return false; }
    public void muteVolume() {}
    public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2) {}
    public void onRestoreInstanceState(android.preference.VolumePreference.VolumeStore p0) {}
    public void onSaveInstanceState(android.preference.VolumePreference.VolumeStore p0) {}
    public void onStartTrackingTouch(android.widget.SeekBar p0) {}
    public void onStopTrackingTouch(android.widget.SeekBar p0) {}
    public void revertVolume() {}
    public void setSeekBar(android.widget.SeekBar p0) {}
    public void start() {}
    public void startSample() {}
    public void stop() {}
    public void stopSample() {}
    protected void updateSeekBar() {}

    public static interface Callback {
        public void onMuted(boolean p0, boolean p1);
        public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2);
        public void onSampleStarting(android.preference.SeekBarVolumizer p0);
        public void onStartTrackingTouch(android.preference.SeekBarVolumizer p0);
        default public void onStopTrackingTouch(android.preference.SeekBarVolumizer p0) {}
    }

    private final class H extends android.os.Handler {
        private static final int UPDATE_SLIDER = 1;
        private H(android.preference.SeekBarVolumizer p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void postUpdateSlider(int p0, int p1, boolean p2) {}
    }

    private final class Observer extends android.database.ContentObserver {
        public Observer(android.preference.SeekBarVolumizer p0, android.os.Handler p1) { super((android.os.Handler)null); }
        public void onChange(boolean p0) {}
    }

    private final class Receiver extends android.content.BroadcastReceiver {
        private boolean mListening;
        private Receiver(android.preference.SeekBarVolumizer p0) { super(); }
        private void updateVolumeSlider(int p0, int p1) {}
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
        public void setListening(boolean p0) {}
    }

    private class VolumeHandler extends android.os.Handler {
        private VolumeHandler(android.preference.SeekBarVolumizer p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
