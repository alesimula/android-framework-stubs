package android.filterpacks.videosink;

public class MediaEncoderFilter extends android.filterfw.core.Filter {
    private static final int NO_AUDIO_SOURCE = -1;
    private static final java.lang.String TAG = "MediaEncoderFilter";
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="audioSource")
    private int mAudioSource;
    private boolean mCaptureTimeLapse;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="errorListener")
    private android.media.MediaRecorder.OnErrorListener mErrorListener;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="outputFileDescriptor")
    private java.io.FileDescriptor mFd;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="framerate")
    private int mFps;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="height")
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="infoListener")
    private android.media.MediaRecorder.OnInfoListener mInfoListener;
    private long mLastTimeLapseFrameRealTimestampNs;
    private boolean mLogVerbose;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="maxDurationMs")
    private int mMaxDurationMs;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="maxFileSize")
    private long mMaxFileSize;
    private android.media.MediaRecorder mMediaRecorder;
    private int mNumFramesEncoded;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="orientationHint")
    private int mOrientationHint;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="outputFile")
    private java.lang.String mOutputFile;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="outputFormat")
    private int mOutputFormat;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="recordingProfile")
    private android.media.CamcorderProfile mProfile;
    private android.filterfw.core.ShaderProgram mProgram;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="recording")
    private boolean mRecording;
    private boolean mRecordingActive;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="recordingDoneListener")
    private android.filterpacks.videosink.MediaEncoderFilter.OnRecordingDoneListener mRecordingDoneListener;
    private android.filterfw.core.GLFrame mScreen;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="inputRegion")
    private android.filterfw.geometry.Quad mSourceRegion;
    private int mSurfaceId;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="timelapseRecordingIntervalUs")
    private long mTimeBetweenTimeLapseFrameCaptureUs;
    private long mTimestampNs;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="videoEncoder")
    private int mVideoEncoder;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="width")
    private int mWidth;
    public MediaEncoderFilter(java.lang.String p0) { super(null); }
    private void startRecording(android.filterfw.core.FilterContext p0) {}
    private void stopRecording(android.filterfw.core.FilterContext p0) {}
    private void updateMediaRecorderParams() {}
    private void updateSourceRegion() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public boolean skipFrameAndModifyTimestamp(long p0) { return false; }
    public void tearDown(android.filterfw.core.FilterContext p0) {}

    public static interface OnRecordingDoneListener {
        public void onRecordingDone();
    }
}
