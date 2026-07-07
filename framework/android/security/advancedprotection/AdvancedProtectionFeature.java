package android.security.advancedprotection;

@android.annotation.SystemApi
public final class AdvancedProtectionFeature implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.advancedprotection.AdvancedProtectionFeature> CREATOR = null;
    public static final int PROVISIONING_MODE_DEPROVISIONED_BY_ADB = 102;
    public static final int PROVISIONING_MODE_DEPROVISIONED_BY_DEFAULT = 100;
    public static final int PROVISIONING_MODE_DEPROVISIONED_BY_FEATURE_ADMIN = 101;
    public static final int PROVISIONING_MODE_PROVISIONED_BY_ADB = 2;
    public static final int PROVISIONING_MODE_PROVISIONED_BY_DEFAULT = 0;
    public static final int PROVISIONING_MODE_PROVISIONED_BY_FEATURE_ADMIN = 1;
    private final boolean mEnabled = false;
    private final int mId = 0;
    private final int mProvisioningMode = 0;
    @java.lang.Deprecated
    public AdvancedProtectionFeature(int p0) {}
    public AdvancedProtectionFeature(int p0, boolean p1, int p2) {}
    private AdvancedProtectionFeature(android.os.Parcel p0) {}
    public static boolean isFeatureProvisioned(int p0) { return false; }
    public int describeContents() { return 0; }
    public int getId() { return 0; }
    public int getProvisioningMode() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isProvisioned() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProvisioningMode {
    }
}
