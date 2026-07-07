package android.credentials.selection;

public class IntentFactory {
    private static final java.lang.String TAG = "CredManIntentHelper";
    private IntentFactory() {}
    public static android.content.Intent createCancelUiIntent(android.content.Context p0, android.os.IBinder p1, boolean p2, java.lang.String p3, int p4) { return null; }
    public static android.content.Intent createCredentialSelectorIntent(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.ProviderData> p2, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p3, android.os.ResultReceiver p4, int p5) { return null; }
    public static android.credentials.selection.IntentCreationResult createCredentialSelectorIntentForAutofill(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p2, android.os.ResultReceiver p3, int p4) { return null; }
    public static android.credentials.selection.IntentCreationResult createCredentialSelectorIntentForCredMan(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.ProviderData> p2, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p3, android.os.ResultReceiver p4, int p5) { return null; }
    private static android.credentials.selection.IntentCreationResult createCredentialSelectorIntentInternal(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p2, android.os.ResultReceiver p3, int p4) { return null; }
    private static android.content.ComponentName getOemOverrideComponentName(android.content.Context p0, android.credentials.selection.IntentCreationResult.Builder p1, int p2) { return null; }
    private static void setCredentialSelectorUiComponentName(android.content.Context p0, android.content.Intent p1, android.credentials.selection.IntentCreationResult.Builder p2, int p3) {}
    private static <T extends android.os.ResultReceiver> android.os.ResultReceiver toIpcFriendlyResultReceiver(T p0) { return null; }
}
