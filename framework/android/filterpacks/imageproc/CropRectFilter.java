package android.filterpacks.imageproc;

public class CropRectFilter extends android.filterfw.core.Filter {
    private int mHeight;
    @android.filterfw.core.GenerateFieldPort(name="height")
    private int mOutputHeight;
    @android.filterfw.core.GenerateFieldPort(name="width")
    private int mOutputWidth;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    private int mWidth;
    @android.filterfw.core.GenerateFieldPort(name="xorigin")
    private int mXorigin;
    @android.filterfw.core.GenerateFieldPort(name="yorigin")
    private int mYorigin;
    public CropRectFilter(java.lang.String p0) { super(null); }
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    void updateSourceRect(int p0, int p1) {}
}
