package android.widget;

public class AutoCompleteTextView extends android.widget.EditText implements android.widget.Filter.FilterListener {
    static final boolean DEBUG = false;
    static final int EXPAND_MAX = 3;
    static final java.lang.String TAG = "AutoCompleteTextView";
    private android.widget.ListAdapter mAdapter;
    private android.widget.AutoCompleteTextView.MyWatcher mAutoCompleteTextWatcher;
    private final android.window.OnBackInvokedCallback mBackCallback = null;
    private boolean mBackCallbackRegistered;
    private boolean mBlockCompletion;
    private int mDropDownAnchorId;
    private boolean mDropDownDismissedOnCompletion;
    private android.widget.Filter mFilter;
    private int mHintResource;
    private java.lang.CharSequence mHintText;
    private android.widget.TextView mHintView;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    private int mLastKeyCode;
    private android.widget.AutoCompleteTextView.PopupDataSetObserver mObserver;
    private final android.widget.AutoCompleteTextView.PassThroughClickListener mPassThroughClickListener = null;
    private final android.widget.ListPopupWindow mPopup = null;
    private boolean mPopupCanBeUpdated;
    private final android.content.Context mPopupContext = null;
    private int mThreshold;
    private android.widget.AutoCompleteTextView.Validator mValidator;
    public AutoCompleteTextView(android.content.Context p0) { super((android.content.Context)null); }
    public AutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public AutoCompleteTextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, android.content.res.Resources.Theme p4) { super((android.content.Context)null); }
    private void buildImeCompletions() {}
    private void onClickImpl() {}
    private void performCompletion(android.view.View p0, int p1, long p2) {}
    private void registerOnBackInvokedCallback() {}
    private void unregisterOnBackInvokedCallback() {}
    private void updateDropDownForFilter(int p0) {}
    public void clearListSelection() {}
    protected java.lang.CharSequence convertSelectionToString(java.lang.Object p0) { return null; }
    public void dismissDropDown() {}
    void doAfterTextChanged() {}
    void doBeforeTextChanged() {}
    public boolean enoughToFilter() { return false; }
    public void ensureImeVisible(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.widget.ListAdapter getAdapter() { return null; }
    public java.lang.CharSequence getCompletionHint() { return null; }
    public int getDropDownAnchor() { return 0; }
    public int getDropDownAnimationStyle() { return 0; }
    public android.graphics.drawable.Drawable getDropDownBackground() { return null; }
    public int getDropDownHeight() { return 0; }
    public int getDropDownHorizontalOffset() { return 0; }
    public int getDropDownVerticalOffset() { return 0; }
    public int getDropDownWidth() { return 0; }
    protected android.widget.Filter getFilter() { return null; }
    public int getInputMethodMode() { return 0; }
    @java.lang.Deprecated
    public android.widget.AdapterView.OnItemClickListener getItemClickListener() { return null; }
    @java.lang.Deprecated
    public android.widget.AdapterView.OnItemSelectedListener getItemSelectedListener() { return null; }
    public int getListSelection() { return 0; }
    public android.widget.AdapterView.OnItemClickListener getOnItemClickListener() { return null; }
    public android.widget.AdapterView.OnItemSelectedListener getOnItemSelectedListener() { return null; }
    public int getThreshold() { return 0; }
    public android.widget.AutoCompleteTextView.Validator getValidator() { return null; }
    public boolean isDropDownAlwaysVisible() { return false; }
    public boolean isDropDownDismissedOnCompletion() { return false; }
    public boolean isInputMethodNotNeeded() { return false; }
    public boolean isPerformingCompletion() { return false; }
    public boolean isPopupShowing() { return false; }
    protected void onAttachedToWindow() {}
    public void onCommitCompletion(android.view.inputmethod.CompletionInfo p0) {}
    protected void onDetachedFromWindow() {}
    protected void onDisplayHint(int p0) {}
    public void onFilterComplete(int p0) {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onWindowFocusChanged(boolean p0) {}
    public void performCompletion() {}
    protected void performFiltering(java.lang.CharSequence p0, int p1) {}
    public void performValidation() {}
    public final void refreshAutoCompleteResults() {}
    protected void replaceText(java.lang.CharSequence p0) {}
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T p0) {}
    public void setCompletionHint(java.lang.CharSequence p0) {}
    public void setDropDownAlwaysVisible(boolean p0) {}
    public void setDropDownAnchor(int p0) {}
    public void setDropDownAnimationStyle(int p0) {}
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setDropDownBackgroundResource(int p0) {}
    public void setDropDownDismissedOnCompletion(boolean p0) {}
    public void setDropDownHeight(int p0) {}
    public void setDropDownHorizontalOffset(int p0) {}
    public void setDropDownVerticalOffset(int p0) {}
    public void setDropDownWidth(int p0) {}
    public void setForceIgnoreOutsideTouch(boolean p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setInputMethodMode(int p0) {}
    public void setListSelection(int p0) {}
    public void setOnClickListener(android.view.View.OnClickListener p0) {}
    public void setOnDismissListener(android.widget.AutoCompleteTextView.OnDismissListener p0) {}
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener p0) {}
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener p0) {}
    public void setText(java.lang.CharSequence p0, boolean p1) {}
    public void setThreshold(int p0) {}
    public void setValidator(android.widget.AutoCompleteTextView.Validator p0) {}
    public void showDropDown() {}
    public void showDropDownAfterLayout() {}

    private class DropDownItemClickListener implements android.widget.AdapterView.OnItemClickListener {
        private DropDownItemClickListener(android.widget.AutoCompleteTextView p0) {}
        public void onItemClick(android.widget.AdapterView p0, android.view.View p1, int p2, long p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InputMethodMode {
    }

    private class MyWatcher implements android.text.TextWatcher {
        private boolean mOpenBefore;
        private MyWatcher(android.widget.AutoCompleteTextView p0) {}
        public void afterTextChanged(android.text.Editable p0) {}
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    }

    public static interface OnDismissListener {
        public void onDismiss();
    }

    private class PassThroughClickListener implements android.view.View.OnClickListener {
        private android.view.View.OnClickListener mWrapped;
        private PassThroughClickListener(android.widget.AutoCompleteTextView p0) {}
        public void onClick(android.view.View p0) {}
    }

    private static class PopupDataSetObserver extends android.database.DataSetObserver {
        private final java.lang.ref.WeakReference<android.widget.AutoCompleteTextView> mViewReference = null;
        private final java.lang.Runnable updateRunnable = null;
        private PopupDataSetObserver(android.widget.AutoCompleteTextView p0) { super(); }
        public void onChanged() {}
    }

    public static interface Validator {
        public java.lang.CharSequence fixText(java.lang.CharSequence p0);
        public boolean isValid(java.lang.CharSequence p0);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.AutoCompleteTextView> {
        private int mCompletionHintId;
        private int mCompletionThresholdId;
        private int mDropDownHeightId;
        private int mDropDownHorizontalOffsetId;
        private int mDropDownVerticalOffsetId;
        private int mDropDownWidthId;
        private int mPopupBackgroundId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.AutoCompleteTextView p0, android.view.inspector.PropertyReader p1) {}
    }
}
