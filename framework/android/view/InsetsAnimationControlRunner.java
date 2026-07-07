package android.view;

public interface InsetsAnimationControlRunner {
    public void cancel();
    default public boolean controlsType(int p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1);
    public android.view.WindowInsetsAnimation getAnimation();
    public int getAnimationType();
    public int getControllingTypes();
    public android.view.inputmethod.ImeTracker.Token getStatsToken();
    public android.view.InsetsAnimationControlRunner.SurfaceParamsApplier getSurfaceParamsApplier();
    public int getTypes();
    public boolean hasAnimationCallback();
    default public boolean isFromPredictiveBack() { return false; }
    public void notifyControlRevoked(int p0);
    public void updateLayoutInsetsDuringAnimation(int p0);
    public void updateSurfacePosition(android.util.SparseArray<android.view.InsetsSourceControl> p0);
    public boolean willUpdateSurface();

    public static interface SurfaceParamsApplier {
        public static final android.view.InsetsAnimationControlRunner.SurfaceParamsApplier DEFAULT = null;
        public void applySurfaceParams(android.view.SyncRtSurfaceTransactionApplier.SurfaceParams... p0);
    }
}
