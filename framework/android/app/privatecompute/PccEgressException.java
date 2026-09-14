package android.app.privatecompute;

public final class PccEgressException extends java.lang.Exception implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.PccEgressException> CREATOR = null;
    public static final int ERROR_CONTENT_SENSITIVE = 3;
    public static final int ERROR_NO_RESPONSE_FROM_EGRESS_SERVICE = 2;
    public static final int ERROR_UNABLE_TO_DELIVER_REQUEST = 1;
    public static final int ERROR_UNKNOWN = -1;
    private final android.app.privatecompute.PccEgressException.SensitiveCategoryInfo mSensitiveCategoryInfo = null;
    private final int mStatusCode = 0;
    public PccEgressException(int p0) { super(); }
    public PccEgressException(int p0, android.app.privatecompute.PccEgressException.SensitiveCategoryInfo p1) { super(); }
    public PccEgressException(int p0, java.lang.String p1) { super(); }
    public PccEgressException(int p0, java.lang.String p1, android.app.privatecompute.PccEgressException.SensitiveCategoryInfo p2) { super(); }
    private PccEgressException(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public android.app.privatecompute.PccEgressException.SensitiveCategoryInfo getSensitiveCategoryInfo() { return null; }
    public int getStatusCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class SensitiveCategoryInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.privatecompute.PccEgressException.SensitiveCategoryInfo> CREATOR = null;
        public static final long FLAG_CATEGORY_BIOMETRICS = 64L;
        public static final long FLAG_CATEGORY_FINANCE = 8L;
        public static final long FLAG_CATEGORY_HEALTH = 1L;
        public static final long FLAG_CATEGORY_POLITICS = 2L;
        public static final long FLAG_CATEGORY_RACE = 16L;
        public static final long FLAG_CATEGORY_RELIGION = 4L;
        public static final long FLAG_CATEGORY_SEXUAL_ORIENTATION = 32L;
        public static final long FLAG_CATEGORY_TRADE_UNIONS = 128L;
        public static final long FLAG_CATEGORY_UNKNOWN = 256L;
        private final long mCategoriesBitmask = 0L;
        public SensitiveCategoryInfo(long p0) {}
        private SensitiveCategoryInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public long getApplicableCategories() { return 0L; }
        public boolean isCategoryDetected(long p0) { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SensitiveCategory {
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatusCode {
    }
}
