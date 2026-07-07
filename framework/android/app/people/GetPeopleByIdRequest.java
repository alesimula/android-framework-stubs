package android.app.people;

@android.annotation.SystemApi
public final class GetPeopleByIdRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.GetPeopleByIdRequest> CREATOR = null;
    private final java.util.List<android.app.people.EntityId> mKeys = null;
    private final android.app.people.RequestParams mParams = null;
    private GetPeopleByIdRequest(android.app.people.GetPeopleByIdRequest.Builder p0) {}
    private GetPeopleByIdRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.people.EntityId> getKeys() { return null; }
    public android.app.people.RequestParams getParams() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.util.List<android.app.people.EntityId> mKeys;
        private final android.app.people.RequestParams mParams = null;
        public Builder(android.app.people.RequestParams p0) {}
        public android.app.people.GetPeopleByIdRequest build() { return null; }
        public android.app.people.GetPeopleByIdRequest.Builder setKeys(java.util.List<android.app.people.EntityId> p0) { return null; }
    }
}
