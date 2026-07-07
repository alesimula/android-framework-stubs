package com.android.internal.pm.parsing;

public interface IPackageCacher {
    public void cacheResult(java.io.File p0, int p1, com.android.internal.pm.parsing.pkg.ParsedPackage p2);
    public com.android.internal.pm.parsing.pkg.ParsedPackage getCachedResult(java.io.File p0, int p1);
}
