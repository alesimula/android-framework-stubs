package com.android.internal.widget.remotecompose.core.operations.layout;

public class Component extends com.android.internal.widget.remotecompose.core.PaintOperation implements com.android.internal.widget.remotecompose.core.operations.layout.Container, com.android.internal.widget.remotecompose.core.operations.layout.measure.Measurable, com.android.internal.widget.remotecompose.core.SerializableToString, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    private static final boolean DEBUG = false;
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimateMeasure mAnimateMeasure;
    protected int mAnimationId;
    public com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec mAnimationSpec;
    protected int mComponentId;
    protected java.util.HashSet<com.android.internal.widget.remotecompose.core.operations.ComponentValue> mComponentValues;
    public boolean mFirstLayout;
    protected float mHeight;
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> mList;
    protected float[] mLocation;
    private boolean mNeedsBoundsAnimation;
    public boolean mNeedsMeasure;
    public boolean mNeedsRepaint;
    com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle mPaint;
    protected com.android.internal.widget.remotecompose.core.operations.layout.Component mParent;
    public com.android.internal.widget.remotecompose.core.PaintOperation mPreTranslate;
    public int mScheduledVisibility;
    public int mVisibility;
    protected float mWidth;
    protected float mX;
    protected float mY;
    protected float mZIndex;
    public Component(int p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.Component p5) { super(); }
    public Component(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) { super(); }
    public Component(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super(); }
    public void addComponentValue(com.android.internal.widget.remotecompose.core.operations.ComponentValue p0) {}
    public void animatingBounds(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public boolean applyAnimationAsNeeded(com.android.internal.widget.remotecompose.core.PaintContext p0) { return false; }
    public boolean applyComputedLayout(int p0, com.android.internal.widget.remotecompose.core.PaintContext p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p2, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p3) { return false; }
    public void applyMeasure(com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p0) {}
    public void clearNeedsBoundsAnimation() {}
    public boolean contains(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) { return false; }
    public java.lang.String content() { return null; }
    public void debugBox(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, com.android.internal.widget.remotecompose.core.PaintContext p1) {}
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public boolean doesNeedsRepaint() { return false; }
    public void finalizeCreation() {}
    public float getAlignValue(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1) { return 0.0f; }
    public int getAnimationId() { return 0; }
    protected com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec getAnimationSpec() { return null; }
    public void getBoundsInSemanticParent(int[] p0, java.lang.Integer p1) {}
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getComponent(int p0) { return null; }
    public int getComponentCount() { return 0; }
    public int getComponentId() { return 0; }
    public void getComponents(java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> p0) {}
    public void getData(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) {}
    public void getData(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, boolean p1) {}
    public float getHeight() { return 0.0f; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> getList() { return null; }
    public void getLocationInWindow(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1) {}
    public void getLocationInWindow(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1, boolean p2) {}
    public int getPaintId() { return 0; }
    public com.android.internal.widget.remotecompose.core.operations.layout.Component getParent() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.RootLayoutComponent getRoot() throws java.lang.Exception { return null; }
    public float getScrollX() { return 0.0f; }
    public float getScrollY() { return 0.0f; }
    protected java.lang.String getSerializedName() { return null; }
    public float getTranslateX() { return 0.0f; }
    public float getTranslateY() { return 0.0f; }
    public float getWidth() { return 0.0f; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public float getZIndex() { return 0.0f; }
    public boolean hasComputedLayout() { return false; }
    public void inflate() {}
    public void invalidateMeasure() {}
    public boolean isGone() { return false; }
    public boolean isInvisible() { return false; }
    public boolean isVisible() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p1) {}
    public void markNeedsBoundsAnimation() {}
    public float maxIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float maxIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public void measure(com.android.internal.widget.remotecompose.core.PaintContext p0, float p1, float p2, float p3, float p4, com.android.internal.widget.remotecompose.core.operations.layout.measure.MeasurePass p5) {}
    public float minIntrinsicHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float minIntrinsicWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public boolean needsBoundsAnimation() { return false; }
    public boolean needsMeasure() { return false; }
    public void needsRepaint() {}
    public boolean onClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public boolean onDoubleClick(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public boolean onLongPress(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public boolean onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, boolean p4) { return false; }
    public boolean onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3) { return false; }
    public boolean onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, boolean p4) { return false; }
    public boolean onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, float p2, float p3, float p4, float p5, boolean p6) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public <T extends java.lang.Object> T selfOrModifier(java.lang.Class<T> p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setAnimationId(int p0) {}
    protected void setAnimationSpec(com.android.internal.widget.remotecompose.core.operations.layout.animation.AnimationSpec p0) {}
    public void setComponentId(int p0) {}
    public void setHeight(float p0) {}
    public void setLayoutPosition(float p0, float p1) {}
    public void setParent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void setVisibility(int p0) {}
    public void setWidth(float p0) {}
    public void setX(float p0) {}
    public void setY(float p0) {}
    public boolean suitableForTransition(com.android.internal.widget.remotecompose.core.Operation p0) { return false; }
    public java.lang.String textContent() { return null; }
    public java.lang.String toString() { return null; }
    protected void updateComponentValues(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}

    public static class Visibility {
        public static final int CLEAR_OVERRIDE = 128;
        public static final int GONE = 0;
        public static final int INVISIBLE = 2;
        public static final int OVERRIDE_GONE = 16;
        public static final int OVERRIDE_INVISIBLE = 64;
        public static final int OVERRIDE_VISIBLE = 32;
        public static final int VISIBLE = 1;
        private Visibility() {}
        public static int add(int p0, int p1) { return 0; }
        public static int clearOverride(int p0) { return 0; }
        public static boolean hasOverride(int p0) { return false; }
        public static boolean isGone(int p0) { return false; }
        public static boolean isInvisible(int p0) { return false; }
        public static boolean isVisible(int p0) { return false; }
        public static java.lang.String toString(int p0) { return null; }
    }
}
