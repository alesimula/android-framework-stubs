package android.filterpacks.imageproc;

public class ImageStitcher extends android.filterfw.core.Filter {
    private int mImageHeight;
    private int mImageWidth;
    private int mInputHeight;
    private int mInputWidth;
    private android.filterfw.core.Frame mOutputFrame;
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
    public ImageStitcher(java.lang.String p0) { super(null); }
    private android.filterfw.core.FrameFormat calcOutputFormatForInput(android.filterfw.core.FrameFormat p0) { return null; }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
