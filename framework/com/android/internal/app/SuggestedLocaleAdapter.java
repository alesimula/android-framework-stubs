package com.android.internal.app;

public class SuggestedLocaleAdapter extends android.widget.BaseAdapter implements android.widget.Filterable {
    protected static final int APP_LANGUAGE_PICKER_TYPE_COUNT = 5;
    protected static final int MIN_REGIONS_FOR_SUGGESTIONS = 6;
    protected static final int SYSTEM_LANGUAGE_TYPE_COUNT = 3;
    protected static final int SYSTEM_LANGUAGE_WITHOUT_HEADER_TYPE_COUNT = 1;
    protected static final int TYPE_CURRENT_LOCALE = 4;
    protected static final int TYPE_HEADER_ALL_OTHERS = 1;
    protected static final int TYPE_HEADER_SUGGESTED = 0;
    protected static final int TYPE_LOCALE = 2;
    protected static final int TYPE_SYSTEM_LANGUAGE_FOR_APP_LANGUAGE_PICKER = 3;
    protected android.content.Context mContextOverride;
    protected final boolean mCountryMode = false;
    protected java.util.Locale mDisplayLocale;
    private boolean mHasSpecificAppPackageName;
    protected android.view.LayoutInflater mInflater;
    protected boolean mIsNumberingMode;
    protected java.util.ArrayList<com.android.internal.app.LocaleStore.LocaleInfo> mLocaleOptions;
    protected java.util.ArrayList<com.android.internal.app.LocaleStore.LocaleInfo> mOriginalLocaleOptions;
    protected int mSuggestionCount;
    public SuggestedLocaleAdapter(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, boolean p1) { super(); }
    public SuggestedLocaleAdapter(java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> p0, boolean p1, boolean p2) { super(); }
    private android.view.View getNewViewIfNeeded(android.view.View p0, android.view.ViewGroup p1, int p2, int p3) { return null; }
    private boolean isHeaderPosition(int p0) { return false; }
    private void updateTextView(android.view.View p0, android.widget.TextView p1, int p2) {}
    public boolean areAllItemsEnabled() { return false; }
    public int getCount() { return 0; }
    public android.widget.Filter getFilter() { return null; }
    public boolean getIsForNumberingSystem() { return false; }
    public java.lang.Object getItem(int p0) { return null; }
    public long getItemId(int p0) { return 0L; }
    public int getItemViewType(int p0) { return 0; }
    public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    public int getViewTypeCount() { return 0; }
    public boolean isEnabled(int p0) { return false; }
    public void setDisplayLocale(android.content.Context p0, java.util.Locale p1) {}
    public void setNumberingSystemMode(boolean p0) {}
    protected void setTextTo(android.widget.TextView p0, int p1) {}
    protected boolean showHeaders() { return false; }
    public void sort(com.android.internal.app.LocaleHelper.LocaleInfoComparator p0) {}

    class FilterByNativeAndUiNames extends android.widget.Filter {
        FilterByNativeAndUiNames(com.android.internal.app.SuggestedLocaleAdapter p0) { super(); }
        protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence p0) { return null; }
        protected void publishResults(java.lang.CharSequence p0, android.widget.Filter.FilterResults p1) {}
        boolean wordMatches(java.lang.String p0, java.lang.String p1) { return false; }
    }
}
