package android.filterpacks.imageproc;

public class ColorTemperatureFilter extends android.filterfw.core.Filter {
    private final java.lang.String mColorTemperatureShader = null;
    private android.filterfw.core.Program mProgram;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="scale")
    private float mScale;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    public ColorTemperatureFilter(java.lang.String p0) { super(null); }
    private void updateParameters() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
