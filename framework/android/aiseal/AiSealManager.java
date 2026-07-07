package android.aiseal;

@android.annotation.SystemApi
public final class AiSealManager {
    private static final java.lang.String AISEAL_HOST_SERVICE_NAME = "aiseal_host";
    private static final java.lang.String SYSTEM_PROPERTY_AISEAL_ENABLED = "service.aiseal.enable";
    private static final java.lang.String TAG = "AiSealManager";
    private final android.content.Context mContext = null;
    public AiSealManager(android.content.Context p0) {}
    private static android.aiseal.IAiSealHostService connectToHostService() { return null; }
    private boolean isEnabled() { return false; }
    @android.annotation.SystemApi
    public android.os.IBinder connectService(java.lang.String p0) throws android.aiseal.AiSealException { return null; }
}
