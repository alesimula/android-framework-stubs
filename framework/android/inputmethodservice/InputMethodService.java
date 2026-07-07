package android.inputmethodservice;

public class InputMethodService extends android.inputmethodservice.AbstractInputMethodService {
    public static final int BACK_DISPOSITION_ADJUST_NOTHING = 3;
    public static final long BACK_DISPOSITION_CONTROLS_BACK_INTERCEPTION = 454542168L;
    public static final int BACK_DISPOSITION_DEFAULT = 0;
    private static final int BACK_DISPOSITION_MAX = 3;
    private static final int BACK_DISPOSITION_MIN = 0;
    @java.lang.Deprecated
    public static final int BACK_DISPOSITION_WILL_DISMISS = 2;
    @java.lang.Deprecated
    public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;
    static final boolean DEBUG = false;
    public static final long DISALLOW_INPUT_METHOD_INTERFACE_OVERRIDE = 148086656L;
    public static final long FINISH_INPUT_NO_FALLBACK_CONNECTION = 156215187L;
    public static final int IME_ACTIVE = 1;
    public static final int IME_VISIBLE = 2;
    private static final int MAX_EVENTS_BUFFER = 500;
    static final int MOVEMENT_DOWN = -1;
    static final int MOVEMENT_UP = -2;
    private static final long STYLUS_HANDWRITING_IDLE_TIMEOUT_MAX_MS = 30000L;
    private static final long STYLUS_HANDWRITING_IDLE_TIMEOUT_MS = 10000L;
    private static final long STYLUS_WINDOW_IDLE_TIMEOUT_MILLIS = 300000L;
    static final java.lang.String TAG = "InputMethodService";
    private static final long TIMEOUT_SURFACE_REMOVAL_MILLIS = 500L;
    final android.view.View.OnClickListener mActionClickListener = null;
    private boolean mBackCallbackRegistered;
    int mBackDisposition;
    android.widget.FrameLayout mCandidatesFrame;
    boolean mCandidatesViewStarted;
    int mCandidatesVisibility;
    private final android.window.CompatOnBackInvokedCallback mCompatBackCallback = null;
    private android.inputmethodservice.ImsConfigurationTracker mConfigTracker;
    private com.android.internal.inputmethod.IConnectionlessHandwritingCallback mConnectionlessHandwritingCallback;
    android.view.inputmethod.CompletionInfo[] mCurCompletions;
    private android.view.inputmethod.ImeTracker.Token mCurStatsToken;
    boolean mDecorViewVisible;
    boolean mDecorViewWasVisible;
    private boolean mDestroyed;
    private final com.android.internal.inputmethod.ImeTracing.ServiceDumper mDumper = null;
    android.view.ViewGroup mExtractAccessories;
    android.view.View mExtractAction;
    android.inputmethodservice.ExtractEditText mExtractEditText;
    android.widget.FrameLayout mExtractFrame;
    android.view.View mExtractView;
    boolean mExtractViewHidden;
    android.view.inputmethod.ExtractedText mExtractedText;
    int mExtractedToken;
    private java.lang.Runnable mFinishHwRunnable;
    boolean mFullscreenApplied;
    android.view.ViewGroup mFullscreenArea;
    private final android.os.Handler mHandler = null;
    private java.lang.CharSequence mHandwritingDelegationText;
    private android.inputmethodservice.InputMethodService.HandwritingSession mHandwritingSession;
    private android.window.ImeBackCallbackSender mImeBackCallbackSender;
    private java.lang.Runnable mImeSurfaceRemoverRunnable;
    private int mImeWindowVisibility;
    android.view.inputmethod.InputMethodManager mImm;
    boolean mInShowWindow;
    android.view.LayoutInflater mInflater;
    boolean mInitialized;
    private android.inputmethodservice.InkWindow mInkWindow;
    private android.inputmethodservice.InlineSuggestionSessionController mInlineSuggestionSessionController;
    android.view.inputmethod.InputBinding mInputBinding;
    android.view.inputmethod.EditorInfo mInputEditorInfo;
    android.widget.FrameLayout mInputFrame;
    boolean mInputStarted;
    android.view.View mInputView;
    boolean mInputViewStarted;
    final android.view.ViewTreeObserver.OnComputeInternalInsetsListener mInsetsComputer = null;
    private boolean mIsConnectionlessHandwritingForDelegation;
    boolean mIsFullscreen;
    boolean mIsInputViewShown;
    private android.graphics.Region mLastHandwritingRegion;
    boolean mLastShowInputRequested;
    private boolean mLastWasInFullscreenMode;
    private java.lang.Object mLock;
    private final android.inputmethodservice.NavigationBarController mNavigationBarController = null;
    private final android.inputmethodservice.NavigationBarController.Delegate mNavigationBarControllerDelegate = null;
    private boolean mNotifyUserActionSent;
    private boolean mOnPreparedStylusHwCalled;
    private com.android.internal.util.RingBuffer<android.view.MotionEvent> mPendingEvents;
    private com.android.internal.inputmethod.InputMethodPrivilegedOperations mPrivOps;
    android.view.View mRootView;
    private android.inputmethodservice.InputMethodService.SettingsObserver mSettingsObserver;
    int mShowInputFlags;
    boolean mShowInputRequested;
    android.view.inputmethod.InputConnection mStartedInputConnection;
    int mStatusIcon;
    private long mStylusHwSessionsTimeout;
    private long mStylusWindowIdleTimeoutForTest;
    private java.lang.Runnable mStylusWindowIdleTimeoutRunnable;
    int mTheme;
    android.content.res.TypedArray mThemeAttrs;
    final android.inputmethodservice.InputMethodService.Insets mTmpInsets = null;
    final int[] mTmpLocation = null;
    android.os.IBinder mToken;
    private boolean mUsingCtrlShiftShortcut;
    boolean mViewsCreated;
    android.inputmethodservice.SoftInputWindow mWindow;
    boolean mWindowVisible;
    public InputMethodService() { super(); }
    private void cancelImeSurfaceRemoval() {}
    private void cancelStylusWindowIdleTimeout() {}
    private void commitHandwritingDelegationTextIfAvailable() {}
    private void compatHandleBack() {}
    private int computeImeWindowVis() { return 0; }
    private android.view.KeyEvent createBackKeyEvent(int p0, boolean p1) { return null; }
    private android.view.inputmethod.ImeTracker.Token createStatsToken(boolean p0, int p1, boolean p2) { return null; }
    private void discardHandwritingDelegationText() {}
    private void dispatchOnCurrentInputMethodSubtypeChanged(android.view.inputmethod.InputMethodSubtype p0) {}
    private boolean dispatchOnShowInputRequested(int p0, boolean p1) { return false; }
    private void finishAndRemoveStylusHandwritingWindow() {}
    private void finishViews(boolean p0) {}
    private android.inputmethodservice.ExtractEditText getExtractEditTextIfVisible() { return null; }
    private java.lang.Runnable getFinishHandwritingRunnable() { return null; }
    private android.os.IBinder getHostInputToken() { return null; }
    private int getIconForImeAction(int p0) { return 0; }
    public static final java.time.Duration getStylusHandwritingIdleTimeoutMax() { return null; }
    private java.lang.Runnable getStylusWindowIdleTimeoutRunnable() { return null; }
    private boolean handleBack(boolean p0) { return false; }
    private void hideWindowWithToken(int p0) {}
    private void initConfigurationTracker() {}
    private boolean methodIsOverridden(java.lang.String p0, java.lang.Class<?>... p1) { return false; }
    private void notifyPreImeWindowVisibilityChanged(boolean p0, android.view.inputmethod.ImeTracker.Token p1) {}
    private void onToggleSoftInput(int p0, int p1) {}
    private boolean prepareWindow(boolean p0) { return false; }
    private void registerDefaultOnBackInvokedCallback() {}
    private void removeImeSurface() {}
    private void reportFullscreenMode() {}
    private void requestHideSelf(int p0, int p1) {}
    private void requestShowSelf(int p0, int p1) {}
    private void resetStateForNewConfiguration() {}
    private void scheduleHandwritingSessionTimeout() {}
    private void scheduleImeSurfaceRemoval() {}
    private void scheduleStylusWindowIdleTimeout() {}
    private void setImeExclusionRect(int p0) {}
    private void setImeWindowStatus(int p0, int p1) {}
    private void setImeWindowVisibility(int p0) {}
    private void showWindowWithToken(boolean p0, int p1) {}
    private void startViews(boolean p0) {}
    private void unregisterDefaultOnBackInvokedCallback() {}
    private void updateEditorToolTypeInternal(int p0) {}
    final android.inputmethodservice.InputMethodServiceInternal createInputMethodServiceInternal() { return null; }
    void doFinishInput() {}
    boolean doMovementKey(int p0, android.view.KeyEvent p1, int p2) { return false; }
    void doStartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2) {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    @java.lang.Deprecated
    public boolean enableHardwareAcceleration() { return false; }
    public final void finishConnectionlessStylusHandwriting(java.lang.CharSequence p0) {}
    public final void finishStylusHandwriting() {}
    public int getBackDisposition() { return 0; }
    public int getCandidatesHiddenVisibility() { return 0; }
    public android.view.inputmethod.InputBinding getCurrentInputBinding() { return null; }
    public android.view.inputmethod.InputConnection getCurrentInputConnection() { return null; }
    public android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() { return null; }
    public boolean getCurrentInputStarted() { return false; }
    @java.lang.Deprecated
    public int getInputMethodWindowRecommendedHeight() { return 0; }
    public android.view.LayoutInflater getLayoutInflater() { return null; }
    public int getMaxWidth() { return 0; }
    public final java.lang.Boolean getShouldShowImeWithHardKeyboardForTesting() { return null; }
    public final java.time.Duration getStylusHandwritingSessionTimeout() { return null; }
    public final android.view.Window getStylusHandwritingWindow() { return null; }
    public java.lang.CharSequence getTextForImeAction(int p0) { return null; }
    public android.app.Dialog getWindow() { return null; }
    public void hideStatusIcon() {}
    public void hideWindow() {}
    void initViews() {}
    void initialize() {}
    public boolean isExtractViewShown() { return false; }
    public boolean isFullscreenMode() { return false; }
    public final boolean isImeNavigationBarShownForTesting() { return false; }
    public boolean isInputViewShown() { return false; }
    public boolean isShowInputRequested() { return false; }
    public void onAppPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void onBindInput() {}
    public void onComputeInsets(android.inputmethodservice.InputMethodService.Insets p0) {}
    public void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onConfigureWindow(android.view.Window p0, boolean p1, boolean p2) {}
    public void onCreate() {}
    public android.view.View onCreateCandidatesView() { return null; }
    public android.view.View onCreateExtractTextView() { return null; }
    public android.view.inputmethod.InlineSuggestionsRequest onCreateInlineSuggestionsRequest(android.os.Bundle p0) { return null; }
    @java.lang.Deprecated
    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() { return null; }
    @java.lang.Deprecated
    public android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() { return null; }
    public android.view.View onCreateInputView() { return null; }
    protected void onCurrentInputMethodSubtypeChanged(android.view.inputmethod.InputMethodSubtype p0) {}
    public void onCustomImeSwitcherButtonRequestedVisible(boolean p0) {}
    public void onDestroy() {}
    public void onDisplayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    public boolean onEvaluateFullscreenMode() { return false; }
    public boolean onEvaluateInputViewShown() { return false; }
    public boolean onExtractTextContextMenuItem(int p0) { return false; }
    public void onExtractedCursorMovement(int p0, int p1) {}
    public void onExtractedDeleteText(int p0, int p1) {}
    public void onExtractedReplaceText(int p0, int p1, java.lang.CharSequence p2) {}
    public void onExtractedSelectionChanged(int p0, int p1) {}
    public void onExtractedSetSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    public void onExtractedTextClicked() {}
    public void onExtractingInputChanged(android.view.inputmethod.EditorInfo p0) {}
    public void onFinishCandidatesView(boolean p0) {}
    public void onFinishInput() {}
    public void onFinishInputView(boolean p0) {}
    public void onFinishStylusHandwriting() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    final void onImeSwitchButtonClickFromClient() {}
    public void onInitializeInterface() {}
    public boolean onInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyLongPress(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public void onPrepareStylusHandwriting() {}
    public boolean onShouldVerifyKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean onShowInputRequested(int p0, boolean p1) { return false; }
    public void onStartCandidatesView(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public boolean onStartConnectionlessStylusHandwriting(int p0, android.view.inputmethod.CursorAnchorInfo p1) { return false; }
    public void onStartInput(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public void onStartInputView(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public boolean onStartStylusHandwriting() { return false; }
    public void onStylusHandwritingMotionEvent(android.view.MotionEvent p0) {}
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void onUnbindInput() {}
    @java.lang.Deprecated
    public void onUpdateCursor(android.graphics.Rect p0) {}
    public void onUpdateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    public void onUpdateEditorToolType(int p0) {}
    public void onUpdateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    public void onUpdateExtractingViews(android.view.inputmethod.EditorInfo p0) {}
    public void onUpdateExtractingVisibility(android.view.inputmethod.EditorInfo p0) {}
    public void onUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    @java.lang.Deprecated
    public void onViewClicked(boolean p0) {}
    public void onWindowHidden() {}
    public void onWindowShown() {}
    void reportExtractedMovement(int p0, int p1) {}
    public void requestHideSelf(int p0) {}
    public final void requestShowSelf(int p0) {}
    public boolean sendDefaultEditorAction(boolean p0) { return false; }
    public void sendDownUpKeyEvents(int p0) {}
    public void sendKeyChar(char p0) {}
    public void setBackDisposition(int p0) {}
    public void setCandidatesView(android.view.View p0) {}
    public void setCandidatesViewShown(boolean p0) {}
    public void setExtractView(android.view.View p0) {}
    public void setExtractViewShown(boolean p0) {}
    public void setInputView(android.view.View p0) {}
    public final void setStylusHandwritingRegion(android.graphics.Region p0) {}
    public final void setStylusHandwritingSessionTimeout(java.time.Duration p0) {}
    public void setTheme(int p0) {}
    public final boolean shouldOfferSwitchingToNextInputMethod() { return false; }
    public void showStatusIcon(int p0) {}
    public void showWindow(boolean p0) {}
    void startExtractingText(boolean p0) {}
    public void switchInputMethod(java.lang.String p0) {}
    public final void switchInputMethod(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) {}
    public final boolean switchToNextInputMethod(boolean p0) { return false; }
    public final boolean switchToPreviousInputMethod() { return false; }
    void updateCandidatesVisibility(boolean p0) {}
    void updateExtractFrameVisibility() {}
    public void updateFullscreenMode() {}
    public void updateInputViewShown() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackDispositionMode {
    }

    private static final class HandwritingSession {
        private final android.view.InputEventReceiver mEventReceiver = null;
        private final int mRequestId = 0;
        HandwritingSession(int p0, android.view.InputEventReceiver p1) {}
        void dispose() {}
        int getRequestId() { return 0; }
    }

    public static @interface ImeWindowVisibility {
    }

    public class InputMethodImpl extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodImpl {
        private boolean mSimultaneousStylusAndTouchEnabled;
        private boolean mSystemCallingHideSoftInput;
        private boolean mSystemCallingShowSoftInput;
        public InputMethodImpl(android.inputmethodservice.InputMethodService p0) { super(null); }
        private void deliverStylusHandwritingMotionEvent(android.view.MotionEvent p0) {}
        private void maybeCreateAndInitInkWindow() {}
        public void attachToken(android.os.IBinder p0) {}
        public void bindInput(android.view.inputmethod.InputBinding p0) {}
        public void canStartStylusHandwriting(int p0, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p1, android.view.inputmethod.CursorAnchorInfo p2, boolean p3) {}
        public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) {}
        public void commitHandwritingDelegationTextIfAvailable() {}
        public void discardHandwritingDelegationText() {}
        public final void dispatchStartInput(android.view.inputmethod.InputConnection p0, com.android.internal.inputmethod.IInputMethod.StartInputParams p1) {}
        public void finishStylusHandwriting() {}
        public void hideSoftInput(int p0, android.os.ResultReceiver p1) {}
        public void hideSoftInputWithToken(android.view.inputmethod.ImeTracker.Token p0) {}
        public void initInkWindow() {}
        public final void initializeInternal(com.android.internal.inputmethod.IInputMethod.InitParams p0) {}
        public void onCreateInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) {}
        public void onNavButtonFlagsChanged(int p0) {}
        public void removeStylusHandwritingWindow() {}
        public void restartInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1) {}
        public void setStylusWindowIdleTimeoutForTest(long p0) {}
        public void showSoftInput(int p0, android.os.ResultReceiver p1) {}
        public void showSoftInputWithToken(android.view.inputmethod.ImeTracker.Token p0) {}
        public void startInput(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1) {}
        public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) {}
        public void unbindInput() {}
        public void updateEditorToolType(int p0) {}
    }

    public class InputMethodSessionImpl extends android.inputmethodservice.AbstractInputMethodService.AbstractInputMethodSessionImpl {
        public InputMethodSessionImpl(android.inputmethodservice.InputMethodService p0) { super(null); }
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
        public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
        public void finishInput() {}
        public final void invalidateInputInternal(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
        public final void removeImeSurface() {}
        @java.lang.Deprecated
        public void toggleSoftInput(int p0, int p1) {}
        public void updateCursor(android.graphics.Rect p0) {}
        public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
        public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public void viewClicked(boolean p0) {}
    }

    public static final class Insets {
        public static final int TOUCHABLE_INSETS_CONTENT = 1;
        public static final int TOUCHABLE_INSETS_FRAME = 0;
        public static final int TOUCHABLE_INSETS_REGION = 3;
        public static final int TOUCHABLE_INSETS_VISIBLE = 2;
        public int contentTopInsets;
        public int touchableInsets;
        public final android.graphics.Region touchableRegion = null;
        public int visibleTopInsets;
        public Insets() {}
        private void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    }

    private final class NavigationBarControllerDelegateImpl implements android.inputmethodservice.NavigationBarController.Delegate {
        private NavigationBarControllerDelegateImpl(android.inputmethodservice.InputMethodService p0) {}
        public android.content.Context getContext() { return null; }
        public android.view.View getInputFrame() { return null; }
        public android.content.res.Resources getResources() { return null; }
        public android.view.Window getWindow() { return null; }
        public boolean isExtractViewShown() { return false; }
        public boolean isFullscreenMode() { return false; }
        public void onCustomImeSwitcherButtonRequestedVisible(boolean p0) {}
        public void onImeSwitchButtonClickFromClient() {}
    }

    private static final class SettingsObserver extends android.database.ContentObserver {
        private final android.inputmethodservice.InputMethodService mService = null;
        private int mShowImeWithHardKeyboard;
        private SettingsObserver(android.inputmethodservice.InputMethodService p0) { super((android.os.Handler)null); }
        public static android.inputmethodservice.InputMethodService.SettingsObserver createAndRegister(android.inputmethodservice.InputMethodService p0) { return null; }
        private boolean shouldShowImeWithHardKeyboard() { return false; }
        public void onChange(boolean p0, android.net.Uri p1) {}
        public java.lang.String toString() { return null; }
        void unregister() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        private static @interface ShowImeWithHardKeyboardType {
            public static final int FALSE = 1;
            public static final int TRUE = 2;
            public static final int UNKNOWN = 0;
        }
    }
}
