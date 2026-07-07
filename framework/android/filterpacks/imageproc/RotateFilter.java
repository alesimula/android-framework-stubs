package android.filterpacks.imageproc;

public class RotateFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="angle")
    private int mAngle;
    private int mHeight;
    private int mOutputHeight;
    private int mOutputWidth;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public RotateFilter(java.lang.String p0) { super(null); }
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
