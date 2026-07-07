package android.inputmethodservice;

class IInputMethodSessionWrapper extends com.android.internal.inputmethod.IInputMethodSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    private static final int DO_APP_PRIVATE_COMMAND = 100;
    private static final int DO_DISPLAY_COMPLETIONS = 65;
    private static final int DO_FINISH_INPUT = 140;
    private static final int DO_FINISH_SESSION = 110;
    private static final int DO_INVALIDATE_INPUT = 150;
    private static final int DO_REMOVE_IME_SURFACE = 130;
    private static final int DO_UPDATE_CURSOR = 95;
    private static final int DO_UPDATE_CURSOR_ANCHOR_INFO = 99;
    private static final int DO_UPDATE_EXTRACTED_TEXT = 67;
    private static final int DO_UPDATE_SELECTION = 90;
    private static final int DO_VIEW_CLICKED = 115;
    private static final java.lang.String TAG = "InputMethodWrapper";
    com.android.internal.os.HandlerCaller mCaller;
    android.view.InputChannel mChannel;
    private final android.content.Context mContext = null;
    android.view.inputmethod.InputMethodSession mInputMethodSession;
    android.inputmethodservice.IInputMethodSessionWrapper.ImeInputEventReceiver mReceiver;
    public IInputMethodSessionWrapper(android.content.Context p0, android.view.inputmethod.InputMethodSession p1, android.view.InputChannel p2) { super(); }
    private void doFinishSession() {}
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    public void executeMessage(android.os.Message p0) {}
    public void finishInput() {}
    public void finishSession() {}
    public android.view.inputmethod.InputMethodSession getInternalInputMethodSession() { return null; }
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    public void removeImeSurface() {}
    public void updateCursor(android.graphics.Rect p0) {}
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void viewClicked(boolean p0) {}

    private final class ImeInputEventReceiver extends android.view.InputEventReceiver implements android.view.inputmethod.InputMethodSession.EventCallback {
        private static final long KEY_EVENT_ALLOW_PERIOD_MS = 100L;
        private final android.util.SparseArray<android.view.InputEvent> mPendingEvents = null;
        public ImeInputEventReceiver(android.inputmethodservice.IInputMethodSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        private boolean hasKeyModifiers(android.view.KeyEvent p0) { return false; }
        private boolean needsVerification(android.view.KeyEvent p0) { return false; }
        public void finishedEvent(int p0, boolean p1) {}
        public void onInputEvent(android.view.InputEvent p0) {}
    }
}
