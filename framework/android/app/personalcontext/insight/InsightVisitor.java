package android.app.personalcontext.insight;

public interface InsightVisitor {
    default public void visit(android.app.personalcontext.insight.ActionableInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.BundleInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.DisplayInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.HintInvalidationInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.InsightCollection p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.ListInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.MapInsight p0, int p1) {}
    default public void visit(android.app.personalcontext.insight.NoResultInsight p0, int p1) {}
    default public void visitUnknown(android.app.personalcontext.insight.ContextInsight p0, int p1) {}
}
