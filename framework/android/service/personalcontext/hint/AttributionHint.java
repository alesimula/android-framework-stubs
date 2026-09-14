package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class AttributionHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_INSIGHT = "insight";
    private final android.service.personalcontext.insight.ContextInsight mInsight = null;
    AttributionHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    AttributionHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public AttributionHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.service.personalcontext.insight.ContextInsight p1) { super(null); }
    public AttributionHint(android.service.personalcontext.insight.ContextInsight p0) { super(null); }
    int getHintType() { return 0; }
    public android.service.personalcontext.insight.ContextInsight getInsight() { return null; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
}
