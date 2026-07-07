package android.widget;

public abstract class AdapterView<T extends android.widget.Adapter> extends android.view.ViewGroup {
    public static final int INVALID_POSITION = -1;
    public static final long INVALID_ROW_ID = -9223372036854775808L;
    public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
    public static final int ITEM_VIEW_TYPE_IGNORE = -1;
    static final int SYNC_FIRST_POSITION = 1;
    static final int SYNC_MAX_DURATION_MILLIS = 100;
    static final int SYNC_SELECTED_POSITION = 0;
    boolean mBlockLayoutRequests;
    boolean mDataChanged;
    private boolean mDesiredFocusableInTouchModeState;
    private int mDesiredFocusableState;
    private android.view.View mEmptyView;
    @android.view.ViewDebug.ExportedProperty(category="scrolling")
    int mFirstPosition;
    boolean mInLayout;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mItemCount;
    private int mLayoutHeight;
    boolean mNeedSync;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mNextSelectedPosition;
    long mNextSelectedRowId;
    int mOldItemCount;
    int mOldSelectedPosition;
    long mOldSelectedRowId;
    android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    android.widget.AdapterView.OnItemLongClickListener mOnItemLongClickListener;
    android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private android.widget.AdapterView<T>.SelectionNotifier mPendingSelectionNotifier;
    @android.view.ViewDebug.ExportedProperty(category="list")
    int mSelectedPosition;
    long mSelectedRowId;
    private android.widget.AdapterView<T>.SelectionNotifier mSelectionNotifier;
    int mSpecificTop;
    long mSyncHeight;
    int mSyncMode;
    int mSyncPosition;
    long mSyncRowId;
    public AdapterView(android.content.Context p0) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AdapterView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void dispatchOnItemSelected() {}
    private void fireOnSelected() {}
    private boolean isScrollableForAccessibility() { return false; }
    private void performAccessibilityActionsOnSelected() {}
    private void updateEmptyStatus(boolean p0) {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected boolean canAnimate() { return false; }
    void checkFocus() {}
    void checkSelectionChanged() {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    int findSyncPosition() { return 0; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public abstract T getAdapter();
    @android.view.ViewDebug.CapturedViewProperty
    public int getCount() { return 0; }
    public android.view.View getEmptyView() { return null; }
    public int getFirstVisiblePosition() { return 0; }
    public java.lang.Object getItemAtPosition(int p0) { return null; }
    public long getItemIdAtPosition(int p0) { return 0L; }
    public int getLastVisiblePosition() { return 0; }
    public final android.widget.AdapterView.OnItemClickListener getOnItemClickListener() { return null; }
    public final android.widget.AdapterView.OnItemLongClickListener getOnItemLongClickListener() { return null; }
    public final android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() { return null; }
    public int getPositionForView(android.view.View p0) { return 0; }
    public java.lang.Object getSelectedItem() { return null; }
    @android.view.ViewDebug.CapturedViewProperty
    public long getSelectedItemId() { return 0L; }
    @android.view.ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() { return 0; }
    public abstract android.view.View getSelectedView();
    void handleDataChanged() {}
    boolean isInFilterMode() { return false; }
    int lookForSelectablePosition(int p0, boolean p1) { return 0; }
    protected void onDetachedFromWindow() {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void onProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public boolean onRequestSendAccessibilityEventInternal(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public boolean performItemClick(android.view.View p0, int p1, long p2) { return false; }
    void rememberSyncState() {}
    public void removeAllViews() {}
    public void removeView(android.view.View p0) {}
    public void removeViewAt(int p0) {}
    void selectionChanged() {}
    public abstract void setAdapter(T p0);
    @android.view.RemotableViewMethod
    public void setEmptyView(android.view.View p0) {}
    public void setFocusable(int p0) {}
    public void setFocusableInTouchMode(boolean p0) {}
    void setNextSelectedPositionInt(int p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener p0) {}
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener p0) {}
    void setSelectedPositionInt(int p0) {}
    public abstract void setSelection(int p0);

    public static class AdapterContextMenuInfo implements android.view.ContextMenu.ContextMenuInfo {
        public long id;
        public int position;
        public android.view.View targetView;
        public AdapterContextMenuInfo(android.view.View p0, int p1, long p2) {}
    }

    class AdapterDataSetObserver extends android.database.DataSetObserver {
        private android.os.Parcelable mInstanceState;
        AdapterDataSetObserver(android.widget.AdapterView p0) { super(); }
        public void clearSavedState() {}
        public void onChanged() {}
        public void onInvalidated() {}
    }

    public static interface OnItemClickListener {
        public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
    }

    public static interface OnItemLongClickListener {
        public boolean onItemLongClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
    }

    public static interface OnItemSelectedListener {
        public void onItemSelected(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3);
        public void onNothingSelected(android.widget.AdapterView<?> p0);
    }

    private class SelectionNotifier implements java.lang.Runnable {
        private SelectionNotifier(android.widget.AdapterView p0) {}
        public void run() {}
    }
}
