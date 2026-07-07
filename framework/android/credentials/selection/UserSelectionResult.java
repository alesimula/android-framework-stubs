package android.credentials.selection;

@android.annotation.SystemApi
public final class UserSelectionResult {
    private final java.lang.String mEntryKey = null;
    private final java.lang.String mEntrySubkey = null;
    private final java.lang.String mProviderId = null;
    private android.credentials.selection.ProviderPendingIntentResponse mProviderPendingIntentResponse;
    public UserSelectionResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.credentials.selection.ProviderPendingIntentResponse p3) {}
    public static void sendUserSelectionResult(android.os.ResultReceiver p0, android.credentials.selection.UserSelectionResult p1) {}
    public java.lang.String getEntryKey() { return null; }
    public java.lang.String getEntrySubkey() { return null; }
    public android.credentials.selection.ProviderPendingIntentResponse getPendingIntentProviderResponse() { return null; }
    public java.lang.String getProviderId() { return null; }
    android.credentials.selection.UserSelectionDialogResult toUserSelectionDialogResult() { return null; }
}
