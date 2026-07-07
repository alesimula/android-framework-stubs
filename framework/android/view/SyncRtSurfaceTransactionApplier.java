package android.view;

public class SyncRtSurfaceTransactionApplier {
    public static final int FLAG_ALL = -1;
    public static final int FLAG_ALPHA = 1;
    public static final int FLAG_BACKGROUND_BLUR_RADIUS = 32;
    public static final int FLAG_BACKGROUND_BLUR_SCALE = 64;
    public static final int FLAG_CORNER_RADIUS = 16;
    public static final int FLAG_EARLY_WAKEUP_END = 1024;
    public static final int FLAG_EARLY_WAKEUP_START = 512;
    public static final int FLAG_LAYER = 8;
    public static final int FLAG_MATRIX = 2;
    public static final int FLAG_OPAQUE = 2048;
    public static final int FLAG_TRANSACTION = 256;
    public static final int FLAG_VISIBILITY = 128;
    public static final int FLAG_WINDOW_CROP = 4;
    private android.view.SurfaceControl mTargetSc;
    private final android.view.ViewRootImpl mTargetViewRootImpl = null;
    private final float[] mTmpFloat9 = null;
    public SyncRtSurfaceTransactionApplier(android.view.View p0) {}
    public static void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams p1, float[] p2) {}
    public static void create(android.view.View p0, java.util.function.Consumer<android.view.SyncRtSurfaceTransactionApplier> p1) {}
    void applyParams(android.view.SurfaceControl.Transaction p0, android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p1) {}
    void applyTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public void scheduleApply(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0) {}

    public static class SurfaceParams {
        public final float alpha = 0.0f;
        public final int backgroundBlurRadius = 0;
        public final float backgroundBlurScale = 0.0f;
        public final float cornerRadius = 0.0f;
        public final android.gui.EarlyWakeupInfo earlyWakeupInfo = null;
        private final int flags = 0;
        public final int layer = 0;
        public final android.graphics.Matrix matrix = null;
        public final android.view.SurfaceControl.Transaction mergeTransaction = null;
        public final boolean opaque = false;
        public final android.view.SurfaceControl surface = null;
        public final boolean visible = false;
        public final android.graphics.Rect windowCrop = null;
        private SurfaceParams(android.view.SurfaceControl p0, int p1, float p2, android.graphics.Matrix p3, android.graphics.Rect p4, int p5, float p6, int p7, float p8, boolean p9, android.view.SurfaceControl.Transaction p10, boolean p11, android.gui.EarlyWakeupInfo p12) {}

        public static class Builder {
            float alpha;
            int backgroundBlurRadius;
            float backgroundBlurScale;
            float cornerRadius;
            android.gui.EarlyWakeupInfo earlyWakeupInfo;
            int flags;
            int layer;
            android.graphics.Matrix matrix;
            android.view.SurfaceControl.Transaction mergeTransaction;
            boolean opaque;
            final android.view.SurfaceControl surface = null;
            boolean visible;
            android.graphics.Rect windowCrop;
            public Builder(android.view.SurfaceControl p0) {}
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams build() { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withAlpha(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withBackgroundBlurRadius(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withBackgroundBlurScale(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withCornerRadius(float p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withEarlyWakeupEnd(android.gui.EarlyWakeupInfo p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withEarlyWakeupStart(android.gui.EarlyWakeupInfo p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withLayer(int p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMatrix(android.graphics.Matrix p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withMergeTransaction(android.view.SurfaceControl.Transaction p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withOpaque(boolean p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withVisibility(boolean p0) { return null; }
            public android.view.SyncRtSurfaceTransactionApplier.SurfaceParams.Builder withWindowCrop(android.graphics.Rect p0) { return null; }
        }
    }
}
