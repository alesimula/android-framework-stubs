package com.android.internal.widget.remotecompose.core.operations.layout.modifiers;

public class ScrollModifierOperation extends com.android.internal.widget.remotecompose.core.operations.layout.ListActionsOperation implements com.android.internal.widget.remotecompose.core.operations.layout.TouchHandler, com.android.internal.widget.remotecompose.core.operations.layout.DecoratorComponent, com.android.internal.widget.remotecompose.core.operations.layout.ScrollDelegate, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent {
    public static final java.lang.String CLASS_NAME = "ScrollModifierOperation";
    private static final int OP_CODE = 226;
    float mContentDimension;
    int mDirection;
    private com.android.internal.widget.remotecompose.core.ScrollingEdgeEffect mEdgeEffectA;
    private com.android.internal.widget.remotecompose.core.ScrollingEdgeEffect mEdgeEffectB;
    float mHostDimension;
    float mInitialScrollX;
    float mInitialScrollY;
    float mLastTouchX;
    float mLastTouchY;
    private final float mMax = 0.0f;
    float mMaxScrollX;
    float mMaxScrollY;
    private final float mNotchMax = 0.0f;
    private final float mPositionExpression = 0.0f;
    float mScrollX;
    float mScrollY;
    boolean mTouchDown;
    float mTouchDownX;
    float mTouchDownY;
    private com.android.internal.widget.remotecompose.core.operations.TouchExpression mTouchExpression;
    public ScrollModifierOperation(int p0, float p1, float p2, float p3) { super(null); }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    private float getMaxScrollPosition(com.android.internal.widget.remotecompose.core.operations.layout.Component p0, int p1) { return 0.0f; }
    public static int id() { return 0; }
    public static java.lang.String name() { return null; }
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public void applyEdgeEffect(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, int p2) {}
    public float contentHeight() { return 0.0f; }
    public float contentWidth() { return 0.0f; }
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public float getContentDimension() { return 0.0f; }
    public com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollAxisRange getScrollAxisRange() { return null; }
    public float getScrollX() { return 0.0f; }
    public float getScrollX(float p0) { return 0.0f; }
    public float getScrollY() { return 0.0f; }
    public float getScrollY(float p0) { return 0.0f; }
    public boolean handlesHorizontalScroll() { return false; }
    public boolean handlesVerticalScroll() { return false; }
    public void inflate(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public boolean isHorizontalScroll() { return false; }
    public boolean isVerticalScroll() { return false; }
    public void layout(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1, float p2, float p3) {}
    public boolean onTouchCancel(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4) { return false; }
    public boolean onTouchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.CoreDocument p1, com.android.internal.widget.remotecompose.core.operations.layout.Component p2, float p3, float p4, float p5, float p6) { return false; }
    public void paint(com.android.internal.widget.remotecompose.core.PaintContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void reset() {}
    public int scrollByOffset(com.android.internal.widget.remotecompose.core.RemoteContext p0, int p1) { return 0; }
    public int scrollDirection() { return 0; }
    public boolean scrollDirection(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.semantics.ScrollableComponent.ScrollDirection p1) { return false; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
    public void serializeToString(int p0, com.android.internal.widget.remotecompose.core.operations.utilities.StringSerializer p1) {}
    public void setHorizontalScrollDimension(float p0, float p1) {}
    public void setVerticalScrollDimension(float p0, float p1) {}
    public boolean showOnScreen(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.operations.layout.Component p1) { return false; }
    public java.lang.String toString() { return null; }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
}
