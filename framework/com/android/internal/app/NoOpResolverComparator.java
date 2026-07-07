package com.android.internal.app;

public class NoOpResolverComparator extends com.android.internal.app.AbstractResolverComparator {
    private java.util.List<android.content.pm.ResolveInfo> mOriginalTargetOrder;
    public NoOpResolverComparator(android.content.Context p0, android.content.Intent p1, java.util.List<android.os.UserHandle> p2) { super((android.content.Context)null, (android.content.Intent)null, (android.os.UserHandle)null); }
    public int compare(android.content.pm.ResolveInfo p0, android.content.pm.ResolveInfo p1) { return 0; }
    public void doCompute(java.util.List<com.android.internal.app.ResolverActivity.ResolvedComponentInfo> p0) {}
    public float getScore(android.content.pm.ResolveInfo p0) { return 0.0f; }
    public float getScore(com.android.internal.app.chooser.TargetInfo p0) { return 0.0f; }
    public void handleResultMessage(android.os.Message p0) {}
}
