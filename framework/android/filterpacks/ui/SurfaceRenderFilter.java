package android.filterpacks.ui;

public class SurfaceRenderFilter extends android.filterfw.core.Filter implements android.view.SurfaceHolder.Callback {
    private static final java.lang.String TAG = "SurfaceRenderFilter";
    private final int RENDERMODE_FILL_CROP = 0;
    private final int RENDERMODE_FIT = 0;
    private final int RENDERMODE_STRETCH = 0;
    private float mAspectRatio;
    private boolean mIsBound;
    private boolean mLogVerbose;
    private android.filterfw.core.ShaderProgram mProgram;
    private int mRenderMode;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="renderMode")
    private java.lang.String mRenderModeString;
    private android.filterfw.core.GLFrame mScreen;
    private int mScreenHeight;
    private int mScreenWidth;
    @android.filterfw.core.GenerateFinalPort(name="surfaceView")
    private android.filterfw.core.FilterSurfaceView mSurfaceView;
    public SurfaceRenderFilter(java.lang.String p0) { super(null); }
    private void updateTargetRect() {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void open(android.filterfw.core.FilterContext p0) {}
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public void surfaceCreated(android.view.SurfaceHolder p0) {}
    public void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    public void updateRenderMode() {}
}
