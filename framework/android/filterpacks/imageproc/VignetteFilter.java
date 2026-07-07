package android.filterpacks.imageproc;

public class VignetteFilter extends android.filterfw.core.Filter {
    private int mHeight;
    private android.filterfw.core.Program mProgram;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="scale")
    private float mScale;
    private final float mShade = 0.0f;
    private final float mSlope = 0.0f;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private final java.lang.String mVignetteShader = null;
    private int mWidth;
    public VignetteFilter(java.lang.String p0) { super(null); }
    private void initParameters() {}
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
