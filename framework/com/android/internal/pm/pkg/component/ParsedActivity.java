package com.android.internal.pm.pkg.component;

public interface ParsedActivity extends com.android.internal.pm.pkg.component.ParsedMainComponent {
    public int getColorMode();
    public int getConfigChanges();
    public int getDocumentLaunchMode();
    public java.util.Set<java.lang.String> getKnownActivityEmbeddingCerts();
    public int getLaunchMode();
    public int getLockTaskLaunchMode();
    public float getMaxAspectRatio();
    public int getMaxRecents();
    public float getMinAspectRatio();
    public java.lang.String getParentActivityName();
    public java.lang.String getPermission();
    public int getPersistableMode();
    public int getPrivateFlags();
    public java.lang.String getRequestedVrComponent();
    public int getRequireContentUriPermissionFromCaller();
    public java.lang.String getRequiredDisplayCategory();
    public int getResizeMode();
    public int getRotationAnimation();
    public int getScreenOrientation();
    public int getSoftInputMode();
    public java.lang.String getTargetActivity();
    public java.lang.String getTaskAffinity();
    public int getTheme();
    public int getUiOptions();
    public android.content.pm.ActivityInfo.WindowLayout getWindowLayout();
    public boolean isSupportsSizeChanges();
}
