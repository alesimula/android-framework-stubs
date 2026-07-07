package android.hardware.camera2.utils;

public class SessionConfigurationAndStreamIds implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.utils.SessionConfigurationAndStreamIds> CREATOR = null;
    public long createSessionTime;
    public int deletedInputStreamId;
    public int[] deletedStreamIds;
    public android.hardware.camera2.params.SessionConfiguration sessionConfigurationDelta;
    public SessionConfigurationAndStreamIds() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
