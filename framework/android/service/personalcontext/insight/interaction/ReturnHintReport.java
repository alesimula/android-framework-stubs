package android.service.personalcontext.insight.interaction;

@android.annotation.SystemApi
public final class ReturnHintReport implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.interaction.ReturnHintReport> CREATOR = null;
    private final android.service.personalcontext.hint.InsightReferenceHint mInsightReferenceHint = null;
    private final java.util.List<android.service.personalcontext.RenderToken> mRenderTokens = null;
    private ReturnHintReport(android.os.Parcel p0) {}
    public ReturnHintReport(android.service.personalcontext.insight.ActionableInsight p0) {}
    public int describeContents() { return 0; }
    public android.service.personalcontext.hint.InsightReferenceHint getInsightReferenceHint() { return null; }
    public java.util.List<android.service.personalcontext.RenderToken> getRenderTokens() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
