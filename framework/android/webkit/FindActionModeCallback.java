package android.webkit;

@android.annotation.SystemApi
public class FindActionModeCallback implements android.view.ActionMode.Callback, android.text.TextWatcher, android.view.View.OnClickListener, android.webkit.WebView.FindListener {
    private android.view.ActionMode mActionMode;
    private int mActiveMatchIndex;
    private android.view.View mCustomView;
    private android.widget.EditText mEditText;
    private android.graphics.Point mGlobalVisibleOffset;
    private android.graphics.Rect mGlobalVisibleRect;
    private android.view.inputmethod.InputMethodManager mInput;
    private android.widget.TextView mMatches;
    private boolean mMatchesFound;
    private int mNumberOfMatches;
    private android.content.res.Resources mResources;
    private android.webkit.WebView mWebView;
    public FindActionModeCallback(android.content.Context p0) {}
    private void findNext(boolean p0) {}
    private void updateMatchesString() {}
    public void afterTextChanged(android.text.Editable p0) {}
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void findAll() {}
    public void finish() {}
    public int getActionModeGlobalBottom() { return 0; }
    public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
    public void onClick(android.view.View p0) {}
    public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    public void onDestroyActionMode(android.view.ActionMode p0) {}
    public void onFindResultReceived(int p0, int p1, boolean p2) {}
    public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public void setText(java.lang.String p0) {}
    public void setWebView(android.webkit.WebView p0) {}
    public void showSoftInput() {}
    public void updateMatchCount(int p0, int p1, boolean p2) {}

    public static class NoAction implements android.view.ActionMode.Callback {
        public NoAction() {}
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
    }
}
