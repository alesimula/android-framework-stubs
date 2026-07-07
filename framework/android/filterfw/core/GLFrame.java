package android.filterfw.core;

public class GLFrame extends android.filterfw.core.Frame {
    public static final int EXISTING_FBO_BINDING = 101;
    public static final int EXISTING_TEXTURE_BINDING = 100;
    public static final int EXTERNAL_TEXTURE = 104;
    public static final int NEW_FBO_BINDING = 103;
    public static final int NEW_TEXTURE_BINDING = 102;
    private int glFrameId;
    private android.filterfw.core.GLEnvironment mGLEnvironment;
    private boolean mOwnsTexture;
    GLFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    GLFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1, int p2, long p3) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    private void assertGLEnvValid() {}
    private native boolean generateNativeMipMap();
    private native boolean getNativeBitmap(android.graphics.Bitmap p0);
    private native byte[] getNativeData();
    private native int getNativeFboId();
    private native float[] getNativeFloats();
    private native int[] getNativeInts();
    private native int getNativeTextureId();
    private void initNew(boolean p0) {}
    private void initWithFbo(int p0) {}
    private void initWithTexture(int p0) {}
    private native boolean nativeAllocate(android.filterfw.core.GLEnvironment p0, int p1, int p2);
    private native boolean nativeAllocateExternal(android.filterfw.core.GLEnvironment p0);
    private native boolean nativeAllocateWithFbo(android.filterfw.core.GLEnvironment p0, int p1, int p2, int p3);
    private native boolean nativeAllocateWithTexture(android.filterfw.core.GLEnvironment p0, int p1, int p2, int p3);
    private native boolean nativeCopyFromGL(android.filterfw.core.GLFrame p0);
    private native boolean nativeCopyFromNative(android.filterfw.core.NativeFrame p0);
    private native boolean nativeDeallocate();
    private native boolean nativeDetachTexFromFbo();
    private native boolean nativeFocus();
    private native boolean nativeReattachTexToFbo();
    private native boolean nativeResetParams();
    private native boolean setNativeBitmap(android.graphics.Bitmap p0, int p1);
    private native boolean setNativeData(byte[] p0, int p1, int p2);
    private native boolean setNativeFloats(float[] p0);
    private native boolean setNativeInts(int[] p0);
    private native boolean setNativeTextureParam(int p0, int p1);
    private native boolean setNativeViewport(int p0, int p1, int p2, int p3);
    void flushGPU(java.lang.String p0) {}
    public void focus() {}
    public void generateMipMap() {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public java.nio.ByteBuffer getData() { return null; }
    public int getFboId() { return 0; }
    public float[] getFloats() { return null; }
    public android.filterfw.core.GLEnvironment getGLEnvironment() { return null; }
    public int[] getInts() { return null; }
    public java.lang.Object getObjectValue() { return null; }
    public int getTextureId() { return 0; }
    protected boolean hasNativeAllocation() { return false; }
    void init(android.filterfw.core.GLEnvironment p0) {}
    protected void onFrameFetch() {}
    protected void onFrameStore() {}
    protected void releaseNativeAllocation() {}
    protected void reset(android.filterfw.core.FrameFormat p0) {}
    public void setBitmap(android.graphics.Bitmap p0) {}
    public void setData(java.nio.ByteBuffer p0, int p1, int p2) {}
    public void setDataFromFrame(android.filterfw.core.Frame p0) {}
    public void setFloats(float[] p0) {}
    public void setInts(int[] p0) {}
    public void setTextureParameter(int p0, int p1) {}
    public void setViewport(int p0, int p1, int p2, int p3) {}
    public void setViewport(android.graphics.Rect p0) {}
    public java.lang.String toString() { return null; }
}
