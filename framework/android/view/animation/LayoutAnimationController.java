package android.view.animation;

public class LayoutAnimationController {
    public static final int ORDER_NORMAL = 0;
    public static final int ORDER_RANDOM = 2;
    public static final int ORDER_REVERSE = 1;
    protected android.view.animation.Animation mAnimation;
    private float mDelay;
    private long mDuration;
    protected android.view.animation.Interpolator mInterpolator;
    private long mMaxDelay;
    private int mOrder;
    protected java.util.Random mRandomizer;
    public LayoutAnimationController(android.content.Context p0, android.util.AttributeSet p1) {}
    public LayoutAnimationController(android.view.animation.Animation p0) {}
    public LayoutAnimationController(android.view.animation.Animation p0, float p1) {}
    public android.view.animation.Animation getAnimation() { return null; }
    public final android.view.animation.Animation getAnimationForView(android.view.View p0) { return null; }
    public float getDelay() { return 0.0f; }
    protected long getDelayForView(android.view.View p0) { return 0L; }
    public android.view.animation.Interpolator getInterpolator() { return null; }
    public int getOrder() { return 0; }
    protected int getTransformedIndex(android.view.animation.LayoutAnimationController.AnimationParameters p0) { return 0; }
    public boolean isDone() { return false; }
    public void setAnimation(android.content.Context p0, int p1) {}
    public void setAnimation(android.view.animation.Animation p0) {}
    public void setDelay(float p0) {}
    public void setInterpolator(android.content.Context p0, int p1) {}
    public void setInterpolator(android.view.animation.Interpolator p0) {}
    public void setOrder(int p0) {}
    public void start() {}
    public boolean willOverlap() { return false; }

    public static class AnimationParameters {
        public int count;
        public int index;
        public AnimationParameters() {}
    }
}
