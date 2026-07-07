package android.filterpacks.imageproc;

public class BitmapOverlayFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="bitmap")
    private android.graphics.Bitmap mBitmap;
    private android.filterfw.core.Frame mFrame;
    private final java.lang.String mOverlayShader = null;
    private android.filterfw.core.Program mProgram;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="tile_size")
    private int mTileSize;
    public BitmapOverlayFilter(java.lang.String p0) { super(null); }
    private android.filterfw.core.Frame createBitmapFrame(android.filterfw.core.FilterContext p0) { return null; }
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void initProgram(android.filterfw.core.FilterContext p0, int p1) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
