package android.graphics;

public class HardwareBufferRenderer implements java.lang.AutoCloseable {
    private static final android.graphics.ColorSpace DEFAULT_COLORSPACE = null;
    private final java.lang.Runnable mCleaner = null;
    private final android.hardware.HardwareBuffer mHardwareBuffer = null;
    private long mProxy;
    private final android.graphics.HardwareBufferRenderer.RenderRequest mRenderRequest = null;
    private final android.graphics.RenderNode mRootNode = null;
    public HardwareBufferRenderer(android.hardware.HardwareBuffer p0) {}
    private static void invokeRenderCallback(java.util.function.Consumer<android.graphics.HardwareBufferRenderer.RenderResult> p0, int p1, int p2) {}
    private static native long nCreateHardwareBufferRenderer(android.hardware.HardwareBuffer p0, long p1);
    private static native long nCreateRootRenderNode();
    private static native void nDestroyRootRenderNode(long p0);
    private static native long nGetFinalizer();
    static native int nRender(long p0, int p1, int p2, int p3, long p4, java.util.function.Consumer<android.graphics.HardwareBufferRenderer.RenderResult> p5);
    private static native void nSetLightAlpha(long p0, float p1, float p2);
    private static native void nSetLightGeometry(long p0, float p1, float p2, float p3, float p4);
    private static void validateAlpha(float p0, java.lang.String p1) {}
    private static void validateFinite(float p0, java.lang.String p1) {}
    private static void validatePositive(float p0, java.lang.String p1) {}
    public void close() {}
    public boolean isClosed() { return false; }
    public android.graphics.HardwareBufferRenderer.RenderRequest obtainRenderRequest() { return null; }
    public void setContentRoot(android.graphics.RenderNode p0) {}
    public void setLightSourceAlpha(float p0, float p1) {}
    public void setLightSourceGeometry(float p0, float p1, float p2, float p3) {}

    private static class HardwareBufferRendererHolder {
        private HardwareBufferRendererHolder() {}
    }

    public final class RenderRequest {
        private android.graphics.ColorSpace mColorSpace;
        private int mTransform;
        private RenderRequest(android.graphics.HardwareBufferRenderer p0) {}
        private void reset() {}
        public void draw(java.util.concurrent.Executor p0, java.util.function.Consumer<android.graphics.HardwareBufferRenderer.RenderResult> p1) {}
        public android.graphics.HardwareBufferRenderer.RenderRequest setBufferTransform(int p0) { return null; }
        public android.graphics.HardwareBufferRenderer.RenderRequest setColorSpace(android.graphics.ColorSpace p0) { return null; }
    }

    public static final class RenderResult {
        public static final int ERROR_UNKNOWN = 1;
        public static final int SUCCESS = 0;
        private final android.hardware.SyncFence mFence = null;
        private final int mResultStatus = 0;
        private RenderResult(android.hardware.SyncFence p0, int p1) {}
        public android.hardware.SyncFence getFence() { return null; }
        public int getStatus() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RenderResultStatus {
        }
    }
}
