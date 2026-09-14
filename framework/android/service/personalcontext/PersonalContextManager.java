package android.service.personalcontext;

@android.annotation.SystemApi
public final class PersonalContextManager {
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LAUNCH_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO = "android.service.personalcontext.action.LAUNCH_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO";
    public static final java.lang.String ACTION_PERSONAL_CONTEXT_ENABLED_CHANGED = "android.service.personalcontext.action.PERSONAL_CONTEXT_ENABLED_CHANGED";
    public static final java.lang.String ACTION_REQUEST_ENABLE_PERSONAL_CONTEXT_UNDERSTANDER = "android.service.personalcontext.action.REQUEST_ENABLE_PERSONAL_CONTEXT_UNDERSTANDER";
    @android.annotation.SystemApi
    public static final int DESTINATION_AUGMENTED_AUTOFILL = 16;
    @android.annotation.SystemApi
    public static final int DESTINATION_EMBEDDED = 32;
    public static final int DESTINATION_LEGACY_CATCH_ALL = -2147483648;
    public static final int DESTINATION_LEGACY_RENDER_TOKEN = 1073741824;
    @android.annotation.SystemApi
    public static final int DESTINATION_NOTIFICATION = 2;
    @android.annotation.SystemApi
    public static final int DESTINATION_REMOTE_AUTOFILL = 8;
    @android.annotation.SystemApi
    public static final int DESTINATION_SCREEN_WHISPER = 4;
    @android.annotation.SystemApi
    public static final int DESTINATION_UNIVERSAL = 1;
    @android.annotation.SystemApi
    public static final int DESTINATION_UNKNOWN = 0;
    public static final java.lang.String EXTRA_FEEDBACK_REQUEST = "android.service.personalcontext.extra.FEEDBACK_REQUEST";
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_COMPONENT = "android.service.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_COMPONENT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO_REQUEST = "android.service.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_CONSENT_INTRO_REQUEST";
    public static final java.lang.String EXTRA_PERSONAL_CONTEXT_UNDERSTANDER_TYPE = "android.service.personalcontext.extra.PERSONAL_CONTEXT_UNDERSTANDER_TYPE";
    public static final java.lang.String EXTRA_PROMPT_CHOSEN_INSIGHT = "android.service.personalcontext.extra.PROMPT_CHOSEN_INSIGHT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_PROMPT_REQUEST = "android.service.personalcontext.extra.PROMPT_REQUEST";
    public static final int OPERATING_MODE_DEFAULT = 0;
    public static final int OPERATING_MODE_TEST = 1;
    public static final java.lang.String PERSONAL_CONTEXT_SERVICE = "personal_context";
    private static final java.lang.String TAG = "PersonalContextManager";
    @android.annotation.SystemApi
    public static final int UNDERSTANDER_TYPE_AGENT = 1;
    @android.annotation.SystemApi
    public static final int UNDERSTANDER_TYPE_OEM = 2;
    @android.annotation.SystemApi
    public static final int UNDERSTANDER_TYPE_UNKNOWN = 0;
    private final android.content.Context mContext = null;
    private final android.service.personalcontext.PersonalContextManager.SettingsProvider mDefaultSettingsProvider = null;
    private final java.util.List<android.service.personalcontext.PersonalContextManager.PersonalContextEnabledChangedListenerWrapper> mEnabledChangedListeners = null;
    private android.database.ContentObserver mEnabledChangedObserver;
    private final android.service.personalcontext.PersonalContextManagerMetadata mMetadata = null;
    private final java.util.List<android.service.personalcontext.PersonalContextManager.PersonalContextModeChangedListenerWrapper> mModeChangedListeners = null;
    private android.content.BroadcastReceiver mModeChangedReceiver;
    private final android.service.personalcontext.IPersonalContextManager mService = null;
    private android.service.personalcontext.PersonalContextManager.SettingsProvider mSettingsProvider;
    private final java.util.ArrayList<android.service.personalcontext.PersonalContextManager.UnderstanderCallbackWrapper> mUnderstanderCallbacks = null;
    private android.database.ContentObserver mUnderstanderObserver;
    public PersonalContextManager(android.content.Context p0, android.service.personalcontext.IPersonalContextManager p1) {}
    public static android.content.Intent createRequestEnableUnderstanderIntent(android.content.ComponentName p0, int p1) { return null; }
    private void handlePersonalContextEnabledChanged() {}
    private void handlePersonalContextModeChanged(java.lang.String p0) {}
    private void handleUnderstanderCallbacksChanged() {}
    public java.util.List<android.content.ComponentName> getEnabledUnderstanders() { return null; }
    public int getPersonalContextModeEnabledDefault() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isPersonalContextModeEnabled() { return false; }
    public boolean isPersonalContextModeEnabled(java.lang.String p0) { return false; }
    public android.service.personalcontext.Token mintToken() { return null; }
    public android.service.personalcontext.hint.PublishedContextHint preparePublishedHint(android.service.personalcontext.hint.ContextHint p0, java.util.List<android.service.personalcontext.hint.ContextHint> p1) { return null; }
    public void publishInsight(java.util.List<android.service.personalcontext.insight.ContextInsight> p0, java.util.UUID p1) {}
    public void publishInsightSurfaceHints(java.util.Set<android.service.personalcontext.hint.ContextHint> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) {}
    @android.annotation.SystemApi
    public void publishRemoteAutofillHint(android.service.personalcontext.hint.ContextHint p0, android.view.autofill.AutofillId p1, android.app.assist.ActivityId p2) {}
    public void publishTriggeringHint(android.service.personalcontext.insight.interaction.ReturnHintReport p0, java.util.List<android.service.personalcontext.hint.ContextHint> p1) {}
    public void publishTriggeringHint(java.util.List<android.service.personalcontext.hint.ContextHint> p0, java.util.List<android.service.personalcontext.RenderToken> p1) {}
    public void publishTriggeringHint(java.util.List<android.service.personalcontext.hint.ContextHint> p0, java.util.List<android.service.personalcontext.RenderToken> p1, java.util.List<android.service.personalcontext.hint.ContextHint> p2) {}
    public void registerInsightSurfaceClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0) {}
    public void registerOnPersonalContextEnabledChangedListener(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void registerOnPersonalContextModeChangedListener(java.lang.String p0, java.util.concurrent.Executor p1, android.service.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p2) {}
    public void registerOnPersonalContextModeChangedListener(java.util.concurrent.Executor p0, android.service.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p1) {}
    public void registerUnderstanderCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    public void reportInsightEvent(android.service.personalcontext.insight.ContextInsight p0, int p1) {}
    @android.annotation.SystemApi
    public void reportInsightEvent(android.service.personalcontext.insight.PublishedContextInsight p0, int p1, android.service.personalcontext.RenderToken p2) {}
    @android.annotation.SystemApi
    public void requestUnderstanderEnabled(android.content.ComponentName p0, int p1) {}
    @android.annotation.SystemApi
    public void respondToPrompt(android.service.personalcontext.insight.PromptResponse p0) {}
    @android.annotation.SystemApi
    public void respondToUnderstanderRegistrationRequest(android.app.personalcontext.understander.RegistrationResponse p0) {}
    public void setEnabled(boolean p0) {}
    public void setOperatingMode(int p0) {}
    public void setPersonalContextModeEnabled(java.lang.String p0, boolean p1) {}
    public void setPersonalContextModeEnabledDefault(int p0) {}
    public void setSettingsProviderForTesting(android.service.personalcontext.PersonalContextManager.SettingsProvider p0) {}
    @android.annotation.SystemApi
    public void setUnderstanderEnabled(android.content.ComponentName p0, int p1, boolean p2) {}
    public void showAttribution(android.service.personalcontext.insight.ContextInsight p0) {}
    public void unregisterInsightSurfaceClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0) {}
    public void unregisterOnPersonalContextEnabledChangedListener(java.lang.Runnable p0) {}
    public void unregisterOnPersonalContextModeChangedListener(android.service.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p0) {}
    public void unregisterUnderstanderCallback(java.lang.Runnable p0) {}
    public void updateEmbeddedClientInfo(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface UnderstanderType {
    }

    public static interface SettingsProvider {
        public java.lang.String getString(java.lang.String p0);
        public void registerContentObserver(android.net.Uri p0, android.database.ContentObserver p1);
        public void unregisterContentObserver(android.database.ContentObserver p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface Destination {
    }

    private static final class PersonalContextEnabledChangedListenerWrapper {
        final java.util.concurrent.Executor mExecutor = null;
        final java.lang.Runnable mListener = null;
        PersonalContextEnabledChangedListenerWrapper(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    }

    private static final class PersonalContextModeChangedListenerWrapper {
        final java.util.concurrent.Executor mExecutor = null;
        final android.service.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener mListener = null;
        final java.lang.String mPackageName = null;
        PersonalContextModeChangedListenerWrapper(java.lang.String p0, java.util.concurrent.Executor p1, android.service.personalcontext.PersonalContextManager.OnPersonalContextModeChangedListener p2) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface OperatingMode {
    }

    private static final class UnderstanderCallbackWrapper {
        final java.lang.Runnable mCallback = null;
        final java.util.concurrent.Executor mExecutor = null;
        UnderstanderCallbackWrapper(java.util.concurrent.Executor p0, java.lang.Runnable p1) {}
    }

    public static interface OnPersonalContextModeChangedListener {
        public void onPersonalContextModeChanged(java.lang.String p0);
    }
}
