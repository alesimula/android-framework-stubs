package android.window.sharedsurface;

public abstract class CommonAnimator {
    public CommonAnimator() {}
    public abstract void addEndListener(java.lang.Runnable p0);
    public abstract void addUpdateListener(android.window.sharedsurface.CommonAnimator.OnUpdateListener p0);
    public abstract void cancel();
    public abstract float getCurrentValue();
    public abstract float getCurrentVelocity();
    public abstract void start();

    public static interface OnUpdateListener {
        public void onUpdate(float p0, float p1);
    }
}
