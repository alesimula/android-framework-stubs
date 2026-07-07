package android.app.people;

@android.annotation.SystemApi
public final class Entity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.Entity> CREATOR = null;
    private final android.app.people.EntityId mId = null;
    private final java.util.List<java.lang.String> mLabels = null;
    private final double mScore = 0.0;
    private Entity(android.app.people.Entity.Builder p0) {}
    private Entity(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.people.EntityId getId() { return null; }
    public java.util.List<java.lang.String> getLabels() { return null; }
    public double getScore() { return 0.0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private final android.app.people.EntityId mId = null;
        private java.util.List<java.lang.String> mLabels;
        private double mScore;
        public Builder(android.app.people.EntityId p0) {}
        public android.app.people.Entity build() { return null; }
        public android.app.people.EntityId getId() { return null; }
        public android.app.people.Entity.Builder setLabels(java.util.List<java.lang.String> p0) { return null; }
        public android.app.people.Entity.Builder setScore(double p0) { return null; }
    }
}
