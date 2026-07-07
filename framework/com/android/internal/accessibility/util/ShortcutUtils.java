package com.android.internal.accessibility.util;

public final class ShortcutUtils {
    private static final java.lang.String TAG = "AccessibilityShortcutUtils";
    private static final android.text.TextUtils.SimpleStringSplitter sStringColonSplitter = null;
    private ShortcutUtils() {}
    public static java.lang.String convertToKey(int p0) { return null; }
    public static int convertToType(java.lang.String p0) { return 0; }
    public static int getButtonMode(android.content.Context p0, int p1) { return 0; }
    public static int getEnabledShortcutTypes(android.content.Context p0, java.lang.String p1) { return 0; }
    private static int getKeyCodeFromTarget(android.content.Context p0, java.lang.String p1) { return 0; }
    public static java.lang.String getKeyCodeLabelFromTarget(android.content.Context p0, java.lang.String p1) { return null; }
    public static java.lang.String getLabelFromKeyCode(android.content.Context p0, int p1) { return null; }
    public static java.lang.String getScreenReaderTargetName(android.content.Context p0) { return null; }
    public static java.lang.String getSelectToSpeakTargetName(android.content.Context p0) { return null; }
    public static java.util.Set<java.lang.String> getShortcutTargetsFromSettings(android.content.Context p0, int p1, int p2) { return null; }
    private static java.lang.String getTargetFromKeyCode(android.content.Context p0, int p1) { return null; }
    public static java.lang.String getTargetFromKeyGestureEvent(android.content.Context p0, android.hardware.input.KeyGestureEvent p1) { return null; }
    public static java.lang.String getVoiceAccessTargetName(android.content.Context p0) { return null; }
    public static boolean isComponentIdExistingInSettings(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public static boolean isShortcutContained(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    @java.lang.Deprecated
    public static void optInValueToSettings(android.content.Context p0, int p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public static void optOutValueFromSettings(android.content.Context p0, int p1, java.lang.String p2) {}
    public static boolean setButtonMode(android.content.Context p0, int p1, int p2) { return false; }
    public static int typeToString(int p0) { return 0; }
    public static void updateInvisibleToggleAccessibilityServiceEnableState(android.content.Context p0, java.util.Set<java.lang.String> p1, int p2) {}
}
