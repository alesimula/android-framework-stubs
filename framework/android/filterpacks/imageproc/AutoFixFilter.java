package android.filterpacks.imageproc;

public class AutoFixFilter extends android.filterfw.core.Filter {
    private static final int[] normal_cdf = null;
    private final java.lang.String mAutoFixShader = null;
    private android.filterfw.core.Frame mDensityFrame;
    private int mHeight;
    private android.filterfw.core.Frame mHistFrame;
    private android.filterfw.core.Program mNativeProgram;
    @android.filterfw.core.GenerateFieldPort(name="scale")
    private float mScale;
    private android.filterfw.core.Program mShaderProgram;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public AutoFixFilter(java.lang.String p0) { super(null); }
    private void createHistogramFrame(android.filterfw.core.FilterContext p0, int p1, int p2, int[] p3) {}
    private void initParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    protected void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    private static long[] $d2j$hex$03fa9f61$decode_J(java.lang.String p0) { return null; }
    private static int[] $d2j$hex$03fa9f61$decode_I(java.lang.String p0) { return null; }
    private static short[] $d2j$hex$03fa9f61$decode_S(java.lang.String p0) { return null; }
    private static byte[] $d2j$hex$03fa9f61$decode_B(java.lang.String p0) { return null; }
}
