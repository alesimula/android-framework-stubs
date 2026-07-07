package android.widget;

public class TableLayout extends android.widget.LinearLayout {
    private android.util.SparseBooleanArray mCollapsedColumns;
    private boolean mInitialized;
    private int[] mMaxWidths;
    private android.widget.TableLayout.PassThroughHierarchyChangeListener mPassThroughListener;
    private boolean mShrinkAllColumns;
    private android.util.SparseBooleanArray mShrinkableColumns;
    private boolean mStretchAllColumns;
    private android.util.SparseBooleanArray mStretchableColumns;
    public TableLayout(android.content.Context p0) { super((android.content.Context)null); }
    public TableLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void findLargestCells(int p0, int p1) {}
    private void initTableLayout() {}
    private void mutateColumnsWidth(android.util.SparseBooleanArray p0, boolean p1, int p2, int p3) {}
    private static android.util.SparseBooleanArray parseColumns(java.lang.String p0) { return null; }
    private void requestRowsLayout() {}
    private void shrinkAndStretchColumns(int p0) {}
    private void trackCollapsedColumns(android.view.View p0) {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.widget.TableLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public boolean isColumnCollapsed(int p0) { return false; }
    public boolean isColumnShrinkable(int p0) { return false; }
    public boolean isColumnStretchable(int p0) { return false; }
    public boolean isShrinkAllColumns() { return false; }
    public boolean isStretchAllColumns() { return false; }
    void measureChildBeforeLayout(android.view.View p0, int p1, int p2, int p3, int p4, int p5) {}
    void measureVertical(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    public void requestLayout() {}
    public void setColumnCollapsed(int p0, boolean p1) {}
    public void setColumnShrinkable(int p0, boolean p1) {}
    public void setColumnStretchable(int p0, boolean p1) {}
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
    public void setShrinkAllColumns(boolean p0) {}
    public void setStretchAllColumns(boolean p0) {}

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1, float p2) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
    }

    private class PassThroughHierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        private android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
        private PassThroughHierarchyChangeListener(android.widget.TableLayout p0) {}
        public void onChildViewAdded(android.view.View p0, android.view.View p1) {}
        public void onChildViewRemoved(android.view.View p0, android.view.View p1) {}
    }
}
