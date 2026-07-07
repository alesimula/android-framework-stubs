package com.android.internal.inputmethod;

public final class RemoteAccessibilityInputConnection {
    private static final int MAX_WAIT_TIME_MILLIS = 2000;
    private static final java.lang.String TAG = "RemoteA11yInputConnection";
    private final com.android.internal.inputmethod.CancellationGroup mCancellationGroup = null;
    com.android.internal.inputmethod.IRemoteAccessibilityInputConnectionInvoker mInvoker;
    public RemoteAccessibilityInputConnection(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0, com.android.internal.inputmethod.CancellationGroup p1) {}
    public RemoteAccessibilityInputConnection(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, int p1) {}
    public void clearMetaKeyStates(int p0) {}
    public void commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) {}
    public void deleteSurroundingText(int p0, int p1) {}
    public int getCursorCapsMode(int p0) { return 0; }
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public boolean isSameConnection(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0) { return false; }
    public void performContextMenuAction(int p0) {}
    public void performEditorAction(int p0) {}
    public void sendKeyEvent(android.view.KeyEvent p0) {}
    public void setSelection(int p0, int p1) {}
}
