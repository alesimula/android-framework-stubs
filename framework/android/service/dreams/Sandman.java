package android.service.dreams;

public final class Sandman {
    private static final java.lang.String TAG = "Sandman";
    private Sandman() {}
    private static boolean isScreenSaverActivatedOnDock(android.content.Context p0) { return false; }
    private static boolean isScreenSaverEnabled(android.content.Context p0) { return false; }
    public static boolean shouldStartDockApp(android.content.Context p0, android.content.Intent p1) { return false; }
    private static void startDream(android.content.Context p0, boolean p1) {}
    public static void startDreamByUserRequest(android.content.Context p0) {}
    public static void startDreamWhenDockedIfAppropriate(android.content.Context p0) {}
}
