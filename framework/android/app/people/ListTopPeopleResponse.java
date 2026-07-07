package android.app.people;

@android.annotation.SystemApi
public final class ListTopPeopleResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.ListTopPeopleResponse> CREATOR = null;
    private final long mRequestTimeMillis = 0L;
    private final java.util.List<android.app.people.Entity> mResults = null;
    private ListTopPeopleResponse(android.app.people.ListTopPeopleResponse.Builder p0) {}
    private ListTopPeopleResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getRequestTimeMillis() { return 0L; }
    public java.util.List<android.app.people.Entity> getResults() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mRequestTimeMillis;
        private java.util.List<android.app.people.Entity> mResults;
        public Builder() {}
        public android.app.people.ListTopPeopleResponse build() { return null; }
        public android.app.people.ListTopPeopleResponse.Builder setRequestTimeMillis(long p0) { return null; }
        public android.app.people.ListTopPeopleResponse.Builder setResults(java.util.List<android.app.people.Entity> p0) { return null; }
    }
}
