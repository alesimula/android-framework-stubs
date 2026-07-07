package com.android.internal.widget.remotecompose.core.operations.utilities.easing;

public abstract class Easing {
    public static final int CUBIC_ACCELERATE = 2;
    public static final int CUBIC_ANTICIPATE = 5;
    public static final int CUBIC_CUSTOM = 11;
    public static final int CUBIC_DECELERATE = 3;
    public static final int CUBIC_LINEAR = 4;
    public static final int CUBIC_OVERSHOOT = 6;
    public static final int CUBIC_STANDARD = 1;
    public static final int EASE_OUT_BOUNCE = 13;
    public static final int EASE_OUT_ELASTIC = 14;
    public static final int SPLINE_CUSTOM = 12;
    int mType;
    public Easing() {}
    public static java.lang.String getString(int p0) { return null; }
    public abstract float get(float p0);
    public abstract float getDiff(float p0);
    public int getType() { return 0; }
}
