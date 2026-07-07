package com.android.internal.widget.remotecompose.core.operations.layout.measure;

public class ComponentMeasure {
    private boolean mAllowsAnimation;
    float mH;
    int mId;
    int mVisibility;
    float mW;
    float mX;
    float mY;
    public ComponentMeasure(int p0, float p1, float p2, float p3, float p4) {}
    public ComponentMeasure(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public ComponentMeasure(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void addVisibilityOverride(int p0) {}
    public void clearVisibilityOverride() {}
    public void copyFrom(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) {}
    public boolean getAllowsAnimation() { return false; }
    public float getH() { return 0.0f; }
    public int getVisibility() { return 0; }
    public float getW() { return 0.0f; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public boolean isGone() { return false; }
    public boolean isInvisible() { return false; }
    public boolean isVisible() { return false; }
    public boolean same(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) { return false; }
    public void setAllowsAnimation(boolean p0) {}
    public void setH(float p0) {}
    public void setVisibility(int p0) {}
    public void setW(float p0) {}
    public void setX(float p0) {}
    public void setY(float p0) {}
}
