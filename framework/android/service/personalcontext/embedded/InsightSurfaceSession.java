package android.service.personalcontext.embedded;

@android.annotation.SystemApi
public class InsightSurfaceSession implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "InsightSurfaceSession";
    private final java.lang.ref.WeakReference<android.service.personalcontext.embedded.InsightSurfaceClient> mClient = null;
    private final android.content.Context mContext = null;
    private final android.service.personalcontext.embedded.IInsightSurfaceSession mSession = null;
    private android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    public InsightSurfaceSession(android.content.Context p0, android.service.personalcontext.embedded.InsightSurfaceClient p1, android.view.SurfaceControlViewHost.SurfacePackage p2, android.service.personalcontext.embedded.IInsightSurfaceSession p3) {}
    public void close() {}
    public android.service.personalcontext.embedded.InsightSurfaceClient getClient() { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage getSurfacePackage() { return null; }
    public void update(android.service.personalcontext.embedded.InsightSurfaceClientUpdate p0, android.os.OutcomeReceiver<android.service.personalcontext.embedded.InsightSurfaceClientUpdate, android.service.personalcontext.embedded.ClientUpdateException> p1) {}
}
