package android.accessibilityservice;

final class AccessibilityInputMethodSessionWrapper extends com.android.internal.inputmethod.IAccessibilityInputMethodSession.Stub {
    private final android.os.Handler mHandler = null;
    private final java.util.concurrent.atomic.AtomicReference<android.accessibilityservice.AccessibilityInputMethodSession> mSessionRef = null;
    AccessibilityInputMethodSessionWrapper(android.os.Looper p0, android.accessibilityservice.AccessibilityInputMethodSession p1) { super(); }
    private void doFinishInput() {}
    private void doFinishSession() {}
    private void doInvalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
    private void doUpdateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void finishInput() {}
    public void finishSession() {}
    android.accessibilityservice.AccessibilityInputMethodSession getSession() { return null; }
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
}
