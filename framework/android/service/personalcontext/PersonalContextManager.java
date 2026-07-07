package android.service.personalcontext;

@android.annotation.SystemApi
public final class PersonalContextManager {
    public static final java.lang.String ACTION_PERSONAL_CONTEXT_ENABLED_CHANGED = "android.service.personalcontext.action.PERSONAL_CONTEXT_ENABLED_CHANGED";
    public static final int OPERATING_MODE_DEFAULT = 0;
    public static final int OPERATING_MODE_TEST = 1;
    public static final java.lang.String PERSONAL_CONTEXT_SERVICE = "personal_context";
    private static final java.lang.String TAG = "PersonalContextManager";
    private final android.content.Context mContext = null;
    private final android.service.personalcontext.PersonalContextManagerMetadata mMetadata = null;
    private final android.service.personalcontext.IPersonalContextManager mService = null;
    public PersonalContextManager(android.content.Context p0, android.service.personalcontext.IPersonalContextManager p1) {}
    public boolean isEnabled() { return false; }
    public boolean isPersonalContextModeEnabled(java.lang.String p0) { return false; }
    public android.service.personalcontext.Token mintToken() { return null; }
    public android.service.personalcontext.hint.PublishedContextHint preparePublishedHint(android.service.personalcontext.hint.ContextHint p0, java.util.List<android.service.personalcontext.hint.ContextHint> p1) { return null; }
    public void publishInsight(java.util.List<android.service.personalcontext.insight.ContextInsight> p0, java.util.UUID p1) {}
    public void publishInsightSurfaceHints(java.util.Set<android.service.personalcontext.hint.ContextHint> p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) {}
    public void publishTriggeringHint(android.service.personalcontext.insight.interaction.ReturnHintReport p0, java.util.List<android.service.personalcontext.hint.ContextHint> p1) {}
    public void publishTriggeringHint(java.util.List<android.service.personalcontext.hint.ContextHint> p0, java.util.List<android.service.personalcontext.RenderToken> p1) {}
    public void publishTriggeringHint(java.util.List<android.service.personalcontext.hint.ContextHint> p0, java.util.List<android.service.personalcontext.RenderToken> p1, java.util.List<android.service.personalcontext.hint.ContextHint> p2) {}
    public void registerInsightSurfaceClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0) {}
    public void reportInsightEvent(android.service.personalcontext.insight.ContextInsight p0, int p1) {}
    @android.annotation.SystemApi
    public void reportInsightEvent(android.service.personalcontext.insight.PublishedContextInsight p0, int p1, android.service.personalcontext.RenderToken p2) {}
    public void setEnabled(boolean p0) {}
    public void setOperatingMode(int p0) {}
    public void setPersonalContextModeEnabled(java.lang.String p0, boolean p1) {}
    public void showAttribution(android.service.personalcontext.insight.ContextInsight p0) {}
    public void unregisterInsightSurfaceClient(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0) {}
    public void updateEmbeddedClientInfo(android.service.personalcontext.embedded.InsightSurfaceClientInfo p0, android.service.personalcontext.embedded.InsightSurfaceClientInfo p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    public static @interface OperatingMode {
    }
}
