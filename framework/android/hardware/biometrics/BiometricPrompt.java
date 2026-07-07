package android.hardware.biometrics;

public class BiometricPrompt implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricConstants {
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRMED = 1;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRM_NOT_REQUIRED = 4;
    public static final int DISMISSED_REASON_CONTENT_VIEW_MORE_OPTIONS = 8;
    public static final int DISMISSED_REASON_CREDENTIAL_CONFIRMED = 7;
    public static final int DISMISSED_REASON_ERROR = 5;
    public static final int DISMISSED_REASON_ERROR_NO_WM = 9;
    public static final int DISMISSED_REASON_FALLBACK_OPTION_BASE = 20;
    public static final int DISMISSED_REASON_FALLBACK_OPTION_MAX = 24;
    public static final int DISMISSED_REASON_NEGATIVE = 2;
    public static final int DISMISSED_REASON_SERVER_REQUESTED = 6;
    public static final int DISMISSED_REASON_USER_CANCEL = 3;
    @android.annotation.SystemApi
    public static final int FALLBACK_TYPE_IDENTITY_CHECK = 1;
    public static final int HIDE_DIALOG_DELAY = 2000;
    static final int MAX_FALLBACK_OPTIONS = 4;
    static final int MAX_LOGO_DESCRIPTION_CHARACTER_NUMBER = 30;
    private static final java.lang.String TAG = "BiometricPrompt";
    private android.hardware.biometrics.BiometricPrompt.AuthenticationCallback mAuthenticationCallback;
    private final android.hardware.biometrics.IBiometricServiceReceiver mBiometricServiceReceiver = null;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mContentViewMoreOptionsButtonInfo = null;
    private final android.content.Context mContext = null;
    private android.hardware.biometrics.BiometricPrompt.CryptoObject mCryptoObject;
    private java.util.concurrent.Executor mExecutor;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo[] mFallbackOptions = null;
    private boolean mIsPromptShowing;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mNegativeButtonInfo = null;
    private final android.hardware.biometrics.PromptInfo mPromptInfo = null;
    private final android.hardware.biometrics.IAuthService mService = null;
    private final android.os.IBinder mToken = null;
    private BiometricPrompt(android.content.Context p0, android.hardware.biometrics.PromptInfo p1, android.hardware.biometrics.BiometricPrompt.ButtonInfo p2, android.hardware.biometrics.BiometricPrompt.ButtonInfo p3, android.hardware.biometrics.BiometricPrompt.ButtonInfo[] p4, android.hardware.biometrics.IAuthService p5) {}
    private long authenticateInternal(long p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3, int p4) { return 0L; }
    private void authenticateInternal(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3, int p4) {}
    private void cancelAuthentication(long p0) {}
    private static android.graphics.Bitmap convertDrawableToBitmap(android.graphics.drawable.Drawable p0) { return null; }
    public static int getMaxFallbackOptions() { return 0; }
    private static boolean isCredentialAllowed(int p0) { return false; }
    public void authenticate(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3) {}
    public void authenticate(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2) {}
    public long authenticateForOperation(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, long p3) { return 0L; }
    public void authenticateUser(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, int p3) {}
    public int getAllowedAuthenticators() { return 0; }
    public java.util.List<java.lang.Integer> getAllowedSensorIds() { return null; }
    public android.hardware.biometrics.PromptContentView getContentView() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.util.List<android.hardware.biometrics.FallbackOption> getFallbackOptions() { return null; }
    public android.graphics.Bitmap getLogoBitmap() { return null; }
    public java.lang.String getLogoDescription() { return null; }
    public int getLogoRes() { return 0; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean isAllowBackgroundAuthentication() { return false; }
    public boolean isConfirmationRequired() { return false; }
    public boolean shouldUseDefaultSubtitle() { return false; }
    public boolean shouldUseDefaultTitle() { return false; }

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationAcquired(int p0) {}
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult p0) {}
        public void onSystemEvent(int p0) {}
    }

    public static class AuthenticationResult extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationResult {
        public AuthenticationResult(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, int p1) { super(); }
        public int getAuthenticationType() { return 0; }
        public android.hardware.biometrics.BiometricPrompt.CryptoObject getCryptoObject() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthenticationResultType {
    }

    public static class Builder {
        private android.hardware.biometrics.BiometricPrompt.ButtonInfo mContentViewMoreOptionsButtonInfo;
        private final android.content.Context mContext = null;
        private int mFallbackOptionCount;
        private final android.hardware.biometrics.BiometricPrompt.ButtonInfo[] mFallbackOptions = null;
        private android.hardware.biometrics.BiometricPrompt.ButtonInfo mNegativeButtonInfo;
        private final android.hardware.biometrics.PromptInfo mPromptInfo = null;
        private android.hardware.biometrics.IAuthService mService;
        public Builder(android.content.Context p0) {}
        private static boolean isValidIconType(int p0) { return false; }
        public android.hardware.biometrics.BiometricPrompt.Builder addFallbackOption(java.lang.CharSequence p0, int p1, java.util.concurrent.Executor p2, android.content.DialogInterface.OnClickListener p3) { return null; }
        public android.hardware.biometrics.BiometricPrompt build() { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowBackgroundAuthentication(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowBackgroundAuthentication(boolean p0, boolean p1) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowedAuthenticators(int p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowedSensorIds(java.util.List<java.lang.Integer> p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setContentView(android.hardware.biometrics.PromptContentView p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setDescription(java.lang.CharSequence p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setDisallowBiometricsIfPolicyExists(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.biometrics.BiometricPrompt.Builder setHideSystemFallbackOption(int p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setIgnoreEnrollmentState(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setIsForLegacyFingerprintManager(int p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoBitmap(android.graphics.Bitmap p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoDescription(java.lang.String p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoRes(int p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setRealCallerForConfirmDeviceCredentialActivity(android.content.ComponentName p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setReceiveSystemEvents(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setService(android.hardware.biometrics.IAuthService p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setShowEmergencyCallButton(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setTextForDeviceCredential(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setUseDefaultSubtitle() { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setUseDefaultTitle() { return null; }
    }

    static class ButtonInfo {
        java.util.concurrent.Executor executor;
        android.content.DialogInterface.OnClickListener listener;
        ButtonInfo(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) {}
    }

    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(long p0) { super(0L); }
        @java.lang.Deprecated
        public CryptoObject(android.security.identity.IdentityCredential p0) { super(0L); }
        public CryptoObject(android.security.identity.PresentationSession p0) { super(0L); }
        public CryptoObject(java.security.Signature p0) { super(0L); }
        public CryptoObject(javax.crypto.Cipher p0) { super(0L); }
        public CryptoObject(javax.crypto.KeyAgreement p0) { super(0L); }
        public CryptoObject(javax.crypto.Mac p0) { super(0L); }
        public javax.crypto.Cipher getCipher() { return null; }
        @java.lang.Deprecated
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
        public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
        public javax.crypto.Mac getMac() { return null; }
        public long getOperationHandle() { return 0L; }
        public android.security.identity.PresentationSession getPresentationSession() { return null; }
        public java.security.Signature getSignature() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DismissedReason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FallbackType {
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private final long mAuthRequestId = 0L;
        OnAuthenticationCancelListener(android.hardware.biometrics.BiometricPrompt p0, long p1) {}
        public void onCancel() {}
    }
}
