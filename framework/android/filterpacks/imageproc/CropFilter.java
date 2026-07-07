package android.filterpacks.imageproc;

public class CropFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="fillblack")
    private boolean mFillBlack;
    private final java.lang.String mFragShader = null;
    private android.filterfw.core.FrameFormat mLastFormat;
    @android.filterfw.core.GenerateFieldPort(name="oheight")
    private int mOutputHeight;
    @android.filterfw.core.GenerateFieldPort(name="owidth")
    private int mOutputWidth;
    private android.filterfw.core.Program mProgram;
    public CropFilter(java.lang.String p0) { super(null); }
    protected void createProgram(android.filterfw.core.FilterContext p0, android.filterfw.core.FrameFormat p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
