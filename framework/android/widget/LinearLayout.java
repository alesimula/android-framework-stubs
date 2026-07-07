package android.widget;

@android.widget.RemoteViews.RemoteView
public class LinearLayout extends android.view.ViewGroup {
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private static boolean sCompatibilityDone;
    private static boolean sRemeasureWeightedChildren;
    private final boolean mAllowInconsistentMeasurement = false;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mBaselineAligned;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private int mBaselineAlignedChildIndex;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    @android.view.ViewDebug.ExportedProperty(category="measurement", flagMapping={@android.view.ViewDebug.FlagToString(equals=-1, mask=-1, name="NONE"), @android.view.ViewDebug.FlagToString(equals=0, mask=0, name="NONE"), @android.view.ViewDebug.FlagToString(equals=48, mask=48, name="TOP"), @android.view.ViewDebug.FlagToString(equals=80, mask=80, name="BOTTOM"), @android.view.ViewDebug.FlagToString(equals=3, mask=3, name="LEFT"), @android.view.ViewDebug.FlagToString(equals=5, mask=5, name="RIGHT"), @android.view.ViewDebug.FlagToString(equals=8388611, mask=8388611, name="START"), @android.view.ViewDebug.FlagToString(equals=8388613, mask=8388613, name="END"), @android.view.ViewDebug.FlagToString(equals=16, mask=16, name="CENTER_VERTICAL"), @android.view.ViewDebug.FlagToString(equals=112, mask=112, name="FILL_VERTICAL"), @android.view.ViewDebug.FlagToString(equals=1, mask=1, name="CENTER_HORIZONTAL"), @android.view.ViewDebug.FlagToString(equals=7, mask=7, name="FILL_HORIZONTAL"), @android.view.ViewDebug.FlagToString(equals=17, mask=17, name="CENTER"), @android.view.ViewDebug.FlagToString(equals=119, mask=119, name="FILL"), @android.view.ViewDebug.FlagToString(equals=8388608, mask=8388608, name="RELATIVE")}, formatToHexString=true)
    private int mGravity;
    private int mLayoutDirection;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mOrientation;
    private int mShowDividers;
    @android.view.ViewDebug.ExportedProperty(category="measurement")
    private int mTotalLength;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mUseLargestChild;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private float mWeightSum;
    public LinearLayout(android.content.Context p0) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public LinearLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private boolean allViewsAreGoneAfter(int p0) { return false; }
    private boolean allViewsAreGoneBefore(int p0) { return false; }
    private void forceUniformHeight(int p0, int p1) {}
    private void forceUniformWidth(int p0, int p1) {}
    private android.view.View getLastNonGoneChild() { return null; }
    private boolean hasDividerAfterChildAt(int p0) { return false; }
    private boolean isShowingDividers() { return false; }
    private void setChildFrame(android.view.View p0, int p1, int p2, int p3, int p4) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    void drawDividersHorizontal(android.graphics.Canvas p0) {}
    void drawDividersVertical(android.graphics.Canvas p0) {}
    void drawHorizontalDivider(android.graphics.Canvas p0, int p1) {}
    void drawVerticalDivider(android.graphics.Canvas p0, int p1) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getBaseline() { return 0; }
    public int getBaselineAlignedChildIndex() { return 0; }
    int getChildrenSkipCount(android.view.View p0, int p1) { return 0; }
    public android.graphics.drawable.Drawable getDividerDrawable() { return null; }
    public int getDividerPadding() { return 0; }
    public int getDividerWidth() { return 0; }
    public int getGravity() { return 0; }
    int getLocationOffset(android.view.View p0) { return 0; }
    int getNextLocationOffset(android.view.View p0) { return 0; }
    public int getOrientation() { return 0; }
    public int getShowDividers() { return 0; }
    android.view.View getVirtualChildAt(int p0) { return null; }
    int getVirtualChildCount() { return 0; }
    public float getWeightSum() { return 0.0f; }
    protected boolean hasDividerBeforeChildAt(int p0) { return false; }
    public boolean isBaselineAligned() { return false; }
    public boolean isMeasureWithLargestChildEnabled() { return false; }
    void layoutHorizontal(int p0, int p1, int p2, int p3) {}
    void layoutVertical(int p0, int p1, int p2, int p3) {}
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    void measureHorizontal(int p0, int p1) {}
    int measureNullChild(int p0) { return 0; }
    void measureVertical(int p0, int p1) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void onRtlPropertiesChanged(int p0) {}
    @android.view.RemotableViewMethod
    public void setBaselineAligned(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setBaselineAlignedChildIndex(int p0) {}
    public void setDividerDrawable(android.graphics.drawable.Drawable p0) {}
    public void setDividerPadding(int p0) {}
    @android.view.RemotableViewMethod
    public void setGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setHorizontalGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setMeasureWithLargestChildEnabled(boolean p0) {}
    public void setOrientation(int p0) {}
    public void setShowDividers(int p0) {}
    @android.view.RemotableViewMethod
    public void setVerticalGravity(int p0) {}
    @android.view.RemotableViewMethod
    public void setWeightSum(float p0) {}
    public boolean shouldDelayChildPressedState() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DividerMode {
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="NONE"), @android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=8388611, to="START"), @android.view.ViewDebug.IntToString(from=8388613, to="END"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
        public int gravity;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public float weight;
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.widget.LinearLayout.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public java.lang.String debug(java.lang.String p0) { return null; }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.LinearLayout.LayoutParams> {
            private int mLayout_gravityId;
            private int mLayout_weightId;
            private boolean mPropertiesMapped;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.LinearLayout.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OrientationMode {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.LinearLayout> {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped;
        private int mWeightSumId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.LinearLayout p0, android.view.inspector.PropertyReader p1) {}
    }
}
