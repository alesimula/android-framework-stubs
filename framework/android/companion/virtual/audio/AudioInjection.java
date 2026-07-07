package android.companion.virtual.audio;

@android.annotation.SystemApi
public final class AudioInjection {
    private static final java.lang.String TAG = "AudioInjection";
    private final android.media.AudioFormat mAudioFormat = null;
    private android.media.AudioTrack mAudioTrack;
    private boolean mIsSilent;
    private final java.lang.Object mLock = null;
    private int mPlayState;
    AudioInjection(android.media.AudioFormat p0) {}
    void close() {}
    public android.media.AudioFormat getFormat() { return null; }
    public int getPlayState() { return 0; }
    public void play() {}
    void setAudioTrack(android.media.AudioTrack p0) {}
    void setSilent(boolean p0) {}
    public void stop() {}
    public int write(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int write(java.nio.ByteBuffer p0, int p1, int p2, long p3) { return 0; }
    public int write(byte[] p0, int p1, int p2) { return 0; }
    public int write(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int write(float[] p0, int p1, int p2, int p3) { return 0; }
    public int write(short[] p0, int p1, int p2) { return 0; }
    public int write(short[] p0, int p1, int p2, int p3) { return 0; }
}
