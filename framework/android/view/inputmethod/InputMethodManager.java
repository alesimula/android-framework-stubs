package android.view.inputmethod;

public final class InputMethodManager {
    private static final long ALWAYS_RETURN_TRUE_HIDE_SOFT_INPUT_FROM_WINDOW = 395521150L;
    private static final java.lang.String CACHE_KEY_CONNECTIONLESS_STYLUS_HANDWRITING_PROPERTY = "cache_key.system_server.connectionless_stylus_handwriting";
    private static final java.lang.String CACHE_KEY_STYLUS_HANDWRITING_PROPERTY = "cache_key.system_server.stylus_handwriting";
    private static final boolean DEBUG = false;
    public static final int DISPATCH_HANDLED = 1;
    public static final int DISPATCH_IN_PROGRESS = -1;
    public static final int DISPATCH_NOT_HANDLED = 0;
    public static final int HANDWRITING_DELEGATE_FLAG_HOME_DELEGATOR_ALLOWED = 1;
    @java.lang.Deprecated
    public static final int HIDE_IMPLICIT_ONLY = 1;
    @java.lang.Deprecated
    public static final int HIDE_NOT_ALWAYS = 2;
    public static final int IM_PICKER_ENTRY_POINT_DEFAULT = 0;
    public static final int IM_PICKER_ENTRY_POINT_QUICK_SETTINGS = 2;
    public static final int IM_PICKER_ENTRY_POINT_STATUS_BAR_CHIP = 1;
    private static final long INPUT_METHOD_NOT_RESPONDING_TIMEOUT = 2500L;
    static final int INVALID_SEQ_ID = -1;
    private static final int MSG_BIND = 2;
    private static final int MSG_BIND_ACCESSIBILITY_SERVICE = 11;
    private static final int MSG_DUMP = 1;
    private static final int MSG_FLUSH_INPUT_EVENT = 7;
    private static final int MSG_REPORT_FULLSCREEN_MODE = 10;
    private static final int MSG_SEND_INPUT_EVENT = 5;
    private static final int MSG_SET_ACTIVE = 4;
    private static final int MSG_SET_INTERACTIVE = 13;
    private static final int MSG_SET_VISIBILITY = 14;
    private static final int MSG_START_INPUT_RESULT = 40;
    private static final int MSG_TIMEOUT_INPUT_EVENT = 6;
    private static final int MSG_UNBIND = 3;
    private static final int MSG_UNBIND_ACCESSIBILITY_SERVICE = 12;
    private static final int NOT_A_SUBTYPE_ID = -1;
    private static final boolean OPTIMIZE_NONEDITABLE_VIEWS = Boolean.valueOf(false);
    private static final java.lang.String PENDING_EVENT_COUNTER = "aq:imm";
    private static final int REQUEST_UPDATE_CURSOR_ANCHOR_INFO_NONE = 0;
    public static final int RESULT_HIDDEN = 3;
    public static final int RESULT_SHOWN = 2;
    public static final int RESULT_UNCHANGED_HIDDEN = 1;
    public static final int RESULT_UNCHANGED_SHOWN = 0;
    @java.lang.Deprecated
    public static final int SHOW_FORCED = 2;
    @java.lang.Deprecated
    public static final int SHOW_IMPLICIT = 1;
    public static final int SHOW_IM_PICKER_MODE_AUTO = 0;
    public static final int SHOW_IM_PICKER_MODE_EXCLUDE_AUXILIARY_SUBTYPES = 2;
    public static final int SHOW_IM_PICKER_MODE_INCLUDE_AUXILIARY_SUBTYPES = 1;
    private static final java.lang.String SUBTYPE_MODE_VOICE = "voice";
    private static final java.lang.String TAG = "InputMethodManager";
    @java.lang.Deprecated
    static android.view.inputmethod.InputMethodManager sInstance;
    private static final android.util.SparseArray<android.view.inputmethod.InputMethodManager> sInstanceMap = null;
    private static final java.lang.Object sLock = null;
    private static boolean sPreventImeStartupUnlessTextEditor;
    private final android.util.SparseArray<android.view.inputmethod.IAccessibilityInputMethodSessionInvoker> mAccessibilityInputMethodSession = null;
    private boolean mActive;
    private final com.android.internal.inputmethod.IInputMethodClient.Stub mClient = null;
    private android.view.inputmethod.CompletionInfo[] mCompletions;
    private android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Boolean> mConnectionlessStylusHandwritingAvailableCache;
    private android.view.inputmethod.InputMethodManager.BindState mCurBindState;
    @java.lang.Deprecated
    java.lang.String mCurId;
    @java.lang.Deprecated
    com.android.internal.inputmethod.IInputMethodSession mCurMethod;
    android.view.ViewRootImpl mCurRootView;
    boolean mCurRootViewWindowFocused;
    private android.view.inputmethod.InputMethodManager.ImeInputEventSender mCurSender;
    private android.view.inputmethod.EditorInfo mCurrentEditorInfo;
    private android.view.inputmethod.CursorAnchorInfo mCursorAnchorInfo;
    private int mCursorCandEnd;
    private int mCursorCandStart;
    android.graphics.Rect mCursorRect;
    private int mCursorSelEnd;
    private int mCursorSelStart;
    private final android.view.inputmethod.InputMethodManager.DelegateImpl mDelegate = null;
    private final int mDisplayId = 0;
    private final android.view.inputmethod.RemoteInputConnectionImpl mFallbackInputConnection = null;
    private boolean mFocusRequestedAfterImeSessionReset;
    private boolean mFullscreenMode;
    final android.view.inputmethod.InputMethodManager.H mH = null;
    private final android.window.ImeBackCallbackProxy mImeBackCallbackProxy = null;
    private int mInitialSelEnd;
    private int mInitialSelStart;
    private int mLastPendingStartSeqId;
    private final android.os.Looper mMainLooper = null;
    private android.view.View mNextServedView;
    private final android.util.Pools.Pool<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEventPool = null;
    private final android.util.SparseArray<android.view.inputmethod.InputMethodManager.PendingEvent> mPendingEvents = null;
    private android.view.inputmethod.ViewFocusParameterInfo mPreviousViewFocusParameters;
    private android.view.inputmethod.InputMethodManager.ReportInputConnectionOpenedRunner mReportInputConnectionOpenedRunner;
    @java.lang.Deprecated
    private int mRequestUpdateCursorAnchorInfoMonitorMode;
    private boolean mRestartOnNextWindowFocus;
    private boolean mServedConnecting;
    private android.view.inputmethod.RemoteInputConnectionImpl mServedInputConnection;
    private android.os.Handler mServedInputConnectionHandler;
    private android.view.View mServedView;
    @java.lang.Deprecated
    final com.android.internal.view.IInputMethodManager mService = null;
    private android.app.PropertyInvalidatedCache<java.lang.Integer, java.lang.Boolean> mStylusHandwritingAvailableCache;
    android.graphics.Rect mTmpCursorRect;
    private InputMethodManager(com.android.internal.view.IInputMethodManager p0, int p1, android.os.Looper p2) {}
    private static boolean canStartInput(android.view.View p0) { return false; }
    private boolean checkFocusInternalLocked(boolean p0, android.view.ViewRootImpl p1) { return false; }
    private void clearAccessibilityBindingLocked(int p0) {}
    private void clearAllAccessibilityBindingLocked() {}
    private void clearBindingLocked() {}
    private void clearConnectionLocked() {}
    private boolean clearCurRootViewIfNeeded() { return false; }
    private static android.util.Pair<android.view.inputmethod.InputConnection, android.view.inputmethod.EditorInfo> createInputConnection(android.view.View p0) { return null; }
    private static android.view.inputmethod.InputMethodManager createInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createRealInstance(int p0, android.os.Looper p1) { return null; }
    private static android.view.inputmethod.InputMethodManager createStubInstance(int p0, android.os.Looper p1) { return null; }
    private void doDump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public static void ensureDefaultInstanceForDefaultDisplayIfNecessary() {}
    private void finishedInputEvent(int p0, boolean p1, boolean p2) {}
    private void flushPendingEventsLocked() {}
    private void forAccessibilitySessionsLocked(java.util.function.Consumer<android.view.inputmethod.IAccessibilityInputMethodSessionInvoker> p0) {}
    public static android.view.inputmethod.InputMethodManager forContext(android.content.Context p0) { return null; }
    private static android.view.inputmethod.InputMethodManager forContextInternal(int p0, android.os.Looper p1) { return null; }
    private int getBindSequenceLocked() { return 0; }
    private android.view.inputmethod.InputMethodManager getFallbackInputMethodManagerIfNecessary(android.view.View p0) { return null; }
    private java.lang.String getImeIdLocked() { return null; }
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager getInstance() { return null; }
    private android.view.View getNextServedViewLocked() { return null; }
    private android.view.View getServedViewLocked() { return null; }
    private int getStartInputFlags(android.view.View p0, int p1) { return 0; }
    private boolean hasActiveInputConnectionInternal(android.view.View p0) { return false; }
    private boolean hasServedByInputMethodLocked(android.view.View p0) { return false; }
    private static boolean hasViewImeRequestedVisible(android.view.View p0) { return false; }
    private boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2, int p3, android.view.inputmethod.ImeTracker.Token p4) { return false; }
    public static void invalidateLocalConnectionlessStylusHandwritingAvailabilityCaches() {}
    public static void invalidateLocalStylusHandwritingAvailabilityCaches() {}
    private void invokeFinishedInputEventCallback(android.view.inputmethod.InputMethodManager.PendingEvent p0, boolean p1) {}
    private static boolean isAutofillUIShowing(android.view.View p0) { return false; }
    private boolean isImeSessionAvailableLocked() { return false; }
    private static boolean isInEditMode() { return false; }
    static boolean isInEditModeInternal() { return false; }
    private boolean isSwitchingBetweenEquivalentNonEditableViews(android.view.inputmethod.ViewFocusParameterInfo p0, int p1, int p2, int p3, int p4) { return false; }
    private android.view.inputmethod.InputMethodManager.PendingEvent obtainPendingEventLocked(android.view.InputEvent p0, java.lang.Object p1, java.lang.String p2, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p3, android.os.Handler p4) { return null; }
    private void onImeFocusLost(android.view.ViewRootImpl p0) {}
    private void onViewFocusChangedInternal(android.view.View p0, boolean p1) {}
    @java.lang.Deprecated
    public static android.view.inputmethod.InputMethodManager peekInstance() { return null; }
    private boolean processDump(java.io.FileDescriptor p0, java.lang.String[] p1) { return false; }
    private void recyclePendingEventLocked(android.view.inputmethod.InputMethodManager.PendingEvent p0) {}
    private void reportInputConnectionOpened(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, android.os.Handler p2, android.view.View p3) {}
    private void sendFailureCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Boolean> p1) {}
    private void sendInputEventAndReportResultOnMainLooper(android.view.inputmethod.InputMethodManager.PendingEvent p0) {}
    private int sendInputEventOnMainLooperLocked(android.view.inputmethod.InputMethodManager.PendingEvent p0) { return 0; }
    private static void setImeVisibilityOnInsetsController(android.view.ViewRootImpl p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) {}
    private void showInputMethodPickerLocked() {}
    private boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2, int p3) { return false; }
    private boolean showSoftInput(android.view.View p0, android.view.inputmethod.ImeTracker.Token p1, int p2, android.os.ResultReceiver p3, int p4) { return false; }
    private void startConnectionlessStylusHandwritingInternal(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1, java.lang.String p2, java.lang.String p3, java.util.concurrent.Executor p4, android.view.inputmethod.ConnectionlessHandwritingCallback p5) {}
    private boolean startInputInner(int p0, android.os.IBinder p1, int p2, int p3, int p4) { return false; }
    private boolean startInputOnWindowFocusGainInternal(int p0, android.view.View p1, int p2, int p3, int p4) { return false; }
    private boolean startStylusHandwritingInternal(android.view.View p0, java.lang.String p1, int p2) { return false; }
    private boolean startStylusHandwritingInternal(android.view.View p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) { return false; }
    static void tearDownEditMode() {}
    private void updateInputChannelLocked(android.view.InputChannel p0) {}
    public void acceptStylusHandwritingDelegation(android.view.View p0, java.lang.String p1, int p2, java.util.concurrent.Executor p3, java.util.function.Consumer<java.lang.Boolean> p4) {}
    public void acceptStylusHandwritingDelegation(android.view.View p0, java.lang.String p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) {}
    public boolean acceptStylusHandwritingDelegation(android.view.View p0) { return false; }
    public boolean acceptStylusHandwritingDelegation(android.view.View p0, java.lang.String p1) { return false; }
    public void addVirtualStylusIdForTestSession() {}
    public void checkFocus() {}
    void closeCurrentInput() {}
    public boolean disableInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    public int dispatchInputEvent(android.view.InputEvent p0, java.lang.Object p1, android.view.inputmethod.InputMethodManager.FinishedInputEventCallback p2, android.os.Handler p3) { return 0; }
    public void dispatchKeyEventFromInputMethod(android.view.View p0, android.view.KeyEvent p1) {}
    public void displayCompletions(android.view.View p0, android.view.inputmethod.CompletionInfo[] p1) {}
    public boolean doInvalidateInput(android.view.inputmethod.RemoteInputConnectionImpl p0, android.view.inputmethod.TextSnapshot p1, int p2) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, byte[] p1) {}
    public boolean enableInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    void finishInputLocked() {}
    public void finishTrackingPendingRequests() {}
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfo() { return null; }
    @android.annotation.SystemApi
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(android.os.UserHandle p0) { return null; }
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() { return null; }
    public android.view.inputmethod.InputMethodManager.DelegateImpl getDelegate() { return null; }
    public int getDisplayId() { return 0; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodListAsUser(android.os.UserHandle p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(android.view.inputmethod.InputMethodInfo p0, boolean p1) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeListAsUser(java.lang.String p0, boolean p1, android.os.UserHandle p2) { return null; }
    android.content.Context getFallbackContextFromServedView() { return null; }
    public android.window.ImeBackCallbackProxy getImeBackCallbackProxy() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList() { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0) { return null; }
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodListAsUser(int p0, int p1) { return null; }
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() { return null; }
    public java.util.Map<android.view.inputmethod.InputMethodInfo, java.util.List<android.view.inputmethod.InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { return null; }
    public boolean hasActiveInputConnection(android.view.View p0) { return false; }
    public void hideInputMethodPickerFromSystem(int p0) {}
    @java.lang.Deprecated
    public void hideSoftInputFromInputMethod(android.os.IBinder p0, int p1) {}
    public void hideSoftInputFromServerForTest() {}
    public boolean hideSoftInputFromView(android.view.View p0, int p1) { return false; }
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1) { return false; }
    public boolean hideSoftInputFromWindow(android.os.IBinder p0, int p1, android.os.ResultReceiver p2) { return false; }
    @java.lang.Deprecated
    public void hideStatusIcon(android.os.IBinder p0) {}
    public void invalidateInput(android.view.View p0) {}
    public boolean isAcceptingText() { return false; }
    public boolean isActive() { return false; }
    public boolean isActive(android.view.View p0) { return false; }
    public boolean isConnectionlessStylusHandwritingAvailable() { return false; }
    public boolean isCurrentRootView(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public boolean isCursorAnchorInfoEnabled() { return false; }
    public boolean isFullscreenMode() { return false; }
    public boolean isImeBoundForTesting() { return false; }
    public boolean isInputMethodPickerShown() { return false; }
    public boolean isInputMethodSuppressingSpellChecker() { return false; }
    public boolean isStylusHandwritingAvailable() { return false; }
    public boolean isStylusHandwritingAvailableAsUser(android.os.UserHandle p0) { return false; }
    @java.lang.Deprecated
    public boolean isWatchingCursor(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public void notifySuggestionPicked(android.text.style.SuggestionSpan p0, java.lang.String p1, int p2) {}
    @java.lang.Deprecated
    public void notifyUserAction() {}
    public void onImeSwitchButtonClickFromSystem(int p0) {}
    public void prepareStylusHandwritingDelegation(android.view.View p0) {}
    public void prepareStylusHandwritingDelegation(android.view.View p0, java.lang.String p1) {}
    public void registerImeSwitcherMenu(com.android.internal.inputmethod.IImeSwitcherMenu p0) {}
    @java.lang.Deprecated
    public void registerSuggestionSpansForNotification(android.text.style.SuggestionSpan[] p0) {}
    public void removeImeSurfaceFromWindow(android.os.IBinder p0) {}
    public void reportPerceptible(android.os.IBinder p0, boolean p1) {}
    public void requestFocusAfterSessionReset() {}
    public void resetInputMethodsForTesting(int p0) {}
    public void restartInput(android.view.View p0) {}
    public void sendAppPrivateCommand(android.view.View p0, java.lang.String p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) {}
    public void setAllowedImesByPolicyForTest(java.util.List<java.lang.String> p0) {}
    @java.lang.Deprecated
    public boolean setCurrentInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) { return false; }
    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1) {}
    @java.lang.Deprecated
    public void setInputMethod(android.os.IBinder p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void setInputMethodAndSubtype(android.os.IBinder p0, java.lang.String p1, android.view.inputmethod.InputMethodSubtype p2) {}
    public boolean setInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    public void setPreventImeStartupBypassedAppsForTest(java.util.List<java.lang.String> p0) {}
    public void setStylusWindowIdleTimeoutForTest(long p0) {}
    @java.lang.Deprecated
    public void setUpdateCursorAnchorInfoMode(int p0) {}
    @java.lang.Deprecated
    public boolean shouldOfferSwitchingToNextInputMethod(android.os.IBinder p0) { return false; }
    public boolean shouldShowImeSwitcherButtonForTest() { return false; }
    public void showInputMethodAndSubtypeEnabler(java.lang.String p0) {}
    public void showInputMethodPicker() {}
    public void showInputMethodPickerFromSystem(boolean p0, int p1, int p2) {}
    public boolean showSoftInput(android.view.View p0, int p1) { return false; }
    public boolean showSoftInput(android.view.View p0, int p1, android.os.ResultReceiver p2) { return false; }
    @java.lang.Deprecated
    public void showSoftInputFromInputMethod(android.os.IBinder p0, int p1) {}
    @java.lang.Deprecated
    public void showSoftInputUnchecked(int p0, android.os.ResultReceiver p1) {}
    @java.lang.Deprecated
    public void showStatusIcon(android.os.IBinder p0, java.lang.String p1, int p2) {}
    public void startConnectionlessStylusHandwriting(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1, java.util.concurrent.Executor p2, android.view.inputmethod.ConnectionlessHandwritingCallback p3) {}
    public void startConnectionlessStylusHandwritingForDelegation(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1, java.lang.String p2, java.util.concurrent.Executor p3, android.view.inputmethod.ConnectionlessHandwritingCallback p4) {}
    public void startConnectionlessStylusHandwritingForDelegation(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1, java.util.concurrent.Executor p2, android.view.inputmethod.ConnectionlessHandwritingCallback p3) {}
    public void startStylusHandwriting(android.view.View p0) {}
    @java.lang.Deprecated
    public boolean switchToLastInputMethod(android.os.IBinder p0) { return false; }
    @java.lang.Deprecated
    public boolean switchToNextInputMethod(android.os.IBinder p0, boolean p1) { return false; }
    public void toggleInputMethodPickerFromSystem(boolean p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void toggleSoftInput(int p0, int p1) {}
    @java.lang.Deprecated
    public void toggleSoftInputFromWindow(android.os.IBinder p0, int p1, int p2) {}
    @java.lang.Deprecated
    public void updateCursor(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void updateCursorAnchorInfo(android.view.View p0, android.view.inputmethod.CursorAnchorInfo p1) {}
    public void updateExtractedText(android.view.View p0, int p1, android.view.inputmethod.ExtractedText p2) {}
    public void updateSelection(android.view.View p0, int p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public void viewClicked(android.view.View p0) {}
    public void waitUntilNoPendingRequests(long p0) {}
    @java.lang.Deprecated
    public void windowDismissed(android.os.IBinder p0) {}

    private static final class BindState {
        final int mBindSequence = 0;
        final java.lang.String mImeId = null;
        final android.view.inputmethod.IInputMethodSessionInvoker mImeSession = null;
        final boolean mIsInputMethodSuppressingSpellChecker = false;
        BindState(com.android.internal.inputmethod.InputBindResult p0) {}
    }

    private static class ConnectionlessHandwritingCallbackProxy extends com.android.internal.inputmethod.IConnectionlessHandwritingCallback.Stub {
        private android.view.inputmethod.ConnectionlessHandwritingCallback mCallback;
        private java.util.concurrent.Executor mExecutor;
        private final java.lang.Object mLock = null;
        ConnectionlessHandwritingCallbackProxy(java.util.concurrent.Executor p0, android.view.inputmethod.ConnectionlessHandwritingCallback p1) { super(); }
        public void onError(int p0) {}
        public void onResult(java.lang.CharSequence p0) {}
    }

    private final class DelegateImpl implements android.view.ImeFocusController.InputMethodManagerDelegate {
        private DelegateImpl(android.view.inputmethod.InputMethodManager p0) {}
        private void setCurrentRootViewLocked(android.view.ViewRootImpl p0) {}
        public void onPostWindowGainedFocus(android.view.View p0, android.view.WindowManager.LayoutParams p1) {}
        public void onPreWindowGainedFocus(android.view.ViewRootImpl p0) {}
        public void onScheduledCheckFocus(android.view.ViewRootImpl p0) {}
        public void onViewDetachedFromWindow(android.view.View p0, android.view.ViewRootImpl p1) {}
        public void onViewFocusChanged(android.view.View p0, boolean p1) {}
        public void onWindowDismissed(android.view.ViewRootImpl p0) {}
        public void onWindowLostFocus(android.view.ViewRootImpl p0) {}
    }

    public static interface FinishedInputEventCallback {
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1);
    }

    class H extends android.os.Handler {
        H(android.view.inputmethod.InputMethodManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HandwritingDelegateFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HideFlags {
    }

    private final class ImeInputEventSender extends android.view.InputEventSender {
        public ImeInputEventSender(android.view.inputmethod.InputMethodManager p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEventFinished(int p0, boolean p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IMPickerEntryPoint {
    }

    private final class PendingEvent implements java.lang.Runnable {
        public android.view.inputmethod.InputMethodManager.FinishedInputEventCallback mCallback;
        public android.view.InputEvent mEvent;
        public boolean mHandled;
        public android.os.Handler mHandler;
        public java.lang.String mInputMethodId;
        public java.lang.Object mToken;
        private PendingEvent(android.view.inputmethod.InputMethodManager p0) {}
        public void recycle() {}
        public void run() {}
    }

    private static abstract class ReportInputConnectionOpenedRunner implements java.lang.Runnable {
        int mSequenceNum;
        ReportInputConnectionOpenedRunner(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ShowFlags {
    }
}
