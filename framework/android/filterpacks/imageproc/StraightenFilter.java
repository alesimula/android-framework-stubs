package android.filterpacks.imageproc;

public class StraightenFilter extends android.filterfw.core.Filter {
    private static final float DEGREE_TO_RADIAN = 0.01745329238474369f;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="angle")
    private float mAngle;
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="maxAngle")
    private float mMaxAngle;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    public StraightenFilter(java.lang.String p0) { super(null); }
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
