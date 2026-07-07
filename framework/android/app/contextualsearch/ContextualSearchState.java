package android.app.contextualsearch;

@android.annotation.SystemApi
public final class ContextualSearchState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.contextualsearch.ContextualSearchState> CREATOR = null;
    private final android.app.assist.AssistContent mContent = null;
    private final android.os.Bundle mExtras = null;
    private final android.app.assist.AssistStructure mStructure = null;
    public ContextualSearchState(android.app.assist.AssistStructure p0, android.app.assist.AssistContent p1, android.os.Bundle p2) {}
    private ContextualSearchState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.assist.AssistContent getContent() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public android.app.assist.AssistStructure getStructure() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
