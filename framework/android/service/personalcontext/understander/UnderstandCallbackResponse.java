package android.service.personalcontext.understander;

public final class UnderstandCallbackResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.understander.UnderstandCallbackResponse> CREATOR = null;
    private final android.app.PendingIntent mFeedbackActivity = null;
    final java.util.Map<android.app.personalcontext.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> mInsights = null;
    private final android.os.IBinder mVisualizerBinder = null;
    private UnderstandCallbackResponse(android.os.Parcel p0) {}
    public UnderstandCallbackResponse(java.util.Map<android.app.personalcontext.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> p0, android.app.PendingIntent p1, android.service.personalcontext.embedded.IInsightVisualizer p2) {}
    public int describeContents() { return 0; }
    public android.app.PendingIntent getFeedbackActivity() { return null; }
    public java.util.Map<android.app.personalcontext.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public android.service.personalcontext.embedded.IInsightVisualizer getVisualizerBinder() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
