package com.android.internal.widget.remotecompose.core.operations.layout;

public class LayoutComponent extends com.android.internal.widget.remotecompose.core.operations.layout.Component {
    private static final boolean USE_IMAGE_TEMP_FIX = false;
    protected final java.util.HashMap<java.lang.Integer, java.lang.Object> mCachedAttributes = null;
    protected java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> mChildrenComponents;
    protected boolean mChildrenHaveZIndex;
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ComponentModifiers mComponentModifiers;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.modifiers.LayoutComputeOperation> mComputedLayoutModifiers;
    protected com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponentContent mContent;
    private com.android.internal.widget.remotecompose.core.operations.layout.CanvasOperations mDrawContentOperations;
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.GraphicsLayerModifierOperation mGraphicsLayerModifier;
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.HeightModifierOperation mHeightModifier;
    protected com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate mHorizontalScrollDelegate;
    protected float mPaddingBottom;
    protected float mPaddingLeft;
    protected float mPaddingRight;
    protected float mPaddingTop;
    float mScrollX;
    float mScrollY;
    protected com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate mVerticalScrollDelegate;
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.WidthModifierOperation mWidthModifier;
    protected com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ZIndexModifierOperation mZIndexModifier;
    public LayoutComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1, int p2, float p3, float p4, float p5, float p6) { super((com.android.internal.widget.remotecompose.core.operations.layout.Component)null); }
    private void internalPaintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    private void updatePadding() {}
    public boolean applyComputedLayout(int p0, com.android.internal.widget.remotecompose.core.PaintContext p1, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p2, com.android.internal.widget.remotecompose.core.operations.layout.measure.ComponentMeasure p3) { return false; }
    protected float applyHeightConstraints(float p0) { return 0.0f; }
    protected float applyWidthConstraints(float p0) { return 0.0f; }
    public float computeModifierDefinedHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float computeModifierDefinedHeight(com.android.internal.widget.remotecompose.core.RemoteContext p0, boolean p1) { return 0.0f; }
    public float computeModifierDefinedPaddingHeight(float[] p0) { return 0.0f; }
    public float computeModifierDefinedPaddingWidth(float[] p0) { return 0.0f; }
    public float computeModifierDefinedWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0) { return 0.0f; }
    public float computeModifierDefinedWidth(com.android.internal.widget.remotecompose.core.RemoteContext p0, boolean p1) { return 0.0f; }
    public void drawContent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.operations.layout.Component> getChildrenComponents() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.ComponentModifiers getComponentModifiers() { return null; }
    protected void getComponentsData(com.android.internal.widget.remotecompose.core.operations.layout.LayoutComponentContent p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.HeightModifierOperation getHeightModifier() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate getHorizontalScrollDelegate() { return null; }
    public void getLocationInWindow(com.android.internal.widget.remotecompose.core.RemoteContext p0, float[] p1, boolean p2) {}
    public float getPaddingBottom() { return 0.0f; }
    public float getPaddingLeft() { return 0.0f; }
    public float getPaddingRight() { return 0.0f; }
    public float getPaddingTop() { return 0.0f; }
    public float getScrollX() { return 0.0f; }
    public float getScrollY() { return 0.0f; }
    public com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate getVerticalScrollDelegate() { return null; }
    public com.android.internal.widget.remotecompose.core.operations.layout.modifiers.WidthModifierOperation getWidthModifier() { return null; }
    public float getZIndex() { return 0.0f; }
    protected void handleOperations(com.android.internal.widget.remotecompose.core.RemoteContext p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public boolean hasComputedLayout() { return false; }
    public void inflate() {}
    public void paintingComponent(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public <T extends java.lang.Object> T selfOrModifier(java.lang.Class<T> p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void setCanvasOperations(com.android.internal.widget.remotecompose.core.operations.layout.CanvasOperations p0) {}
    public void setScrollX(float p0) {}
    public void setScrollY(float p0) {}
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
}
