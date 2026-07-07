package android.service.settings.preferences;

public class SettingsPreferenceServiceClient implements java.lang.AutoCloseable {
    private final android.content.Context mContext = null;
    private android.service.settings.preferences.ISettingsPreferenceService mRemoteService;
    private final android.content.ServiceConnection mServiceConnection = null;
    private final android.content.Intent mServiceIntent = null;
    public SettingsPreferenceServiceClient(android.content.Context p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<android.service.settings.preferences.SettingsPreferenceServiceClient, java.lang.Exception> p3) {}
    public SettingsPreferenceServiceClient(android.content.Context p0, java.lang.String p1, boolean p2, java.util.concurrent.Executor p3, android.os.OutcomeReceiver<android.service.settings.preferences.SettingsPreferenceServiceClient, java.lang.Exception> p4) {}
    private void connect(boolean p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.service.settings.preferences.SettingsPreferenceServiceClient, java.lang.Exception> p2) {}
    private android.content.ServiceConnection createServiceConnection(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.service.settings.preferences.SettingsPreferenceServiceClient, java.lang.Exception> p1) { return null; }
    public void close() {}
    public void getAllPreferenceMetadata(android.service.settings.preferences.MetadataRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.service.settings.preferences.MetadataResult, java.lang.Exception> p2) {}
    public void getPreferenceValue(android.service.settings.preferences.GetValueRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.service.settings.preferences.GetValueResult, java.lang.Exception> p2) {}
    public void setPreferenceValue(android.service.settings.preferences.SetValueRequest p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.service.settings.preferences.SetValueResult, java.lang.Exception> p2) {}
}
