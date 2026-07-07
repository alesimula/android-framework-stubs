package android.attention;

@android.annotation.SystemApi
public final class AttentionManager {
    @android.annotation.SystemApi
    public static final int INTERACTION_TYPE_ALL = -1;
    @android.annotation.SystemApi
    public static final int INTERACTION_TYPE_GESTURE = 4;
    @android.annotation.SystemApi
    public static final int INTERACTION_TYPE_HOVER = 2;
    @android.annotation.SystemApi
    public static final int INTERACTION_TYPE_KEY = 1;
    @android.annotation.SystemApi
    public static final int INTERACTION_TYPE_NONE = 0;
    private final android.attention.IAttentionManager mService = null;
    public AttentionManager(android.attention.IAttentionManager p0) {}
    @android.annotation.SystemApi
    public void clearInteractionListener() {}
    @android.annotation.SystemApi
    public void setInteractionListener(int p0, java.time.Duration p1, java.util.concurrent.Executor p2, java.util.function.Consumer<android.attention.InteractionInfo> p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InteractionType {
    }
}
