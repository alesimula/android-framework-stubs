package android.app;

public class RemoteInputHistoryItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RemoteInputHistoryItem> CREATOR = null;
    private java.lang.String mMimeType;
    private java.lang.CharSequence mText;
    private android.net.Uri mUri;
    protected RemoteInputHistoryItem(android.os.Parcel p0) {}
    public RemoteInputHistoryItem(java.lang.CharSequence p0) {}
    public RemoteInputHistoryItem(java.lang.String p0, android.net.Uri p1, java.lang.CharSequence p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getMimeType() { return null; }
    public java.lang.CharSequence getText() { return null; }
    public android.net.Uri getUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
