package com.android.internal.pm.pkg.component;

public interface ParsedPermission extends com.android.internal.pm.pkg.component.ParsedComponent {
    public java.lang.String getBackgroundPermission();
    public java.lang.String getGroup();
    public java.util.Set<java.lang.String> getKnownCerts();
    public com.android.internal.pm.pkg.component.ParsedPermissionGroup getParsedPermissionGroup();
    public int getProtectionLevel();
    public int getRequestRes();
    public int getRequiresGeneralPurposeTargetSdkVersion();
    public int getRequiresPurposeStringTargetSdkVersion();
    public int getRequiresPurposeTargetSdkVersion();
    public java.util.List<com.android.internal.pm.pkg.component.ParsedValidGeneralPurpose> getValidGeneralPurposes();
    public java.util.List<com.android.internal.pm.pkg.component.ParsedValidPurpose> getValidPurposes();
    public boolean isTree();
}
