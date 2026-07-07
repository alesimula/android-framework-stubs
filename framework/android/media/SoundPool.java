package android.media;

public class SoundPool extends android.media.PlayerBase {
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int SAMPLE_LOADED = 1;
    private static final java.lang.String TAG = "SoundPool";
    private final android.media.AudioAttributes mAttributes = null;
    private final java.util.concurrent.atomic.AtomicReference<android.media.SoundPool.EventHandler> mEventHandler = null;
    private boolean mHasAppOpsPlayAudio;
    private long mNativeContext;
    public SoundPool(int p0, int p1, int p2) { super(null, 0); }
    private SoundPool(android.content.Context p0, int p1, android.media.AudioAttributes p2, int p3) { super(null, 0); }
    private final native int _load(java.io.FileDescriptor p0, long p1, long p2, int p3);
    private final native void _mute(boolean p0);
    private final native int _play(int p0, float p1, float p2, int p3, int p4, float p5, int p6);
    private final native void _setVolume(int p0, float p1, float p2);
    private final native void native_release();
    private native int native_setup(int p0, java.lang.Object p1, java.lang.String p2);
    private void postEventFromNative(int p0, int p1, int p2, java.lang.Object p3) {}
    public final native void autoPause();
    public final native void autoResume();
    protected void finalize() {}
    public int load(android.content.Context p0, int p1, int p2) { return 0; }
    public int load(android.content.res.AssetFileDescriptor p0, int p1) { return 0; }
    public int load(java.io.FileDescriptor p0, long p1, long p2, int p3) { return 0; }
    public int load(java.lang.String p0, int p1) { return 0; }
    public final native void pause(int p0);
    public final int play(int p0, float p1, float p2, int p3, int p4, float p5) { return 0; }
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    void playerPause() {}
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    void playerSetVolume(boolean p0, float p1, float p2) {}
    void playerStart() {}
    void playerStop() {}
    public final void release() {}
    public final native void resume(int p0);
    public final native void setLoop(int p0, int p1);
    public void setOnLoadCompleteListener(android.media.SoundPool.OnLoadCompleteListener p0) {}
    public final native void setPriority(int p0, int p1);
    public final native void setRate(int p0, float p1);
    public void setVolume(int p0, float p1) {}
    public final void setVolume(int p0, float p1, float p2) {}
    public final native void stop(int p0);
    public final native boolean unload(int p0);

    public static class Builder {
        private android.media.AudioAttributes mAudioAttributes;
        private android.content.Context mContext;
        private int mMaxStreams;
        private int mSessionId;
        public Builder() {}
        public android.media.SoundPool build() { return null; }
        public android.media.SoundPool.Builder setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.SoundPool.Builder setAudioSessionId(int p0) { return null; }
        public android.media.SoundPool.Builder setContext(android.content.Context p0) { return null; }
        public android.media.SoundPool.Builder setMaxStreams(int p0) throws java.lang.IllegalArgumentException { return null; }
    }

    private final class EventHandler extends android.os.Handler {
        private final android.media.SoundPool.OnLoadCompleteListener mOnLoadCompleteListener = null;
        EventHandler(android.media.SoundPool p0, android.os.Looper p1, android.media.SoundPool.OnLoadCompleteListener p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnLoadCompleteListener {
        public void onLoadComplete(android.media.SoundPool p0, int p1, int p2);
    }
}
