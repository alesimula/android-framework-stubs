package com.android.internal.pm.pkg.component;

public interface ParsedUsesPermission {
    public static final int FLAG_NEVER_FOR_LOCATION = 65536;
    public static final int FLAG_ONLY_FOR_LOCATION_BUTTON = 131072;
    public java.util.Set<java.lang.String> getGeneralPurposes();
    public java.lang.String getName();
    public int getPurposeStringResource();
    public java.util.Set<java.lang.String> getPurposes();
    public int getUsesPermissionFlags();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UsesPermissionFlags {
    }
}
