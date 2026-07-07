package android.inputmethodservice;

class IInputMethodWrapper extends com.android.internal.inputmethod.IInputMethod.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final int DO_CAN_START_STYLUS_HANDWRITING = 100;
    private static final int DO_CHANGE_INPUTMETHOD_SUBTYPE = 80;
    private static final int DO_COMMIT_HANDWRITING_DELEGATION_TEXT_IF_AVAILABLE = 170;
    private static final int DO_CREATE_INLINE_SUGGESTIONS_REQUEST = 90;
    private static final int DO_CREATE_SESSION = 40;
    private static final int DO_DISCARD_HANDWRITING_DELEGATION_TEXT = 180;
    private static final int DO_DUMP = 1;
    private static final int DO_FINISH_STYLUS_HANDWRITING = 130;
    private static final int DO_HIDE_SOFT_INPUT = 70;
    private static final int DO_INITIALIZE_INTERNAL = 10;
    private static final int DO_INIT_INK_WINDOW = 120;
    private static final int DO_ON_NAV_BUTTON_FLAGS_CHANGED = 35;
    private static final int DO_REMOVE_STYLUS_HANDWRITING_WINDOW = 150;
    private static final int DO_SET_INPUT_CONTEXT = 20;
    private static final int DO_SET_SESSION_ENABLED = 45;
    private static final int DO_SET_STYLUS_WINDOW_IDLE_TIMEOUT = 160;
    private static final int DO_SHOW_SOFT_INPUT = 60;
    private static final int DO_START_INPUT = 32;
    private static final int DO_START_STYLUS_HANDWRITING = 110;
    private static final int DO_UNSET_INPUT_CONTEXT = 30;
    private static final int DO_UPDATE_TOOL_TYPE = 140;
    private static final java.lang.String TAG = "InputMethodWrapper";
    final com.android.internal.os.HandlerCaller mCaller = null;
    com.android.internal.inputmethod.CancellationGroup mCancellationGroup;
    final android.content.Context mContext = null;
    final java.lang.ref.WeakReference<android.view.inputmethod.InputMethod> mInputMethod = null;
    final java.lang.ref.WeakReference<android.inputmethodservice.InputMethodServiceInternal> mTarget = null;
    final int mTargetSdkVersion = 0;
    IInputMethodWrapper(android.inputmethodservice.InputMethodServiceInternal p0, android.view.inputmethod.InputMethod p1) { super(); }
    private static boolean isValid(android.view.inputmethod.InputMethod p0, android.inputmethodservice.InputMethodServiceInternal p1, java.lang.String p2) { return false; }
    public void bindInput(android.view.inputmethod.InputBinding p0) {}
    public void canStartStylusHandwriting(int p0, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p1, android.view.inputmethod.CursorAnchorInfo p2, boolean p3) throws android.os.RemoteException {}
    public void changeInputMethodSubtype(android.view.inputmethod.InputMethodSubtype p0) {}
    public void commitHandwritingDelegationTextIfAvailable() {}
    public void createSession(android.view.InputChannel p0, com.android.internal.inputmethod.IInputMethodSessionCallback p1) {}
    public void discardHandwritingDelegationText() {}
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void executeMessage(android.os.Message p0) {}
    public void finishStylusHandwriting() {}
    public void hideSoftInput(android.view.inputmethod.ImeTracker.Token p0) {}
    public void initInkWindow() {}
    public void initializeInternal(com.android.internal.inputmethod.IInputMethod.InitParams p0) {}
    public void onCreateInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) {}
    public void onNavButtonFlagsChanged(int p0) {}
    public void removeStylusHandwritingWindow() {}
    public void setSessionEnabled(com.android.internal.inputmethod.IInputMethodSession p0, boolean p1) {}
    public void setStylusWindowIdleTimeoutForTest(long p0) {}
    public void showSoftInput(android.view.inputmethod.ImeTracker.Token p0) {}
    public void startInput(com.android.internal.inputmethod.IInputMethod.StartInputParams p0) {}
    public void startStylusHandwriting(int p0, android.view.InputChannel p1, java.util.List<android.view.MotionEvent> p2) throws android.os.RemoteException {}
    public void unbindInput() {}
    public void updateEditorToolType(int p0) throws android.os.RemoteException {}

    static final class InputMethodSessionCallbackWrapper implements android.view.inputmethod.InputMethod.SessionCallback {
        final com.android.internal.inputmethod.IInputMethodSessionCallback mCb = null;
        final android.view.InputChannel mChannel = null;
        final android.content.Context mContext = null;
        InputMethodSessionCallbackWrapper(android.content.Context p0, android.view.InputChannel p1, com.android.internal.inputmethod.IInputMethodSessionCallback p2) {}
        public void sessionCreated(android.view.inputmethod.InputMethodSession p0) {}
    }
}
