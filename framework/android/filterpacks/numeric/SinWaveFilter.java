package android.filterpacks.numeric;

public class SinWaveFilter extends android.filterfw.core.Filter {
    private android.filterfw.core.FrameFormat mOutputFormat;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="stepSize")
    private float mStepSize;
    private float mValue;
    public SinWaveFilter(java.lang.String p0) { super(null); }
    public void open(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
