package android.filterpacks.imageproc;

public class SaturateFilter extends android.filterfw.core.Filter {
    private android.filterfw.core.Program mBenProgram;
    private final java.lang.String mBenSaturateShader = null;
    private android.filterfw.core.Program mHerfProgram;
    private final java.lang.String mHerfSaturateShader = null;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="scale")
    private float mScale;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    public SaturateFilter(java.lang.String p0) { super(null); }
    private void initParameters() {}
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
