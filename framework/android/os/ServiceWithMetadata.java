package android.os;

public class ServiceWithMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.ServiceWithMetadata> CREATOR = null;
    public boolean isLazyService;
    public android.os.IBinder service;
    public ServiceWithMetadata() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}
