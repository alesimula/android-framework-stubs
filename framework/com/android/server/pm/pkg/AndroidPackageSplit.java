package com.android.server.pm.pkg;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.SYSTEM_SERVER)
public interface AndroidPackageSplit {
    public java.lang.String getClassLoaderName();
    public java.util.List<com.android.server.pm.pkg.AndroidPackageSplit> getDependencies();
    public java.lang.String getName();
    public java.lang.String getPath();
    public int getRevisionCode();
    public boolean isHasCode();
}
