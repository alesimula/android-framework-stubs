package com.android.internal.pm.parsing.pkg;

public interface AndroidPackageHidden {
    public java.lang.String getPrimaryCpuAbi();
    public java.lang.String getSecondaryCpuAbi();
    @java.lang.Deprecated
    public int getVersionCode();
    public int getVersionCodeMajor();
    public boolean isOdm();
    public boolean isOem();
    public boolean isPrivileged();
    public boolean isProduct();
    public boolean isSystem();
    public boolean isSystemExt();
    public boolean isVendor();
    public android.content.pm.ApplicationInfo toAppInfoWithoutState();
}
