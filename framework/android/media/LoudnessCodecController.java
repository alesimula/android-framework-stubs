package android.media;

public class LoudnessCodecController implements android.media.permission.SafeCloseable {
    private static final java.lang.String TAG = "LoudnessCodecController";
    private final java.lang.Object mControllerLock = null;
    private final android.media.LoudnessCodecDispatcher mLcDispatcher = null;
    private final java.util.HashMap<android.media.LoudnessCodecInfo, java.util.Set<android.media.MediaCodec>> mMediaCodecs = null;
    private final int mSessionId = 0;
    private LoudnessCodecController(android.media.LoudnessCodecDispatcher p0, int p1) {}
    public static android.media.LoudnessCodecController create(int p0) { return null; }
    public static android.media.LoudnessCodecController create(int p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2) { return null; }
    public static android.media.LoudnessCodecController createForTesting(int p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2, android.media.IAudioService p3) { return null; }
    private static android.media.LoudnessCodecInfo getCodecInfo(android.media.MediaCodec p0) { return null; }
    public boolean addMediaCodec(android.media.MediaCodec p0) { return false; }
    public void close() {}
    public android.os.Bundle getLoudnessCodecParams(android.media.MediaCodec p0) { return null; }
    int getSessionId() { return 0; }
    void mediaCodecsConsume(java.util.function.Consumer<java.util.Map.Entry<android.media.LoudnessCodecInfo, java.util.Set<android.media.MediaCodec>>> p0) {}
    public void removeMediaCodec(android.media.MediaCodec p0) {}

    public static interface OnLoudnessCodecUpdateListener {
        default public android.os.Bundle onLoudnessCodecUpdate(android.media.MediaCodec p0, android.os.Bundle p1) { return null; }
    }
}
