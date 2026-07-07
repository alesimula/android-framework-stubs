package android.service.personalcontext.understander;

public final class UnderstandCallbackResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.understander.UnderstandCallbackResponse> CREATOR = null;
    final java.util.Map<android.service.personalcontext.insight.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> mInsights = null;
    private UnderstandCallbackResponse(android.os.Parcel p0) {}
    public UnderstandCallbackResponse(java.util.Map<android.service.personalcontext.insight.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> p0) {}
    public int describeContents() { return 0; }
    public java.util.Map<android.service.personalcontext.insight.destination.ContextDestination, android.service.personalcontext.insight.ContextInsight> getInsights() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
