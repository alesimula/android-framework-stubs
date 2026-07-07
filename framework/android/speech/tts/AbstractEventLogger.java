package android.speech.tts;

abstract class AbstractEventLogger {
    protected final int mCallerPid = 0;
    protected final int mCallerUid = 0;
    private volatile long mEngineCompleteTime;
    private volatile long mEngineStartTime;
    private boolean mLogWritten;
    protected long mPlaybackStartTime;
    protected final long mReceivedTime = 0L;
    private volatile long mRequestProcessingStartTime;
    protected final java.lang.String mServiceApp = null;
    AbstractEventLogger(int p0, int p1, java.lang.String p2) {}
    protected abstract void logFailure(int p0);
    protected abstract void logSuccess(long p0, long p1, long p2);
    public void onAudioDataWritten() {}
    public void onCompleted(int p0) {}
    public void onEngineComplete() {}
    public void onEngineDataReceived() {}
    public void onRequestProcessingStart() {}
}
