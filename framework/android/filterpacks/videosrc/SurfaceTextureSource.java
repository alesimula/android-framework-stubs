package android.filterpacks.videosrc;

public class SurfaceTextureSource extends android.filterfw.core.Filter {
    private static final java.lang.String TAG = "SurfaceTextureSource";
    private static final boolean mLogVerbose = Boolean.valueOf(false);
    private static final float[] mSourceCoords = null;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="closeOnTimeout")
    private boolean mCloseOnTimeout;
    private boolean mFirstFrame;
    private android.filterfw.core.ShaderProgram mFrameExtractor;
    private float[] mFrameTransform;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mHeight;
    private float[] mMappedCoords;
    private android.filterfw.core.GLFrame mMediaFrame;
    private android.os.ConditionVariable mNewFrameAvailable;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private final java.lang.String mRenderShader = null;
    @android.filterfw.core.GenerateFinalPort(name="sourceListener")
    private android.filterpacks.videosrc.SurfaceTextureSource.SurfaceTextureSourceListener mSourceListener;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="waitForNewFrame")
    private boolean mWaitForNewFrame;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="waitTimeout")
    private int mWaitTimeout;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mWidth;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener;
    public SurfaceTextureSource(java.lang.String p0) { super(null); }
    private void createFormats() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}

    public static interface SurfaceTextureSourceListener {
        public void onSurfaceTextureSourceReady(android.graphics.SurfaceTexture p0);
    }
}
