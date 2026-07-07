package android.app.people;

@android.annotation.SystemApi
public final class GetPeopleByIdResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.GetPeopleByIdResponse> CREATOR = null;
    private final long mRequestTimeMillis = 0L;
    private final java.util.Map<android.app.people.EntityId, java.util.List<android.app.people.Entity>> mResults = null;
    private GetPeopleByIdResponse(android.app.people.GetPeopleByIdResponse.Builder p0) {}
    private GetPeopleByIdResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getRequestTimeMillis() { return 0L; }
    public java.util.Map<android.app.people.EntityId, java.util.List<android.app.people.Entity>> getResults() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mRequestTimeMillis;
        private java.util.Map<android.app.people.EntityId, java.util.List<android.app.people.Entity>> mResults;
        public Builder() {}
        public android.app.people.GetPeopleByIdResponse build() { return null; }
        public android.app.people.GetPeopleByIdResponse.Builder setRequestTimeMillis(long p0) { return null; }
        public android.app.people.GetPeopleByIdResponse.Builder setResults(java.util.Map<android.app.people.EntityId, java.util.List<android.app.people.Entity>> p0) { return null; }
    }
}
