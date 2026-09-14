package android.app.people;

@android.annotation.SystemApi
public final class PeopleEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.PeopleEvent> CREATOR = null;
    public static final int POSITION_COLUMN = 2;
    public static final int POSITION_ROW = 1;
    public static final int TYPE_CLICK = 2;
    public static final int TYPE_DESELECT = 4;
    public static final int TYPE_DISMISS = 3;
    public static final int TYPE_SHOW = 1;
    private final long mEventTimeMillis = 0L;
    private final java.util.List<android.app.people.PeopleEvent.Subject> mSubjects = null;
    private final int mType = 0;
    private PeopleEvent(android.app.people.PeopleEvent.Builder p0) {}
    private PeopleEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getEventTimeMillis() { return 0L; }
    public java.util.List<android.app.people.PeopleEvent.Subject> getSubjects() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private long mEventTimeMillis;
        private java.util.List<android.app.people.PeopleEvent.Subject> mSubjects;
        private final int mType = 0;
        public Builder(int p0) {}
        public android.app.people.PeopleEvent build() { return null; }
        public android.app.people.PeopleEvent.Builder setEventTimeMillis(long p0) { return null; }
        public android.app.people.PeopleEvent.Builder setSubjects(java.util.List<android.app.people.PeopleEvent.Subject> p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Position {
    }

    @android.annotation.SystemApi
    public static final class Subject implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.people.PeopleEvent.Subject> CREATOR = null;
        private final android.app.people.EntityId mId = null;
        private final java.util.Map<java.lang.Integer, java.lang.Integer> mPosition = null;
        private Subject(int p0, android.os.Parcel p1) {}
        private Subject(android.app.people.PeopleEvent.Subject.Builder p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.people.EntityId getId() { return null; }
        public java.util.Map<java.lang.Integer, java.lang.Integer> getPosition() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private final android.app.people.EntityId mId = null;
            private java.util.Map<java.lang.Integer, java.lang.Integer> mPosition;
            public Builder(android.app.people.EntityId p0) {}
            public android.app.people.PeopleEvent.Subject build() { return null; }
            public android.app.people.PeopleEvent.Subject.Builder setPosition(java.util.Map<java.lang.Integer, java.lang.Integer> p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
