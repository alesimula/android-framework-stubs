package android.filterpacks.imageproc;

public class ResizeFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="generateMipMap")
    private boolean mGenerateMipMap;
    private int mInputChannels;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="keepAspectRatio")
    private boolean mKeepAspectRatio;
    private android.filterfw.core.FrameFormat mLastFormat;
    @android.filterfw.core.GenerateFieldPort(name="oheight")
    private int mOHeight;
    @android.filterfw.core.GenerateFieldPort(name="owidth")
    private int mOWidth;
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private android.filterfw.core.Program mProgram;
    public ResizeFilter(java.lang.String p0) { super(null); }
    protected void createProgram(android.filterfw.core.FilterContext p0, android.filterfw.core.FrameFormat p1) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
