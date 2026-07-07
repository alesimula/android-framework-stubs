package android.app.privatecompute;

public final class MigrationRequestResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.privatecompute.MigrationRequestResult> CREATOR = null;
    public static final int MIGRATION_REQUEST_ACCEPTED = 1;
    public static final int MIGRATION_REQUEST_REJECTED = 2;
    private final android.os.PersistableBundle mExtras = null;
    private final int mStatus = 0;
    public MigrationRequestResult(int p0, android.os.PersistableBundle p1) {}
    private MigrationRequestResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.os.PersistableBundle getExtras() { return null; }
    public int getStatus() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MigrationStatus {
    }
}
