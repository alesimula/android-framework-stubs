package com.android.internal.view;

public interface IInputMethodManager extends android.os.IInterface {
    public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException;
    public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException;
    public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException;
    public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException;
    public boolean disableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean enableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException;
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException;
    public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException;
    public com.android.internal.inputmethod.InputMethodSubtypeSafeList getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException;
    public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException;
    public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException;
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException;
    public void hideInputMethodPickerFromSystem(int p0) throws android.os.RemoteException;
    public void hideSoftInputFromServerForTest() throws android.os.RemoteException;
    public boolean isImeTraceEnabled() throws android.os.RemoteException;
    public boolean isInputMethodPickerShownForTest(int p0) throws android.os.RemoteException;
    public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException;
    public void onImeSwitchButtonClickFromSystem(int p0) throws android.os.RemoteException;
    public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void registerImeSwitcherMenu(com.android.internal.inputmethod.IImeSwitcherMenu p0) throws android.os.RemoteException;
    public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException;
    public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void resetInputMethodsForTesting(int p0) throws android.os.RemoteException;
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException;
    public void setAllowedImesByPolicyForTest(com.android.internal.inputmethod.IInputMethodClient p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;
    public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException;
    public boolean setInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setPreventImeStartupBypassedAppsForTest(java.util.List<java.lang.String> p0) throws android.os.RemoteException;
    public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException;
    public boolean shouldShowImeSwitcherButtonForTest() throws android.os.RemoteException;
    public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException;
    public void showInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException;
    public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException;
    public void startImeTrace() throws android.os.RemoteException;
    public void startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, com.android.internal.inputmethod.IRemoteComputerControlInputConnection p9, int p10, int p11, android.os.ResultReceiver p12, boolean p13, int p14) throws android.os.RemoteException;
    public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException;
    public void stopImeTrace() throws android.os.RemoteException;
    public void toggleInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputMethodManager {
        public Default() {}
        public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
        public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException {}
        public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
        public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public boolean disableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean enableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException { return null; }
        public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.InputMethodSubtypeSafeList getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException { return null; }
        public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
        public void hideInputMethodPickerFromSystem(int p0) throws android.os.RemoteException {}
        public void hideSoftInputFromServerForTest() throws android.os.RemoteException {}
        public boolean isImeTraceEnabled() throws android.os.RemoteException { return false; }
        public boolean isInputMethodPickerShownForTest(int p0) throws android.os.RemoteException { return false; }
        public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException { return false; }
        public void onImeSwitchButtonClickFromSystem(int p0) throws android.os.RemoteException {}
        public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void registerImeSwitcherMenu(com.android.internal.inputmethod.IImeSwitcherMenu p0) throws android.os.RemoteException {}
        public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException {}
        public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void resetInputMethodsForTesting(int p0) throws android.os.RemoteException {}
        public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException {}
        public void setAllowedImesByPolicyForTest(com.android.internal.inputmethod.IInputMethodClient p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
        public boolean setInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void setPreventImeStartupBypassedAppsForTest(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
        public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException {}
        public boolean shouldShowImeSwitcherButtonForTest() throws android.os.RemoteException { return false; }
        public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
        public void showInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException {}
        public void startImeTrace() throws android.os.RemoteException {}
        public void startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, com.android.internal.inputmethod.IRemoteComputerControlInputConnection p9, int p10, int p11, android.os.ResultReceiver p12, boolean p13, int p14) throws android.os.RemoteException {}
        public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
        public void stopImeTrace() throws android.os.RemoteException {}
        public void toggleInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodManager {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodManager";
        static final java.lang.String[] PERMISSIONS_disableInputMethodForTesting = null;
        static final java.lang.String[] PERMISSIONS_enableInputMethodForTesting = null;
        static final java.lang.String[] PERMISSIONS_hideInputMethodPickerFromSystem = null;
        static final java.lang.String[] PERMISSIONS_onImeSwitchButtonClickFromSystem = null;
        static final java.lang.String[] PERMISSIONS_registerImeSwitcherMenu = null;
        static final java.lang.String[] PERMISSIONS_resetInputMethodsForTesting = null;
        static final java.lang.String[] PERMISSIONS_setInputMethodForTesting = null;
        static final java.lang.String[] PERMISSIONS_showInputMethodPickerFromSystem = null;
        static final java.lang.String[] PERMISSIONS_toggleInputMethodPickerFromSystem = null;
        static final int TRANSACTION_acceptStylusHandwritingDelegation = 28;
        static final int TRANSACTION_acceptStylusHandwritingDelegationAsync = 29;
        static final int TRANSACTION_addClient = 1;
        static final int TRANSACTION_addVirtualStylusIdForTestSession = 31;
        static final int TRANSACTION_disableInputMethodForTesting = 39;
        static final int TRANSACTION_enableInputMethodForTesting = 38;
        static final int TRANSACTION_getCurrentInputMethodInfoAsUser = 2;
        static final int TRANSACTION_getCurrentInputMethodSubtype = 17;
        static final int TRANSACTION_getEnabledInputMethodList = 4;
        static final int TRANSACTION_getEnabledInputMethodSubtypeList = 5;
        static final int TRANSACTION_getImeTrackerService = 33;
        static final int TRANSACTION_getInputMethodList = 3;
        static final int TRANSACTION_getLastInputMethodSubtype = 6;
        static final int TRANSACTION_hideInputMethodPickerFromSystem = 12;
        static final int TRANSACTION_hideSoftInputFromServerForTest = 7;
        static final int TRANSACTION_isImeTraceEnabled = 22;
        static final int TRANSACTION_isInputMethodPickerShownForTest = 13;
        static final int TRANSACTION_isStylusHandwritingAvailableAsUser = 30;
        static final int TRANSACTION_onImeSwitchButtonClickFromSystem = 14;
        static final int TRANSACTION_prepareStylusHandwritingDelegation = 27;
        static final int TRANSACTION_registerImeSwitcherMenu = 16;
        static final int TRANSACTION_removeImeSurfaceFromWindow = 21;
        static final int TRANSACTION_reportPerceptible = 20;
        static final int TRANSACTION_resetInputMethodsForTesting = 36;
        static final int TRANSACTION_setAdditionalInputMethodSubtypes = 18;
        static final int TRANSACTION_setAllowedImesByPolicyForTest = 34;
        static final int TRANSACTION_setExplicitlyEnabledInputMethodSubtypes = 19;
        static final int TRANSACTION_setInputMethodForTesting = 37;
        static final int TRANSACTION_setPreventImeStartupBypassedAppsForTest = 35;
        static final int TRANSACTION_setStylusWindowIdleTimeoutForTest = 32;
        static final int TRANSACTION_shouldShowImeSwitcherButtonForTest = 15;
        static final int TRANSACTION_showInputMethodPickerFromClient = 9;
        static final int TRANSACTION_showInputMethodPickerFromSystem = 10;
        static final int TRANSACTION_startConnectionlessStylusHandwriting = 26;
        static final int TRANSACTION_startImeTrace = 23;
        static final int TRANSACTION_startInputOrWindowGainedFocus = 8;
        static final int TRANSACTION_startStylusHandwriting = 25;
        static final int TRANSACTION_stopImeTrace = 24;
        static final int TRANSACTION_toggleInputMethodPickerFromSystem = 11;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static com.android.internal.view.IInputMethodManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addVirtualStylusIdForTestSession_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void disableInputMethodForTesting_enforcePermission() throws java.lang.SecurityException {}
        protected void enableInputMethodForTesting_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void hideInputMethodPickerFromSystem_enforcePermission() throws java.lang.SecurityException {}
        protected void hideSoftInputFromServerForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void isInputMethodPickerShownForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void onImeSwitchButtonClickFromSystem_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerImeSwitcherMenu_enforcePermission() throws java.lang.SecurityException {}
        protected void resetInputMethodsForTesting_enforcePermission() throws java.lang.SecurityException {}
        protected void setAllowedImesByPolicyForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void setInputMethodForTesting_enforcePermission() throws java.lang.SecurityException {}
        protected void setPreventImeStartupBypassedAppsForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void setStylusWindowIdleTimeoutForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void shouldShowImeSwitcherButtonForTest_enforcePermission() throws java.lang.SecurityException {}
        protected void showInputMethodPickerFromSystem_enforcePermission() throws java.lang.SecurityException {}
        protected void startImeTrace_enforcePermission() throws java.lang.SecurityException {}
        protected void stopImeTrace_enforcePermission() throws java.lang.SecurityException {}
        protected void toggleInputMethodPickerFromSystem_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements com.android.internal.view.IInputMethodManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean acceptStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4) throws android.os.RemoteException { return false; }
            public void acceptStylusHandwritingDelegationAsync(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3, int p4, com.android.internal.inputmethod.IBooleanListener p5) throws android.os.RemoteException {}
            public void addClient(com.android.internal.inputmethod.IInputMethodClient p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
            public void addVirtualStylusIdForTestSession(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public boolean disableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean enableInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public android.view.inputmethod.InputMethodInfo getCurrentInputMethodInfoAsUser(int p0) throws android.os.RemoteException { return null; }
            public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.InputMethodInfoSafeList getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.InputMethodSubtypeSafeList getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1, int p2) throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.IImeTracker getImeTrackerService() throws android.os.RemoteException { return null; }
            public com.android.internal.inputmethod.InputMethodInfoSafeList getInputMethodList(int p0, int p1) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype(int p0) throws android.os.RemoteException { return null; }
            public void hideInputMethodPickerFromSystem(int p0) throws android.os.RemoteException {}
            public void hideSoftInputFromServerForTest() throws android.os.RemoteException {}
            public boolean isImeTraceEnabled() throws android.os.RemoteException { return false; }
            public boolean isInputMethodPickerShownForTest(int p0) throws android.os.RemoteException { return false; }
            public boolean isStylusHandwritingAvailableAsUser(int p0, boolean p1) throws android.os.RemoteException { return false; }
            public void onImeSwitchButtonClickFromSystem(int p0) throws android.os.RemoteException {}
            public void prepareStylusHandwritingDelegation(com.android.internal.inputmethod.IInputMethodClient p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void registerImeSwitcherMenu(com.android.internal.inputmethod.IImeSwitcherMenu p0) throws android.os.RemoteException {}
            public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException {}
            public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void resetInputMethodsForTesting(int p0) throws android.os.RemoteException {}
            public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1, int p2) throws android.os.RemoteException {}
            public void setAllowedImesByPolicyForTest(com.android.internal.inputmethod.IInputMethodClient p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
            public void setExplicitlyEnabledInputMethodSubtypes(java.lang.String p0, int[] p1, int p2) throws android.os.RemoteException {}
            public boolean setInputMethodForTesting(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void setPreventImeStartupBypassedAppsForTest(java.util.List<java.lang.String> p0) throws android.os.RemoteException {}
            public void setStylusWindowIdleTimeoutForTest(com.android.internal.inputmethod.IInputMethodClient p0, long p1) throws android.os.RemoteException {}
            public boolean shouldShowImeSwitcherButtonForTest() throws android.os.RemoteException { return false; }
            public void showInputMethodPickerFromClient(com.android.internal.inputmethod.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
            public void showInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void startConnectionlessStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0, int p1, android.view.inputmethod.CursorAnchorInfo p2, java.lang.String p3, java.lang.String p4, com.android.internal.inputmethod.IConnectionlessHandwritingCallback p5) throws android.os.RemoteException {}
            public void startImeTrace() throws android.os.RemoteException {}
            public void startInputOrWindowGainedFocus(int p0, com.android.internal.inputmethod.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.inputmethod.IRemoteInputConnection p7, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p8, com.android.internal.inputmethod.IRemoteComputerControlInputConnection p9, int p10, int p11, android.os.ResultReceiver p12, boolean p13, int p14) throws android.os.RemoteException {}
            public void startStylusHandwriting(com.android.internal.inputmethod.IInputMethodClient p0) throws android.os.RemoteException {}
            public void stopImeTrace() throws android.os.RemoteException {}
            public void toggleInputMethodPickerFromSystem(int p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}
