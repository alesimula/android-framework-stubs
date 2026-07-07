package android.filterpacks.videosrc;

public class MediaSource extends android.filterfw.core.Filter {
    private static final int NEWFRAME_TIMEOUT = 100;
    private static final int NEWFRAME_TIMEOUT_REPEAT = 10;
    private static final int PREP_TIMEOUT = 100;
    private static final int PREP_TIMEOUT_REPEAT = 100;
    private static final java.lang.String TAG = "MediaSource";
    private static final float[] mSourceCoords_0 = null;
    private static final float[] mSourceCoords_180 = null;
    private static final float[] mSourceCoords_270 = null;
    private static final float[] mSourceCoords_90 = null;
    private boolean mCompleted;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="context")
    private android.content.Context mContext;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    private final java.lang.String mFrameShader = null;
    private boolean mGotSize;
    private int mHeight;
    private final boolean mLogVerbose = false;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="loop")
    private boolean mLooping;
    private android.filterfw.core.GLFrame mMediaFrame;
    private android.media.MediaPlayer mMediaPlayer;
    private boolean mNewFrameAvailable;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="orientation")
    private int mOrientation;
    private boolean mOrientationUpdated;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private boolean mPaused;
    private boolean mPlaying;
    private boolean mPrepared;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="sourceIsUrl")
    private boolean mSelectedIsUrl;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="sourceAsset")
    private android.content.res.AssetFileDescriptor mSourceAsset;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="sourceUrl")
    private java.lang.String mSourceUrl;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="volume")
    private float mVolume;
    @android.filterfw.core.GenerateFinalPort(hasDefault=true, name="waitForNewFrame")
    private boolean mWaitForNewFrame;
    private int mWidth;
    private android.media.MediaPlayer.OnCompletionListener onCompletionListener;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onMediaFrameAvailableListener;
    private android.media.MediaPlayer.OnPreparedListener onPreparedListener;
    private android.media.MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener;
    public MediaSource(java.lang.String p0) { super(null); }
    private void createFormats() {}
    private boolean setupMediaPlayer(boolean p0) { return false; }
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void pauseVideo(boolean p0) {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
