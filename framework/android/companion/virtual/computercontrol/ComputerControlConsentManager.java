package android.companion.virtual.computercontrol;

public interface ComputerControlConsentManager {
    public static final int ALLOWED = 1;
    public static final int DEFAULT = 2;
    public static final int NOT_ALLOWED = 3;
    public void clearAllUserConsents(int p0, java.lang.String p1);
    public int getUserConsent(int p0, java.lang.String p1, java.lang.String p2);
    public java.util.Map<java.lang.String, java.lang.Integer> getUserConsents(int p0, java.lang.String p1);
    public void setUserConsent(int p0, java.lang.String p1, java.lang.String p2, int p3);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConsentState {
    }
}
