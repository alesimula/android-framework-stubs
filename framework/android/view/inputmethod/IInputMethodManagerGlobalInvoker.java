package android.view.inputmethod;

final class IInputMethodManagerGlobalInvoker {
    private static int sCurStartInputSeq;
    private static volatile com.android.internal.view.IInputMethodManager sServiceCache;
    IInputMethodManagerGlobalInvoker() {}
    static boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) { return false; }
    static boolean acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) { return false; }
    static void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    static void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) {}
    private static int advanceAngGetStartInputSequenceNumber() { return 0; }
    static boolean disableInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    static boolean enableInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    static android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) { return null; }
    static android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) { return null; }
    static java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(int p0) { return null; }
    static java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) { return null; }
    static com.android.internal.inputmethod.ImeTrackerServiceWrapper getImeTrackerService() { return null; }
    static java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(int p0, int p1) { return null; }
    static android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) { return null; }
    static com.android.internal.view.IInputMethodManager getService() { return null; }
    private static void handleRemoteExceptionOrRethrow(android.os.RemoteException p0, java.util.function.Consumer<android.os.RemoteException> p1) {}
    static void hideInputMethodPickerFromSystem(int p0) {}
    static void hideSoftInputFromServerForTest() {}
    static boolean isAvailable() { return false; }
    static boolean isImeTraceEnabled() { return false; }
    static boolean isInputMethodPickerShownForTest(int p0) { return false; }
    static boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) { return false; }
    static void onImeSwitchButtonClickFromSystem(int p0) {}
    static void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) {}
    static void registerImeSwitcherMenu(com.android.internal.inputmethod.IImeSwitcherMenu p0) {}
    static void removeImeSurfaceFromWindow(android.os.IBinder p0) {}
    static void reportPerceptible(android.os.IBinder p0, boolean p1) {}
    static void resetInputMethodsForTesting(int p0) {}
    static void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) {}
    static void setAllowedImesByPolicyForTest(com.android.internal.inputmethod.IInputMethodClient p0, java.util.List<java.lang.String> p1) {}
    static void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) {}
    static boolean setInputMethodForTesting(java.lang.String p0, int p1) { return false; }
    static void setPreventImeStartupBypassedAppsForTest(java.util.List<java.lang.String> p0) {}
    static void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) {}
    static boolean shouldShowImeSwitcherButtonForTest() { return false; }
    static void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) {}
    static void showInputMethodPickerFromSystem(int p0, int p1, int p2) {}
    static boolean startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) { return false; }
    static void startImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    static int startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, com.android.internal.inputmethod.IRemoteComputerControlInputConnection p9, int p10, int p11, android.os.ResultReceiver p12, boolean p13) { return 0; }
    static void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) {}
    static void stopImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    static void toggleInputMethodPickerFromSystem(int p0, int p1, int p2) {}
}
