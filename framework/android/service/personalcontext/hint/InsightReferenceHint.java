package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class InsightReferenceHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_INSIGHT_ID = "insight_id";
    private final java.util.UUID mInsightId = null;
    InsightReferenceHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    public InsightReferenceHint(android.service.personalcontext.insight.ContextInsight p0) { super(null); }
    int getHintType() { return 0; }
    public java.util.UUID getInsightId() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
}
