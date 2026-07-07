package android.content.pm.verify.developer;

@android.annotation.SystemApi
public abstract class DeveloperVerifierService extends android.app.Service {
    public DeveloperVerifierService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onPackageNameAvailable(java.lang.String p0);
    public abstract void onVerificationCancelled(java.lang.String p0);
    public abstract void onVerificationRequired(android.content.pm.verify.developer.DeveloperVerificationSession p0);
    public abstract void onVerificationRetry(android.content.pm.verify.developer.DeveloperVerificationSession p0);
    public abstract void onVerificationTimeout(int p0);
}
