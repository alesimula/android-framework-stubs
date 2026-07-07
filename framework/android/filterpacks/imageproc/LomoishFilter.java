package android.filterpacks.imageproc;

public class LomoishFilter extends android.filterfw.core.Filter {
    private int mHeight;
    private final java.lang.String mLomoishShader = null;
    private android.filterfw.core.Program mProgram;
    private java.util.Random mRandom;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public LomoishFilter(java.lang.String p0) { super(null); }
    private void initParameters() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
