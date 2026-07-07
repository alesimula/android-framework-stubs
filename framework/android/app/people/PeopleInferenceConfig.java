package android.app.people;

@android.annotation.SystemApi
public final class PeopleInferenceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.PeopleInferenceConfig> CREATOR = null;
    private final android.app.people.RankingSpec mRankingSpec = null;
    private final java.lang.String mSessionId = null;
    private PeopleInferenceConfig(android.app.people.PeopleInferenceConfig.Builder p0) {}
    private PeopleInferenceConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.people.RankingSpec getRankingSpec() { return null; }
    public java.lang.String getSessionId() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.app.people.RankingSpec mRankingSpec;
        private final java.lang.String mSessionId = null;
        public Builder(java.lang.String p0) {}
        public android.app.people.PeopleInferenceConfig build() { return null; }
        public android.app.people.PeopleInferenceConfig.Builder setRankingSpec(android.app.people.RankingSpec p0) { return null; }
    }
}
