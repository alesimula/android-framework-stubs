package android.animation;

public class PathKeyframes implements android.animation.Keyframes {
    private static final java.util.ArrayList<android.animation.Keyframe> EMPTY_KEYFRAMES = null;
    private static final int FRACTION_OFFSET = 0;
    private static final int NUM_COMPONENTS = 3;
    private static final int X_OFFSET = 1;
    private static final int Y_OFFSET = 2;
    private float[] mKeyframeData;
    private android.graphics.PointF mTempPointF;
    public PathKeyframes(android.graphics.Path p0) {}
    public PathKeyframes(android.graphics.Path p0, float p1) {}
    private static float interpolate(float p0, float p1, float p2) { return 0.0f; }
    private android.graphics.PointF interpolateInRange(float p0, int p1, int p2) { return null; }
    private android.graphics.PointF pointForIndex(int p0) { return null; }
    public android.animation.Keyframes clone() { return null; }
    public android.animation.Keyframes.FloatKeyframes createXFloatKeyframes() { return null; }
    public android.animation.Keyframes.IntKeyframes createXIntKeyframes() { return null; }
    public android.animation.Keyframes.FloatKeyframes createYFloatKeyframes() { return null; }
    public android.animation.Keyframes.IntKeyframes createYIntKeyframes() { return null; }
    public java.util.ArrayList<android.animation.Keyframe> getKeyframes() { return null; }
    public java.lang.Class getType() { return null; }
    public java.lang.Object getValue(float p0) { return null; }
    public void setEvaluator(android.animation.TypeEvaluator p0) {}

    static abstract class FloatKeyframesBase extends android.animation.PathKeyframes.SimpleKeyframes implements android.animation.Keyframes.FloatKeyframes {
        FloatKeyframesBase() { super(); }
        public java.lang.Class getType() { return null; }
        public java.lang.Object getValue(float p0) { return null; }
    }

    static abstract class IntKeyframesBase extends android.animation.PathKeyframes.SimpleKeyframes implements android.animation.Keyframes.IntKeyframes {
        IntKeyframesBase() { super(); }
        public java.lang.Class getType() { return null; }
        public java.lang.Object getValue(float p0) { return null; }
    }

    private static abstract class SimpleKeyframes implements android.animation.Keyframes {
        private SimpleKeyframes() {}
        public android.animation.Keyframes clone() { return null; }
        public java.util.ArrayList<android.animation.Keyframe> getKeyframes() { return null; }
        public void setEvaluator(android.animation.TypeEvaluator p0) {}
    }
}
