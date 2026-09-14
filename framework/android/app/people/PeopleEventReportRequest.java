package android.app.people;

@android.annotation.SystemApi
public final class PeopleEventReportRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.PeopleEventReportRequest> CREATOR = null;
    private final java.util.List<android.app.people.PeopleEvent> mEvents = null;
    private final android.app.people.PeopleEventSessionId mSessionId = null;
    private PeopleEventReportRequest(android.app.people.PeopleEventReportRequest.Builder p0) {}
    private PeopleEventReportRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.people.PeopleEvent> getEvents() { return null; }
    public android.app.people.PeopleEventSessionId getSessionId() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private java.util.List<android.app.people.PeopleEvent> mEvents;
        private final android.app.people.PeopleEventSessionId mSessionId = null;
        public Builder(android.app.people.PeopleEventSessionId p0) {}
        public android.app.people.PeopleEventReportRequest build() { return null; }
        public android.app.people.PeopleEventReportRequest.Builder setEvents(java.util.List<android.app.people.PeopleEvent> p0) { return null; }
    }
}
