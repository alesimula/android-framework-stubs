package android.filterpacks.imageproc;

public class RedEyeFilter extends android.filterfw.core.Filter {
    private static final float DEFAULT_RED_INTENSITY = 1.2999999523162842f;
    private static final float MIN_RADIUS = 10.0f;
    private static final float RADIUS_RATIO = 0.05999999865889549f;
    private final android.graphics.Canvas mCanvas = null;
    @android.filterfw.core.GenerateFieldPort(name="centers")
    private float[] mCenters;
    private int mHeight;
    private final android.graphics.Paint mPaint = null;
    private android.filterfw.core.Program mProgram;
    private float mRadius;
    private android.graphics.Bitmap mRedEyeBitmap;
    private android.filterfw.core.Frame mRedEyeFrame;
    private final java.lang.String mRedEyeShader = null;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public RedEyeFilter(java.lang.String p0) { super(null); }
    private void createRedEyeFrame(android.filterfw.core.FilterContext p0) {}
    private void updateProgramParams() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
