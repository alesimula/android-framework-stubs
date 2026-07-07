package android.credentials;

public final class CredentialManager {
    private static final java.lang.String DEVICE_CONFIG_ENABLE_CREDENTIAL_DESC_API = "enable_credential_description_api";
    public static final java.lang.String DEVICE_CONFIG_ENABLE_CREDENTIAL_MANAGER = "enable_credential_manager";
    public static final java.lang.String EXTRA_AUTOFILL_RESULT_RECEIVER = "android.credentials.AUTOFILL_RESULT_RECEIVER";
    private static final android.os.Bundle OPTIONS_SENDER_BAL_OPTIN = null;
    public static final int PROVIDER_FILTER_ALL_PROVIDERS = 0;
    public static final int PROVIDER_FILTER_SYSTEM_PROVIDERS_ONLY = 1;
    public static final int PROVIDER_FILTER_USER_PROVIDERS_INCLUDING_HIDDEN = 3;
    public static final int PROVIDER_FILTER_USER_PROVIDERS_ONLY = 2;
    public static final java.lang.String TAG = "CredentialManager";
    private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
    private final android.credentials.ICredentialManager mService = null;
    public CredentialManager(android.content.Context p0, android.credentials.ICredentialManager p1) {}
    private java.lang.String getOpPackageName() { return null; }
    private boolean isCredentialDescriptionApiEnabled() { return false; }
    public static boolean isCredentialDescriptionApiEnabled(android.content.Context p0) { return false; }
    private boolean isServiceEnabled() { return false; }
    public static boolean isServiceEnabled(android.content.Context p0) { return false; }
    public void clearCredentialState(android.credentials.ClearCredentialStateRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> p3) {}
    public void createCredential(android.content.Context p0, android.credentials.CreateCredentialRequest p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> p4) {}
    public void getCandidateCredentials(android.credentials.GetCredentialRequest p0, java.lang.String p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.GetCandidateCredentialsResponse, android.credentials.GetCandidateCredentialsException> p4, android.os.IBinder p5) {}
    public void getCredential(android.content.Context p0, android.credentials.GetCredentialRequest p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p4) {}
    public void getCredential(android.content.Context p0, android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p4) {}
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServices(int p0, int p1) { return null; }
    public java.util.List<android.credentials.CredentialProviderInfo> getCredentialProviderServicesForTesting(int p0) { return null; }
    public boolean isEnabledCredentialProviderService(android.content.ComponentName p0) { return false; }
    public void prepareGetCredential(android.credentials.GetCredentialRequest p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> p3) {}
    public void registerCredentialDescription(android.credentials.RegisterCredentialDescriptionRequest p0) {}
    public void setEnabledProviders(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, int p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<java.lang.Void, android.credentials.SetEnabledProvidersException> p4) {}
    public void unregisterCredentialDescription(android.credentials.UnregisterCredentialDescriptionRequest p0) {}

    private static class ClearCredentialStateTransport extends android.credentials.IClearCredentialStateCallback.Stub {
        private android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> mCallback;
        private final java.util.concurrent.Executor mExecutor = null;
        private ClearCredentialStateTransport(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.credentials.ClearCredentialStateException> p1) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onSuccess() {}
    }

    private static class CreateCredentialTransport extends android.credentials.ICreateCredentialCallback.Stub {
        private android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> mCallback;
        private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private CreateCredentialTransport(android.content.Context p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.credentials.CreateCredentialResponse, android.credentials.CreateCredentialException> p2) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.CreateCredentialResponse p0) {}
    }

    private static class GetCandidateCredentialsTransport extends android.credentials.IGetCandidateCredentialsCallback.Stub {
        private android.os.OutcomeReceiver<android.credentials.GetCandidateCredentialsResponse, android.credentials.GetCandidateCredentialsException> mCallback;
        private final java.util.concurrent.Executor mExecutor = null;
        private GetCandidateCredentialsTransport(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.credentials.GetCandidateCredentialsResponse, android.credentials.GetCandidateCredentialsException> p1) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onResponse(android.credentials.GetCandidateCredentialsResponse p0) {}
    }

    private static class GetCredentialTransport extends android.credentials.IGetCredentialCallback.Stub {
        private android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> mCallback;
        private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
        private final java.util.concurrent.Executor mExecutor = null;
        private GetCredentialTransport(android.content.Context p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p2) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.GetCredentialResponse p0) {}
    }

    protected static class GetCredentialTransportPendingUseCase extends android.credentials.IGetCredentialCallback.Stub {
        private android.credentials.PrepareGetCredentialResponse.GetPendingCredentialInternalCallback mCallback;
        private GetCredentialTransportPendingUseCase() { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onPendingIntent(android.app.PendingIntent p0) {}
        public void onResponse(android.credentials.GetCredentialResponse p0) {}
        public void setCallback(android.credentials.PrepareGetCredentialResponse.GetPendingCredentialInternalCallback p0) {}
    }

    private static class PrepareGetCredentialTransport extends android.credentials.IPrepareGetCredentialCallback.Stub {
        private android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> mCallback;
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.credentials.CredentialManager.GetCredentialTransportPendingUseCase mGetCredentialTransport = null;
        private PrepareGetCredentialTransport(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.credentials.PrepareGetCredentialResponse, android.credentials.GetCredentialException> p1, android.credentials.CredentialManager.GetCredentialTransportPendingUseCase p2) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onResponse(android.credentials.PrepareGetCredentialResponseInternal p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ProviderFilter {
    }

    private static class SetEnabledProvidersTransport extends android.credentials.ISetEnabledProvidersCallback.Stub {
        private android.os.OutcomeReceiver<java.lang.Void, android.credentials.SetEnabledProvidersException> mCallback;
        private final java.util.concurrent.Executor mExecutor = null;
        private SetEnabledProvidersTransport(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, android.credentials.SetEnabledProvidersException> p1) { super(); }
        public void onError(java.lang.String p0, java.lang.String p1) {}
        public void onResponse() {}
        public void onResponse(java.lang.Void p0) {}
    }
}
