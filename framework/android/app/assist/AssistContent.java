package android.app.assist;

public class AssistContent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.assist.AssistContent> CREATOR = null;
    public static final java.lang.String EXTRA_APP_FUNCTION_DATA = "android.app.assist.extra.APP_FUNCTION_DATA";
    private android.content.ClipData mClipData;
    private final android.os.Bundle mExtras = null;
    private android.content.Intent mIntent;
    private boolean mIsAppProvidedIntent;
    private boolean mIsAppProvidedWebUri;
    private android.net.Uri mSessionTransferUri;
    private java.lang.String mStructuredData;
    private android.net.Uri mUri;
    public AssistContent() {}
    public AssistContent(android.os.Bundle p0) {}
    AssistContent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.content.ClipData getClipData() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.content.Intent getIntent() { return null; }
    public android.net.Uri getSessionTransferUri() { return null; }
    public java.lang.String getStructuredData() { return null; }
    public android.net.Uri getWebUri() { return null; }
    public boolean isAppProvidedIntent() { return false; }
    public boolean isAppProvidedWebUri() { return false; }
    public void setClipData(android.content.ClipData p0) {}
    public void setDefaultIntent(android.content.Intent p0) {}
    public void setIntent(android.content.Intent p0) {}
    public void setSessionTransferUri(android.net.Uri p0) {}
    public void setStructuredData(java.lang.String p0) {}
    public void setWebUri(android.net.Uri p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    void writeToParcelInternal(android.os.Parcel p0, int p1) {}
}
