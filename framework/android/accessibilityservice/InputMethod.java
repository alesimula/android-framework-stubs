package android.accessibilityservice;

public class InputMethod {
    private static final java.lang.String LOG_TAG = "A11yInputMethod";
    private android.view.inputmethod.EditorInfo mInputEditorInfo;
    private boolean mInputStarted;
    private final android.accessibilityservice.AccessibilityService mService = null;
    private com.android.internal.inputmethod.RemoteAccessibilityInputConnection mStartedInputConnection;
    public InputMethod(android.accessibilityservice.AccessibilityService p0) {}
    final void createImeSession(com.android.internal.inputmethod.IAccessibilityInputMethodSessionCallback p0) {}
    final void doFinishInput() {}
    final void doStartInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2) {}
    public final android.accessibilityservice.InputMethod.AccessibilityInputConnection getCurrentInputConnection() { return null; }
    public final android.view.inputmethod.EditorInfo getCurrentInputEditorInfo() { return null; }
    public final boolean getCurrentInputStarted() { return false; }
    public void onFinishInput() {}
    public void onStartInput(android.view.inputmethod.EditorInfo p0, boolean p1) {}
    public void onUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    final void restartInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1) {}
    final void startInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1) {}

    public final class AccessibilityInputConnection {
        private final com.android.internal.inputmethod.RemoteAccessibilityInputConnection mIc = null;
        AccessibilityInputConnection(android.accessibilityservice.InputMethod p0, com.android.internal.inputmethod.RemoteAccessibilityInputConnection p1) {}
        public void clearMetaKeyStates(int p0) {}
        public void commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) {}
        public void deleteSurroundingText(int p0, int p1) {}
        public int getCursorCapsMode(int p0) { return 0; }
        public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
        public void performContextMenuAction(int p0) {}
        public void performEditorAction(int p0) {}
        public void sendKeyEvent(android.view.KeyEvent p0) {}
        public void setSelection(int p0, int p1) {}
    }

    private final class SessionImpl implements android.accessibilityservice.AccessibilityInputMethodSession {
        boolean mEnabled;
        private SessionImpl(android.accessibilityservice.InputMethod p0) {}
        public void finishInput() {}
        public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
        public void setEnabled(boolean p0) {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    }
}
