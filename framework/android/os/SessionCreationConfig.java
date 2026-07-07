package android.os;

public class SessionCreationConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.SessionCreationConfig> CREATOR = null;
    public android.os.IBinder[] layerTokens;
    public int[] modesToEnable;
    public long targetWorkDurationNanos;
    public int[] tids;
    public SessionCreationConfig() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
