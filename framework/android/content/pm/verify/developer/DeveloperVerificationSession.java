package android.content.pm.verify.developer;

@android.annotation.SystemApi
public final class DeveloperVerificationSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.verify.developer.DeveloperVerificationSession> CREATOR = null;
    public static final int DEVELOPER_VERIFICATION_BYPASSED_REASON_ADB = 1;
    public static final int DEVELOPER_VERIFICATION_BYPASSED_REASON_EMERGENCY = 2;
    public static final int DEVELOPER_VERIFICATION_BYPASSED_REASON_TEST = 3;
    public static final int DEVELOPER_VERIFICATION_BYPASSED_REASON_UNSPECIFIED = 0;
    public static final int DEVELOPER_VERIFICATION_INCOMPLETE_NETWORK_UNAVAILABLE = 1;
    public static final int DEVELOPER_VERIFICATION_INCOMPLETE_UNKNOWN = 0;
    public static final int FLAG_VERIFICATION_FORCED_ON_ADB = 2;
    public static final int FLAG_VERIFICATION_IS_ADB = 1;
    private final java.util.List<android.content.pm.SharedLibraryInfo> mDeclaredLibraries = null;
    private final android.os.PersistableBundle mExtensionParams = null;
    private final int mId = 0;
    private final int mInstallSessionId = 0;
    private final java.lang.String mPackageName = null;
    private volatile int mPolicy;
    private final android.content.pm.verify.developer.IDeveloperVerificationSessionInterface mSession = null;
    private final android.content.pm.SigningInfo mSigningInfo = null;
    private final android.net.Uri mStagedPackageUri = null;
    private final int mVerificationFlags = 0;
    public DeveloperVerificationSession(int p0, int p1, java.lang.String p2, android.net.Uri p3, android.content.pm.SigningInfo p4, java.util.List<android.content.pm.SharedLibraryInfo> p5, android.os.PersistableBundle p6, int p7, android.content.pm.verify.developer.IDeveloperVerificationSessionInterface p8) {}
    public DeveloperVerificationSession(int p0, int p1, java.lang.String p2, android.net.Uri p3, android.content.pm.SigningInfo p4, java.util.List<android.content.pm.SharedLibraryInfo> p5, android.os.PersistableBundle p6, int p7, android.content.pm.verify.developer.IDeveloperVerificationSessionInterface p8, int p9) {}
    private DeveloperVerificationSession(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.time.Duration extendTimeout(java.time.Duration p0) { return null; }
    public java.util.List<android.content.pm.SharedLibraryInfo> getDeclaredLibraries() { return null; }
    public android.os.PersistableBundle getExtensionParams() { return null; }
    public int getId() { return 0; }
    public int getInstallSessionId() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public int getPolicy() { return 0; }
    public android.content.pm.SigningInfo getSigningInfo() { return null; }
    public android.net.Uri getStagedPackageUri() { return null; }
    public java.time.Instant getTimeoutTime() { return null; }
    public int getVerificationFlags() { return 0; }
    public void reportVerificationBypassed(int p0) {}
    public void reportVerificationComplete(android.content.pm.verify.developer.DeveloperVerificationStatus p0) {}
    public void reportVerificationComplete(android.content.pm.verify.developer.DeveloperVerificationStatus p0, android.os.PersistableBundle p1) {}
    public void reportVerificationIncomplete(int p0) {}
    public boolean setPolicy(int p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeveloperVerificationIncompleteReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerificationFlags {
    }
}
