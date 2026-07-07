package com.android.internal.pm.parsing.pkg;

public interface AndroidPackageInternal extends com.android.server.pm.pkg.AndroidPackage, com.android.internal.content.om.OverlayConfig.PackageProvider.Package {
    public java.lang.String[] getUsesLibrariesSorted();
    public java.lang.String[] getUsesOptionalLibrariesSorted();
    public java.lang.String[] getUsesSdkLibrariesSorted();
    public java.lang.String[] getUsesStaticLibrariesSorted();
}
