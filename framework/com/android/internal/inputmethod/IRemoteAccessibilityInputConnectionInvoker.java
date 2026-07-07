package com.android.internal.inputmethod;

final class IRemoteAccessibilityInputConnectionInvoker {
    private final com.android.internal.inputmethod.IRemoteAccessibilityInputConnection mConnection = null;
    private final int mSessionId = 0;
    private IRemoteAccessibilityInputConnectionInvoker(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0, int p1) {}
    public static com.android.internal.inputmethod.IRemoteAccessibilityInputConnectionInvoker create(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0) { return null; }
    public void clearMetaKeyStates(int p0) {}
    public com.android.internal.inputmethod.IRemoteAccessibilityInputConnectionInvoker cloneWithSessionId(int p0) { return null; }
    public void commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) {}
    com.android.internal.inputmethod.InputConnectionCommandHeader createHeader() { return null; }
    public void deleteSurroundingText(int p0, int p1) {}
    public com.android.internal.infra.AndroidFuture<java.lang.Integer> getCursorCapsMode(int p0) { return null; }
    public com.android.internal.infra.AndroidFuture<android.view.inputmethod.SurroundingText> getSurroundingText(int p0, int p1, int p2) { return null; }
    public boolean isSameConnection(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0) { return false; }
    public void performContextMenuAction(int p0) {}
    public void performEditorAction(int p0) {}
    public void sendKeyEvent(android.view.KeyEvent p0) {}
    public void setSelection(int p0, int p1) {}
}
