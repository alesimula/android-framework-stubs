package android.view;

public interface WindowInsetsAnimationController {
    public void finish(boolean p0);
    public float getCurrentAlpha();
    public float getCurrentFraction();
    public android.graphics.Insets getCurrentInsets();
    public long getDurationMs();
    public android.graphics.Insets getHiddenStateInsets();
    public android.view.animation.Interpolator getInsetsInterpolator();
    public android.graphics.Insets getShownStateInsets();
    public int getTypes();
    public boolean hasZeroInsetsIme();
    public boolean isCancelled();
    public boolean isFinished();
    default public boolean isReady() { return false; }
    public void setInsetsAndAlpha(android.graphics.Insets p0, float p1, float p2);
}
