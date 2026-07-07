package android.view.autofill;

public final class AutofillManager {
    public static final int ACTION_RESPONSE_EXPIRED = 5;
    public static final int ACTION_START_SESSION = 1;
    public static final int ACTION_VALUE_CHANGED = 4;
    public static final int ACTION_VIEW_ENTERED = 2;
    public static final int ACTION_VIEW_EXITED = 3;
    public static final java.lang.String ANY_HINT = "any";
    private static final int AUTHENTICATION_ID_DATASET_ID_MASK = 65535;
    private static final int AUTHENTICATION_ID_DATASET_ID_SHIFT = 16;
    public static final int AUTHENTICATION_ID_DATASET_ID_UNDEFINED = 65535;
    public static final int COMMIT_REASON_ACTIVITY_FINISHED = 1;
    public static final int COMMIT_REASON_SESSION_DESTROYED = 5;
    public static final int COMMIT_REASON_UNKNOWN = 0;
    public static final int COMMIT_REASON_VIEW_CHANGED = 4;
    public static final int COMMIT_REASON_VIEW_CLICKED = 3;
    public static final int COMMIT_REASON_VIEW_COMMITTED = 2;
    private static final boolean DBG = false;
    public static final int DEFAULT_LOGGING_LEVEL = Integer.valueOf(0);
    public static final int DEFAULT_MAX_PARTITIONS_SIZE = 10;
    public static final java.lang.String DIRECT_ACTION_ID_REMOTE_AUTOFILL = "android.REMOTE_AUTOFILL";
    public static final java.lang.String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
    public static final java.lang.String EXTRA_AUGMENTED_AUTOFILL_CLIENT = "android.view.autofill.extra.AUGMENTED_AUTOFILL_CLIENT";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
    public static final java.lang.String EXTRA_AUTHENTICATION_RESULT_EPHEMERAL_DATASET = "android.view.autofill.extra.AUTHENTICATION_RESULT_EPHEMERAL_DATASET";
    public static final java.lang.String EXTRA_AUTH_STATE = "android.view.autofill.extra.AUTH_STATE";
    public static final java.lang.String EXTRA_AUTOFILL_REQUEST_ID = "android.view.autofill.extra.AUTOFILL_REQUEST_ID";
    public static final java.lang.String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
    public static final java.lang.String EXTRA_INLINE_SUGGESTIONS_REQUEST = "android.view.autofill.extra.INLINE_SUGGESTIONS_REQUEST";
    public static final java.lang.String EXTRA_REMOTE_AUTOFILL_ID = "android.view.autofill.extra.REMOTE_AUTOFILL_ID";
    public static final java.lang.String EXTRA_REMOTE_AUTOFILL_VALUE = "android.view.autofill.extra.REMOTE_AUTOFILL_VALUE";
    public static final java.lang.String EXTRA_RESTORE_CROSS_ACTIVITY = "android.view.autofill.extra.RESTORE_CROSS_ACTIVITY";
    public static final java.lang.String EXTRA_RESTORE_SESSION_TOKEN = "android.view.autofill.extra.RESTORE_SESSION_TOKEN";
    public static final int FC_SERVICE_TIMEOUT = 5000;
    public static final int FLAG_ADD_CLIENT_DEBUG = 2;
    public static final int FLAG_ADD_CLIENT_ENABLED = 1;
    public static final int FLAG_ADD_CLIENT_ENABLED_FOR_AUGMENTED_AUTOFILL_ONLY = 8;
    public static final int FLAG_ADD_CLIENT_VERBOSE = 4;
    public static final int FLAG_SMART_SUGGESTION_OFF = 0;
    public static final int FLAG_SMART_SUGGESTION_SYSTEM = 1;
    private static final java.lang.String LAST_AUTOFILLED_DATA_TAG = "android:lastAutoFilledData";
    public static final int MAX_TEMP_AUGMENTED_SERVICE_DURATION_MS = 120000;
    public static final int NO_LOGGING = 0;
    public static final int NO_SESSION = 2147483647;
    public static final int PENDING_UI_OPERATION_CANCEL = 1;
    public static final int PENDING_UI_OPERATION_RESTORE = 2;
    public static final java.lang.String PINNED_DATASET_ID = "PINNED_DATASET_ID";
    public static final int RECEIVER_FLAG_SESSION_FOR_AUGMENTED_AUTOFILL_ONLY = 1;
    public static final int RESULT_CODE_NOT_SERVICE = -1;
    public static final int RESULT_OK = 0;
    private static final java.lang.String SESSION_ID_TAG = "android:sessionId";
    public static final int SET_STATE_FLAG_DEBUG = 8;
    public static final int SET_STATE_FLAG_ENABLED = 1;
    public static final int SET_STATE_FLAG_FOR_AUTOFILL_ONLY = 32;
    public static final int SET_STATE_FLAG_RESET_CLIENT = 4;
    public static final int SET_STATE_FLAG_RESET_SESSION = 2;
    public static final int SET_STATE_FLAG_VERBOSE = 16;
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_DISABLED_BY_SERVICE = 4;
    public static final int STATE_FINISHED = 2;
    public static final int STATE_PENDING_AUTHENTICATION = 7;
    public static final int STATE_SHOWING_SAVE_UI = 3;
    private static final java.lang.String STATE_TAG = "android:state";
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_UNKNOWN_COMPAT_MODE = 5;
    public static final int STATE_UNKNOWN_FAILED = 6;
    private static final int SYNC_CALLS_TIMEOUT_MS = 5000;
    private static final java.lang.String TAG = "AutofillManager";
    private final android.util.ArraySet<android.view.autofill.AutofillId> mAllTrackedViews = null;
    private java.util.Set<java.lang.String> mAllowedActivitySet;
    private android.view.autofill.IAugmentedAutofillManagerClient mAugmentedAutofillServiceClient;
    private android.view.autofill.AutofillStateFingerprint mAutofillStateFingerprint;
    private android.view.autofill.AutofillManager.AutofillCallback mCallback;
    private android.view.autofill.AutofillManager.CompatibilityBridge mCompatibilityBridge;
    private final android.content.Context mContext = null;
    private java.util.Set<java.lang.String> mDeniedActivitySet;
    private boolean mEnabled;
    private boolean mEnabledForAugmentedAutofillOnly;
    private java.util.Set<android.view.autofill.AutofillId> mEnteredForAugmentedAutofillIds;
    private android.util.ArraySet<android.view.autofill.AutofillId> mEnteredIds;
    private final java.lang.String[] mFillDialogEnabledHints = null;
    private java.util.List<android.view.autofill.AutofillId> mFillDialogTriggerIds;
    private boolean mFillReAttemptNeeded;
    private android.util.ArraySet<android.view.autofill.AutofillId> mFillableIds;
    private java.util.Map<java.lang.Integer, android.view.autofill.AutofillId> mFingerprintToViewMap;
    private boolean mForAugmentedAutofillOnly;
    private android.view.autofill.AutofillId mIdShownFillUi;
    private boolean mImproveFillDialogEnabled;
    private final boolean mIsCredmanIntegrationEnabled = false;
    private final boolean mIsFillAndSaveDialogDisabledForCredentialManager = false;
    private final boolean mIsFillDialogEnabled = false;
    private java.util.concurrent.atomic.AtomicBoolean mIsFillRequested;
    private boolean mIsPackageFullyAllowedForAutofill;
    private boolean mIsPackageFullyDeniedForAutofill;
    private boolean mIsPackagePartiallyAllowedForAutofill;
    private boolean mIsPackagePartiallyDeniedForAutofill;
    private boolean mIsTriggerFillRequestOnFilteredImportantViewsEnabled;
    private boolean mIsTriggerFillRequestOnUnimportantViewEnabled;
    private android.view.autofill.ParcelableMap mLastAutofilledData;
    private final java.lang.Object mLock = null;
    private final com.android.internal.logging.MetricsLogger mMetricsLogger = null;
    private java.util.Set<java.lang.String> mNonAutofillableImeActionIdSet;
    private boolean mOnInvisibleCalled;
    private final android.content.AutofillOptions mOptions = null;
    private final boolean mRelativePositionForRelayout = false;
    private final boolean mRelayoutFix = false;
    private boolean mRelayoutFixDeprecated;
    private boolean mSaveOnFinish;
    private android.view.autofill.AutofillId mSaveTriggerId;
    private boolean mScreenHasCredmanField;
    private final android.view.autofill.IAutoFillManager mService = null;
    private android.view.autofill.IAutoFillManagerClient mServiceClient;
    private int mSessionId;
    private boolean mShouldAlwaysIncludeWebviewInAssistStructure;
    private boolean mShouldEnableAutofillOnAllViewTypes;
    private boolean mShouldEnableMultilineFilter;
    private boolean mShouldIgnoreCredentialViews;
    private boolean mShouldIncludeAllChildrenViewInAssistStructure;
    private boolean mShouldIncludeAllViewsWithAutofillTypeNotNoneInAssistStructure;
    private boolean mShouldIncludeInvisibleViewInAssistStructure;
    private boolean mShowAutofillDialogCalled;
    private int mState;
    private android.view.autofill.AutofillManager.TrackedViews mTrackedViews;
    public AutofillManager(android.content.Context p0, android.view.autofill.IAutoFillManager p1) {}
    private void addEnteredIdLocked(android.view.autofill.AutofillId p0) {}
    private void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) {}
    private void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
    private void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) {}
    private void cancelLocked() {}
    private void cancelSessionLocked() {}
    private void commitLocked(int p0) {}
    private void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) {}
    private android.view.View findView(android.view.autofill.AutofillId p0) { return null; }
    private void finishSessionLocked(int p0) {}
    private void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) {}
    private static android.view.autofill.AutofillId getAutofillId(android.view.View p0, int p1) { return null; }
    private android.view.autofill.AutofillManager.AutofillClient getClient() { return null; }
    public static int getDatasetIdFromAuthenticationId(int p0) { return 0; }
    private java.util.Set<java.lang.String> getDeniedOrAllowedActivitySetFromString(java.lang.String p0, java.lang.String p1) { return null; }
    private int getImeStateFlag(android.view.View p0) { return 0; }
    public static int getRequestIdFromAuthenticationId(int p0) { return 0; }
    public static java.lang.String getSmartSuggestionModeToString(int p0) { return null; }
    private static java.lang.String getStateAsString(int p0) { return null; }
    private java.lang.String getStateAsStringLocked() { return null; }
    private java.lang.String getString(java.lang.Object p0) { return null; }
    private void handleFailedIdsLocked(java.util.ArrayList<android.view.autofill.AutofillId> p0) {}
    private void handleFailedIdsLocked(java.util.ArrayList<android.view.autofill.AutofillId> p0, java.util.ArrayList<android.view.autofill.AutofillValue> p1, boolean p2, boolean p3) {}
    private boolean hasFillDialogUiFeature() { return false; }
    private boolean isActiveLocked() { return false; }
    private boolean isClientDisablingEnterExitEvent() { return false; }
    private boolean isClientVisibleForAutofillLocked() { return false; }
    private boolean isCredmanRequested(android.view.View p0) { return false; }
    private boolean isDisabledByServiceLocked() { return false; }
    private boolean isFinishedLocked() { return false; }
    private boolean isPackageFullyAllowedOrDeniedForAutofill(java.lang.String p0, java.lang.String p1) { return false; }
    private boolean isPackagePartiallyDeniedOrAllowedForAutofill(java.lang.String p0, java.lang.String p1) { return false; }
    private boolean isPassingImeActionCheck(android.widget.EditText p0) { return false; }
    private boolean isPassingMultilineCheck(android.widget.EditText p0) { return false; }
    private boolean isPendingAuthenticationLocked() { return false; }
    public static int makeAuthenticationId(int p0, int p1) { return 0; }
    private android.metrics.LogMaker newLog(int p0) { return null; }
    private void notifyCallback(int p0, android.view.autofill.AutofillId p1, int p2) {}
    private void notifyDisableAutofill(long p0, android.content.ComponentName p1) {}
    private void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) {}
    private void notifyViewClicked(android.view.autofill.AutofillId p0) {}
    private void notifyViewEntered(android.view.View p0, int p1) {}
    private void notifyViewEntered(android.view.View p0, int p1, android.graphics.Rect p2, int p3) {}
    private android.view.autofill.AutofillManager.AutofillCallback notifyViewEnteredLocked(android.view.View p0, android.view.autofill.AutofillId p1, android.graphics.Rect p2, android.view.autofill.AutofillValue p3, int p4) { return null; }
    private void notifyViewExitedLocked(android.view.View p0, int p1) {}
    private void notifyViewReadyInner(android.view.autofill.AutofillId p0, java.lang.String[] p1, boolean p2) {}
    private void notifyViewVisibilityChangedInternal(android.view.View p0, int p1, boolean p2, boolean p3) {}
    private void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) {}
    private void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) {}
    private void reportAutofillContentFailure(android.view.autofill.AutofillId p0) {}
    private void requestHideFillUi(android.view.autofill.AutofillId p0, android.view.View p1) {}
    private void requestHideFillUi(android.view.autofill.AutofillId p0, boolean p1) {}
    private void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
    private void requestShowSoftInput(android.view.autofill.AutofillId p0) {}
    private static void requestShowSoftInputInViewThread(android.view.View p0) {}
    private void resetSessionLocked(boolean p0) {}
    private void setAutofilledIfValuesIs(android.view.View p0, android.view.autofill.AutofillValue p1, boolean p2) {}
    private void setFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) {}
    private void setNotifyOnClickLocked(android.view.autofill.AutofillId p0, boolean p1) {}
    private void setSaveUiState(int p0, boolean p1) {}
    private void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) {}
    private void setState(int p0) {}
    private void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5, boolean p6) {}
    private boolean shouldIgnoreViewEnteredLocked(android.view.autofill.AutofillId p0, int p1) { return false; }
    private boolean shouldShowAutofillDialog(android.view.View p0, android.view.autofill.AutofillId p1) { return false; }
    private boolean shouldSuppressDialogsForCredman(android.view.View p0) { return false; }
    private boolean startAutofillIfNeededLocked(android.view.View p0) { return false; }
    private void startSessionLocked(android.view.autofill.AutofillId p0, android.graphics.Rect p1, android.view.autofill.AutofillValue p2, int p3) {}
    private boolean tryAddServiceClientIfNeededLocked() { return false; }
    private boolean tryAddServiceClientIfNeededLocked(boolean p0) { return false; }
    private void updateSessionLocked(android.view.autofill.AutofillId p0, android.graphics.Rect p1, android.view.autofill.AutofillValue p2, int p3, int p4) {}
    public boolean attemptRefill() { return false; }
    void autofill(android.view.View[] p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3, boolean p4) {}
    public void autofillRemoteApp(android.view.autofill.AutofillId p0, java.lang.String p1, android.os.IBinder p2, int p3) {}
    public void cancel() {}
    public void commit() {}
    public void disableAutofillServices() {}
    public void disableOwnedAutofillServices() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public void enableCompatibilityMode() {}
    public android.content.ComponentName getAutofillServiceComponentName() { return null; }
    public java.util.List<java.lang.String> getAvailableFieldClassificationAlgorithms() { return null; }
    public java.lang.String getDefaultFieldClassificationAlgorithm() { return null; }
    public android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
    public android.view.autofill.AutofillId getNextAutofillId() { return null; }
    public int getNextAutofillViewId() { return 0; }
    public java.lang.String getNoiseInjectionMasterSeed() { return null; }
    public android.service.autofill.UserData getUserData() { return null; }
    public java.lang.String getUserDataId() { return null; }
    public boolean hasAutofillFeature() { return false; }
    public boolean hasEnabledAutofillServices() { return false; }
    public boolean isActivityAllowedForAutofill() { return false; }
    public boolean isActivityDeniedForAutofill() { return false; }
    public boolean isAuthenticationPending() { return false; }
    public boolean isAutofillSupported() { return false; }
    public boolean isAutofillUiShowing() { return false; }
    public boolean isAutofillable(android.view.View p0) { return false; }
    public boolean isCompatibilityModeEnabledLocked() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isFieldClassificationEnabled() { return false; }
    public boolean isImproveFillDialogEnabled() { return false; }
    public boolean isRelativePositionForRelayoutEnabled() { return false; }
    public boolean isRelayoutFixEnabled() { return false; }
    public boolean isTriggerFillRequestOnFilteredImportantViewsEnabled() { return false; }
    public boolean isTriggerFillRequestOnUnimportantViewEnabled() { return false; }
    void notifyImeAnimationEnd(long p0) {}
    void notifyImeAnimationStart(long p0) {}
    void notifyReenableAutofill() {}
    public void notifySystemInlineSuggestions(int p0, java.util.List<android.service.autofill.Dataset> p1) {}
    public void notifyValueChanged(android.view.View p0) {}
    public void notifyValueChanged(android.view.View p0, int p1, android.view.autofill.AutofillValue p2) {}
    public void notifyViewClicked(android.view.View p0) {}
    public void notifyViewClicked(android.view.View p0, int p1) {}
    public void notifyViewEntered(android.view.View p0) {}
    public void notifyViewEntered(android.view.View p0, int p1, android.graphics.Rect p2) {}
    public void notifyViewEnteredForAugmentedAutofill(android.view.View p0) {}
    public void notifyViewEnteredForFillDialog(android.view.View p0) {}
    public void notifyViewEnteredIgnoredDuringAuthCount() {}
    public void notifyViewExited(android.view.View p0) {}
    public void notifyViewExited(android.view.View p0, int p1) {}
    void notifyViewExitedLocked(android.view.View p0) {}
    public void notifyViewVisibilityChanged(android.view.View p0, int p1, boolean p2) {}
    public void notifyViewVisibilityChanged(android.view.View p0, boolean p1) {}
    @java.lang.Deprecated
    public void notifyVirtualViewsReady(android.view.View p0, android.util.SparseArray<android.view.autofill.VirtualViewFillInfo> p1) {}
    public void onActivityFinishing() {}
    public void onAuthenticationResult(int p0, android.content.Intent p1, android.view.View p2) {}
    public void onCreate(android.os.Bundle p0) {}
    public void onInvisibleForAutofill(boolean p0) {}
    public void onPendingSaveUi(int p0, android.os.IBinder p1) {}
    public void onSaveInstanceState(android.os.Bundle p0) {}
    public void onVisibleForAutofill() {}
    void post(java.lang.Runnable p0) {}
    public void registerCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}
    public void requestAutofill(android.view.View p0) {}
    public void requestAutofill(android.view.View p0, int p1, android.graphics.Rect p2) {}
    void requestAutofillFromNewSession(android.view.View p0) {}
    public void requestHideFillUi() {}
    @android.annotation.SystemApi
    public void setAugmentedAutofillWhitelist(java.util.Set<java.lang.String> p0, java.util.Set<android.content.ComponentName> p1) {}
    public void setUserData(android.service.autofill.UserData p0) {}
    public boolean shouldAlwaysIncludeWebviewInAssistStructure() { return false; }
    public boolean shouldIgnoreCredentialViews() { return false; }
    public boolean shouldIncludeAllChildrenViewInAssistStructure() { return false; }
    public boolean shouldIncludeAllChildrenViewsWithAutofillTypeNotNoneInAssistStructure() { return false; }
    public boolean shouldIncludeInvisibleViewInAssistStructure() { return false; }
    public boolean shouldRetryFill() { return false; }
    @java.lang.Deprecated
    public boolean showAutofillDialog(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public boolean showAutofillDialog(android.view.View p0, int p1) { return false; }
    public void unregisterCallback(android.view.autofill.AutofillManager.AutofillCallback p0) {}

    private static final class AugmentedAutofillManagerClient extends android.view.autofill.IAugmentedAutofillManagerClient.Stub {
        private final java.lang.ref.WeakReference<android.view.autofill.AutofillManager> mAfm = null;
        private AugmentedAutofillManagerClient(android.view.autofill.AutofillManager p0) { super(); }
        private android.view.View getView(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId p1) { return null; }
        private android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId p1) { return null; }
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) { return null; }
        public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) { return null; }
        public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) { return false; }
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
    }

    public static abstract class AutofillCallback {
        public static final int EVENT_INPUT_HIDDEN = 2;
        public static final int EVENT_INPUT_SHOWN = 1;
        public static final int EVENT_INPUT_UNAVAILABLE = 3;
        public AutofillCallback() {}
        public void onAutofillEvent(android.view.View p0, int p1) {}
        public void onAutofillEvent(android.view.View p0, int p1, int p2) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface AutofillEventType {
        }
    }

    public static interface AutofillClient {
        public void autofillClientAuthenticate(int p0, android.content.IntentSender p1, android.content.Intent p2, boolean p3);
        public void autofillClientDispatchUnhandledKey(android.view.View p0, android.view.KeyEvent p1);
        public java.util.List<android.view.View> autofillClientFindAutofillableViewsByTraversal();
        public android.view.View autofillClientFindViewByAccessibilityIdTraversal(int p0, int p1);
        public android.view.View autofillClientFindViewByAutofillIdTraversal(android.view.autofill.AutofillId p0);
        public android.view.View[] autofillClientFindViewsByAutofillIdTraversal(android.view.autofill.AutofillId[] p0);
        public android.os.IBinder autofillClientGetActivityToken();
        public android.content.ComponentName autofillClientGetComponentName();
        public android.view.autofill.AutofillId autofillClientGetNextAutofillId();
        public boolean[] autofillClientGetViewVisibility(android.view.autofill.AutofillId[] p0);
        public boolean autofillClientIsCompatibilityModeEnabled();
        public boolean autofillClientIsFillUiShowing();
        public boolean autofillClientIsVisibleForAutofill();
        public boolean autofillClientRequestHideFillUi();
        public boolean autofillClientRequestShowFillUi(android.view.View p0, int p1, int p2, android.graphics.Rect p3, android.view.autofill.IAutofillWindowPresenter p4);
        public void autofillClientResetableStateAvailable();
        public void autofillClientRunOnUiThread(java.lang.Runnable p0);
        public boolean isActivityResumed();
        public boolean isDisablingEnterExitEventForAutofill();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutofillCommitReason {
    }

    private static final class AutofillManagerClient extends android.view.autofill.IAutoFillManagerClient.Stub {
        private final java.lang.ref.WeakReference<android.view.autofill.AutofillManager> mAfm = null;
        private AutofillManagerClient(android.view.autofill.AutofillManager p0) { super(); }
        public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) {}
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) {}
        public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) {}
        public void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) {}
        public void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) {}
        public void notifyDisableAutofill(long p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void notifyFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) {}
        public void notifyFillUiHidden(int p0, android.view.autofill.AutofillId p1) {}
        public void notifyFillUiShown(int p0, android.view.autofill.AutofillId p1) {}
        public void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) {}
        public void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) {}
        public void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) {}
        public void requestHideFillUiWhenDestroyed(int p0, android.view.autofill.AutofillId p1) {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) {}
        public void requestShowSoftInput(android.view.autofill.AutofillId p0) {}
        public void setSaveUiState(int p0, boolean p1) {}
        public void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) {}
        public void setState(int p0) {}
        public void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5, boolean p6) {}
        public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1) {}
    }

    private final class CompatibilityBridge implements android.view.accessibility.AccessibilityManager.AccessibilityPolicy {
        android.accessibilityservice.AccessibilityServiceInfo mCompatServiceInfo;
        private final android.graphics.Rect mFocusedBounds = null;
        private long mFocusedNodeId;
        private int mFocusedWindowId;
        private final android.graphics.Rect mTempBounds = null;
        CompatibilityBridge(android.view.autofill.AutofillManager p0) {}
        private android.view.View findViewByAccessibilityId(int p0, long p1) { return null; }
        private android.view.accessibility.AccessibilityNodeInfo findVirtualNodeByAccessibilityId(android.view.View p0, int p1) { return null; }
        private android.accessibilityservice.AccessibilityServiceInfo getCompatServiceInfo() { return null; }
        private boolean isVirtualNode(int p0) { return false; }
        private void notifyValueChanged(int p0, long p1) {}
        private void notifyViewClicked(int p0, long p1) {}
        private boolean notifyViewEntered(int p0, long p1, android.graphics.Rect p2) { return false; }
        private void notifyViewExited(int p0, long p1) {}
        private void updateTrackedViewsLocked() {}
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int p0, java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p1) { return null; }
        public java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(java.util.List<android.accessibilityservice.AccessibilityServiceInfo> p0) { return null; }
        public int getRelevantEventTypes(int p0) { return 0; }
        public boolean isEnabled(boolean p0) { return false; }
        public android.view.accessibility.AccessibilityEvent onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1, int p2) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SmartSuggestionMode {
    }

    private class TrackedViews {
        boolean mHasNewTrackedView;
        private final android.util.ArraySet<android.view.autofill.AutofillId> mInvisibleDialogTrackedIds = null;
        private final android.util.ArraySet<android.view.autofill.AutofillId> mInvisibleTrackedIds = null;
        boolean mIsTrackedSaveView;
        private final android.util.ArraySet<android.view.autofill.AutofillId> mVisibleDialogTrackedIds = null;
        private final android.util.ArraySet<android.view.autofill.AutofillId> mVisibleTrackedIds = null;
        TrackedViews(android.view.autofill.AutofillManager p0, android.view.autofill.AutofillId[] p1, android.view.autofill.AutofillId[] p2) {}
        private <T extends java.lang.Object> android.util.ArraySet<T> addToSet(android.util.ArraySet<T> p0, T p1) { return null; }
        private void initialTrackedViews(android.view.autofill.AutofillId[] p0, android.util.ArraySet<android.view.autofill.AutofillId> p1, android.util.ArraySet<android.view.autofill.AutofillId> p2) {}
        private <T extends java.lang.Object> boolean isInSet(android.util.ArraySet<T> p0, T p1) { return false; }
        private void processNoVisibleTrackedAllViews() {}
        private <T extends java.lang.Object> android.util.ArraySet<T> removeFromSet(android.util.ArraySet<T> p0, T p1) { return null; }
        void checkViewState(android.view.autofill.AutofillId p0) {}
        void notifyViewVisibilityChangedLocked(android.view.autofill.AutofillId p0, boolean p1) {}
        void onVisibleForAutofillChangedInternalLocked(android.util.ArraySet<android.view.autofill.AutofillId> p0, android.util.ArraySet<android.view.autofill.AutofillId> p1) {}
        void onVisibleForAutofillChangedLocked() {}
    }
}
