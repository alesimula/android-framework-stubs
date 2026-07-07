package android.filterpacks.base;

public class FrameSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(name="format")
    private android.filterfw.core.FrameFormat mFormat;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="frame")
    private android.filterfw.core.Frame mFrame;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="repeatFrame")
    private boolean mRepeatFrame;
    public FrameSource(java.lang.String p0) { super(null); }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
