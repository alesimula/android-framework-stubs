package android.graphics.drawable;

public interface Animatable2 extends android.graphics.drawable.Animatable {
    public void clearAnimationCallbacks();
    public void registerAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0);
    public boolean unregisterAnimationCallback(android.graphics.drawable.Animatable2.AnimationCallback p0);

    public static abstract class AnimationCallback {
        public AnimationCallback() {}
        public void onAnimationEnd(android.graphics.drawable.Drawable p0) {}
        public void onAnimationStart(android.graphics.drawable.Drawable p0) {}
    }
}
