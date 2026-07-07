package android.widget;

public class SearchView extends android.widget.LinearLayout implements android.view.CollapsibleActionView {
    private static final boolean DBG = false;
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    private static final java.lang.String LOG_TAG = "SearchView";
    private android.os.Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final android.widget.ImageView mCloseButton = null;
    private final android.widget.ImageView mCollapsedIcon = null;
    private int mCollapsedImeOptions;
    private final java.lang.CharSequence mDefaultQueryHint = null;
    private final android.view.View mDropDownAnchor = null;
    private boolean mExpandedInActionView;
    private final android.widget.ImageView mGoButton = null;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private java.lang.CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener = null;
    private android.widget.SearchView.OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener = null;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener = null;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener = null;
    private android.widget.SearchView.OnQueryTextListener mOnQueryChangeListener;
    private android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private android.widget.SearchView.OnSuggestionListener mOnSuggestionListener;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache = null;
    private java.lang.CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private java.lang.Runnable mReleaseCursorRunnable;
    private final android.widget.ImageView mSearchButton = null;
    private final android.view.View mSearchEditFrame = null;
    private final android.graphics.drawable.Drawable mSearchHintIcon = null;
    private final android.view.View mSearchPlate = null;
    private final android.widget.SearchView.SearchAutoComplete mSearchSrcTextView = null;
    private android.graphics.Rect mSearchSrcTextViewBounds;
    private android.graphics.Rect mSearchSrtTextViewBoundsExpanded;
    private android.app.SearchableInfo mSearchable;
    private final android.view.View mSubmitArea = null;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId = 0;
    private final int mSuggestionRowLayout = 0;
    private android.widget.CursorAdapter mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    android.view.View.OnKeyListener mTextKeyListener;
    private android.text.TextWatcher mTextWatcher;
    private android.widget.SearchView.UpdatableTouchDelegate mTouchDelegate;
    private java.lang.Runnable mUpdateDrawableStateRunnable;
    private java.lang.CharSequence mUserQuery;
    private final android.content.Intent mVoiceAppSearchIntent = null;
    private final android.widget.ImageView mVoiceButton = null;
    private boolean mVoiceButtonEnabled;
    private final android.content.Intent mVoiceWebSearchIntent = null;
    public SearchView(android.content.Context p0) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SearchView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void adjustDropDownSizeAndPosition() {}
    private android.content.Intent createIntent(java.lang.String p0, android.net.Uri p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5) { return null; }
    private android.content.Intent createIntentFromSuggestion(android.database.Cursor p0, int p1, java.lang.String p2) { return null; }
    private android.content.Intent createVoiceAppSearchIntent(android.content.Intent p0, android.app.SearchableInfo p1) { return null; }
    private android.content.Intent createVoiceWebSearchIntent(android.content.Intent p0, android.app.SearchableInfo p1) { return null; }
    private void dismissSuggestions() {}
    private void forceSuggestionQuery() {}
    private static java.lang.String getActionKeyMessage(android.database.Cursor p0, android.app.SearchableInfo.ActionKeyInfo p1) { return null; }
    private void getChildBoundsWithinSearchView(android.view.View p0, android.graphics.Rect p1) {}
    private java.lang.CharSequence getDecoratedHint(java.lang.CharSequence p0) { return null; }
    private int getPreferredHeight() { return 0; }
    private int getPreferredWidth() { return 0; }
    private boolean hasVoiceSearch() { return false; }
    static boolean isLandscapeMode(android.content.Context p0) { return false; }
    private boolean isSubmitAreaEnabled() { return false; }
    private void launchIntent(android.content.Intent p0) {}
    private void launchQuerySearch(int p0, java.lang.String p1, java.lang.String p2) {}
    private boolean launchSuggestion(int p0, int p1, java.lang.String p2) { return false; }
    private void onCloseClicked() {}
    private boolean onItemClicked(int p0, int p1, java.lang.String p2) { return false; }
    private boolean onItemSelected(int p0) { return false; }
    private void onSearchClicked() {}
    private void onSubmitQuery() {}
    private boolean onSuggestionsKey(android.view.View p0, int p1, android.view.KeyEvent p2) { return false; }
    private void onTextChanged(java.lang.CharSequence p0) {}
    private void onVoiceClicked() {}
    private void postUpdateFocusedState() {}
    private void rewriteQueryFromSuggestion(int p0) {}
    private void setQuery(java.lang.CharSequence p0) {}
    private void updateCloseButton() {}
    private void updateFocusedState() {}
    private void updateQueryHint() {}
    private void updateSearchAutoComplete() {}
    private void updateSubmitArea() {}
    private void updateSubmitButton(boolean p0) {}
    private void updateViewsVisibility(boolean p0) {}
    private void updateVoiceButton(boolean p0) {}
    public void clearFocus() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public int getImeOptions() { return 0; }
    public int getInputType() { return 0; }
    public int getMaxWidth() { return 0; }
    public java.lang.CharSequence getQuery() { return null; }
    public java.lang.CharSequence getQueryHint() { return null; }
    int getSuggestionCommitIconResId() { return 0; }
    int getSuggestionRowLayout() { return 0; }
    public android.widget.CursorAdapter getSuggestionsAdapter() { return null; }
    @java.lang.Deprecated
    public boolean isIconfiedByDefault() { return false; }
    public boolean isIconified() { return false; }
    public boolean isIconifiedByDefault() { return false; }
    public boolean isQueryRefinementEnabled() { return false; }
    public boolean isSubmitButtonEnabled() { return false; }
    public void onActionViewCollapsed() {}
    public void onActionViewExpanded() {}
    protected void onDetachedFromWindow() {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onMeasure(int p0, int p1) {}
    void onQueryRefine(java.lang.CharSequence p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    void onTextFocusChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    public void setAppSearchData(android.os.Bundle p0) {}
    public void setIconified(boolean p0) {}
    public void setIconifiedByDefault(boolean p0) {}
    public void setImeOptions(int p0) {}
    public void setInputType(int p0) {}
    public void setMaxWidth(int p0) {}
    public void setOnCloseListener(android.widget.SearchView.OnCloseListener p0) {}
    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener p0) {}
    public void setOnQueryTextListener(android.widget.SearchView.OnQueryTextListener p0) {}
    public void setOnSearchClickListener(android.view.View.OnClickListener p0) {}
    public void setOnSuggestionListener(android.widget.SearchView.OnSuggestionListener p0) {}
    public void setQuery(java.lang.CharSequence p0, boolean p1) {}
    public void setQueryHint(java.lang.CharSequence p0) {}
    public void setQueryRefinementEnabled(boolean p0) {}
    public void setSearchableInfo(android.app.SearchableInfo p0) {}
    public void setSubmitButtonEnabled(boolean p0) {}
    public void setSuggestionsAdapter(android.widget.CursorAdapter p0) {}

    public static interface OnCloseListener {
        public boolean onClose();
    }

    public static interface OnQueryTextListener {
        public boolean onQueryTextChange(java.lang.String p0);
        public boolean onQueryTextSubmit(java.lang.String p0);
    }

    public static interface OnSuggestionListener {
        public boolean onSuggestionClick(int p0);
        public boolean onSuggestionSelect(int p0);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<android.widget.SearchView.SavedState> CREATOR = null;
        boolean isIconified;
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class SearchAutoComplete extends android.widget.AutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final java.lang.Runnable mRunShowSoftInputIfNecessary = null;
        private android.widget.SearchView mSearchView;
        private int mThreshold;
        public SearchAutoComplete(android.content.Context p0) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
        public SearchAutoComplete(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
        private int getSearchViewTextMinWidthDp() { return 0; }
        private boolean isEmpty() { return false; }
        private void setImeVisibility(boolean p0) {}
        private void showSoftInputIfNecessary() {}
        public boolean checkInputConnectionProxy(android.view.View p0) { return false; }
        public boolean enoughToFilter() { return false; }
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
        protected void onFinishInflate() {}
        protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
        public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
        public void onWindowFocusChanged(boolean p0) {}
        public void performCompletion() {}
        protected void replaceText(java.lang.CharSequence p0) {}
        void setSearchView(android.widget.SearchView p0) {}
        public void setThreshold(int p0) {}
    }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.graphics.Rect mActualBounds = null;
        private boolean mDelegateTargeted;
        private final android.view.View mDelegateView = null;
        private final int mSlop = 0;
        private final android.graphics.Rect mSlopBounds = null;
        private final android.graphics.Rect mTargetBounds = null;
        public UpdatableTouchDelegate(android.graphics.Rect p0, android.graphics.Rect p1, android.view.View p2) { super(null, null); }
        public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
        public void setBounds(android.graphics.Rect p0, android.graphics.Rect p1) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.SearchView> {
        private int mIconifiedByDefaultId;
        private int mIconifiedId;
        private int mMaxWidthId;
        private boolean mPropertiesMapped;
        private int mQueryHintId;
        private int mQueryId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.SearchView p0, android.view.inspector.PropertyReader p1) {}
    }
}
