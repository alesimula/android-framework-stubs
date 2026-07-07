package android.os;

public class SecurityStateManager {
    public static final java.lang.String KEY_KERNEL_VERSION = "kernel_version";
    public static final java.lang.String KEY_SYSTEM_SPL = "system_spl";
    public static final java.lang.String KEY_SYSTEM_SUPPLEMENTAL_PATCHES = "system_supplemental_security_patches";
    public static final java.lang.String KEY_VENDOR_SPL = "vendor_spl";
    public static final java.lang.String KEY_VENDOR_SUPPLEMENTAL_PATCHES = "vendor_supplemental_security_patches";
    private final android.os.ISecurityStateManager mService = null;
    public SecurityStateManager(android.os.ISecurityStateManager p0) {}
    public android.os.Bundle getGlobalSecurityState() { return null; }
}
