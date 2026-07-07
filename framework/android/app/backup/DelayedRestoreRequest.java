package android.app.backup;

@android.annotation.SystemApi
public final class DelayedRestoreRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.backup.DelayedRestoreRequest> CREATOR = null;
    private static final java.util.Set<java.lang.Integer> TYPES_REQUIRING_PACKAGE_NAME = null;
    public static final int TYPE_APP_INSTALL = 1;
    public static final int TYPE_APP_UPDATE = 2;
    public static final int TYPE_MANAGED_PROFILE_PROVISIONED = 4;
    public static final int TYPE_SETUP_COMPLETE = 3;
    private static final java.util.Set<java.lang.Integer> VALID_TYPES = null;
    private final java.lang.String mPackageName = null;
    private final int mType = 0;
    private DelayedRestoreRequest(int p0, java.lang.String p1) {}
    private DelayedRestoreRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getPackageName() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mPackageName;
        private final int mType = 0;
        public Builder(int p0) {}
        public android.app.backup.DelayedRestoreRequest build() { return null; }
        public android.app.backup.DelayedRestoreRequest.Builder setPackageName(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}
