package android.app;

public final class RecoverableSecurityException extends java.lang.SecurityException implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RecoverableSecurityException> CREATOR = null;
    private static final java.lang.String TAG = "RecoverableSecurityException";
    private final android.app.RemoteAction mUserAction = null;
    private final java.lang.CharSequence mUserMessage = null;
    public RecoverableSecurityException(android.os.Parcel p0) { super((java.lang.String)null); }
    public RecoverableSecurityException(java.lang.Throwable p0, java.lang.CharSequence p1, android.app.RemoteAction p2) { super((java.lang.String)null); }
    public int describeContents() { return 0; }
    public android.app.RemoteAction getUserAction() { return null; }
    public java.lang.CharSequence getUserMessage() { return null; }
    public void showAsDialog(android.app.Activity p0) {}
    public void showAsNotification(android.content.Context p0, java.lang.String p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class LocalDialog extends android.app.DialogFragment {
        public LocalDialog() { super(); }
        public android.app.Dialog onCreateDialog(android.os.Bundle p0) { return null; }
    }
}
