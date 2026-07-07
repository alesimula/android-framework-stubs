package android.content.pm;

public class PermissionInfo extends android.content.pm.PackageItemInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PermissionInfo> CREATOR = null;
    public static final int FLAG_ALLOWED_IN_PRIVATE_COMPUTE_CORE = 32;
    public static final int FLAG_COSTS_MONEY = 1;
    public static final int FLAG_HARD_RESTRICTED = 4;
    public static final int FLAG_IMMUTABLY_RESTRICTED = 16;
    public static final int FLAG_INSTALLED = 1073741824;
    @android.annotation.SystemApi
    public static final int FLAG_REMOVED = 2;
    public static final int FLAG_SOFT_RESTRICTED = 8;
    @android.annotation.SystemApi
    public static final int NO_TARGET_SDK_VERSION = 2147483647;
    public static final int PROTECTION_DANGEROUS = 1;
    public static final int PROTECTION_FLAG_APPOP = 64;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_APP_PREDICTOR = 2097152;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_COMPANION = 8388608;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_CONFIGURATOR = 524288;
    public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_DOCUMENTER = 262144;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_INCIDENT_REPORT_APPROVER = 1048576;
    public static final int PROTECTION_FLAG_INSTALLER = 256;
    public static final int PROTECTION_FLAG_INSTANT = 4096;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_KNOWN_SIGNER = 134217728;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_MODULE = 4194304;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_OEM = 16384;
    public static final int PROTECTION_FLAG_PRE23 = 128;
    public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
    public static final int PROTECTION_FLAG_PRIVILEGED = 16;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_RECENTS = 33554432;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_RETAIL_DEMO = 16777216;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_ROLE = 67108864;
    public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
    public static final int PROTECTION_FLAG_SETUP = 2048;
    @java.lang.Deprecated
    public static final int PROTECTION_FLAG_SYSTEM = 16;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_SYSTEM_TEXT_CLASSIFIER = 65536;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_VENDOR_PRIVILEGED = 32768;
    public static final int PROTECTION_FLAG_VERIFIER = 512;
    @android.annotation.SystemApi
    public static final int PROTECTION_FLAG_WELLBEING = 131072;
    public static final int PROTECTION_INTERNAL = 4;
    @java.lang.Deprecated
    public static final int PROTECTION_MASK_BASE = 15;
    @java.lang.Deprecated
    public static final int PROTECTION_MASK_FLAGS = 65520;
    public static final int PROTECTION_NORMAL = 0;
    public static final int PROTECTION_SIGNATURE = 2;
    @java.lang.Deprecated
    public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
    private static final com.android.internal.util.Parcelling.BuiltIn.ForStringSet sForStringSet = null;
    @android.annotation.SystemApi
    public final java.lang.String backgroundPermission = null;
    public int descriptionRes;
    public int flags;
    public java.lang.String group;
    @android.annotation.SystemApi
    public java.util.Set<java.lang.String> knownCerts;
    public java.lang.CharSequence nonLocalizedDescription;
    @java.lang.Deprecated
    public int protectionLevel;
    @android.annotation.SystemApi
    public int requestRes;
    @android.annotation.SystemApi
    public int requiresGeneralPurposeTargetSdkVersion;
    @android.annotation.SystemApi
    public int requiresPurposeStringTargetSdkVersion;
    @android.annotation.SystemApi
    public int requiresPurposeTargetSdkVersion;
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.content.pm.ValidGeneralPurposeInfo> validGeneralPurposes;
    @android.annotation.SystemApi
    public java.util.Map<java.lang.String, android.content.pm.ValidPurposeInfo> validPurposes;
    @java.lang.Deprecated
    public PermissionInfo() { super(); }
    @java.lang.Deprecated
    public PermissionInfo(android.content.pm.PermissionInfo p0) { super(); }
    private PermissionInfo(android.os.Parcel p0) { super(); }
    public PermissionInfo(java.lang.String p0) { super(); }
    public static int fixProtectionLevel(int p0) { return 0; }
    public static java.lang.String flagsToString(int p0) { return null; }
    public static java.lang.String protectionToString(int p0) { return null; }
    private void readValidGeneralPurposes(android.os.Parcel p0) {}
    private void readValidPurposes(android.os.Parcel p0) {}
    private void writeValidGeneralPurposes(android.os.Parcel p0) {}
    private void writeValidPurposes(android.os.Parcel p0) {}
    public int calculateFootprint() { return 0; }
    public int describeContents() { return 0; }
    public int getProtection() { return 0; }
    public int getProtectionFlags() { return 0; }
    public boolean isAllowedInPrivateComputeCore() { return false; }
    public boolean isAppOp() { return false; }
    public boolean isHardRestricted() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isRuntime() { return false; }
    public boolean isSoftRestricted() { return false; }
    public java.lang.CharSequence loadDescription(android.content.pm.PackageManager p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Protection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProtectionFlags {
    }
}
