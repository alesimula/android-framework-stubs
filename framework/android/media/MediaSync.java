package android.media;

public final class MediaSync {
    private static final int CB_RETURN_AUDIO_BUFFER = 1;
    private static final int EVENT_CALLBACK = 1;
    private static final int EVENT_SET_CALLBACK = 2;
    public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
    public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
    private static final java.lang.String TAG = "MediaSync";
    private java.util.List<android.media.MediaSync.AudioBuffer> mAudioBuffers;
    private android.os.Handler mAudioHandler;
    private final java.lang.Object mAudioLock = null;
    private android.os.Looper mAudioLooper;
    private java.lang.Thread mAudioThread;
    private android.media.AudioTrack mAudioTrack;
    private android.media.MediaSync.Callback mCallback;
    private android.os.Handler mCallbackHandler;
    private final java.lang.Object mCallbackLock = null;
    private long mNativeContext;
    private android.media.MediaSync.OnErrorListener mOnErrorListener;
    private android.os.Handler mOnErrorListenerHandler;
    private final java.lang.Object mOnErrorListenerLock = null;
    private float mPlaybackRate;
    public MediaSync() {}
    private void createAudioThread() {}
    private final native void native_finalize();
    private final native void native_flush();
    private final native long native_getPlayTimeForPendingAudioFrames();
    private final native boolean native_getTimestamp(android.media.MediaTimestamp p0);
    private static final native void native_init();
    private final native void native_release();
    private final native void native_setAudioTrack(android.media.AudioTrack p0);
    private native float native_setPlaybackParams(android.media.PlaybackParams p0);
    private final native void native_setSurface(android.view.Surface p0);
    private native float native_setSyncParams(android.media.SyncParams p0);
    private final native void native_setup();
    private final native void native_updateQueuedAudioData(int p0, long p1);
    private void postRenderAudio(long p0) {}
    private final void postReturnByteBuffer(android.media.MediaSync.AudioBuffer p0) {}
    private final void returnAudioBuffers() {}
    public final native android.view.Surface createInputSurface();
    protected void finalize() {}
    public void flush() {}
    public native android.media.PlaybackParams getPlaybackParams();
    public native android.media.SyncParams getSyncParams();
    public android.media.MediaTimestamp getTimestamp() { return null; }
    public void queueAudio(java.nio.ByteBuffer p0, int p1, long p2) {}
    public final void release() {}
    public void setAudioTrack(android.media.AudioTrack p0) {}
    public void setCallback(android.media.MediaSync.Callback p0, android.os.Handler p1) {}
    public void setOnErrorListener(android.media.MediaSync.OnErrorListener p0, android.os.Handler p1) {}
    public void setPlaybackParams(android.media.PlaybackParams p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setSyncParams(android.media.SyncParams p0) {}

    private static class AudioBuffer {
        public int mBufferIndex;
        public java.nio.ByteBuffer mByteBuffer;
        long mPresentationTimeUs;
        public AudioBuffer(java.nio.ByteBuffer p0, int p1, long p2) {}
    }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onAudioBufferConsumed(android.media.MediaSync p0, java.nio.ByteBuffer p1, int p2);
    }

    public static interface OnErrorListener {
        public void onError(android.media.MediaSync p0, int p1, int p2);
    }
}
