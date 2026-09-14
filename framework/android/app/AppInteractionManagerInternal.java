package android.app;

public interface AppInteractionManagerInternal {
    public static final int ACCESS_ALLOWED = 0;
    public static final int ACCESS_DENIED = 2;
    public static final int ACCESS_REQUESTABLE = 1;
    public int checkAccess(java.lang.String p0, java.lang.String p1, int p2);
    public android.content.IntentSender createRequestAccessIntentSender(java.lang.String p0, java.lang.String[] p1, int p2, int p3, java.util.concurrent.Executor p4, java.util.function.Consumer<int[]> p5);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CheckAccessResult {
    }
}
