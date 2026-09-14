package android.service.personalcontext.embedded;

public interface InsightVisualizerSession extends java.lang.AutoCloseable {
    public static final int CLOSE_REASON_CLIENT_DISCONNECTED = 2;
    public static final int CLOSE_REASON_ERROR = 4;
    public static final int CLOSE_REASON_UNKNOWN = 0;
    public static final int CLOSE_REASON_USER_BUTTON_PRESS = 1;
    public static final int CLOSE_REASON_VISUALIZER_DECISION = 3;
    public void close();
    default public void close(int p0) {}
    public android.widget.RemoteViews createRemoteViewsForHints(java.util.Set<android.app.personalcontext.hint.ContextHint> p0, android.service.personalcontext.embedded.InsightVisualizerClientConfig p1);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CloseReason {
    }
}
