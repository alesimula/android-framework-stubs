package android.graphics;

public class TableMaskFilter extends android.graphics.MaskFilter {
    private TableMaskFilter(long p0) { super(); }
    public TableMaskFilter(byte[] p0) { super(); }
    public static android.graphics.TableMaskFilter CreateClipTable(int p0, int p1) { return null; }
    public static android.graphics.TableMaskFilter CreateGammaTable(float p0) { return null; }
    private static native long nativeNewClip(int p0, int p1);
    private static native long nativeNewGamma(float p0);
    private static native long nativeNewTable(byte[] p0);
}
