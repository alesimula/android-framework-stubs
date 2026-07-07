package android.app.modes;

public final class ContextualModesMutation implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.modes.ContextualModesMutation> CREATOR = null;
    private final java.util.List<android.app.modes.ContextualMode> mUpdatedModes = null;
    private ContextualModesMutation(android.os.Parcel p0) {}
    private ContextualModesMutation(java.util.List<android.app.modes.ContextualMode> p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.app.modes.ContextualMode> getUpdatedModes() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.List<android.app.modes.ContextualMode> mUpdates = null;
        public Builder() {}
        public android.app.modes.ContextualModesMutation.Builder addUpdatedMode(android.app.modes.ContextualMode p0) { return null; }
        public android.app.modes.ContextualModesMutation build() { return null; }
    }
}
