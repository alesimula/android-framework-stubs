package android.service.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextDetectionServiceStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.ambientcontext.AmbientContextDetectionServiceStatus> CREATOR = null;
    public static final java.lang.String STATUS_RESPONSE_BUNDLE_KEY = "android.app.ambientcontext.AmbientContextServiceStatusBundleKey";
    private final java.lang.String mPackageName = null;
    private final int mStatusCode = 0;
    AmbientContextDetectionServiceStatus(int p0, java.lang.String p1) {}
    AmbientContextDetectionServiceStatus(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getStatusCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private long mBuilderFieldsSet;
        private java.lang.String mPackageName;
        private int mStatusCode;
        public Builder(java.lang.String p0) {}
        private void checkNotUsed() {}
        public android.service.ambientcontext.AmbientContextDetectionServiceStatus build() { return null; }
        public android.service.ambientcontext.AmbientContextDetectionServiceStatus.Builder setStatusCode(int p0) { return null; }
    }
}
