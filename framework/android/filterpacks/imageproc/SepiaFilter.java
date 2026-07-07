package android.filterpacks.imageproc;

public class SepiaFilter extends android.filterfw.core.Filter {
    private android.filterfw.core.Program mProgram;
    private final java.lang.String mSepiaShader = null;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    public SepiaFilter(java.lang.String p0) { super(null); }
    private void initParameters() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
