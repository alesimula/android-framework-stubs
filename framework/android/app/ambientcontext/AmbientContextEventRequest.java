package android.app.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextEventRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ambientcontext.AmbientContextEventRequest> CREATOR = null;
    private final java.util.Set<java.lang.Integer> mEventTypes = null;
    private final android.os.PersistableBundle mOptions = null;
    private AmbientContextEventRequest(android.os.Parcel p0) {}
    private AmbientContextEventRequest(java.util.Set<java.lang.Integer> p0, android.os.PersistableBundle p1) {}
    public int describeContents() { return 0; }
    public java.util.Set<java.lang.Integer> getEventTypes() { return null; }
    public android.os.PersistableBundle getOptions() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private java.util.Set<java.lang.Integer> mEventTypes;
        private android.os.PersistableBundle mOptions;
        public Builder() {}
        private void checkNotUsed() {}
        public android.app.ambientcontext.AmbientContextEventRequest.Builder addEventType(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEventRequest build() { return null; }
        public android.app.ambientcontext.AmbientContextEventRequest.Builder setOptions(android.os.PersistableBundle p0) { return null; }
    }
}
