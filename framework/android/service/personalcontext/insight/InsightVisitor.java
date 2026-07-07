package android.service.personalcontext.insight;

public interface InsightVisitor {
    default public void visit(android.service.personalcontext.insight.ActionableInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.BundleInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.DisplayInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.HintInvalidationInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.InsightCollection p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.ListInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.MapInsight p0, int p1) {}
    default public void visit(android.service.personalcontext.insight.NoResultInsight p0, int p1) {}
    default public void visitUnknown(android.service.personalcontext.insight.ContextInsight p0, int p1) {}
}
