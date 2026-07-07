package com.android.internal.pm.pkg.component;

public interface ParsedComponent {
    public int getBanner();
    public android.content.ComponentName getComponentName();
    public int getDescriptionRes();
    public int getFlags();
    public int getIcon();
    public java.util.List<com.android.internal.pm.pkg.component.ParsedIntentInfo> getIntents();
    public int getLabelRes();
    public int getLogo();
    public android.os.Bundle getMetaData();
    public java.lang.String getName();
    public java.lang.CharSequence getNonLocalizedLabel();
    public java.lang.String getPackageName();
    public java.util.Map<java.lang.String, android.content.pm.PackageManager.Property> getProperties();
}
