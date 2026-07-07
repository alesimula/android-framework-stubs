package android.speech.tts;

class FileSynthesisCallback extends android.speech.tts.AbstractSynthesisCallback {
    private static final boolean DBG = false;
    private static final int MAX_AUDIO_BUFFER_SIZE = 8192;
    private static final java.lang.String TAG = "FileSynthesisRequest";
    private static final short WAV_FORMAT_PCM = 1;
    private static final int WAV_HEADER_LENGTH = 44;
    private int mAudioFormat;
    private int mChannelCount;
    private final android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher mDispatcher = null;
    private boolean mDone;
    private java.nio.channels.FileChannel mFileChannel;
    private int mSampleRateInHz;
    private boolean mStarted;
    private final java.lang.Object mStateLock = null;
    protected int mStatusCode;
    FileSynthesisCallback(java.nio.channels.FileChannel p0, android.speech.tts.TextToSpeechService.UtteranceProgressDispatcher p1, boolean p2) { super(false); }
    private void cleanUp() {}
    private void closeFile() {}
    private java.nio.ByteBuffer makeWavHeader(int p0, int p1, int p2, int p3) { return null; }
    public int audioAvailable(byte[] p0, int p1, int p2) { return 0; }
    public int done() { return 0; }
    public void error() {}
    public void error(int p0) {}
    public int getMaxBufferSize() { return 0; }
    public boolean hasFinished() { return false; }
    public boolean hasStarted() { return false; }
    public void rangeStart(int p0, int p1, int p2) {}
    public int start(int p0, int p1, int p2) { return 0; }
    void stop() {}
}
