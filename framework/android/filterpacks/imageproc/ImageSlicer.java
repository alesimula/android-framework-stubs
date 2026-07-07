package android.filterpacks.imageproc;

public class ImageSlicer extends android.filterfw.core.Filter {
    private int mInputHeight;
    private int mInputWidth;
    private android.filterfw.core.Frame mOriginalFrame;
    private int mOutputHeight;
    private int mOutputWidth;
    @android.filterfw.core.GenerateFieldPort(name="padSize")
    private int mPadSize;
    private android.filterfw.core.Program mProgram;
    private int mSliceHeight;
    private int mSliceIndex;
    private int mSliceWidth;
    @android.filterfw.core.GenerateFieldPort(name="xSlices")
    private int mXSlices;
    @android.filterfw.core.GenerateFieldPort(name="ySlices")
    private int mYSlices;
    public ImageSlicer(java.lang.String p0) { super(null); }
    private void calcOutputFormatForInput(android.filterfw.core.Frame p0) {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
