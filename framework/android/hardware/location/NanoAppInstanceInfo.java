package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NanoAppInstanceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppInstanceInfo> CREATOR = null;
    private long mAppId;
    private int mAppVersion;
    private int mContexthubId;
    private int mHandle;
    private java.lang.String mName;
    private int mNeededExecMemBytes;
    private int mNeededReadMemBytes;
    private int[] mNeededSensors;
    private int mNeededWriteMemBytes;
    private int[] mOutputEvents;
    private java.lang.String mPublisher;
    public NanoAppInstanceInfo() {}
    public NanoAppInstanceInfo(int p0, long p1, int p2, int p3) {}
    private NanoAppInstanceInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getAppId() { return 0L; }
    public int getAppVersion() { return 0; }
    public int getContexthubId() { return 0; }
    public int getHandle() { return 0; }
    public java.lang.String getName() { return null; }
    public int getNeededExecMemBytes() { return 0; }
    public int getNeededReadMemBytes() { return 0; }
    public int[] getNeededSensors() { return null; }
    public int getNeededWriteMemBytes() { return 0; }
    public int[] getOutputEvents() { return null; }
    public java.lang.String getPublisher() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
