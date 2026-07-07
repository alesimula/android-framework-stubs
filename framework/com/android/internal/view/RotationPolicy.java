package com.android.internal.view;

public final class RotationPolicy {
    private static final int CURRENT_ROTATION = -1;
    public static final int NATURAL_ROTATION = 0;
    private static final java.lang.String TAG = "RotationPolicy";
    private RotationPolicy() {}
    public static boolean areAllRotationsAllowed(android.content.Context p0) { return false; }
    public static int getRotationLockOrientation(android.content.Context p0) { return 0; }
    public static boolean isRotationLockToggleVisible(android.content.Context p0) { return false; }
    public static boolean isRotationLocked(android.content.Context p0) { return false; }
    public static boolean isRotationSupported(android.content.Context p0) { return false; }
    public static void registerRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1) {}
    public static void registerRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1, int p2) {}
    public static void requestDeviceStateAutoRotateSettingChange(int p0, boolean p1) {}
    public static void setRotationAtAngleIfAllowed(int p0, java.lang.String p1) {}
    public static void setRotationLock(android.content.Context p0, boolean p1, java.lang.String p2) {}
    private static void setRotationLock(boolean p0, int p1, java.lang.String p2) {}
    public static void setRotationLockAtAngle(android.content.Context p0, boolean p1, int p2, java.lang.String p3) {}
    public static void setRotationLockForAccessibility(android.content.Context p0, boolean p1, java.lang.String p2) {}
    public static void unregisterRotationPolicyListener(android.content.Context p0, com.android.internal.view.RotationPolicy.RotationPolicyListener p1) {}
    public static boolean useCurrentRotationOnRotationLockChange(android.content.Context p0) { return false; }

    public static abstract class RotationPolicyListener {
        final android.database.ContentObserver mObserver = null;
        public RotationPolicyListener() {}
        public abstract void onChange();
    }
}
