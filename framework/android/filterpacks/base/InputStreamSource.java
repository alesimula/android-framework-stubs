package android.filterpacks.base;

public class InputStreamSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="stream")
    private java.io.InputStream mInputStream;
    @android.filterfw.core.GenerateFinalPort(hasDefault=true, name="format")
    private android.filterfw.core.MutableFrameFormat mOutputFormat;
    @android.filterfw.core.GenerateFinalPort(name="target")
    private java.lang.String mTarget;
    public InputStreamSource(java.lang.String p0) { super(null); }
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
}
