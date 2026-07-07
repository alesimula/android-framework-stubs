package android.widget;

public abstract class AbsSpinner extends android.widget.AdapterView<android.widget.SpinnerAdapter> {
    private static final java.lang.String LOG_TAG = null;
    android.widget.SpinnerAdapter mAdapter;
    private android.database.DataSetObserver mDataSetObserver;
    int mHeightMeasureSpec;
    final android.widget.AbsSpinner.RecycleBin mRecycler = null;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    final android.graphics.Rect mSpinnerPadding = null;
    private android.graphics.Rect mTouchFrame;
    int mWidthMeasureSpec;
    public AbsSpinner(android.content.Context p0) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsSpinner(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initAbsSpinner() {}
    public void autofill(android.view.autofill.AutofillValue p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.widget.SpinnerAdapter getAdapter() { return null; }
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    int getChildHeight(android.view.View p0) { return 0; }
    int getChildWidth(android.view.View p0) { return 0; }
    public int getCount() { return 0; }
    public android.view.View getSelectedView() { return null; }
    abstract void layout(int p0, boolean p1);
    protected void onMeasure(int p0, int p1) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public int pointToPosition(int p0, int p1) { return 0; }
    void recycleAllViews() {}
    public void requestLayout() {}
    void resetList() {}
    public void setAdapter(android.widget.SpinnerAdapter p0) {}
    public void setSelection(int p0) {}
    public void setSelection(int p0, boolean p1) {}
    void setSelectionInt(int p0, boolean p1) {}

    class RecycleBin {
        private final android.util.SparseArray<android.view.View> mScrapHeap = null;
        RecycleBin(android.widget.AbsSpinner p0) {}
        void clear() {}
        android.view.View get(int p0) { return null; }
        public void put(int p0, android.view.View p1) {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.AbsSpinner.SavedState> CREATOR = null;
        int position;
        long selectedId;
        SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
