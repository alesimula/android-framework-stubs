package android.app.admin.dataleakprevention;

public interface DestinationMatcher {
    public static final int USER_AFFILIATED_STATE_AFFILIATED = 2;
    public static final int USER_AFFILIATED_STATE_OTHER = 3;
    public static final int USER_AFFILIATED_STATE_SELF = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserAffiliatedState {
    }
}
