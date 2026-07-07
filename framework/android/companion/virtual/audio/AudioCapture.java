package android.companion.virtual.audio;

@android.annotation.SystemApi
public final class AudioCapture {
    private static final java.lang.String TAG = "AudioCapture";
    private final android.media.AudioFormat mAudioFormat = null;
    private android.media.AudioRecord mAudioRecord;
    private final java.lang.Object mLock = null;
    private int mRecordingState;
    AudioCapture(android.media.AudioFormat p0) {}
    void close() {}
    public android.media.AudioFormat getFormat() { return null; }
    public int getRecordingState() { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int read(float[] p0, int p1, int p2, int p3) { return 0; }
    public int read(short[] p0, int p1, int p2) { return 0; }
    public int read(short[] p0, int p1, int p2, int p3) { return 0; }
    void setAudioRecord(android.media.AudioRecord p0) {}
    public void startRecording() {}
    public void stop() {}
}
