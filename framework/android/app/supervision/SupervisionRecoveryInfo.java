package android.app.supervision;

@android.annotation.SystemApi
public final class SupervisionRecoveryInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.supervision.SupervisionRecoveryInfo> CREATOR = null;
    public static final java.lang.String EXTRA_SUPERVISION_RECOVERY_INFO = "android.app.supervision.extra.SUPERVISION_RECOVERY_INFO";
    public static final int STATE_PENDING = 0;
    public static final int STATE_VERIFIED = 1;
    private android.os.PersistableBundle mAccountData;
    private java.lang.String mAccountName;
    private java.lang.String mAccountType;
    private int mState;
    public SupervisionRecoveryInfo(java.lang.String p0, java.lang.String p1, int p2, android.os.PersistableBundle p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.os.PersistableBundle getAccountData() { return null; }
    public java.lang.String getAccountName() { return null; }
    public java.lang.String getAccountType() { return null; }
    public int getState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}
