package android.filterpacks.imageproc;

public class ToPackedGrayFilter extends android.filterfw.core.Filter {
    private final java.lang.String mColorToPackedGrayShader = null;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="keepAspectRatio")
    private boolean mKeepAspectRatio;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="oheight")
    private int mOHeight;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="owidth")
    private int mOWidth;
    private android.filterfw.core.Program mProgram;
    public ToPackedGrayFilter(java.lang.String p0) { super(null); }
    private void checkOutputDimensions(int p0, int p1) {}
    private android.filterfw.core.FrameFormat convertInputFormat(android.filterfw.core.FrameFormat p0) { return null; }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
