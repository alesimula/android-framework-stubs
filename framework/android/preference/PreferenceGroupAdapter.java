package android.preference;

@java.lang.Deprecated
public class PreferenceGroupAdapter extends android.widget.BaseAdapter implements android.preference.Preference.OnPreferenceChangeInternalListener {
    private static final java.lang.String TAG = "PreferenceGroupAdapter";
    private static android.view.ViewGroup.LayoutParams sWrapperLayoutParams;
    private android.os.Handler mHandler;
    private boolean mHasReturnedViewTypeCount;
    private android.graphics.drawable.Drawable mHighlightedDrawable;
    private int mHighlightedPosition;
    private volatile boolean mIsSyncing;
    private android.preference.PreferenceGroup mPreferenceGroup;
    private java.util.ArrayList<android.preference.PreferenceGroupAdapter.PreferenceLayout> mPreferenceLayouts;
    private java.util.List<android.preference.Preference> mPreferenceList;
    private java.lang.Runnable mSyncRunnable;
    private android.preference.PreferenceGroupAdapter.PreferenceLayout mTempPreferenceLayout;
    public PreferenceGroupAdapter(android.preference.PreferenceGroup p0) { super(); }
    private void addPreferenceClassName(android.preference.Preference p0) {}
    private android.preference.PreferenceGroupAdapter.PreferenceLayout createPreferenceLayout(android.preference.Preference p0, android.preference.PreferenceGroupAdapter.PreferenceLayout p1) { return null; }
    private void flattenPreferenceGroup(java.util.List<android.preference.Preference> p0, android.preference.PreferenceGroup p1) {}
    private int getHighlightItemViewType() { return 0; }
    private void syncMyPreferences() {}
    public boolean areAllItemsEnabled() { return false; }
    public int getCount() { return 0; }
    public android.preference.Preference getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean hasStableIds() { return false; }
    public boolean isEnabled(int p0) { return false; }
    public void onPreferenceChange(android.preference.Preference p0) {}
    public void onPreferenceHierarchyChange(android.preference.Preference p0) {}
    public void setHighlighted(int p0) {}
    public void setHighlightedDrawable(android.graphics.drawable.Drawable p0) {}

    private static class PreferenceLayout implements java.lang.Comparable<android.preference.PreferenceGroupAdapter.PreferenceLayout> {
        private java.lang.String name;
        private int resId;
        private int widgetResId;
        private PreferenceLayout() {}
        public int compareTo(android.preference.PreferenceGroupAdapter.PreferenceLayout p0) { return 0; }
    }
}
