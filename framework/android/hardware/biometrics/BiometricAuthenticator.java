package android.hardware.biometrics;

public interface BiometricAuthenticator {
    public static final int TYPE_ANY_BIOMETRIC = 14;
    public static final int TYPE_CREDENTIAL = 1;
    public static final int TYPE_FACE = 8;
    public static final int TYPE_FINGERPRINT = 2;
    public static final int TYPE_IRIS = 4;
    public static final int TYPE_NONE = 0;

    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {}
        public void onAuthenticationAcquired(int p0) {}
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
    }

    public static class AuthenticationResult {
        private int mAuthenticationType;
        private android.hardware.biometrics.CryptoObject mCryptoObject;
        private android.hardware.biometrics.BiometricAuthenticator.Identifier mIdentifier;
        private int mUserId;
        public AuthenticationResult() {}
        public AuthenticationResult(android.hardware.biometrics.CryptoObject p0, int p1, android.hardware.biometrics.BiometricAuthenticator.Identifier p2, int p3) {}
        public int getAuthenticationType() { return 0; }
        public android.hardware.biometrics.CryptoObject getCryptoObject() { return null; }
        public android.hardware.biometrics.BiometricAuthenticator.Identifier getId() { return null; }
        public int getUserId() { return 0; }
    }

    public static abstract class Identifier implements android.os.Parcelable {
        private int mBiometricId;
        private long mDeviceId;
        private java.lang.CharSequence mName;
        public Identifier() {}
        public Identifier(java.lang.CharSequence p0, int p1, long p2) {}
        public int getBiometricId() { return 0; }
        public long getDeviceId() { return 0L; }
        public java.lang.CharSequence getName() { return null; }
        public void setDeviceId(long p0) {}
        public void setName(java.lang.CharSequence p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modality {
    }
}
