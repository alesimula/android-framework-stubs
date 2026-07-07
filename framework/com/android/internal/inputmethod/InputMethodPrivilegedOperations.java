package com.android.internal.inputmethod;

public final class InputMethodPrivilegedOperations {
    private static final java.lang.String TAG = "InputMethodPrivilegedOperations";
    private final com.android.internal.inputmethod.InputMethodPrivilegedOperations.OpsHolder mOps = null;
    public InputMethodPrivilegedOperations() {}
    public com.android.internal.inputmethod.IInputContentUriToken createInputContentUriToken(android.net.Uri p0, java.lang.String p1) { return null; }
    public void hideMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2) {}
    public void notifyUserActionAsync() {}
    public void onImeSwitchButtonClickFromClient(int p0) {}
    public void onStylusHandwritingReady(int p0, int p1) {}
    public void reportFullscreenModeAsync(boolean p0) {}
    public void reportStartInputAsync(android.os.IBinder p0) {}
    public void resetStylusHandwriting(int p0) {}
    public void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
    public void setHandwritingSurfaceNotTouchable(boolean p0) {}
    public void setHandwritingTouchableRegion(android.graphics.Region p0) {}
    public void setImeWindowStatusAsync(int p0, int p1) {}
    public void setInputMethod(java.lang.String p0) {}
    public void setInputMethodAndSubtype(java.lang.String p0, android.view.inputmethod.InputMethodSubtype p1) {}
    public boolean shouldOfferSwitchingToNextInputMethod() { return false; }
    public void showMySoftInput(android.view.inputmethod.ImeTracker.Token p0, int p1, int p2) {}
    public void switchKeyboardLayoutAsync(int p0) {}
    public boolean switchToNextInputMethod(boolean p0) { return false; }
    public boolean switchToPreviousInputMethod() { return false; }
    public void updateStatusIconAsync(java.lang.String p0, int p1) {}

    private static final class OpsHolder {
        private com.android.internal.inputmethod.IInputMethodPrivilegedOperations mPrivOps;
        private OpsHolder() {}
        private static java.lang.String getCallerMethodName() { return null; }
        public com.android.internal.inputmethod.IInputMethodPrivilegedOperations getAndWarnIfNull() { return null; }
        public void set(com.android.internal.inputmethod.IInputMethodPrivilegedOperations p0) {}
    }
}
