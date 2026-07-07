package android.service.personalcontext.embedded;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public final class InsightSurfaceClientInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.embedded.InsightSurfaceClientInfo> CREATOR = null;
    private static final java.lang.String TAG = "InsightSrfcClientInfo";
    private final android.graphics.Color mBackgroundColor = null;
    private final android.service.personalcontext.embedded.IInsightSurfaceClient mClient = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final int mDisplayId = 0;
    private final java.util.UUID mId = null;
    private final int mMeasureSpecHeight = 0;
    private final int mMeasureSpecWidth = 0;
    private final int mNestedScrollAxes = 0;
    private final boolean mNestedScrollAxisLocked = false;
    private final java.lang.String mPackageName = null;
    private final boolean mShouldBlur = false;
    private final int mThemeResourceId = 0;
    private InsightSurfaceClientInfo(android.os.Parcel p0) {}
    public InsightSurfaceClientInfo(java.util.UUID p0, int p1, int p2, int p3, android.graphics.Color p4, int p5, boolean p6, boolean p7, int p8, java.lang.String p9, android.content.res.Configuration p10, android.service.personalcontext.embedded.IInsightSurfaceClient p11) {}
    public android.service.personalcontext.embedded.InsightSurfaceClientInfo createInfoFromUpdate(android.service.personalcontext.embedded.InsightSurfaceClientUpdate p0) { return null; }
    public int describeContents() { return 0; }
    public android.graphics.Color getBackgroundColor() { return null; }
    public android.service.personalcontext.embedded.IInsightSurfaceClient getClient() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public int getDisplayId() { return 0; }
    public java.util.UUID getId() { return null; }
    public int getMeasureSpecHeight() { return 0; }
    public int getMeasureSpecWidth() { return 0; }
    public int getNestedScrollAxes() { return 0; }
    public boolean getNestedScrollAxisLocked() { return false; }
    public java.lang.String getPackageName() { return null; }
    public int getThemeResourceId() { return 0; }
    public void onReceiveInsight(android.service.personalcontext.insight.ContextInsight p0) {}
    public void onRegistered() {}
    public void onSizeChanged(int p0, int p1) {}
    public void onSurfaceCreated(android.view.SurfaceControlViewHost.SurfacePackage p0, android.service.personalcontext.embedded.IInsightSurfaceSession p1) {}
    public void onSurfaceReleased(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    public void onSurfaceUpdated(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    public void onVisualizationError(int p0) {}
    public boolean shouldBlur() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
