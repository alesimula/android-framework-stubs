package com.android.internal.accessibility.dialog;

public final class AccessibilityTargetHelper {
    private static java.lang.Boolean sSupportOneHandedModeForTesting;
    private AccessibilityTargetHelper() {}
    private static com.android.internal.accessibility.dialog.AccessibilityTarget createAccessibilityServiceTarget(android.content.Context p0, int p1, android.accessibilityservice.AccessibilityServiceInfo p2) { return null; }
    private static java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> getAccessibilityActivityTargets(android.content.Context p0, int p1) { return null; }
    private static java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> getAccessibilityServiceTargets(android.content.Context p0, int p1) { return null; }
    private static java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> getAllowListingFeatureTargets(android.content.Context p0, int p1) { return null; }
    public static java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> getInstalledTargets(android.content.Context p0, int p1) { return null; }
    public static java.util.List<com.android.internal.accessibility.dialog.AccessibilityTarget> getTargets(android.content.Context p0, int p1) { return null; }
    public static boolean isAccessibilityServiceTargetAllowed(android.content.Context p0, android.accessibilityservice.AccessibilityServiceInfo p1) { return false; }
    private static boolean isOneHandedModeSupported() { return false; }
    public static boolean isValidServiceTarget(android.accessibilityservice.AccessibilityServiceInfo p0, int p1) { return false; }
    public static boolean sendRestrictedDialogIntent(android.content.Context p0, android.accessibilityservice.AccessibilityServiceInfo p1) { return false; }
    public static void setSupportOneHandedModeForTesting(java.lang.Boolean p0) {}
}
