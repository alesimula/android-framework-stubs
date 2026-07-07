package android.widget;

@android.widget.RemoteViews.RemoteView
public class FrameLayout extends android.view.ViewGroup {
    private static final int DEFAULT_CHILD_GRAVITY = 8388659;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingBottom;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingLeft;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingRight;
    @android.view.ViewDebug.ExportedProperty(category="padding")
    private int mForegroundPaddingTop;
    private final java.util.ArrayList<android.view.View> mMatchParentChildren = null;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    boolean mMeasureAllChildren;
    public FrameLayout(android.content.Context p0) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public FrameLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private int getPaddingBottomWithForeground() { return 0; }
    private int getPaddingTopWithForeground() { return 0; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    protected android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    @java.lang.Deprecated
    public boolean getConsiderGoneChildrenWhenMeasuring() { return false; }
    public boolean getMeasureAllChildren() { return false; }
    int getPaddingLeftWithForeground() { return 0; }
    int getPaddingRightWithForeground() { return 0; }
    void layoutChildren(int p0, int p1, int p2, int p3, boolean p4) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    @android.view.RemotableViewMethod
    public void setForegroundGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setMeasureAllChildren(boolean p0) {}
    public boolean shouldDelayChildPressedState() { return false; }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public static final int UNSPECIFIED_GRAVITY = -1;
        public int gravity;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, int p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.widget.FrameLayout.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.FrameLayout.LayoutParams> {
            private int mLayout_gravityId;
            private boolean mPropertiesMapped;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.FrameLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.FrameLayout> {
        private int mMeasureAllChildrenId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.FrameLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
