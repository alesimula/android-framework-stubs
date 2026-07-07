package android.widget;

public class TableRow extends android.widget.LinearLayout {
    private android.widget.TableRow.ChildrenTracker mChildrenTracker;
    private android.util.SparseIntArray mColumnToChildIndex;
    private int[] mColumnWidths;
    private int[] mConstrainedColumnWidths;
    private int mNumColumns;
    public TableRow(android.content.Context p0) { super((android.content.Context)null); }
    public TableRow(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void initTableRow() {}
    private void mapIndexAndColumns() {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.TableRow.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    int getChildrenSkipCount(android.view.View p0, int p1) { return 0; }
    int[] getColumnsWidths(int p0, int p1) { return null; }
    int getLocationOffset(android.view.View p0) { return 0; }
    int getNextLocationOffset(android.view.View p0) { return 0; }
    public android.view.View getVirtualChildAt(int p0) { return null; }
    public int getVirtualChildCount() { return 0; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    int measureNullChild(int p0) { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    void setColumnCollapsed(int p0, boolean p1) {}
    void setColumnsWidthConstraints(int[] p0) {}
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}

    private class ChildrenTracker implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener listener;
        private ChildrenTracker(android.widget.TableRow p0) {}
        private void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
        public void onChildViewAdded(android.view.View p0, android.view.View p1) {}
        public void onChildViewRemoved(android.view.View p0, android.view.View p1) {}
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        private static final int LOCATION = 0;
        private static final int LOCATION_NEXT = 1;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int column;
        private int[] mOffset;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int span;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.TableRow.LayoutParams> {
            private int mLayout_columnId;
            private int mLayout_spanId;
            private boolean mPropertiesMapped;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.widget.TableRow.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }
}
