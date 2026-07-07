package android.preference;

@java.lang.Deprecated
public abstract class PreferenceActivity extends android.app.ListActivity implements android.preference.PreferenceManager.OnPreferenceTreeClickListener, android.preference.PreferenceFragment.OnPreferenceStartFragmentCallback {
    private static final java.lang.String BACK_STACK_PREFS = ":android:prefs";
    private static final java.lang.String CUR_HEADER_TAG = ":android:cur_header";
    public static final java.lang.String EXTRA_NO_HEADERS = ":android:no_headers";
    private static final java.lang.String EXTRA_PREFS_SET_BACK_TEXT = "extra_prefs_set_back_text";
    private static final java.lang.String EXTRA_PREFS_SET_NEXT_TEXT = "extra_prefs_set_next_text";
    private static final java.lang.String EXTRA_PREFS_SHOW_BUTTON_BAR = "extra_prefs_show_button_bar";
    private static final java.lang.String EXTRA_PREFS_SHOW_SKIP = "extra_prefs_show_skip";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";
    public static final java.lang.String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";
    private static final int FIRST_REQUEST_CODE = 100;
    private static final java.lang.String HEADERS_TAG = ":android:headers";
    public static final long HEADER_ID_UNDEFINED = -1L;
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final int MSG_BUILD_HEADERS = 2;
    private static final java.lang.String PREFERENCES_TAG = ":android:preferences";
    private static final java.lang.String TAG = "PreferenceActivity";
    private java.lang.CharSequence mActivityTitle;
    private android.preference.PreferenceActivity.Header mCurHeader;
    private android.app.FragmentBreadCrumbs mFragmentBreadCrumbs;
    private android.os.Handler mHandler;
    private final java.util.ArrayList<android.preference.PreferenceActivity.Header> mHeaders = null;
    private android.view.ViewGroup mHeadersContainer;
    private boolean mIsBackCallbackRegistered;
    private android.widget.FrameLayout mListFooter;
    private android.widget.Button mNextButton;
    private final android.window.OnBackInvokedCallback mOnBackInvokedCallback = null;
    private final android.app.FragmentManager.OnBackStackChangedListener mOnBackStackChangedListener = null;
    private int mPreferenceHeaderItemResId;
    private boolean mPreferenceHeaderRemoveEmptyIcon;
    private android.preference.PreferenceManager mPreferenceManager;
    private android.view.ViewGroup mPrefsContainer;
    private android.os.Bundle mSavedInstanceState;
    private boolean mSinglePane;
    public PreferenceActivity() { super(); }
    private void bindPreferences() {}
    private void onBackInvoked() {}
    private void postBindPreferences() {}
    private void requirePreferenceManager() {}
    private void switchToHeaderInner(java.lang.String p0, android.os.Bundle p1) {}
    private void updateBackCallbackRegistrationState() {}
    @java.lang.Deprecated
    public void addPreferencesFromIntent(android.content.Intent p0) {}
    @java.lang.Deprecated
    public void addPreferencesFromResource(int p0) {}
    android.preference.PreferenceActivity.Header findBestMatchingHeader(android.preference.PreferenceActivity.Header p0, java.util.ArrayList<android.preference.PreferenceActivity.Header> p1) { return null; }
    @java.lang.Deprecated
    public android.preference.Preference findPreference(java.lang.CharSequence p0) { return null; }
    public void finishPreferencePanel(android.app.Fragment p0, int p1, android.content.Intent p2) {}
    public java.util.List<android.preference.PreferenceActivity.Header> getHeaders() { return null; }
    protected android.widget.Button getNextButton() { return null; }
    @java.lang.Deprecated
    public android.preference.PreferenceManager getPreferenceManager() { return null; }
    @java.lang.Deprecated
    public android.preference.PreferenceScreen getPreferenceScreen() { return null; }
    public boolean hasHeaders() { return false; }
    protected boolean hasNextButton() { return false; }
    public void invalidateHeaders() {}
    public boolean isMultiPane() { return false; }
    protected boolean isValidFragment(java.lang.String p0) { return false; }
    public void loadHeadersFromResource(int p0, java.util.List<android.preference.PreferenceActivity.Header> p1) {}
    protected void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public void onBackPressed() {}
    public void onBuildHeaders(java.util.List<android.preference.PreferenceActivity.Header> p0) {}
    public android.content.Intent onBuildStartFragmentIntent(java.lang.String p0, android.os.Bundle p1, int p2, int p3) { return null; }
    public void onContentChanged() {}
    protected void onCreate(android.os.Bundle p0) {}
    protected void onDestroy() {}
    public android.preference.PreferenceActivity.Header onGetInitialHeader() { return null; }
    public android.preference.PreferenceActivity.Header onGetNewHeader() { return null; }
    public void onHeaderClick(android.preference.PreferenceActivity.Header p0, int p1) {}
    public boolean onIsHidingHeaders() { return false; }
    public boolean onIsMultiPane() { return false; }
    protected void onListItemClick(android.widget.ListView p0, android.view.View p1, int p2, long p3) {}
    protected void onNewIntent(android.content.Intent p0) {}
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public boolean onPreferenceStartFragment(android.preference.PreferenceFragment p0, android.preference.Preference p1) { return false; }
    @java.lang.Deprecated
    public boolean onPreferenceTreeClick(android.preference.PreferenceScreen p0, android.preference.Preference p1) { return false; }
    protected void onRestoreInstanceState(android.os.Bundle p0) {}
    protected void onSaveInstanceState(android.os.Bundle p0) {}
    protected void onStop() {}
    public void setListFooter(android.view.View p0) {}
    public void setParentTitle(java.lang.CharSequence p0, java.lang.CharSequence p1, android.view.View.OnClickListener p2) {}
    @java.lang.Deprecated
    public void setPreferenceScreen(android.preference.PreferenceScreen p0) {}
    void setSelectedHeader(android.preference.PreferenceActivity.Header p0) {}
    void showBreadCrumbs(android.preference.PreferenceActivity.Header p0) {}
    public void showBreadCrumbs(java.lang.CharSequence p0, java.lang.CharSequence p1) {}
    public void startPreferenceFragment(android.app.Fragment p0, boolean p1) {}
    public void startPreferencePanel(java.lang.String p0, android.os.Bundle p1, int p2, java.lang.CharSequence p3, android.app.Fragment p4, int p5) {}
    public void startWithFragment(java.lang.String p0, android.os.Bundle p1, android.app.Fragment p2, int p3) {}
    public void startWithFragment(java.lang.String p0, android.os.Bundle p1, android.app.Fragment p2, int p3, int p4, int p5) {}
    public void switchToHeader(android.preference.PreferenceActivity.Header p0) {}
    public void switchToHeader(java.lang.String p0, android.os.Bundle p1) {}

