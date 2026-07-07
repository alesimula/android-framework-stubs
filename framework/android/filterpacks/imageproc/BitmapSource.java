package android.filterpacks.imageproc;

public class BitmapSource extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFieldPort(name="bitmap")
    private android.graphics.Bitmap mBitmap;
    private android.filterfw.core.Frame mImageFrame;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="recycleBitmap")
    private boolean mRecycleBitmap;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="repeatFrame")
    boolean mRepeatFrame;
    private int mTarget;
    @android.filterfw.core.GenerateFieldPort(name="target")
    java.lang.String mTargetString;
    public BitmapSource(java.lang.String p0) { super(null); }
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}
    public void loadImage(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}
