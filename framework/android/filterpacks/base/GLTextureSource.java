package android.filterpacks.base;

public class GLTextureSource extends android.filterfw.core.Filter {
    private android.filterfw.core.Frame mFrame;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="repeatFrame")
    private boolean mRepeatFrame;
    @android.filterfw.core.GenerateFieldPort(name="texId")
    private int mTexId;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="timestamp")
    private long mTimestamp;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mWidth;
    public GLTextureSource(java.lang.String p0) { super(null); }
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
