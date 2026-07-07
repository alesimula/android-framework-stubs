package android.filterpacks.base;

public class ObjectSource extends android.filterfw.core.Filter {
    private android.filterfw.core.Frame mFrame;
    @android.filterfw.core.GenerateFieldPort(name="object")
    private java.lang.Object mObject;
    @android.filterfw.core.GenerateFinalPort(hasDefault=true, name="format")
    private android.filterfw.core.FrameFormat mOutputFormat;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="repeatFrame")
    boolean mRepeatFrame;
    public ObjectSource(java.lang.String p0) { super(null); }
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
