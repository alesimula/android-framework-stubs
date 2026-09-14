package android.app.personalcontext;

public final class PersonalContextManager {
    public static final java.lang.String ACTION_LAUNCH_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO = "android.app.personalcontext.action.LAUNCH_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO";
    public static final java.lang.String ACTION_PERSONAL_CONTEXT_ENABLED_CHANGED = "android.app.personalcontext.action.PERSONAL_CONTEXT_ENABLED_CHANGED";
    public static final java.lang.String ACTION_REQUEST_ENABLE_PERSONAL_CONTEXT_UNDERSTANDER = "android.service.personalcontext.action.REQUEST_ENABLE_PERSONAL_CONTEXT_UNDERSTANDER";
    public static final java.lang.String CONTEXT_UNDERSTANDER_SERVICE_INTERFACE = "android.service.personalcontext.understander.ContextUnderstanderService";
    public static final int DESTINATION_AUGMENTED_AUTOFILL = 16;
    public static final int DESTINATION_EMBEDDED = 32;
    public static final int DESTINATION_LEGACY_CATCH_ALL = -2147483648;
    public static final int DESTINATION_LEGACY_RENDER_TOKEN = 1073741824;
    public static final int DESTINATION_NOTIFICATION = 2;
    public static final int DESTINATION_REMOTE_AUTOFILL = 8;
    public static final int DESTINATION_SCREEN_WHISPER = 4;
    public static final int DESTINATION_UNIVERSAL = 1;
    public static final int DESTINATION_UNKNOWN = 0;
    public static final java.lang.String EXTRA_FEEDBACK_REQUEST = "android.app.personalcontext.extra.FEEDBACK_REQUEST";
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_COMPONENT = "android.service.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_COMPONENT";
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO_REQUEST = "android.app.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO_REQUEST";
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_TYPE = "android.service.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_TYPE";
    public static final java.lang.String EXTRA_PROMPT_CHOSEN_INSIGHT = "android.app.personalcontext.extra.PROMPT_CHOSEN_INSIGHT";
    public static final java.lang.String EXTRA_PROMPT_REQUEST = "android.app.personalcontext.extra.PROMPT_REQUEST";
    public static final int OPERATING_MODE_DEFAULT = 0;
    public static final int OPERATING_MODE_TEST = 1;
    public static final java.lang.String PERSONAL_CONTEXT_SERVICE = "personal_context";
    private static final java.lang.String TAG = "PersonalContextManager";
    public static final int UNDERSTANDER_TYPE_AGENT = 1;
    public static final int UNDERSTANDER_TYPE_OEM = 2;
    public static final int UNDERSTANDER_TYPE_UNKNOWN = 0;
    private final android.content.Context mContext = null;
    private final android.app.personalcontext.PersonalContextManager.SettingsProvider mDefaultSettingsProvider = null;
    private final java.util.List<android.app.personalcontext.PersonalContextManager.PersonalContextEnabledChangedListenerWrapper> mEnabledChangedListeners = null;
    private android.database.ContentObserver mEnabledChangedObserver;
    private final android.app.personalcontext.PersonalContextManagerMetadata mMetadata = null;
    private final java.util.List<android.app.personalcontext.PersonalContextManager.PersonalContextModeChangedListenerWrapper> mModeChangedListeners = null;
    private android.content.BroadcastReceiver mModeChangedReceiver;
    private final android.app.personalcontext.IPersonalContextManager mService = null;
    private android.app.personalcontext.PersonalContextManager.SettingsProvider mSettingsProvider;
    private final java.util.ArrayList<android.app.personalcontext.PersonalContextManager.UnderstanderCallbackWrapper> mUnderstanderCallbacks = null;
    private android.database.ContentObserver mUnderstanderObserver;
    public PersonalContextManager(android.content.Context p0, android.app.personalcontext.IPersonalContextManager p1) {}
    public static android.content.Intent createRequestEnableUnderstanderIntent(android.content.ComponentName p0, int p1) { return null; }
    private void handlePersonalContextEnabledChanged() {}
    private void handlePersonalContextModeChanged(java.lang.String p0) {}
    private void handleUnderstanderCallbacksChanged() {}
    public static java.lang.String understanderTypeToString(int p0) { return null; }
    public java.util.List<android.content.ComponentName> getEnabledUnderstanders() { return null; }
    public int getPersonalContextModeEnabledDefault() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isPersonalContextModeEnabled() { return false; }
    public boolean isPersonalContextModeEnabled(java.lang.String p0) { return false; }
    public android.app.personalcontext.Token mintToken() { return null; }
    public android.app.personalcontext.hint.PublishedContextHint preparePublishedHint(android.app.personalcontext.hint.ContextHint p0, java.util.List<android.app.personalcontext.hint.ContextHint> p1) { return null; }
    public void publishInsight(java.util.List<android.app.personalcontext.insight.ContextInsight> p0, java.util.UUID p1) {}
    @android.annotation.SystemApi
    public void publishRemoteAutofillHint(android.app.personalcontext.hint.ContextHint p0, android.view.autofill.AutofillId p1, android.app.assist.ActivityId p2) {}
    @android.annotation.SystemApi
    public void publishTriggeringHint(java.util.List<android.app.personalcontext.hint.ContextHint> p0) {}
    @android.annotation.SystemApi
    public void publishTriggeringHint(java.util.List<android.app.personalcontext.hint.ContextHint> p0, java.util.List<android.app.personalcontext.hint.ContextHint> p1) {}
    public void publishTriggeringHintInternal(java.util.List<android.app.personalcontext.hint.ContextHint> p0, java.util.List<android.app.personalcontext.RenderToken> p1) {}
    public void publishTriggeringHintInternal(java.util.List<android.app.personalcontext.hint.ContextHint> p0, java.util.List<android.app.personalcontext.RenderToken> p1, java.util.List<android.app.personalcontext.hint.ContextHint> p2) {}
    public void registerOnPersonalContextEnabledChangedListener(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void registerOnPersonalContextModeChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.app.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p2) {}
    public void registerOnPersonalContextModeChangedListener(java.util.concurrent.Executor p0, android.app.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p1) {}
    public void registerUnderstanderCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void reportInsightEvent(android.app.personalcontext.insight.ContextInsight p0, int p1) {}
    public void reportInsightEvent(android.app.personalcontext.insight.PublishedContextInsight p0, int p1, android.app.personalcontext.RenderToken p2) {}
    @android.annotation.SystemApi
    public void requestUnderstanderEnabled(android.content.ComponentName p0, int p1) {}
    public void respondToPrompt(android.app.personalcontext.insight.PromptResponse p0) {}
    public void respondToUnderstanderRegistrationRequest(android.app.personalcontext.understander.RegistrationResponse p0) {}
    @android.annotation.SystemApi
    public void setEnabled(boolean p0) {}
    public void setOperatingMode(int p0) {}
    @android.annotation.SystemApi
    public void setPersonalContextModeEnabled(java.lang.String p0, boolean p1) {}
    public void setPersonalContextModeEnabledDefault(int p0) {}
    public void setSettingsProviderForTesting(android.app.personalcontext.PersonalContextManager.SettingsProvider p0) {}
    public void setUnderstanderEnabled(android.content.ComponentName p0, int p1, boolean p2) {}
    public void showAttribution(android.app.personalcontext.insight.ContextInsight p0) {}
    public void unregisterOnPersonalContextEnabledChangedListener(java.lang.Runnable p0) {}
    public void unregisterOnPersonalContextModeChangedListener(android.app.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p0) {}
    public void unregisterUnderstanderCallback(java.lang.Runnable p0) {}

    public static interface SettingsProvider {
        public java.lang.String getString(java.lang.String p0);
        public void registerContentObserver(android.net.Uri p0, android.database.ContentObserver p1);
        public void unregisterContentObserver(android.database.ContentObserver p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface Destination {
    }

    public static interface OnPersonalContextModeChangedListener {
        public void onPersonalContextModeChanged(java.lang.String p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface OperatingMode {
    }

    private static final class PersonalContextEnabledChangedListenerWrapper {
        final java.util.concurrent.Executor mExecutor = null;
        final java.lang.Runnable mListener = null;
        PersonalContextEnabledChangedListenerWrapper(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    }

    private static final class PersonalContextModeChangedListenerWrapper {
        final java.util.concurrent.Executor mExecutor = null;
        final android.app.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener mListener = null;
        final java.lang.String mPackageName = null;
        PersonalContextModeChangedListenerWrapper(java.lang.String p0, java.util.concurrent.Executor p1, android.app.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p2) {}
    }

    private static final class UnderstanderCallbackWrapper {
        final java.lang.Runnable mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        UnderstanderCallbackWrapper(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface UnderstanderType {
    }
}
