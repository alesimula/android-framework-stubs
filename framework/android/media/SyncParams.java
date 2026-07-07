package android.media;

public final class SyncParams {
    public static final int AUDIO_ADJUST_MODE_DEFAULT = 0;
    public static final int AUDIO_ADJUST_MODE_RESAMPLE = 2;
    public static final int AUDIO_ADJUST_MODE_STRETCH = 1;
    private static final int SET_AUDIO_ADJUST_MODE = 2;
    private static final int SET_FRAME_RATE = 8;
    private static final int SET_SYNC_SOURCE = 1;
    private static final int SET_TOLERANCE = 4;
    public static final int SYNC_SOURCE_AUDIO = 2;
    public static final int SYNC_SOURCE_DEFAULT = 0;
    public static final int SYNC_SOURCE_SYSTEM_CLOCK = 1;
    public static final int SYNC_SOURCE_VSYNC = 3;
    private int mAudioAdjustMode;
    private float mFrameRate;
    private int mSet;
    private int mSyncSource;
    private float mTolerance;
    public SyncParams() {}
    public android.media.SyncParams allowDefaults() { return null; }
    public int getAudioAdjustMode() { return 0; }
    public float getFrameRate() { return 0.0f; }
    public int getSyncSource() { return 0; }
    public float getTolerance() { return 0.0f; }
    public android.media.SyncParams setAudioAdjustMode(int p0) { return null; }
    public android.media.SyncParams setFrameRate(float p0) { return null; }
    public android.media.SyncParams setSyncSource(int p0) { return null; }
    public android.media.SyncParams setTolerance(float p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioAdjustMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncSource {
    }
}
