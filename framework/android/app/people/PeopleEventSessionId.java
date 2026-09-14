package android.app.people;

@android.annotation.SystemApi
public final class PeopleEventSessionId implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.PeopleEventSessionId> CREATOR = null;
    private final java.lang.String mId = null;
    private final long mInferenceTimeMillis = 0L;
    private PeopleEventSessionId(android.os.Parcel p0) {}
    public PeopleEventSessionId(java.lang.String p0, android.app.people.GetPeopleByIdResponse p1) {}
    public PeopleEventSessionId(java.lang.String p0, android.app.people.ListTopPeopleResponse p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getId() { return null; }
    public long getInferenceTimeMillis() { return 0L; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
