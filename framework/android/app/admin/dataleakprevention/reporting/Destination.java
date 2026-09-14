package android.app.admin.dataleakprevention.reporting;

public interface Destination {
    public static final int USER_AFFILIATED_STATE_AFFILIATED = 2;
    public static final int USER_AFFILIATED_STATE_OTHER = 3;
    public static final int USER_AFFILIATED_STATE_SELF = 1;
    public static final int USER_AFFILIATED_STATE_UNSPECIFIED = 0;
    public int getUserAffiliatedState();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserAffiliatedState {
    }
}
