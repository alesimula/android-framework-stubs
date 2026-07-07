package android.media.tv.tunerresourcemanager;

public class TunerFrontendRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.tunerresourcemanager.TunerFrontendRequest> CREATOR = null;
    public static final int DEFAULT_DESIRED_ID = -1;
    public int clientId;
    public int desiredId;
    public int frontendType;
    public TunerFrontendRequest() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
