package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class FrontendStatusReadiness {
    public static final int FRONTEND_STATUS_READINESS_STABLE = 3;
    public static final int FRONTEND_STATUS_READINESS_UNAVAILABLE = 1;
    public static final int FRONTEND_STATUS_READINESS_UNDEFINED = 0;
    public static final int FRONTEND_STATUS_READINESS_UNSTABLE = 2;
    public static final int FRONTEND_STATUS_READINESS_UNSUPPORTED = 4;
    private int mFrontendStatusType;
    private int mStatusReadiness;
    private FrontendStatusReadiness(int p0, int p1) {}
    public int getStatusReadiness() { return 0; }
    public int getStatusType() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Readiness {
    }
}
