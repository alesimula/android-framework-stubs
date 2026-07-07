package android.hardware.face;

public class FaceEnrollOptions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceEnrollOptions> CREATOR = null;
    public static final int ENROLL_REASON_RE_ENROLL_NOTIFICATION = 1;
    public static final int ENROLL_REASON_SETTINGS = 2;
    public static final int ENROLL_REASON_SUW = 3;
    public static final int ENROLL_REASON_UNKNOWN = 0;
    private final int mEnrollReason = 0;
    FaceEnrollOptions(int p0) {}
    protected FaceEnrollOptions(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static int defaultEnrollReason() { return 0; }
    public static java.lang.String enrollReasonToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEnrollReason() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private long mBuilderFieldsSet;
        private int mEnrollReason;
        public Builder() {}
        private void checkNotUsed() {}
        public android.hardware.face.FaceEnrollOptions build() { return null; }
        public android.hardware.face.FaceEnrollOptions.Builder setEnrollReason(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnrollReason {
    }
}
