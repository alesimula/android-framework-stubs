package android.security;

public class ConfirmationPrompt {
    private static final java.lang.String TAG = "ConfirmationPrompt";
    private android.security.ConfirmationCallback mCallback;
    private final android.security.apc.IConfirmationCallback mConfirmationCallback = null;
    private android.content.Context mContext;
    private java.util.concurrent.Executor mExecutor;
    private byte[] mExtraData;
    private java.lang.CharSequence mPromptText;
    private android.security.AndroidProtectedConfirmation mProtectedConfirmation;
    private ConfirmationPrompt(android.content.Context p0, java.lang.CharSequence p1, byte[] p2) {}
    private void doCallback(int p0, byte[] p1, android.security.ConfirmationCallback p2) {}
    private android.security.AndroidProtectedConfirmation getService() { return null; }
    private int getUiOptionsAsFlags() { return 0; }
    private static boolean isAccessibilityServiceRunning(android.content.Context p0) { return false; }
    public static boolean isSupported(android.content.Context p0) { return false; }
    public void cancelPrompt() {}
    public void presentPrompt(java.util.concurrent.Executor p0, android.security.ConfirmationCallback p1) throws android.security.ConfirmationAlreadyPresentingException, android.security.ConfirmationNotAvailableException {}

    public static final class Builder {
        private android.content.Context mContext;
        private byte[] mExtraData;
        private java.lang.CharSequence mPromptText;
        public Builder(android.content.Context p0) {}
        public android.security.ConfirmationPrompt build() { return null; }
        public android.security.ConfirmationPrompt.Builder setExtraData(byte[] p0) { return null; }
        public android.security.ConfirmationPrompt.Builder setPromptText(java.lang.CharSequence p0) { return null; }
    }
}
