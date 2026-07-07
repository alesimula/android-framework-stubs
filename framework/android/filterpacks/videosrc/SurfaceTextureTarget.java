package android.filterpacks.videosrc;

public class SurfaceTextureTarget extends android.filterfw.core.Filter {
    private static final java.lang.String TAG = "SurfaceTextureTarget";
    private final int RENDERMODE_CUSTOMIZE = 0;
    private final int RENDERMODE_FILL_CROP = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_STRETCH = 0;
    private float mAspectRatio;
    private boolean mLogVerbose;
    private android.filterfw.core.ShaderProgram mProgram;
    private int mRenderMode;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="renderMode")
    private java.lang.String mRenderModeString;
    private android.filterfw.core.GLFrame mScreen;
    @android.filterfw.core.GenerateFinalPort(name="height")
    private int mScreenHeight;
    @android.filterfw.core.GenerateFinalPort(name="width")
    private int mScreenWidth;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="sourceQuad")
    private android.filterfw.geometry.Quad mSourceQuad;
    private int mSurfaceId;
    @android.filterfw.core.GenerateFinalPort(name="surfaceTexture")
    private android.graphics.SurfaceTexture mSurfaceTexture;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="targetQuad")
    private android.filterfw.geometry.Quad mTargetQuad;
    public SurfaceTextureTarget(java.lang.String p0) { super(null); }
    private void updateTargetRect() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void disconnect(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void updateRenderMode() {}
}
