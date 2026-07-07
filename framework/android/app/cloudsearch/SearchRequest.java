package android.app.cloudsearch;

@android.annotation.SystemApi
public final class SearchRequest implements android.os.Parcelable {
    public static final java.lang.String CONSTRAINT_IS_PRESUBMIT_SUGGESTION = "android.app.cloudsearch.IS_PRESUBMIT_SUGGESTION";
    public static final java.lang.String CONSTRAINT_SEARCH_PROVIDER_FILTER = "android.app.cloudsearch.SEARCH_PROVIDER_FILTER";
    public static final android.os.Parcelable.Creator<android.app.cloudsearch.SearchRequest> CREATOR = null;
    private SearchRequest() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getCallerPackageName() { return null; }
    public float getMaxLatencyMillis() { return 0.0f; }
    public java.lang.String getQuery() { return null; }
    public java.lang.String getRequestId() { return null; }
    public int getResultNumber() { return 0; }
    public int getResultOffset() { return 0; }
    public android.os.Bundle getSearchConstraints() { return null; }
    public int hashCode() { return 0; }
    public void setCallerPackageName(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(java.lang.String p0) {}
        public android.app.cloudsearch.SearchRequest build() { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setCallerPackageName(java.lang.String p0) { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setMaxLatencyMillis(float p0) { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setQuery(java.lang.String p0) { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setResultNumber(int p0) { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setResultOffset(int p0) { return null; }
        public android.app.cloudsearch.SearchRequest.Builder setSearchConstraints(android.os.Bundle p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SearchConstraintKey {
    }
}
