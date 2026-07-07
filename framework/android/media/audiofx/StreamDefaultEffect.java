package android.media.audiofx;

public class StreamDefaultEffect extends android.media.audiofx.DefaultEffect {
    private static final java.lang.String TAG = "StreamDefaultEffect-JAVA";
    public StreamDefaultEffect(java.util.UUID p0, java.util.UUID p1, int p2, int p3) { super(); }
    private final native void native_release(int p0);
    private final native int native_setup(java.lang.String p0, java.lang.String p1, int p2, int p3, java.lang.String p4, int[] p5);
    protected void finalize() {}
    public void release() {}
}
