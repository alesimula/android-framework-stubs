package android.service.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextDetectionResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.ambientcontext.AmbientContextDetectionResult> CREATOR = null;
    public static final java.lang.String RESULT_RESPONSE_BUNDLE_KEY = "android.app.ambientcontext.AmbientContextDetectionResultBundleKey";
    private final java.util.List<android.app.ambientcontext.AmbientContextEvent> mEvents = null;
    private final java.lang.String mPackageName = null;
    AmbientContextDetectionResult(android.os.Parcel p0) {}
    AmbientContextDetectionResult(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public java.util.List<android.app.ambientcontext.AmbientContextEvent> getEvents() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private java.util.ArrayList<android.app.ambientcontext.AmbientContextEvent> mEvents;
        private java.lang.String mPackageName;
        public Builder(java.lang.String p0) {}
        private void checkNotUsed() {}
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder addEvent(android.app.ambientcontext.AmbientContextEvent p0) { return null; }
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder addEvents(java.util.List<android.app.ambientcontext.AmbientContextEvent> p0) { return null; }
        public android.service.ambientcontext.AmbientContextDetectionResult build() { return null; }
        public android.service.ambientcontext.AmbientContextDetectionResult.Builder clearEvents() { return null; }
    }
}
