package android.filterpacks.base;

public class RetargetFilter extends android.filterfw.core.Filter {
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    private int mTarget;
    @android.filterfw.core.GenerateFinalPort(hasDefault=false, name="target")
    private java.lang.String mTargetString;
    public RetargetFilter(java.lang.String p0) { super(null); }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
