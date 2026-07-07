package android.hardware.biometrics;

public class IdentityCheckInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.IdentityCheckInfo> CREATOR = null;
    public static final int IDENTITY_CHECK_AUTHENTICATORS_INVALID = 1;
    public static final int IDENTITY_CHECK_DEVICE_IN_TRUSTED_LOCATION = 5;
    public static final int IDENTITY_CHECK_REQUIREMENTS_NOT_SATISFIED = 3;
    public static final int IDENTITY_CHECK_STRONG_BIOMETRICS_NOT_ENROLLED = 4;
    public static final int IDENTITY_CHECK_TOGGLE_DISABLED = 2;
    private boolean mClearIdentityCheckFallbackOption;
    private boolean mDeviceCredentialAndIdentityCheck;
    private boolean mIdentityCheckActive;
    private int mIdentityCheckInactiveReason;
    public IdentityCheckInfo() {}
    protected IdentityCheckInfo(android.os.Parcel p0) {}
    public void clearIdentityCheckFallbackOption() {}
    public int describeContents() { return 0; }
    public int getIdentityCheckInactiveReason() { return 0; }
    public boolean isClearIdentityCheckFallbackOption() { return false; }
    public boolean isDeviceCredentialAndIdentityCheckRequested() { return false; }
    public boolean isIdentityCheckActive() { return false; }
    public void setDeviceCredentialAndIdentityCheck(boolean p0) {}
    public void setIdentityCheckActive(boolean p0) {}
    public void setIdentityCheckInactiveReason(int p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface IdentityCheckInactiveReason {
    }
}
