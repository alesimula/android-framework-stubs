package android.service.voice;

public final class VisibleActivityInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.VisibleActivityInfo> CREATOR = null;
    public static final int TYPE_ACTIVITY_ADDED = 1;
    public static final int TYPE_ACTIVITY_REMOVED = 2;
    private final android.os.IBinder mAssistToken = null;
    private final int mTaskId = 0;
    public VisibleActivityInfo(int p0, android.os.IBinder p1) {}
    VisibleActivityInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.service.voice.VoiceInteractionSession.ActivityId getActivityId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
