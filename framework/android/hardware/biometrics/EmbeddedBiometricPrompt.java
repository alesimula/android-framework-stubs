package android.hardware.biometrics;

public final class EmbeddedBiometricPrompt implements android.hardware.biometrics.BiometricPrompt.EmbeddedPromptDelegate {
    private static final java.lang.String KEY_EMBEDDED_CONTENT_VIEW_STATE = "embedded_content_view_state";
    public static final int START_MODE_DEFERRED = 2;
    public static final int START_MODE_IMMEDIATE = 0;
    public static final int START_MODE_IMMEDIATE_UNLESS_OCCLUDED = 1;
    private static final java.lang.String TAG = "EmbeddedBiometricPrompt";
    private android.app.Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    private volatile boolean mAuthenticated;
    private android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback mAuthenticationCallback;
    private final android.hardware.biometrics.BiometricPrompt mBiometricPrompt = null;
    private final android.content.Context mContext = null;
    private int mCornerRadius;
    private android.os.IBinder mCurrentHostToken;
    private int mCurrentRotation;
    private android.view.View mEmbeddedContent;
    private android.hardware.biometrics.EmbeddedBiometricPrompt.EmbeddedContentFactory mEmbeddedContentFactory;
    private int mEmbeddedContentHeight;
    private android.view.View.OnLayoutChangeListener mEmbeddedContentLayoutChangeListener;
    private int mEmbeddedContentWidth;
    private boolean mHasReportedSurfacePackage;
    private final android.hardware.biometrics.IAuthService mService = null;
    private android.view.SurfaceControlViewHost mSurfaceControlViewHost;
    private EmbeddedBiometricPrompt(android.hardware.biometrics.BiometricPrompt p0, android.content.Context p1, android.hardware.biometrics.IAuthService p2, android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback p3) {}
    private void matchStyle() {}
    private void registerActivityLifecycleCallbacks() {}
    private void removeEmbeddedContentIfNeeded() {}
    private void saveEmbeddedContentState() {}
    private void showEmbeddedContent(int p0, android.os.IBinder p1, int p2, int p3) {}
    private void unregisterActivityLifecycleCallbacks() {}
    public int getAllowedAuthenticators() { return 0; }
    public android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback getAuthenticationCallback() { return null; }
    public java.util.concurrent.Executor getAuthenticationExecutor() { return null; }
    public int getAuthenticationPurpose() { return 0; }
    public android.hardware.biometrics.PromptContentView getContentView() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public android.hardware.biometrics.EmbeddedBiometricPrompt.EmbeddedContentFactory getEmbeddedContentFactory() { return null; }
    public long getExistingAuthSessionId() { return 0L; }
    public java.util.List<android.hardware.biometrics.FallbackOption> getFallbackOptions() { return null; }
    public android.graphics.Bitmap getLogoBitmap() { return null; }
    public java.lang.String getLogoDescription() { return null; }
    public int getLogoRes() { return 0; }
    public android.content.DialogInterface.OnClickListener getNegativeButton() { return null; }
    public java.util.concurrent.Executor getNegativeButtonExecutor() { return null; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public int getNextTranslationOffset() { return 0; }
    public int getPreviousTranslationOffset() { return 0; }
    public android.hardware.biometrics.BiometricPromptStyleSpec getStyleSpec() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean isBackgroundAuthenticationAllowed() { return false; }
    public boolean isConfirmationRequired() { return false; }
    public void onAuthenticationFinished() {}
    public void onAuthenticationSucceeded() {}
    public void onHostTokenAvailable(int p0, android.os.IBinder p1, int p2, int p3) {}
    public void onSessionStarted(long p0) {}
    public void onStyleUpdated(android.hardware.biometrics.BiometricPromptStyleSpec p0) {}
    public void pauseAuthentication() {}
    public void restoreEmbeddedContentState(long p0) {}
    public void resumeAuthentication() {}
    public void setNextTranslationOffset(int p0) {}
    public void setSurfaceControlViewHost(android.view.SurfaceControlViewHost p0, android.os.IBinder p1) {}
    public void startAuthenticationSession(android.os.CancellationSignal p0, int p1, java.util.concurrent.Executor p2, android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback p3) {}

    public static interface EmbeddedContentFactory {
        public android.view.View createView(android.content.Context p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartMode {
    }

    public static abstract class AuthenticationCallback {
        public AuthenticationCallback() {}
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationPaused() {}
        public void onAuthenticationResumed() {}
        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult p0) {}
        public void onBackPressed() {}
        public void onSessionStarted(long p0) {}
        public void onTappedOutside() {}
    }

    public static final class Builder {
        private android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback mAuthenticationCallback;
        private final android.content.Context mContext = null;
        private android.hardware.biometrics.EmbeddedBiometricPrompt.EmbeddedContentFactory mEmbeddedContentFactory;
        private java.util.concurrent.Executor mExecutor;
        private long mExistingAuthSessionId;
        private final android.hardware.biometrics.BiometricPrompt.Builder mPromptBuilder = null;
        public Builder(android.content.Context p0) {}
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder addFallbackOption(java.lang.CharSequence p0, int p1, java.util.concurrent.Executor p2, android.content.DialogInterface.OnClickListener p3) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt build() { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setAllowedAuthenticators(int p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setAuthenticationCallback(java.util.concurrent.Executor p0, android.hardware.biometrics.EmbeddedBiometricPrompt.AuthenticationCallback p1) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setAuthenticationPurpose(int p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setBackgroundAuthenticationAllowed(boolean p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setConfirmationRequired(boolean p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setContentView(android.hardware.biometrics.PromptContentView p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setEmbeddedContentFactory(android.hardware.biometrics.EmbeddedBiometricPrompt.EmbeddedContentFactory p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setExistingAuthSessionId(long p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setLogoBitmap(android.graphics.Bitmap p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setLogoDescription(java.lang.String p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setLogoRes(int p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setNegativeButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setNextTranslationOffset(int p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setPreviousTranslationOffset(int p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setService(android.hardware.biometrics.IAuthService p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.EmbeddedBiometricPrompt.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}
