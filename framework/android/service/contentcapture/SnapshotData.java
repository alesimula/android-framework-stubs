package android.service.contentcapture;

@android.annotation.SystemApi
public final class SnapshotData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.SnapshotData> CREATOR = null;
    private final android.app.assist.AssistContent mAssistContent = null;
    private final android.os.Bundle mAssistData = null;
    private final android.app.assist.AssistStructure mAssistStructure = null;
    public SnapshotData(android.os.Bundle p0, android.app.assist.AssistStructure p1, android.app.assist.AssistContent p2) {}
    SnapshotData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.app.assist.AssistContent getAssistContent() { return null; }
    public android.os.Bundle getAssistData() { return null; }
    public android.app.assist.AssistStructure getAssistStructure() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
