package android.app.people;

@android.annotation.SystemApi
public final class FeatureSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.people.FeatureSpec> CREATOR = null;
    private final android.app.people.Feature mDefaultFeature = null;
    private final android.app.people.Expression mFormula = null;
    private FeatureSpec(android.app.people.FeatureSpec.Builder p0) {}
    public FeatureSpec(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.people.Feature getDefaultFeature() { return null; }
    public android.app.people.Expression getFormula() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private android.app.people.Feature mDefaultFeature;
        private final android.app.people.Expression mFormula = null;
        public Builder(android.app.people.Expression p0) {}
        public android.app.people.FeatureSpec build() { return null; }
        public android.app.people.FeatureSpec.Builder setDefaultFeature(android.app.people.Feature p0) { return null; }
    }
}
