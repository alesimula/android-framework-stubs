package android.media;

public class MediaActionSound {
    public static final int FOCUS_COMPLETE = 1;
    private static final int NUM_MEDIA_SOUND_STREAMS = 1;
    public static final int SHUTTER_CLICK = 0;
    private static final java.lang.String[] SOUND_DIRS = null;
    private static final java.lang.String[] SOUND_FILES = null;
    public static final int START_VIDEO_RECORDING = 2;
    private static final int STATE_LOADED = 3;
    private static final int STATE_LOADING = 1;
    private static final int STATE_LOADING_PLAY_REQUESTED = 2;
    private static final int STATE_NOT_LOADED = 0;
    public static final int STOP_VIDEO_RECORDING = 3;
    private static final java.lang.String TAG = "MediaActionSound";
    private android.media.SoundPool.OnLoadCompleteListener mLoadCompleteListener;
    private android.media.SoundPool mSoundPool;
    private android.media.MediaActionSound.SoundState[] mSounds;
    public MediaActionSound() {}
    private int loadSound(android.media.MediaActionSound.SoundState p0) { return 0; }
    public static boolean mustPlayShutterSound() { return false; }
    public void load(int p0) {}
    public void play(int p0) {}
    public void release() {}

    private class SoundState {
        public int id;
        public final int name = 0;
        public int state;
        public SoundState(android.media.MediaActionSound p0, int p1) {}
    }
}
