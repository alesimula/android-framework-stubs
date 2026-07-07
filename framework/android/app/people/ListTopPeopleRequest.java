package android.app.people;

@android.annotation.SystemApi
public final class ListTopPeopleRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.ListTopPeopleRequest> CREATOR = null;
    private final int mLimit = 0;
    private final android.app.people.RequestParams mParams = null;
    private ListTopPeopleRequest(android.app.people.ListTopPeopleRequest.Builder p0) {}
    private ListTopPeopleRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getLimit() { return 0; }
    public android.app.people.RequestParams getParams() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mLimit;
        private final android.app.people.RequestParams mParams = null;
        public Builder(android.app.people.RequestParams p0) {}
        public android.app.people.ListTopPeopleRequest build() { return null; }
        public android.app.people.ListTopPeopleRequest.Builder setLimit(int p0) { return null; }
    }
}
