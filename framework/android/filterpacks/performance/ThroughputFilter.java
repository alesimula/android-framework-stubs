package android.filterpacks.performance;

public class ThroughputFilter extends android.filterfw.core.Filter {
    private long mLastTime;
    private android.filterfw.core.FrameFormat mOutputFormat;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="period")
    private int mPeriod;
    private int mPeriodFrameCount;
    private int mTotalFrameCount;
    public ThroughputFilter(java.lang.String p0) { super(null); }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
