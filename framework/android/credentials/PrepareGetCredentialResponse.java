package android.credentials;

public final class PrepareGetCredentialResponse {
    private static final android.os.Bundle OPTIONS_SENDER_BAL_OPTIN = null;
    private static final java.lang.String TAG = "CredentialManager";
    private final android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle mPendingGetCredentialHandle = null;
    private final android.credentials.PrepareGetCredentialResponseInternal mResponseInternal = null;
    protected PrepareGetCredentialResponse(android.credentials.PrepareGetCredentialResponseInternal p0, android.credentials.CredentialManager.GetCredentialTransportPendingUseCase p1) {}
    public android.credentials.PrepareGetCredentialResponse.PendingGetCredentialHandle getPendingGetCredentialHandle() { return null; }
    public boolean hasAuthenticationResults() { return false; }
    public boolean hasCredentialResults(java.lang.String p0) { return false; }
    public boolean hasRemoteResults() { return false; }

    protected static interface GetPendingCredentialInternalCallback {
        public void onError(java.lang.String p0, java.lang.String p1);
        public void onPendingIntent(android.app.PendingIntent p0);
        public void onResponse(android.credentials.GetCredentialResponse p0);
    }

    public static final class PendingGetCredentialHandle {
        private final android.credentials.CredentialManager.GetCredentialTransportPendingUseCase mGetCredentialTransport = null;
        private final android.app.PendingIntent mPendingIntent = null;
        PendingGetCredentialHandle(android.credentials.CredentialManager.GetCredentialTransportPendingUseCase p0, android.app.PendingIntent p1) {}
        void show(android.content.Context p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException> p3) {}
    }
}
