package android.text;

public final class ShowSecretsSetting {
    private static final int HIDE = 0;
    private static final int SHOW = 1;
    public static final long SPLIT_SHOW_PASSWORDS_TO_TOUCH_AND_PHYSICAL = 417951523L;
    private ShowSecretsSetting() {}
    public static java.lang.Runnable registerCallback(android.content.Context p0, java.lang.Runnable p1) { return null; }
    public static java.lang.Runnable registerCallback(android.content.Context p0, java.util.concurrent.Executor p1, java.lang.Runnable p2) { return null; }
    private static void setSettingValue(android.content.ContentResolver p0, java.lang.String p1, boolean p2, android.os.UserHandle p3) {}
    public static void setShouldShowPhysicalInput(android.content.Context p0, boolean p1) {}
    public static void setShouldShowTouchInput(android.content.Context p0, boolean p1) {}
    public static boolean shouldShowPhysicalInput(android.content.Context p0) { return false; }
    public static boolean shouldShowTouchInput(android.content.Context p0) { return false; }
}
