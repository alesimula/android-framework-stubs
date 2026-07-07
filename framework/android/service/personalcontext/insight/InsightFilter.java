package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class InsightFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.InsightFilter> CREATOR = null;
    public static final android.service.personalcontext.insight.InsightFilter REQUIRE_RENDER_TOKEN = null;
    private final java.util.Set<java.lang.String> mAllowedTypes = null;
    private InsightFilter(android.os.Parcel p0) {}
    public InsightFilter(java.util.Collection<java.lang.String> p0) {}
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.String> getInsightTypes() { return null; }
    public boolean isInterestedInInsight(android.service.personalcontext.insight.ContextInsight p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.Set<java.lang.String> mAllowedTypes = null;
        public Builder() {}
        public android.service.personalcontext.insight.InsightFilter.Builder addInsightType(java.lang.Class<? extends android.service.personalcontext.insight.ContextInsight> p0) { return null; }
        public android.service.personalcontext.insight.InsightFilter.Builder addInsightType(java.lang.String p0) { return null; }
        public android.service.personalcontext.insight.InsightFilter build() { return null; }
    }
}
