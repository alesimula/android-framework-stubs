package android.security.keystore;

public interface UserAuthArgs {
    public long getBoundToSpecificSecureUserId();
    public int getUserAuthenticationType();
    public int getUserAuthenticationValidityDurationSeconds();
    public boolean isInvalidatedByBiometricEnrollment();
    public boolean isUnlockedDeviceRequired();
    public boolean isUserAuthenticationRequired();
    public boolean isUserAuthenticationValidWhileOnBody();
    public boolean isUserConfirmationRequired();
    public boolean isUserPresenceRequired();
}
