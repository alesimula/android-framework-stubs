package com.android.internal.app;

@java.lang.Deprecated
public class LocalePickerWithRegion extends android.app.ListFragment implements android.widget.SearchView.OnQueryTextListener {
    private static final java.lang.String PARENT_FRAGMENT_NAME = "localeListEditor";
    private static final java.lang.String TAG = null;
    private com.android.internal.app.SuggestedLocaleAdapter mAdapter;
    private int mFirstVisiblePosition;
    private boolean mIsNumberingSystem;
    private com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener mListener;
    private java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> mLocaleList;
    private com.android.internal.app.LocaleCollectorBase mLocalePickerCollector;
    private android.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
    private com.android.internal.app.LocaleStore.LocaleInfo mParentLocale;
    private java.lang.CharSequence mPreviousSearch;
    private boolean mPreviousSearchHadFocus;
    private android.widget.SearchView mSearchView;
    private java.lang.CharSequence mTitle;
    private int mTopDistance;
    private boolean mTranslatedOnly;
    public LocalePickerWithRegion() { super(); }
    private static com.android.internal.app.LocalePickerWithRegion createCountryPicker(com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2, android.view.MenuItem.OnActionExpandListener p3, com.android.internal.app.LocaleCollectorBase p4) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2, android.os.LocaleList p3) { return null; }
    public static com.android.internal.app.LocalePickerWithRegion createLanguagePicker(android.content.Context p0, com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p1, boolean p2, android.os.LocaleList p3, java.lang.String p4, android.view.MenuItem.OnActionExpandListener p5) { return null; }
    private static com.android.internal.app.LocalePickerWithRegion createNumberingSystemPicker(com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2, android.view.MenuItem.OnActionExpandListener p3, com.android.internal.app.LocaleCollectorBase p4) { return null; }
    private void returnToParentFrame() {}
    private void setIsNumberingSystem(boolean p0) {}
    private boolean setListener(com.android.internal.app.LocalePickerWithRegion.LocaleSelectedListener p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2, com.android.internal.app.LocaleCollectorBase p3) { return false; }
    public void onCreate(android.os.Bundle p0) {}
    public void onCreateOptionsMenu(android.view.Menu p0, android.view.MenuInflater p1) {}
    public void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onPause() {}
    public boolean onQueryTextChange(java.lang.String p0) { return false; }
    public boolean onQueryTextSubmit(java.lang.String p0) { return false; }
    public void onResume() {}
    public void onViewCreated(android.view.View p0, android.os.Bundle p1) {}
    public void setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener p0) {}

    public static interface LocaleSelectedListener {
        public void onLocaleSelected(com.android.internal.app.LocaleStore.LocaleInfo p0);
        default public void onParentLocaleSelected(com.android.internal.app.LocaleStore.LocaleInfo p0) {}
    }
}
