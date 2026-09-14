package android.app.personalcontext.hint;

public final class InsightReferenceHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_INSIGHT_ID = "insight_id";
    private final java.util.UUID mInsightId = null;
    InsightReferenceHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    InsightReferenceHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    InsightReferenceHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, java.util.UUID p1) { super(null); }
    public InsightReferenceHint(android.app.personalcontext.insight.ContextInsight p0) { super(null); }
    int getHintType() { return 0; }
    public java.util.UUID getInsightId() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
}
