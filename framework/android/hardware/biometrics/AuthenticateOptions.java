package android.hardware.biometrics;

public interface AuthenticateOptions {
    public static final int DISPLAY_STATE_AOD = 4;
    public static final int DISPLAY_STATE_LOCKSCREEN = 1;
    public static final int DISPLAY_STATE_NO_UI = 2;
    public static final int DISPLAY_STATE_SCREENSAVER = 3;
    public static final int DISPLAY_STATE_UNKNOWN = 0;
    public java.lang.String getAttributionTag();
    public int getDisplayState();
    public java.lang.String getOpPackageName();
    public int getSensorId();
    public int getUserId();
    public boolean isMandatoryBiometrics();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DisplayState {
    }
}
