package android.app;

public class Dialog implements android.content.DialogInterface, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener, android.view.Window.OnWindowDismissedCallback {
    private static final int CANCEL = 68;
    private static final java.lang.String DIALOG_HIERARCHY_TAG = "android:dialogHierarchy";
    private static final java.lang.String DIALOG_SHOWING_TAG = "android:dialogShowing";
    private static final int DISMISS = 67;
    private static final int SHOW = 69;
    private static final java.lang.String TAG = "Dialog";
    private android.app.ActionBar mActionBar;
    private android.view.ActionMode mActionMode;
    private int mActionModeTypeStarting;
    private java.lang.String mCancelAndDismissTaken;
    private android.os.Message mCancelMessage;
    protected boolean mCancelable;
    private boolean mCanceled;
    final android.content.Context mContext = null;
    private boolean mCreated;
    android.view.View mDecor;
    private android.window.OnBackInvokedCallback mDefaultBackCallback;
    private final java.lang.Runnable mDismissAction = null;
    private android.os.Message mDismissMessage;
    private java.lang.Runnable mDismissOverride;
    private final android.os.Handler mHandler = null;
    private final android.os.Handler mListenersHandler = null;
    private android.content.DialogInterface.OnKeyListener mOnKeyListener;
    private android.app.Activity mOwnerActivity;
    private android.view.SearchEvent mSearchEvent;
    private android.os.Message mShowMessage;
    private boolean mShowing;
    final android.view.Window mWindow = null;
    private final android.view.WindowManager mWindowManager = null;
    public Dialog(android.content.Context p0) {}
    public Dialog(android.content.Context p0, int p1) {}
    Dialog(android.content.Context p0, int p1, boolean p2) {}
    protected Dialog(android.content.Context p0, boolean p1, android.content.DialogInterface.OnCancelListener p2) {}
    @java.lang.Deprecated
    protected Dialog(android.content.Context p0, boolean p1, android.os.Message p2) {}
    private android.content.ComponentName getAssociatedActivity() { return null; }
    private void sendDismissMessage() {}
    private void sendShowMessage() {}
    public void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected boolean allowsRegisterDefaultOnBackInvokedCallback() { return false; }
    public void cancel() {}
    public void closeOptionsMenu() {}
    public void create() {}
    public void dismiss() {}
    void dismissDialog() {}
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    void dispatchOnCreate(android.os.Bundle p0) {}
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public android.app.ActionBar getActionBar() { return null; }
    public final android.content.Context getContext() { return null; }
    public android.view.View getCurrentFocus() { return null; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    public final android.app.Activity getOwnerActivity() { return null; }
    public final android.view.SearchEvent getSearchEvent() { return null; }
    public final int getVolumeControlStream() { return 0; }
    public android.view.Window getWindow() { return null; }
    public void hide() {}
    public void invalidateOptionsMenu() {}
    public boolean isShowing() { return false; }
    public void onActionModeFinished(android.view.ActionMode p0) {}
    public void onActionModeStarted(android.view.ActionMode p0) {}
    public void onAttachedToWindow() {}
    @java.lang.Deprecated
    public void onBackPressed() {}
    public void onContentChanged() {}
    public boolean onContextItemSelected(android.view.MenuItem p0) { return false; }
    public void onContextMenuClosed(android.view.Menu p0) {}
    protected void onCreate(android.os.Bundle p0) {}
    public void onCreateContextMenu(android.view.ContextMenu p0, android.view.View p1, android.view.ContextMenu.ContextMenuInfo p2) {}
    public boolean onCreateOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onCreatePanelMenu(int p0, android.view.Menu p1) { return false; }
    public android.view.View onCreatePanelView(int p0) { return null; }
    public void onDetachedFromWindow() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onMenuItemSelected(int p0, android.view.MenuItem p1) { return false; }
    public boolean onMenuOpened(int p0, android.view.Menu p1) { return false; }
    public boolean onOptionsItemSelected(android.view.MenuItem p0) { return false; }
    public void onOptionsMenuClosed(android.view.Menu p0) {}
    public void onPanelClosed(int p0, android.view.Menu p1) {}
    public boolean onPrepareOptionsMenu(android.view.Menu p0) { return false; }
    public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2) { return false; }
    public void onRestoreInstanceState(android.os.Bundle p0) {}
    public android.os.Bundle onSaveInstanceState() { return null; }
    public boolean onSearchRequested() { return false; }
    public boolean onSearchRequested(android.view.SearchEvent p0) { return false; }
    protected void onStart() {}
    protected void onStop() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void onWindowDismissed(boolean p0, boolean p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    public void openContextMenu(android.view.View p0) {}
    public void openOptionsMenu() {}
    public void registerForContextMenu(android.view.View p0) {}
    public final boolean requestWindowFeature(int p0) { return false; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public void setCancelMessage(android.os.Message p0) {}
    public void setCancelable(boolean p0) {}
    public void setCanceledOnTouchOutside(boolean p0) {}
    public void setContentView(int p0) {}
    public void setContentView(android.view.View p0) {}
    public void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void setDismissMessage(android.os.Message p0) {}
    public void setDismissOverride(java.lang.Runnable p0) {}
    public final void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1) {}
    public final void setFeatureDrawableAlpha(int p0, int p1) {}
    public final void setFeatureDrawableResource(int p0, int p1) {}
    public final void setFeatureDrawableUri(int p0, android.net.Uri p1) {}
    public void setOnCancelListener(android.content.DialogInterface.OnCancelListener p0) {}
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener p0) {}
    public void setOnKeyListener(android.content.DialogInterface.OnKeyListener p0) {}
    public void setOnShowListener(android.content.DialogInterface.OnShowListener p0) {}
    public final void setOwnerActivity(android.app.Activity p0) {}
    public void setTitle(int p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public final void setVolumeControlStream(int p0) {}
    public void show() {}
    public boolean takeCancelAndDismissListeners(java.lang.String p0, android.content.DialogInterface.OnCancelListener p1, android.content.DialogInterface.OnDismissListener p2) { return false; }
    public void takeKeyEvents(boolean p0) {}
    public void unregisterForContextMenu(android.view.View p0) {}

    private static final class ListenersHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<android.content.DialogInterface> mDialog = null;
        public ListenersHandler(android.app.Dialog p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}
