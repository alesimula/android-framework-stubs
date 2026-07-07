package android.app.people;

@android.annotation.SystemApi
public final class RankingSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.RankingSpec> CREATOR = null;
    private final java.util.Map<java.lang.Integer, android.app.people.FeatureSpec> mFeatures = null;
    private final java.util.List<android.app.people.HeuristicInferrer> mHeuristicInferrers = null;
    private final java.lang.String mPredefinedSpecName = null;
    private RankingSpec(android.app.people.RankingSpec.Builder p0) {}
    private RankingSpec(android.os.Parcel p0) {}
    public RankingSpec(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<java.lang.Integer, android.app.people.FeatureSpec> getFeatures() { return null; }
    public java.util.List<android.app.people.HeuristicInferrer> getHeuristicInferrers() { return null; }
    public java.lang.String getPredefinedSpecName() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.util.Map<java.lang.Integer, android.app.people.FeatureSpec> mFeatures;
        private final java.util.ArrayList<android.app.people.HeuristicInferrer> mHeuristicInferrers = null;
        public Builder() {}
        public android.app.people.RankingSpec.Builder addHeuristicInferrers(android.app.people.HeuristicInferrer... p0) { return null; }
        public android.app.people.RankingSpec build() { return null; }
        public android.app.people.RankingSpec.Builder setFeatures(java.util.Map<java.lang.Integer, android.app.people.FeatureSpec> p0) { return null; }
    }
}
