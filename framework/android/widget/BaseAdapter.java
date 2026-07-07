package android.widget;

public abstract class BaseAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
    private java.lang.CharSequence[] mAutofillOptions;
    private final android.database.DataSetObservable mDataSetObservable = null;
    public BaseAdapter() {}
    public boolean areAllItemsEnabled() { return false; }
    public java.lang.CharSequence[] getAutofillOptions() { return null; }
    public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getItemViewType(int p0) { return 0; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public void notifyDataSetChanged() {}
    public void notifyDataSetInvalidated() {}
    public void registerDataSetObserver(android.database.DataSetObserver p0) {}
    public void setAutofillOptions(java.lang.CharSequence... p0) {}
    public void unregisterDataSetObserver(android.database.DataSetObserver p0) {}
}
