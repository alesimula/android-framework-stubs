package android.animation;

public abstract class Keyframe implements java.lang.Cloneable {
    float mFraction;
    boolean mHasValue;
    private android.animation.TimeInterpolator mInterpolator;
    java.lang.Class mValueType;
    boolean mValueWasSetOnStart;
    public Keyframe() {}
    public static android.animation.Keyframe ofFloat(float p0) { return null; }
    public static android.animation.Keyframe ofFloat(float p0, float p1) { return null; }
    public static android.animation.Keyframe ofInt(float p0) { return null; }
    public static android.animation.Keyframe ofInt(float p0, int p1) { return null; }
    public static android.animation.Keyframe ofObject(float p0) { return null; }
    public static android.animation.Keyframe ofObject(float p0, java.lang.Object p1) { return null; }
    public abstract android.animation.Keyframe clone();
    public float getFraction() { return 0.0f; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public java.lang.Class getType() { return null; }
    public abstract java.lang.Object getValue();
    public boolean hasValue() { return false; }
    public void setFraction(float p0) {}
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public abstract void setValue(java.lang.Object p0);
    void setValueWasSetOnStart(boolean p0) {}
    boolean valueWasSetOnStart() { return false; }

    static class FloatKeyframe extends android.animation.Keyframe {
        float mValue;
        FloatKeyframe(float p0) { super(); }
        FloatKeyframe(float p0, float p1) { super(); }
        public android.animation.Keyframe.FloatKeyframe clone() { return null; }
        public float getFloatValue() { return 0.0f; }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
    }

    static class IntKeyframe extends android.animation.Keyframe {
        int mValue;
        IntKeyframe(float p0) { super(); }
        IntKeyframe(float p0, int p1) { super(); }
        public android.animation.Keyframe.IntKeyframe clone() { return null; }
        public int getIntValue() { return 0; }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
    }

    static class ObjectKeyframe extends android.animation.Keyframe {
        java.lang.Object mValue;
        ObjectKeyframe(float p0, java.lang.Object p1) { super(); }
        public android.animation.Keyframe.ObjectKeyframe clone() { return null; }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
    }
}
