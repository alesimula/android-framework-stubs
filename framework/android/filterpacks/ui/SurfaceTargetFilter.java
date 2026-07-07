package android.filterpacks.ui;

public class SurfaceTargetFilter extends android.filterfw.core.Filter {
    private static final java.lang.String TAG = "SurfaceRenderFilter";
    private final int RENDERMODE_FILL_CROP = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_STRETCH = 0;
    private float mAspectRatio;
    private android.filterfw.core.GLEnvironment mGlEnv;
    private boolean mLogVerbose;
    private android.filterfw.core.ShaderProgram mProgram;
    private int mRenderMode;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="renderMode")
    private java.lang.String mRenderModeString;
    private android.filterfw.core.GLFrame mScreen;
    @android.filterfw.core.GenerateFieldPort(name="oheight")
    private int mScreenHeight;
    @android.filterfw.core.GenerateFieldPort(name="owidth")
    private int mScreenWidth;
    @android.filterfw.core.GenerateFinalPort(name="surface")
    private android.view.Surface mSurface;
    private int mSurfaceId;
    public SurfaceTargetFilter(java.lang.String p0) { super(null); }
    private void registerSurface() {}
    private void unregisterSurface() {}
    private void updateTargetRect() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void updateRenderMode() {}
}
