package android.hardware.location;

@android.annotation.SystemApi
public final class NanoAppState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppState> CREATOR = null;
    private boolean mIsEnabled;
    private long mNanoAppId;
    private java.util.List<java.lang.String> mNanoAppPermissions;
    private java.util.List<android.hardware.location.NanoAppRpcService> mNanoAppRpcServiceList;
    private int mNanoAppVersion;
    public NanoAppState(long p0, int p1, boolean p2) {}
    public NanoAppState(long p0, int p1, boolean p2, java.util.List<java.lang.String> p3) {}
    public NanoAppState(long p0, int p1, boolean p2, java.util.List<java.lang.String> p3, java.util.List<android.hardware.location.NanoAppRpcService> p4) {}
    private NanoAppState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getNanoAppId() { return 0L; }
    public java.util.List<java.lang.String> getNanoAppPermissions() { return null; }
    public long getNanoAppVersion() { return 0L; }
    public java.util.List<android.hardware.location.NanoAppRpcService> getRpcServices() { return null; }
    public boolean isEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
