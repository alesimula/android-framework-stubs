package android.window.sharedsurface;

public final class SharedAnimationParams implements android.os.Parcelable {
    private static final int[] ANIMATIONS_FLAGS = null;
    public static final int ANIMATION_CORNER_RADIUS = 16;
    public static final int ANIMATION_CROSS_FADE = 8;
    private static final int ANIMATION_EVERYTHING = 31;
    public static final int ANIMATION_GEOMETRIC = 7;
    public static final int ANIMATION_SCALE = 4;
    public static final int ANIMATION_TRANSLATION = 3;
    public static final int ANIMATION_UNDEFINED = 0;
    public static final int ANIMATION_X_TRANSLATION = 1;
    public static final int ANIMATION_Y_TRANSLATION = 2;
    public static final android.os.Parcelable.Creator<android.window.sharedsurface.SharedAnimationParams> CREATOR = null;
    public static final int INTERPOLATOR_ACCELERATE = 1;
    public static final int INTERPOLATOR_ACCELERATE_DECELERATE = 3;
    public static final int INTERPOLATOR_ANTICIPATE = 4;
    public static final int INTERPOLATOR_ANTICIPATE_OVERSHOOT = 6;
    public static final int INTERPOLATOR_BOUNCE = 7;
    public static final int INTERPOLATOR_DECELERATE = 2;
    public static final int INTERPOLATOR_LINEAR = 0;
    public static final int INTERPOLATOR_OVERSHOOT = 5;
    public static final int INTERPOLATOR_PATH = 8;
    public static final long MAXIMUM_ANIMATION_DURATION_MS = 1000L;
    private final android.util.SparseArray<android.window.sharedsurface.AnimationDescription> mAnimationSparseArray = null;
    public SharedAnimationParams() {}
    private SharedAnimationParams(android.os.Parcel p0) {}
    public SharedAnimationParams(android.window.sharedsurface.SharedAnimationParams p0) {}
    private void distributeFlagToDescription(int p0, android.window.sharedsurface.AnimationDescription p1) {}
    private static void validateDuration(long p0) {}
    private static void validateFlags(int p0) {}
    private static void validateInterpolatorType(int p0) {}
    private static void validatePathData(java.lang.String p0) {}
    private static void validateSpringParam(float p0, float p1) {}
    public void addAnimationInterpolated(int p0, long p1, int p2) {}
    public void addAnimationPath(int p0, long p1, java.lang.String p2) {}
    public void addAnimationSpring(int p0, float p1, float p2) {}
    public android.util.SparseArray<android.window.sharedsurface.CommonAnimator> createAnimators() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AnimationFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InterpolatorType {
    }
}