    @java.lang.Deprecated
    public static final class Header implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.preference.PreferenceActivity.Header> CREATOR = null;
        public java.lang.CharSequence breadCrumbShortTitle;
        public int breadCrumbShortTitleRes;
        public java.lang.CharSequence breadCrumbTitle;
        public int breadCrumbTitleRes;
        public android.os.Bundle extras;
        public java.lang.String fragment;
        public android.os.Bundle fragmentArguments;
        public int iconRes;
        public long id;
        public android.content.Intent intent;
        public java.lang.CharSequence summary;
        public int summaryRes;
        public java.lang.CharSequence title;
        public int titleRes;
        public Header() {}
        Header(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public java.lang.CharSequence getBreadCrumbShortTitle(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getBreadCrumbTitle(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getSummary(android.content.res.Resources p0) { return null; }
        public java.lang.CharSequence getTitle(android.content.res.Resources p0) { return null; }
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    private static class HeaderAdapter extends android.widget.ArrayAdapter<android.preference.PreferenceActivity.Header> {
        private android.view.LayoutInflater mInflater;
        private int mLayoutResId;
        private boolean mRemoveIconIfEmpty;
        public HeaderAdapter(android.content.Context p0, java.util.List<android.preference.PreferenceActivity.Header> p1, int p2, boolean p3) { super((android.content.Context)null, 0); }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }

        private static class HeaderViewHolder {
            android.widget.ImageView icon;
            android.widget.TextView summary;
            android.widget.TextView title;
            private HeaderViewHolder() {}
        }
    }
}
