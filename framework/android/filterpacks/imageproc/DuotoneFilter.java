package android.filterpacks.imageproc;

public class DuotoneFilter extends android.filterfw.core.Filter {
    private final java.lang.String mDuotoneShader = null;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="first_color")
    private int mFirstColor;
    private android.filterfw.core.Program mProgram;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="second_color")
    private int mSecondColor;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    public DuotoneFilter(java.lang.String p0) { super(null); }
    private void updateParameters() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
