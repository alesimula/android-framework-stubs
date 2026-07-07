package android.filterpacks.imageproc;

public class GrainFilter extends android.filterfw.core.Filter {
    private static final int RAND_THRESHOLD = 128;
    private android.filterfw.core.Program mGrainProgram;
    private final java.lang.String mGrainShader = null;
    private int mHeight;
    private android.filterfw.core.Program mNoiseProgram;
    private final java.lang.String mNoiseShader = null;
    private java.util.Random mRandom;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="strength")
    private float mScale;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public GrainFilter(java.lang.String p0) { super(null); }
    private void updateFrameSize(int p0, int p1) {}
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
